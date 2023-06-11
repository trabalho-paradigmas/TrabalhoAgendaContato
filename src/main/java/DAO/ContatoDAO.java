package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import DTO.ContatoDTO;


public class ContatoDAO {
    public Boolean cadastrarContatoDAO(ContatoDTO contato) throws SQLException {
       String sql =
               "INSERT INTO contato (nome, email, celular)" +
               "VALUES" +
               "(?, ?, ?)";
       
      try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {

            statement.setString(1, contato.getNome());
            statement.setString(2, contato.getEmail());
            statement.setString(3, contato.getCelular());

            statement.executeUpdate();
             System.out.println("Contato inserido com sucesso!");
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar contato: " + e.getMessage());
            return false;
        }

        
    }
   
    
}
