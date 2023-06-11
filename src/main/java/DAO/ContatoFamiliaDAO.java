package DAO;
import DAO.ConexaoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import DTO.ContatoDTO;
import DTO.ContatoFamiliaDTO;

public class ContatoFamiliaDAO {
      public Boolean cadastrarContatoFamiliaDAO(ContatoFamiliaDTO contato) throws SQLException {
        String sqlContato = "INSERT INTO contato (nome, email, celular) VALUES (?, ?, ?)";
        String sqlContatoFamilia = "INSERT INTO contato_familia (id_contato, parentesco) VALUES (?, ?)";

        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement statementContato = conn.prepareStatement(sqlContato, PreparedStatement.RETURN_GENERATED_KEYS);
             PreparedStatement statementContatoFamilia = conn.prepareStatement(sqlContatoFamilia)) {

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

            // Inserir dados na tabela "contato_familia"
            statementContatoFamilia.setInt(1, idContato);
            statementContatoFamilia.setString(2, contato.getParentesco());
            statementContatoFamilia.executeUpdate();

            System.out.println("Contato de Família inserido com sucesso! ID: " + idContato);
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar contato de Família: " + e.getMessage());
            return false;
        }
    
    
    }

    private ContatoFamiliaDTO obterContatoPorId(int idContato) throws SQLException {
        String sql = "SELECT nome, email, celular FROM contato WHERE id = ?";

        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {

            statement.setInt(1, idContato);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    String nome = resultSet.getString("nome");
                    String email = resultSet.getString("email");
                    String celular = resultSet.getString("celular");
                    String parentesco = "Parentesco"; // Supondo que você obtenha o parentesco de alguma forma

                    ContatoFamiliaDTO contato = new ContatoFamiliaDTO(0, nome, celular, email, parentesco);
                    return contato;
                } else {
                    throw new SQLException("Contato não encontrado com o ID fornecido");
                }
            }
        }
    }
}
