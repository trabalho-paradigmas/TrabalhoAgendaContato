/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;
import DAO.ConexaoDAO;
import DTO.ContatoDTO;
import DAO.ContatoDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import DTO.ContatoFamiliaDTO;
import DAO.ContatoFamiliaDAO;

import VIEW.frmPrincipal;


public class frmAdicionarContato extends javax.swing.JFrame {
     Connection conn = new ConexaoDAO().conectaBD();
    

    /**
     * Creates new form frmAmizade
     */
    public frmAdicionarContato() {
        initComponents();
        desativarCamposTexto();
       
    }
    
     private void desativarCamposTexto() {
        TextNome.setEnabled(false);
        TextContato.setEnabled(false);
        TextEmail.setEnabled(false);
        TextParentesco.setEnabled(false);
        TextApelido.setEnabled(false);
        TextEspecializacao.setEnabled(false);
        TextDepartamento.setEnabled(false);
        TextContatoComercial.setEnabled(false);
    }
    
    
    // ...


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextContato = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TextEmail = new javax.swing.JTextField();
        btnAdicionarConatato = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TextParentesco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TextApelido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TextContatoComercial = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TextEspecializacao = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        TextDepartamento = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cbFamilia = new javax.swing.JCheckBox();
        cbAmizade = new javax.swing.JCheckBox();
        cbTrabalho = new javax.swing.JCheckBox();
        cbEmergencia = new javax.swing.JCheckBox();
        btnConfirmarTipoContato = new javax.swing.JButton();
        cbSaude = new javax.swing.JCheckBox();
        cbOutros = new javax.swing.JCheckBox();

        jTextField3.setText("jTextField3");

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

        jTextField7.setText("jTextField7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cadastro de contato");

        jLabel2.setText("Nome :");

        TextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNomeActionPerformed(evt);
            }
        });

        jLabel3.setText("Número de contato :");

        TextContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextContatoActionPerformed(evt);
            }
        });

        jLabel4.setText("Email :");

        TextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextEmailActionPerformed(evt);
            }
        });

        btnAdicionarConatato.setText("Adicionar Contato");
        btnAdicionarConatato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarConatatoActionPerformed(evt);
            }
        });

        jLabel5.setText("Parentesco:");

        TextParentesco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextParentescoActionPerformed(evt);
            }
        });

        jLabel6.setText("Apelido :");

        TextApelido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextApelidoActionPerformed(evt);
            }
        });

        jLabel8.setText("Número de contato comercial :");

        TextContatoComercial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextContatoComercialActionPerformed(evt);
            }
        });

        jLabel9.setText("Especialização :");

        TextEspecializacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextEspecializacaoActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel10.setText("Departamento :");

        jLabel11.setText("Escolha o tipo de contato desejado");

        cbFamilia.setText("Familia");
        cbFamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFamiliaActionPerformed(evt);
            }
        });

        cbAmizade.setText("Amizade");
        cbAmizade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAmizadeActionPerformed(evt);
            }
        });

        cbTrabalho.setText("Trabalho");
        cbTrabalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTrabalhoActionPerformed(evt);
            }
        });

        cbEmergencia.setText("Emergencia");
        cbEmergencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEmergenciaActionPerformed(evt);
            }
        });

        btnConfirmarTipoContato.setText("Confirmar");
        btnConfirmarTipoContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarTipoContatoActionPerformed(evt);
            }
        });

        cbSaude.setText("Saude");
        cbSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSaudeActionPerformed(evt);
            }
        });

        cbOutros.setText("Outros");
        cbOutros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOutrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbEmergencia)
                        .addGap(18, 18, 18)
                        .addComponent(cbSaude))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextApelido, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 339, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAdicionarConatato)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(243, 243, 243)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextEspecializacao, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextContatoComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbFamilia)
                                        .addGap(33, 33, 33)
                                        .addComponent(cbAmizade)
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbTrabalho)
                                            .addComponent(cbOutros)))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addComponent(btnConfirmarTipoContato))
                            .addComponent(TextContato, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbFamilia)
                            .addComponent(cbAmizade)
                            .addComponent(cbTrabalho))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbEmergencia)
                            .addComponent(cbSaude)
                            .addComponent(cbOutros)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnConfirmarTipoContato)))
                .addGap(72, 72, 72)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextContatoComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextEspecializacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarConatato)
                    .addComponent(btnCancelar))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNomeActionPerformed
       
    }//GEN-LAST:event_TextNomeActionPerformed

    private void btnAdicionarConatatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarConatatoActionPerformed
        
        String nome = TextNome.getText();
        String celular = TextContato.getText();
        String email = TextEmail.getText();
        String parentesco = TextParentesco.getText();
        ContatoFamiliaDTO contato = new ContatoFamiliaDTO(0, nome, celular, email, parentesco);
        ContatoFamiliaDAO contatoFamiliaDAO = new ContatoFamiliaDAO();
        try {
            contatoFamiliaDAO.cadastrarContatoFamiliaDAO(contato);
            System.out.println("Contato de família inserido com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
 
    }//GEN-LAST:event_btnAdicionarConatatoActionPerformed

    private void TextParentescoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextParentescoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextParentescoActionPerformed

    private void TextApelidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextApelidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextApelidoActionPerformed

    private void TextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextEmailActionPerformed

    private void TextEspecializacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextEspecializacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextEspecializacaoActionPerformed

    private void cbFamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFamiliaActionPerformed

       
        if (cbFamilia.isSelected()) {

            //bloqueando as checkbox
            cbTrabalho.setEnabled(false);
            cbAmizade.setEnabled(false);
            cbSaude.setEnabled(false);
            cbOutros.setEnabled(false);

            // retornaria a tela de cadastro desse tipo de contato
        } else {

            cbTrabalho.setEnabled(true);
            cbAmizade.setEnabled(true);
            cbSaude.setEnabled(true);
            cbOutros.setEnabled(true);

        }
    }//GEN-LAST:event_cbFamiliaActionPerformed

    private void cbAmizadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAmizadeActionPerformed

        if (cbAmizade.isSelected()) {

            //bloqueando as checkbox
            cbFamilia.setEnabled(false);
            cbSaude.setEnabled(false);
            cbOutros.setEnabled(false);

        } else {
            cbFamilia.setEnabled(true);
            cbSaude.setEnabled(true);
            cbOutros.setEnabled(true);
        }
    }//GEN-LAST:event_cbAmizadeActionPerformed

    private void cbTrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTrabalhoActionPerformed

        if (cbTrabalho.isSelected()) {

            //bloqueando as checkbox
            cbFamilia.setEnabled(false);
            cbSaude.setEnabled(false);
            cbOutros.setEnabled(false);
        } else {

            cbFamilia.setEnabled(true);
            cbSaude.setEnabled(true);
            cbOutros.setEnabled(true);
        }
    }//GEN-LAST:event_cbTrabalhoActionPerformed

    private void cbEmergenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEmergenciaActionPerformed

        if (cbEmergencia.isSelected()) {

            //bloqueando as checkbox
            cbOutros.setEnabled(false);
            cbTrabalho.setEnabled(false);
            cbOutros.setEnabled(false);

        } else {

            cbOutros.setEnabled(true);
            cbTrabalho.setEnabled(true);
            cbOutros.setEnabled(true);
        }
    }//GEN-LAST:event_cbEmergenciaActionPerformed

    private void btnConfirmarTipoContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarTipoContatoActionPerformed
        // Verificar qual checkbox foi selecionada  
        if (cbFamilia.isSelected()) {
            TextNome.setEnabled(true);
            TextContato.setEnabled(true);
            TextEmail.setEnabled(true);
            TextParentesco.setEnabled(true);
            TextEspecializacao.setEnabled(false);
            TextContatoComercial.setEnabled(false);
            TextDepartamento.setEnabled(false);
            TextApelido.setEnabled(false);
            
        } else if (cbAmizade.isSelected()) {
            TextNome.setEnabled(true);
            TextContato.setEnabled(true);
            TextEmail.setEnabled(true);
            TextApelido.setEnabled(true);
            TextEspecializacao.setEnabled(false);
            TextContatoComercial.setEnabled(false);
            TextDepartamento.setEnabled(false);
            TextParentesco.setEnabled(false);
            
        } else if (cbSaude.isSelected()) {
            TextNome.setEnabled(true);
            TextContato.setEnabled(true);
            TextEmail.setEnabled(true);
            TextEspecializacao.setEnabled(true);
            TextContatoComercial.setEnabled(true);
             TextParentesco.setEnabled(false); 
            TextDepartamento.setEnabled(false);
            TextApelido.setEnabled(false); 
            
        } else if (cbEmergencia.isSelected()) {
            TextNome.setEnabled(true);
            TextContato.setEnabled(true);
            TextEmail.setEnabled(true);
            TextParentesco.setEnabled(false); 
            TextDepartamento.setEnabled(false);
            TextApelido.setEnabled(false);
            TextEspecializacao.setEnabled(false);
            TextContatoComercial.setEnabled(false);
            
        } else if (cbTrabalho.isSelected()) {
            TextNome.setEnabled(true);
            TextContato.setEnabled(true);
            TextEmail.setEnabled(true);
            TextDepartamento.setEnabled(true);
            TextContatoComercial.setEnabled(true);
             TextParentesco.setEnabled(false); 
            TextApelido.setEnabled(false);
            TextEspecializacao.setEnabled(false);
            
        } else if (cbOutros.isSelected()) {
            TextNome.setEnabled(true);
            TextContato.setEnabled(true);
            TextEmail.setEnabled(true);
            TextParentesco.setEnabled(false); 
            TextApelido.setEnabled(false);
            TextEspecializacao.setEnabled(false);
            TextDepartamento.setEnabled(false);
            TextContatoComercial.setEnabled(false);
        } 
        
        
    }//GEN-LAST:event_btnConfirmarTipoContatoActionPerformed

    private void cbSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSaudeActionPerformed

        if (cbSaude.isSelected()) {

            //bloqueando as checkbox
            cbFamilia.setEnabled(false);
            cbAmizade.setEnabled(false);
            cbTrabalho.setEnabled(false);
            cbOutros.setEnabled(false);
        } else {

            cbFamilia.setEnabled(true);
            cbAmizade.setEnabled(true);
            cbTrabalho.setEnabled(true);
        }
    }//GEN-LAST:event_cbSaudeActionPerformed

    private void cbOutrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOutrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOutrosActionPerformed

    private void TextContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextContatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextContatoActionPerformed

    private void TextContatoComercialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextContatoComercialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextContatoComercialActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Cancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(frmAdicionarContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAdicionarContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAdicionarContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAdicionarContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAdicionarContato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextApelido;
    private javax.swing.JTextField TextContato;
    private javax.swing.JTextField TextContatoComercial;
    private javax.swing.JTextField TextDepartamento;
    private javax.swing.JTextField TextEmail;
    private javax.swing.JTextField TextEspecializacao;
    private javax.swing.JTextField TextNome;
    private javax.swing.JTextField TextParentesco;
    private javax.swing.JButton btnAdicionarConatato;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmarTipoContato;
    private javax.swing.JCheckBox cbAmizade;
    private javax.swing.JCheckBox cbEmergencia;
    private javax.swing.JCheckBox cbFamilia;
    private javax.swing.JCheckBox cbOutros;
    private javax.swing.JCheckBox cbSaude;
    private javax.swing.JCheckBox cbTrabalho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables

    
    
    private void Cancelar() {
        frmPrincipal objTelafrmPrincipalVIEW = new frmPrincipal();
        objTelafrmPrincipalVIEW.setVisible(true);
        dispose();
    }
}
