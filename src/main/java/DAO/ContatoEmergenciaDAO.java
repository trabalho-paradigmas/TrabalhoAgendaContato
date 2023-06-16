package DAO;
import DTO.ContatoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DTO.ContatoEmergenciaDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ContatoEmergenciaDAO {
      public Boolean cadastrarContatoEmergenciaDAO(ContatoEmergenciaDTO contato) throws SQLException {
        String sqlContato = "INSERT INTO contato (nome, email, celular) VALUES (?, ?, ?)";
        String sqlContatoEmergencia = "INSERT INTO contato_Emergencia (id_contato) VALUES (?)";

        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement statementContato = conn.prepareStatement(sqlContato, PreparedStatement.RETURN_GENERATED_KEYS);
             PreparedStatement statementContatoEmergencia = conn.prepareStatement(sqlContatoEmergencia)) {

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

            // Inserir dados na tabela "contato_emergencia"
            statementContatoEmergencia.setInt(1, idContato);
            statementContatoEmergencia.executeUpdate();

            System.out.println("Contato de Família inserido com sucesso! ID: " + idContato);
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar contato de Família: " + e.getMessage());
            return false;
        }
    
    
    }

    private ContatoEmergenciaDTO obterContatoPorId(int idContato) throws SQLException {
        String sql = "SELECT nome, email, celular FROM contato WHERE id = ?";

        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {

            statement.setInt(1, idContato);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    String nome = resultSet.getString("nome");
                    String email = resultSet.getString("email");
                    String celular = resultSet.getString("celular");
    

                    ContatoEmergenciaDTO contato = new ContatoEmergenciaDTO(0, nome, celular, email);
                    return contato;
                } else {
                    throw new SQLException("Contato não encontrado com o ID fornecido");
                }
            }
        }
    }
    public List<ContatoEmergenciaDTO> read() throws SQLException {
    String sql = "SELECT c.nome, c.email, c.celular FROM contato c " +
                 "JOIN contato_emergencia cf ON c.id = cf.id_contato " +
                 "ORDER BY c.nome ASC";

    List<ContatoEmergenciaDTO> contatos = new ArrayList<>();
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

            ContatoEmergenciaDTO contato = new ContatoEmergenciaDTO(0, nome, celular, email);
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
