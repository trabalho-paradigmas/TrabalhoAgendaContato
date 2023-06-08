/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.InstantSource;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Precision M6700
 *
 *
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
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

        jPanel1 = new javax.swing.JPanel();
        btnCadastrarContato = new javax.swing.JButton();
        txtNomeUsuario = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        DesktopTela = new javax.swing.JDesktopPane();
        menu = new javax.swing.JMenuBar();
        menCadContato = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        menEditarContato = new javax.swing.JMenu();
        menOpc = new javax.swing.JMenu();
        btnMenSair = new javax.swing.JRadioButtonMenuItem();
        btnMenPerfil = new javax.swing.JRadioButtonMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda de contatos");
        setResizable(false);

        btnCadastrarContato.setText("Cadastrar Contato");
        btnCadastrarContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarContatoActionPerformed(evt);
            }
        });

        lblUsuario.setText("Usuario");

        javax.swing.GroupLayout DesktopTelaLayout = new javax.swing.GroupLayout(DesktopTela);
        DesktopTela.setLayout(DesktopTelaLayout);
        DesktopTelaLayout.setHorizontalGroup(
            DesktopTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );
        DesktopTelaLayout.setVerticalGroup(
            DesktopTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 384, Short.MAX_VALUE)
        );

        menCadContato.setText("contato");
        menCadContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadContatoActionPerformed(evt);
            }
        });

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("cadastrar");
        menCadContato.add(jRadioButtonMenuItem1);

        menu.add(menCadContato);

        menEditarContato.setText("editar contato");
        menu.add(menEditarContato);

        menOpc.setText("opções");
        menOpc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menOpcActionPerformed(evt);
            }
        });

        btnMenSair.setSelected(true);
        btnMenSair.setText("sair");
        btnMenSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenSairActionPerformed(evt);
            }
        });
        menOpc.add(btnMenSair);

        btnMenPerfil.setSelected(true);
        btnMenPerfil.setText("perfil");
        btnMenPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenPerfilActionPerformed(evt);
            }
        });
        menOpc.add(btnMenPerfil);

        menu.add(menOpc);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnCadastrarContato)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeUsuario)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(DesktopTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(lblUsuario)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(txtNomeUsuario))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(lblUsuario))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(DesktopTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnCadastrarContato)
                .addGap(46, 46, 46))
        );

        setSize(new java.awt.Dimension(828, 533));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarContatoActionPerformed

        cadastrarContato();

    }//GEN-LAST:event_btnCadastrarContatoActionPerformed

    private void menOpcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menOpcActionPerformed


    }//GEN-LAST:event_menOpcActionPerformed

    private void btnMenSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenSairActionPerformed
        sair();
    }//GEN-LAST:event_btnMenSairActionPerformed

    private void menCadContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadContatoActionPerformed
        cadastrarContato();
    }//GEN-LAST:event_menCadContatoActionPerformed

    private void btnMenPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenPerfilActionPerformed
        //vai para a tela de perfil do usuario dentro do tesktopTela
        retornaNomeUsuario();

    }//GEN-LAST:event_btnMenPerfilActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopTela;
    private javax.swing.JButton btnCadastrarContato;
    private javax.swing.JRadioButtonMenuItem btnMenPerfil;
    private javax.swing.JRadioButtonMenuItem btnMenSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    public javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu menCadContato;
    private javax.swing.JMenu menEditarContato;
    private javax.swing.JMenu menOpc;
    private javax.swing.JMenuBar menu;
    private javax.swing.JLabel txtNomeUsuario;
    // End of variables declaration//GEN-END:variables

    private void cadastrarContato() {

        // chma a tela de cadastro de contato
        frmTipoContatoVIEW objTipoContatoVIEW = new frmTipoContatoVIEW();
        objTipoContatoVIEW.setVisible(true);
        dispose();
    }

    private void sair() {
        int sair = JOptionPane.showConfirmDialog(null, "Deseja sair do sistema?", "Atenção!", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    private void retornaNomeUsuario() {

        String nomeUsuario = lblUsuario.getText();

        String nome_usuario = lblUsuario.getText();
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setNome_usuario(nome_usuario);

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        ResultSet rs = usuarioDAO.consultarNome(usuarioDTO);
        try {
            if (rs.next()) {
                try {
                    String nome = rs.getString("nome");
                    telaUsuarioVIEW telaUsuarioVIEW = new telaUsuarioVIEW();
                    telaUsuarioVIEW.recebeNomeUsuario(nomeUsuario);
                    telaUsuarioVIEW.recebeNome(nome);
                    telaUsuarioVIEW.setVisible(true);
                    DesktopTela.add(telaUsuarioVIEW);
                } catch (Exception erro) {
                    JOptionPane.showMessageDialog(null, "MERDA DO NOME DE USUARIO" + erro);
                }

            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "MERDA DO NOME DE USUARIO" + erro);
        }

    }

}