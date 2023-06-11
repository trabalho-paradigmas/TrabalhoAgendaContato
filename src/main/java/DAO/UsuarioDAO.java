package DAO;

//import DTO.CadastroUsuarioDTO;
import DTO.UsuarioDTO;
import VIEW.frmPrincipal;
import VIEW.telaUsuarioVIEW;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class UsuarioDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    // usamos resultSet pq estamos retornando algum resultado
    // AUTENTICAÇÃO DO  USUARIO NO LOGIN
    public ResultSet autenticacaoUsuario(UsuarioDTO objUsuarioDTO) {
        conn = new ConexaoDAO().conectaBD();

        try {

            String sql = "select * from usuario where nome_usuario = ? and senha_usuario = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);

            pstm.setString(1, objUsuarioDTO.getNome_usuario());
            pstm.setString(2, objUsuarioDTO.getSenha_usuario());

            ResultSet rs = pstm.executeQuery(); //executanto o que foi passado

            return rs;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);

            return null;
        }
    }

    //Connection conn;
    //PreparedStatement pstm;
    public int cadastroUsuario(UsuarioDTO objUsuarioDTO) {

        String sql = "insert into usuario (nome_usuario, senha_usuario, nome) values (?, ?, ?)";

        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getNome_usuario());
            pstm.setString(2, objUsuarioDTO.getSenha_usuario());
            pstm.setString(3, objUsuarioDTO.getNome());
            int rs =pstm.executeUpdate();
            
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "CadastroUsuario " + e);
            return 0;
        }

    }

    public ResultSet consultarNome(UsuarioDTO usuarioDTO) {

        String sql = "SELECT nome FROM usuario WHERE nome_usuario = ? ";
        conn = new ConexaoDAO().conectaBD();

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
        String sql = "update usuario set senha_usuario = ?, nome = ? where nome_usuario = ?";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(2, nome);
            pstm.setString(1, senha);
            pstm.setString(3, nome_usuario);
            

            int alterado = pstm.executeUpdate();

            return alterado;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ConsultaUsuario " + e);
            return 0;
        }

    }

    public int senha(String nome_usuario, String senha) {

        String sql = "update usuario set senha_usuario = ? where nome_usuario = ?";

        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(2, nome_usuario);
            pstm.setString(1, senha);

            int rs = pstm.executeUpdate();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro nova senha " + e);
            return 0;
        }
    }

    public void excluir(String nome_usuario) {
        String sql = "delete from usuario where nome_usuario = ?";

        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,nome_usuario);
            pstm.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro excluir usuario " + e);
        } 
    }
    
    public ResultSet consultaSenha(String nome_usuario){
        
        String sql = "SELECT senha_usuario FROM usuario WHERE nome_usuario = ? ";
        conn = new ConexaoDAO().conectaBD();
        
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

}
