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

        try (Connection conn = ConexaoDAO.getConnection(); PreparedStatement statementContato = conn.prepareStatement(sqlContato, PreparedStatement.RETURN_GENERATED_KEYS); PreparedStatement statementContatoFamilia = conn.prepareStatement(sqlContatoFamilia)) {

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

    public List<ContatoFamiliaDTO> read() throws SQLException {
        String sql = "SELECT cf.id, c.nome, c.email, c.celular, cf.parentesco FROM contato_familia cf "
                + "JOIN contato c ON c.id = cf.id_contato "
                + "ORDER BY cf.id ASC";

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
    
   public List<ContatoFamiliaDTO> pesquisar(String filtro) throws SQLException {
    String sql = "SELECT cf.id, c.nome, c.email, c.celular, cf.parentesco FROM contato_familia cf " +
                 "JOIN contato c ON c.id = cf.id_contato " +
                 "WHERE c.nome LIKE ? OR c.email LIKE ? " +
                 "ORDER BY cf.id ASC";

    List<ContatoFamiliaDTO> contatos = new ArrayList<>();
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
            String parentesco = resultSet.getString("parentesco");

            ContatoFamiliaDTO contato = new ContatoFamiliaDTO(id, nome, celular, email, parentesco);
            contatos.add(contato);
        }
    } catch (SQLException e) {
        // Lidar com a exceção, se necessário
    } 

    return contatos;
}
   



  public void delete(int idContato) {
        Connection conn = null;
        PreparedStatement statementContatoFamilia = null;
        PreparedStatement statementContato = null;

        try {
            conn = ConexaoDAO.getConnection();
            conn.setAutoCommit(false); // Desabilitar o commit automático

            // Excluir o registro da tabela "contato_familia" com base no ID do contato
            statementContatoFamilia = conn.prepareStatement("DELETE FROM contato_familia WHERE id = ?");
            statementContatoFamilia.setInt(1, idContato);
            statementContatoFamilia.executeUpdate();

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

    public void atualizar(ContatoFamiliaDTO contato) {
        Connection conn = null;
        PreparedStatement statementContato = null;
        PreparedStatement statementContatoFamilia = null;

        try {
            conn = ConexaoDAO.getConnection();
            conn.setAutoCommit(false); // Desabilitar o commit automático

            // Atualizar o registro na tabela "contato"
            statementContato = conn.prepareStatement("UPDATE contato SET nome = ?, email = ?, celular = ? ");
            statementContato.setString(1, contato.getNome());
            statementContato.setString(2, contato.getEmail());
            statementContato.setString(3, contato.getCelular());
            statementContato.executeUpdate();

            // Atualizar o registro na tabela "contato_familia"
            statementContatoFamilia = conn.prepareStatement("UPDATE contato_familia SET parentesco = ? ");
            statementContatoFamilia.setString(1, contato.getParentesco());
            statementContatoFamilia.executeUpdate();

            // Confirmar a transação
            conn.commit();

            JOptionPane.showMessageDialog(null, "Contato atualizado com sucesso");
        } catch (SQLException e) {
            // Rollback em caso de erro
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    // Lidar com a exceção, se necessário
                }
            }
            JOptionPane.showMessageDialog(null, "Erro ao atualizar o contato: " + e);
        } finally {
            // Fechar os recursos
            if (statementContato != null) {
                try {
                    statementContato.close();
                } catch (SQLException e) {
                    // Lidar com a exceção, se necessário
                }
            }
            if (statementContatoFamilia != null) {
                try {
                    statementContatoFamilia.close();
                } catch (SQLException e) {
                    // Lidar com a exceção, se necessário
                }
            }
            if (conn != null) {
                try {
                    conn.setAutoCommit(true); // Reabilitar o commit automático
                    conn.close();
                } catch (SQLException e) {
                    // Lidar com a exceção, se necessário
                }
            }
        }
    }
   
}



       


   
