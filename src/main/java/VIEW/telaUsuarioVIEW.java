package VIEW;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import com.mysql.cj.protocol.Resultset;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
/**
 *
 * @author Precision M6700
 */
public class telaUsuarioVIEW extends javax.swing.JInternalFrame {

    /**
     * Creates new form telaUsuarioVIEW
     */
    public telaUsuarioVIEW() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNomeUsuario = new javax.swing.JLabel();
        btnEditarUsuario = new javax.swing.JButton();
        btnExcluirUsuario = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("DesktopUsuario");
        setPreferredSize(new java.awt.Dimension(595, 384));

        jLabel1.setText("Nome:");

        jLabel2.setText("Nome de usuario:");

        lblNomeUsuario.setText("jLabel4");

        btnEditarUsuario.setText("Editar");
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });

        btnExcluirUsuario.setText("Excluir");
        btnExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirUsuarioActionPerformed(evt);
            }
        });

        lblNome.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEditarUsuario)
                        .addGap(57, 57, 57)
                        .addComponent(btnExcluirUsuario))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblNomeUsuario))))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblNome))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblNomeUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarUsuario)
                    .addComponent(btnExcluirUsuario))
                .addGap(44, 44, 44))
        );

        setBounds(0, 0, 406, 310);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed
        telaEditaUsuario();
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed

    private void btnExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirUsuarioActionPerformed
        excluirUsuario();
    }//GEN-LAST:event_btnExcluirUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnExcluirUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblNome;
    public javax.swing.JLabel lblNomeUsuario;
    // End of variables declaration//GEN-END:variables

    public void recebeNomeUsuario(String nomeUsuario) {

        lblNomeUsuario.setText(nomeUsuario);
        // lblSenha.setText(senha);

    }

    public void recebeNome(String nome) {

        lblNome.setText(nome);

    }

    private void telaEditaUsuario() {

        String nome = lblNome.getText();
        String nome_usuario = lblNomeUsuario.getText();

        JDesktopPane desktopPane = getDesktopPane();
        frmTelaEditaUsuario telaEditaUsuario = new frmTelaEditaUsuario();
        telaEditaUsuario.recbeNomeeNomeUser(nome, nome_usuario);
        desktopPane.add(telaEditaUsuario);
        telaEditaUsuario.setVisible(true);

    }

    private void excluirUsuario() {
        String nome_usuario;

        nome_usuario = lblNomeUsuario.getText();

        int confirma = JOptionPane.showConfirmDialog(null, "Deseja apagar sua conta?", "Atenção", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            usuarioDAO.excluir(nome_usuario);
            dispose();
            frmLoginVIEW loginVIEW = new frmLoginVIEW();
            loginVIEW.setVisible(true);
        }



    }

}
