package DAO;

import DTO.ContatoDTO;
import DTO.ContatoSaudeDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DTO.ContatoTrabalhoDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ContatoTrabalhoDAO {
      public Boolean cadastrarContatoTrabalhoDAO(ContatoTrabalhoDTO contato) throws SQLException {
        String sqlContato = "INSERT INTO contato (nome, email, celular) VALUES (?, ?, ?)";
        String sqlContatoTrabalho = "INSERT INTO contato_trabalho (id_contato, telefone_comercial, departamento) VALUES (?, ?, ?)";

        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement statementContato = conn.prepareStatement(sqlContato, PreparedStatement.RETURN_GENERATED_KEYS);
             PreparedStatement statementContatoTrabalho = conn.prepareStatement(sqlContatoTrabalho)) {

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
            statementContatoTrabalho.setInt(1, idContato);
            statementContatoTrabalho.setString(2, contato.getTelefone_comercial());
            statementContatoTrabalho.setString(3, contato.getDepartamento());
            statementContatoTrabalho.executeUpdate();

            System.out.println("Contato de Família inserido com sucesso! ID: " + idContato);
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar contato de Família: " + e.getMessage());
            return false;
        }
    
    
    }

    private ContatoTrabalhoDTO obterContatoPorId(int idContato) throws SQLException {
        String sql = "SELECT nome, email, celular FROM contato WHERE id = ?";

        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {

            statement.setInt(1, idContato);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    String nome = resultSet.getString("nome");
                    String email = resultSet.getString("email");
                    String celular = resultSet.getString("celular");
                    String telefone_comercial = "telefone_comercial"; // Supondo que você obtenha o telefone comercial e departamento de alguma forma
                    String departamento = "departamento";
                    
                    ContatoTrabalhoDTO contato = new ContatoTrabalhoDTO(0, nome, celular, email, telefone_comercial, departamento);
                    return contato;
                } else {
                    throw new SQLException("Contato não encontrado com o ID fornecido");
                }
            }
        }
    }
    
    public List<ContatoTrabalhoDTO> read() throws SQLException {
    String sql = "SELECT c.nome, c.email, c.celular, cf.telefone_comercial, cf.departamento FROM contato c " +
                 "JOIN contato_saude cf ON c.id = cf.id_contato " +
                 "ORDER BY c.nome ASC";

    List<ContatoTrabalhoDTO> contatos = new ArrayList<>();
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
            String telefone_comercial = resultSet.getString("telefone_comercial");
            String departamento = resultSet.getString("departamento");

            ContatoTrabalhoDTO contato = new ContatoTrabalhoDTO(0, nome, celular, email, telefone_comercial, departamento);
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
 