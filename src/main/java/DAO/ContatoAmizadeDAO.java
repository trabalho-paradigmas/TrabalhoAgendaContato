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
import javax.swing.JOptionPane;

public class ContatoAmizadeDAO {

    public Boolean cadastrarContatoAmizadeDAO(ContatoAmizadeDTO contato) throws SQLException {
        String sqlContato = "INSERT INTO contato (nome, email, celular) VALUES (?, ?, ?)";
        String sqlContatoAmizade = "INSERT INTO contato_amizade (id_contato, apelido) VALUES (?, ?)";

        try ( Connection conn = ConexaoDAO.getConnection();  PreparedStatement statementContato = conn.prepareStatement(sqlContato, PreparedStatement.RETURN_GENERATED_KEYS);  PreparedStatement statementContatoAmizade = conn.prepareStatement(sqlContatoAmizade)) {

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

    public List<ContatoAmizadeDTO> read() throws SQLException {
        String sql = "SELECT cf.id, c.nome, c.email, c.celular, cf.apelido FROM contato_amizade cf "
                + "JOIN contato c ON c.id = cf.id_contato "
                + "ORDER BY cf.id ASC";

        List<ContatoAmizadeDTO> contatos = new ArrayList<>();
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
                String apelido = resultSet.getString("apelido");

                ContatoAmizadeDTO contato = new ContatoAmizadeDTO(id, nome, celular, email, apelido);
                contatos.add(contato);
            }
        } catch (SQLException e) {
            // Lidar com a exceção, se necessário
        }

        return contatos;
    }

    public List<ContatoAmizadeDTO> pesquisar(String filtro) throws SQLException {
        String sql = "SELECT cf.id, c.nome, c.email, c.celular, cf.apelido FROM contato_amizade cf "
                + "JOIN contato c ON c.id = cf.id_contato "
                + "WHERE c.nome LIKE ? OR c.email LIKE ? "
                + "ORDER BY cf.id ASC";

        List<ContatoAmizadeDTO> contatos = new ArrayList<>();
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
                String apelido = resultSet.getString("apelido");

                ContatoAmizadeDTO contato = new ContatoAmizadeDTO(id, nome, celular, email, apelido);
                contatos.add(contato);
            }
        } catch (SQLException e) {
            // Lidar com a exceção, se necessário
        }

        return contatos;
    }

    public void delete(int idContato) {
        Connection conn = null;
        PreparedStatement statementContatoAmizade = null;
        PreparedStatement statementContato = null;

        try {
            conn = ConexaoDAO.getConnection();
            conn.setAutoCommit(false); // Desabilitar o commit automático

            // Excluir o registro da tabela "contato_familia" com base no ID do contato
            statementContatoAmizade = conn.prepareStatement("DELETE FROM contato_amizade WHERE id = ?");
            statementContatoAmizade.setInt(1, idContato);
            statementContatoAmizade.executeUpdate();

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

    public int alteraContato(String nome, String email, String celular, String apelido, int id) {
        Connection conn;
        PreparedStatement pstm;
        int rs;

        String sql1 = "update contato set nome = ? , email = ? , celular = ? where id = ?";
        String sql2 = "update contato_amizade set apelido = ? where id_contato = ?";

        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql1);
            pstm.setString(1, nome);
            pstm.setString(2, email);
            pstm.setString(3, celular);
            pstm.setInt(4, id);
            
            pstm.executeUpdate();
            
            pstm = conn.prepareStatement(sql2);
            pstm.setString(1, apelido);
            pstm.setInt(2, id);

            rs = pstm.executeUpdate();
            return rs;
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ContatoADAO: " + erro);
            return 0;
        }
    }

}
