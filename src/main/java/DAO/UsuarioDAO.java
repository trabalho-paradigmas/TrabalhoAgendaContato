package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    private Connection conn;
    private PreparedStatement pstm;
    private ResultSet rs;

    public UsuarioDAO() {
        conn = new ConexaoDAO().conectaBD();
    }

    public ResultSet autenticacaoUsuario(UsuarioDTO objUsuarioDTO) {
        try {
            String sql = "SELECT * FROM usuario WHERE nome_usuario = ? AND senha_usuario = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getNome_usuario());
            pstm.setString(2, objUsuarioDTO.getSenha_usuario());
            rs = pstm.executeQuery();
            return rs;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null;
        }
    }

    public int cadastroUsuario(UsuarioDTO objUsuarioDTO) {
        String sql = "INSERT INTO usuario (nome_usuario, senha_usuario, nome) VALUES (?, ?, ?)";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getNome_usuario());
            pstm.setString(2, objUsuarioDTO.getSenha_usuario());
            pstm.setString(3, objUsuarioDTO.getNome());
            int rs = pstm.executeUpdate();
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "CadastroUsuario " + e);
            return 0;
        }
    }

    public ResultSet consultarNome(UsuarioDTO usuarioDTO) {
        String sql = "SELECT nome FROM usuario WHERE nome_usuario = ? ";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, usuarioDTO.getNome_usuario());
            rs = pstm.executeQuery();
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ConsultaUsuario " + e);
            return null;
        }
    }

    public int alteraUsuario(String nome_usuario, String nome, String senha) {
        String sql = "UPDATE usuario SET senha_usuario = ?, nome = ? WHERE nome_usuario = ?";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, senha);
            pstm.setString(2, nome);
            pstm.setString(3, nome_usuario);
            int alterado = pstm.executeUpdate();
            return alterado;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ConsultaUsuario " + e);
            return 0;
        }
    }

    public int alteraSenha(String nome_usuario, String senha) {
        String sql = "UPDATE usuario SET senha_usuario = ? WHERE nome_usuario = ?";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, senha);
            pstm.setString(2, nome_usuario);
            int rs = pstm.executeUpdate();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro nova senha " + e);
            return 0;
        }
    }

    public void excluir(String nome_usuario) {
        String sql = "DELETE FROM usuario WHERE nome_usuario = ?";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, nome_usuario);
            pstm.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro excluir usuario " + e);
        }
    }

    public ResultSet consultaSenha(String nome_usuario) {
        String sql = "SELECT senha_usuario FROM usuario WHERE nome_usuario = ?";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, nome_usuario);
            rs = pstm.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro ao consultar senha" + e);
            return null;
        }
    }

    // Métodos getter e setter para os campos encapsulados

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public PreparedStatement getPstm() {
        return pstm;
    }

    public void setPstm(PreparedStatement pstm) {
        this.pstm = pstm;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }
}
