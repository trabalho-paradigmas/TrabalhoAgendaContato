package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import DTO.ContatoDTO;
import VIEW.frmPrincipal;
import java.sql.ResultSet;

public class ContatoDAO {

    public Boolean cadastrarContatoDAO(ContatoDTO contato) throws SQLException {
        String sql
                = "INSERT INTO contato (nome, email, celular)"
                + "VALUES"
                + "(?, ?, ?)";

        try (Connection conn = ConexaoDAO.getConnection(); PreparedStatement statement = conn.prepareStatement(sql)) {

            statement.setString(1, contato.getNome());
            statement.setString(2, contato.getEmail());
            statement.setString(3, contato.getCelular());
            recebeNomeUsuario(); // esse metodo acredito que relaciona o contato ao usuario. n consegui testar pois não tinha o botao de cadastrar contato
            statement.executeUpdate();
            System.out.println("Contato inserido com sucesso!");
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar contato: " + e.getMessage());
            return false;
        }

    }

    private void recebeNomeUsuario() throws SQLException {
        Connection conn;
        PreparedStatement pstm;
        ResultSet rs;

        frmPrincipal objFrmPrincipalVIEW = new frmPrincipal();
        String nome_usuario = objFrmPrincipalVIEW.lblUsuario.getText();
        
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "insert into contato (nome_usuario) values (?)";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, nome_usuario);

        } catch (SQLException e) {
        }

    }

}
