package DAO;
import DAO.ConexaoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import DTO.ContatoDTO;
import DTO.ContatoAmizadeDTO;
import DTO.ContatoFamiliaDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ContatoAmizadeDAO {
      public Boolean cadastrarContatoAmizadeDAO(ContatoAmizadeDTO contato) throws SQLException {
        String sqlContato = "INSERT INTO contato (nome, email, celular) VALUES (?, ?, ?)";
        String sqlContatoAmizade = "INSERT INTO contato_amizade (id_contato, apelido) VALUES (?, ?)";

        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement statementContato = conn.prepareStatement(sqlContato, PreparedStatement.RETURN_GENERATED_KEYS);
             PreparedStatement statementContatoAmizade = conn.prepareStatement(sqlContatoAmizade)) {

            // Inserir dados na tabela "contato"
            statementContato.setString(1, contato.getNome());
            statementContato.setString(2, contato.getEmail());
            statementContato.setString(3, contato.getCelular());
            statementContato.executeUpdate();

            ResultSet generatedKeys = statementContato.getGeneratedKeys();
            int idContato;
            if (generatedKeys.next()) {
                idContato = generatedKeys.getInt(1);
            } else {
                throw new SQLException("Falha ao obter o ID do Contato inserido.");
            }

            // Inserir dados na tabela "contato_amizade"
            statementContatoAmizade.setInt(1, idContato);
            statementContatoAmizade.setString(2, contato.getApelido());
            statementContatoAmizade.executeUpdate();

            System.out.println("Contato de Família inserido com sucesso! ID: " + idContato);
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar contato de Família: " + e.getMessage());
            return false;
        }
    
    
    }

    private ContatoAmizadeDTO obterContatoPorId(int idContato) throws SQLException {
        String sql = "SELECT nome, email, celular FROM contato WHERE id = ?";

        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {

            statement.setInt(1, idContato);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    String nome = resultSet.getString("nome");
                    String email = resultSet.getString("email");
                    String celular = resultSet.getString("celular");
                    String apelido = "Apelido"; // Supondo que você obtenha o apelido de alguma forma

                    ContatoAmizadeDTO contato = new ContatoAmizadeDTO(0, nome, celular, email, apelido);
                    return contato;
                } else {
                    throw new SQLException("Contato não encontrado com o ID fornecido");
                }
            }
        }
    }
    
     public List<ContatoAmizadeDTO> read() throws SQLException {
        String sql = "SELECT c.nome, c.email, c.celular, cf.apelido FROM contato c " +
                     "JOIN contato_amizade cf ON c.id = cf.id_contato " +
                     "ORDER BY c.nome ASC";

        List<ContatoAmizadeDTO> contatos = new ArrayList<>();
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            conn = ConexaoDAO.getConnection();
            statement = conn.prepareStatement(sql);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String nome = resultSet.getString("nome");
                String email = resultSet.getString("email");
                String celular = resultSet.getString("celular");
                String apelido = resultSet.getString("apelido");

                ContatoAmizadeDTO contato = new ContatoAmizadeDTO(0, nome, celular, email, apelido);
                contatos.add(contato);
            }
        } catch (SQLException e) {
            // Lidar com a exceção, se necessário
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    // Lidar com a exceção, se necessário
                }
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    // Lidar com a exceção, se necessário
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    // Lidar com a exceção, se necessário
                }
            }
        }

        return contatos;
    }

    

   
            
 }
   
