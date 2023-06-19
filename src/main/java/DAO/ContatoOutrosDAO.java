package DAO;


import DTO.ContatoDTO;
import DTO.ContatoFamiliaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DTO.ContatoOutrosDTO;
import DTO.ContatoSaudeDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.swing.JOptionPane;

public class ContatoOutrosDAO {
      public Boolean cadastrarContatoFamiliaDAO(ContatoOutrosDTO contato) throws SQLException {
        String sqlContato = "INSERT INTO contato (nome, email, celular) VALUES (?, ?, ?)";
        String sqlContatoOutros = "INSERT INTO contato_outros (id_contato, telefone_comercial) VALUES (?, ?)";

        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement statementContato = conn.prepareStatement(sqlContato, PreparedStatement.RETURN_GENERATED_KEYS);
             PreparedStatement statementContatoOutros = conn.prepareStatement(sqlContatoOutros)) {

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

            // Inserir dados na tabela "contato_outros"
            statementContatoOutros.setInt(1, idContato);
            statementContatoOutros.setString(2, contato.getTelefone_comercial());
            statementContatoOutros.executeUpdate();

            System.out.println("Contato de Família inserido com sucesso! ID: " + idContato);
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar contato de Família: " + e.getMessage());
            return false;
        }
    
    
    }

  public int obterIdContatoPorId(int idContato) throws SQLException {
        int id = -1;

        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            conn = ConexaoDAO.getConnection();
            statement = conn.prepareStatement("SELECT id FROM contato WHERE id = ?");
            statement.setInt(1, idContato);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                id = resultSet.getInt("id");
            }
        } catch (SQLException e) {
            // Lidar com a exceção, se necessário
        }
        return id;
    }

    public List<ContatoOutrosDTO> read() throws SQLException {
        String sql = "SELECT cf.id, c.nome, c.email, c.celular, cf.telefone_comercial FROM contato_outros cf "
                + "JOIN contato c ON c.id = cf.id_contato "
                + "ORDER BY cf.id ASC";

        List<ContatoOutrosDTO> contatos = new ArrayList<>();
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
                String telefone_comercial = resultSet.getString("telefone_comercial");

                ContatoOutrosDTO contato = new ContatoOutrosDTO(id, nome, celular, email,telefone_comercial);
                contatos.add(contato);
            }
        } catch (SQLException e) {
            // Lidar com a exceção, se necessário
        }


    return contatos;
   }

    public List<ContatoOutrosDTO> pesquisar(String filtro) throws SQLException {
    String sql = "SELECT cf.id, c.nome, c.email, c.celular, cf.telefone_comercial FROM contato_outros cf " +
                 "JOIN contato c ON c.id = cf.id_contato " +
                 "WHERE c.nome LIKE ? OR c.email LIKE ? " +
                 "ORDER BY cf.id ASC";

    List<ContatoOutrosDTO> contatos = new ArrayList<>();
    Connection conn = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;

    try {
        conn = ConexaoDAO.getConnection();
        statement = conn.prepareStatement(sql);
        String pesquisa = "%" + filtro + "%";
        statement.setString(1, pesquisa);
        statement.setString(2, pesquisa);
        resultSet = statement.executeQuery();

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String nome = resultSet.getString("nome");
            String email = resultSet.getString("email");
            String celular = resultSet.getString("celular");
            String telefone_comercial = resultSet.getString("telefone_comercial");

            ContatoOutrosDTO contato = new ContatoOutrosDTO(id, nome, celular, email, telefone_comercial);
            contatos.add(contato);
        }
    } catch (SQLException e) {
        // Lidar com a exceção, se necessário
    } 

    return contatos;
}
   



  public void delete(int idContato) {
        Connection conn = null;
        PreparedStatement statementContatoOutros = null;
        PreparedStatement statementContato = null;

        try {
            conn = ConexaoDAO.getConnection();
            conn.setAutoCommit(false); // Desabilitar o commit automático

            // Excluir o registro da tabela "contato_familia" com base no ID do contato
            statementContatoOutros = conn.prepareStatement("DELETE FROM contato_outros WHERE id = ?");
            statementContatoOutros.setInt(1, idContato);
            statementContatoOutros.executeUpdate();

            // Excluir o registro correspondente na tabela "contato"
            statementContato = conn.prepareStatement("DELETE FROM contato WHERE id= ?");
            statementContato.setInt(1, idContato);
            statementContato.executeUpdate();

            // Confirmar a transação
            conn.commit();

        } catch (SQLException e) {
            // Rollback em caso de erro
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    // Lidar com a exceção, se necessário
                }
            }
            JOptionPane.showMessageDialog(null, "Erro ao excluir o contato: " + e);
        } finally {
            // Fechar os recursos
            // ...
        }
    }
   
}
