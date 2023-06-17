package DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DTO.ContatoFamiliaDTO;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;



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

    private int obterIdContatoPorID(int idContato) throws SQLException {
    String sql = "SELECT id FROM contato WHERE id = ?";
    Connection conn = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;

    try {
        conn = ConexaoDAO.getConnection();
        statement = conn.prepareStatement(sql);
        statement.setInt(1, idContato);
        resultSet = statement.executeQuery();

        if (resultSet.next()) {
            return resultSet.getInt("id");
        } else {
            return -1; // Retorna -1 se o contato não for encontrado
        }
    } catch (SQLException e) {
        throw new SQLException("Erro ao obter ID do contato: " + e);
    } 
}

    
    public List<ContatoFamiliaDTO> read() throws SQLException {
    String sql = "SELECT c.id, c.nome, c.email, c.celular, cf.parentesco FROM contato c " +
                 "JOIN contato_familia cf ON c.id = cf.id_contato " +
                 "ORDER BY c.id ASC";

    List<ContatoFamiliaDTO> contatos = new ArrayList<>();
    Connection conn = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;

    try {
        conn = ConexaoDAO.getConnection();
        statement = conn.prepareStatement(sql);
        resultSet = statement.executeQuery();

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String nome = resultSet.getString("nome");
            String email = resultSet.getString("email");
            String celular = resultSet.getString("celular");
            String parentesco = resultSet.getString("parentesco");

            ContatoFamiliaDTO contato = new ContatoFamiliaDTO(id, nome, celular, email, parentesco);
            contatos.add(contato);
        }
    } catch (SQLException e) {
        // Lidar com a exceção, se necessário
    } 

    return contatos;
   }
    
   public void delete(int id) {
    Connection conn = null;
    PreparedStatement statement = null;

    try {
        conn = ConexaoDAO.getConnection();
        statement = conn.prepareStatement("DELETE FROM contato_familia WHERE id_contato = ?");
        statement.setInt(1, id);

        int rowsAffected = statement.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Excluído com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Falha ao excluir o contato");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao excluir: " + e);
    } finally {
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
}







    

  
}
