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
    public void cadastroUsuario(UsuarioDTO objUsuarioDTO) {

        String sql = "insert into usuario (nome_usuario, senha_usuario, nome) values (?, ?, ?)";

        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getNome_usuario());
            pstm.setString(2, objUsuarioDTO.getSenha_usuario());
            pstm.setString(3, objUsuarioDTO.getNome());

            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "CadastroUsuario " + e);
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

}
