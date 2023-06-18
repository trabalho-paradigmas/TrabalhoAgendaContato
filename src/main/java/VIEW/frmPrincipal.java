/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.ConexaoDAO;
import DAO.ContatoAmizadeDAO;
import DAO.ContatoEmergenciaDAO;
import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import DAO.ContatoFamiliaDAO;
import DAO.ContatoOutrosDAO;
import DAO.ContatoSaudeDAO;
import DAO.ContatoTrabalhoDAO;
import DTO.ContatoAmizadeDTO;
import DTO.ContatoDTO;
import DTO.ContatoEmergenciaDTO;
import DTO.ContatoFamiliaDTO;
import DTO.ContatoOutrosDTO;
import DTO.ContatoSaudeDTO;
import DTO.ContatoTrabalhoDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;



public class frmPrincipal extends javax.swing.JFrame {
    frmAdicionarContato AdicionarContato = new frmAdicionarContato();
    EditarContato EditarContato = new EditarContato();
    
    public frmPrincipal() {
        initComponents();
        readJTableFamilia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaFamilia = new javax.swing.JTable();
        lblUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        TabelaFamilia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Email", "Celular", "Parentesco"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaFamilia);

        lblUsuario.setText("Usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnBuscar)
                .addGap(58, 58, 58)
                .addComponent(btnExcluir)
                .addGap(89, 89, 89)
                .addComponent(btnEditar)
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(lblUsuario)))
                .addContainerGap(206, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
         int selectedRow = TabelaFamilia.getSelectedRow(); // Obtém a linha selecionada na tabela
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Nenhum contato selecionado");
            return;
        }

        int idContato = (int) TabelaFamilia.getValueAt(selectedRow, 0); // Obtém o ID do contato da coluna 0

        ContatoFamiliaDAO contatoDAO = new ContatoFamiliaDAO();
        contatoDAO.delete(idContato);


        DefaultTableModel model = (DefaultTableModel) TabelaFamilia.getModel();
        model.removeRow(selectedRow);
        model.fireTableDataChanged();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
         int selectedRow = TabelaFamilia.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Nenhum contato selecionado");
            return;
        } else {
            EditarContato objTelaEditarContatoVIEW = new EditarContato();
            objTelaEditarContatoVIEW.setVisible(true);
            setVisible(false);
        }
        
         DefaultTableModel model = (DefaultTableModel) TabelaFamilia.getModel();
        
         String Nome = TabelaFamilia.getValueAt(TabelaFamilia.getSelectedRow(),0).toString();
         String Email = TabelaFamilia.getValueAt(TabelaFamilia.getSelectedRow(),1).toString();
         String Celular = TabelaFamilia.getValueAt(TabelaFamilia.getSelectedRow(),2).toString();
         String Parentesco = TabelaFamilia.getValueAt(TabelaFamilia.getSelectedRow(),3).toString();
    }//GEN-LAST:event_btnEditarActionPerformed

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
    private javax.swing.JTable TabelaFamilia;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables

    
 
   private void sair() {
        int sair = JOptionPane.showConfirmDialog(null, "Deseja sair do sistema?", "Atenção!", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            dispose();
            frmLoginVIEW login = new frmLoginVIEW();
            login.setVisible(true);
        }
    }

   /* private void retornaNomeUsuario() {

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

    }*/

    

   
 public void readJTableFamilia() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) TabelaFamilia.getModel();
            modelo.setNumRows(0);
            ContatoFamiliaDAO contato = new ContatoFamiliaDAO();

            for (ContatoFamiliaDTO c : contato.read()) {
                modelo.addRow(new Object[]{
                    c.getId(),
                    c.getNome(),
                    c.getEmail(),
                    c.getCelular(),
                    c.getParentesco()
                });
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Lida com a exceção de alguma forma apropriada, como exibir uma mensagem de erro.
        }
    }

    
}
