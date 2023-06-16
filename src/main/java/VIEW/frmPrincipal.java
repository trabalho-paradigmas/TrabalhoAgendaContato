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
import java.time.InstantSource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Precision M6700
 *
 *
 */
public final class frmPrincipal extends javax.swing.JFrame {

    frmAdicionarContato adicionarContato = new frmAdicionarContato();

    /**
     * Creates new form frmPrincipal
     * @throws java.sql.SQLException
     */
    public frmPrincipal() throws SQLException, ExecutionException {
        initComponents();

        /*DefaultTableModel modelFamilia = (DefaultTableModel) TabelaFamilia.getModel();
        TableRowSorter<DefaultTableModel> sorterFamilia = new TableRowSorter<>(modelFamilia);
        TabelaFamilia.setRowSorter(sorterFamilia);*/

       /* DefaultTableModel modelAmizade = (DefaultTableModel) TabelaAmizade.getModel();
        TableRowSorter<DefaultTableModel> sorterAmizade = new TableRowSorter<>(modelAmizade);
        TabelaAmizade.setRowSorter(sorterAmizade);*/

      ChamarEmOutroFrame();
       
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // </editor-fold>

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jDialog1 = new javax.swing.JDialog();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jScrollPane4 = new javax.swing.JScrollPane();
        TabelaOutros = new javax.swing.JTable();
        txtNomeUsuario = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        DesktopTela = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaFamilia = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaAmizade = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelaEmergencia = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        TabelaSaude = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        TabelaTrabalho = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        TabelaOutro = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();
        menCadContato = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
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

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        TabelaOutros.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(TabelaOutros);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda de contatos");
        setResizable(false);

        lblUsuario.setText("Usuario");

        DesktopTela.setPreferredSize(new java.awt.Dimension(566, 600));

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

        jLabel1.setText("Lista de contatos Familia");

        jLabel2.setText("Lista de contatos Amizade");

        jLabel3.setText("Lista de contatos Emergência");

        jLabel4.setText("Lista de contatos Saúde");

        jLabel5.setText("Lista de contatos Trabalho");

        TabelaAmizade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Email", "Celular", "Apelido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TabelaAmizade);

        TabelaEmergencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Email", "Celular"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TabelaEmergencia);

        TabelaSaude.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Email", "Celular", "Telefone Comercial", "Especialização"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(TabelaSaude);

        TabelaTrabalho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Email", "Celular", "Telefone Comercial", "Departamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(TabelaTrabalho);

        TabelaOutro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Email", "Celular", "Telefone Comercial"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(TabelaOutro);

        jLabel6.setText("Lista de contatos outros");

        DesktopTela.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopTela.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopTela.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopTela.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopTela.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopTela.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopTela.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopTela.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopTela.setLayer(jScrollPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopTela.setLayer(jScrollPane6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopTela.setLayer(jScrollPane7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopTela.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopTelaLayout = new javax.swing.GroupLayout(DesktopTela);
        DesktopTela.setLayout(DesktopTelaLayout);
        DesktopTelaLayout.setHorizontalGroup(
            DesktopTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopTelaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(DesktopTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DesktopTelaLayout.createSequentialGroup()
                        .addGroup(DesktopTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(DesktopTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(DesktopTelaLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(DesktopTelaLayout.createSequentialGroup()
                        .addGroup(DesktopTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        DesktopTelaLayout.setVerticalGroup(
            DesktopTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopTelaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGroup(DesktopTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DesktopTelaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DesktopTelaLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DesktopTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(DesktopTelaLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DesktopTelaLayout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(156, 156, 156)
                .addComponent(jLabel5)
                .addGap(156, 156, 156)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
        );

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(605, 605, 605)
                        .addComponent(txtNomeUsuario))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(DesktopTela, javax.swing.GroupLayout.DEFAULT_SIZE, 1121, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUsuario)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(txtNomeUsuario))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(DesktopTela, javax.swing.GroupLayout.PREFERRED_SIZE, 1054, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lblUsuario)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1235, 1225));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menOpcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menOpcActionPerformed


    }//GEN-LAST:event_menOpcActionPerformed

    private void btnMenSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenSairActionPerformed
        sair();
    }//GEN-LAST:event_btnMenSairActionPerformed

    private void menCadContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadContatoActionPerformed

    }//GEN-LAST:event_menCadContatoActionPerformed

    private void btnMenPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenPerfilActionPerformed
        //vai para a tela de perfil do usuario dentro do tesktopTela
        retornaNomeUsuario();

    }//GEN-LAST:event_btnMenPerfilActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            adicionarContato.ExecutaMetodo(this);
        } catch (SQLException ex) {
            Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
                try {
                    new frmPrincipal().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ExecutionException ex) {
                    Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopTela;
    private javax.swing.JTable TabelaAmizade;
    private javax.swing.JTable TabelaEmergencia;
    private javax.swing.JTable TabelaFamilia;
    private javax.swing.JTable TabelaOutro;
    private javax.swing.JTable TabelaOutros;
    private javax.swing.JTable TabelaSaude;
    private javax.swing.JTable TabelaTrabalho;
    private javax.swing.JRadioButtonMenuItem btnMenPerfil;
    private javax.swing.JRadioButtonMenuItem btnMenSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu menCadContato;
    private javax.swing.JMenu menOpc;
    private javax.swing.JMenuBar menu;
    private javax.swing.JLabel txtNomeUsuario;
    // End of variables declaration//GEN-END:variables

    private void sair() {
        int sair = JOptionPane.showConfirmDialog(null, "Deseja sair do sistema?", "Atenção!", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            dispose();
            frmLoginVIEW login = new frmLoginVIEW();
            login.setVisible(true);
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

    private static class modelo {

        private static void addRow(Object[] object) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        private static void setNumRows(int i) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public modelo() {
        }
    }
    
   
    /*public void ChamarEmOutroFrame() throws ExecutionException {
    ExecutorService executor = Executors.newFixedThreadPool(6);
    
    CompletableFuture<Void> familiaFuture = CompletableFuture.runAsync(this::readJTableFamilia, executor);
    CompletableFuture<Void> amizadeFuture = CompletableFuture.runAsync(this::readJTableAmizade, executor);
    CompletableFuture<Void> emergenciaFuture = CompletableFuture.runAsync(this::readJTableEmergencia, executor);
    CompletableFuture<Void> saudeFuture = CompletableFuture.runAsync(this::readJTableSaude, executor);
    CompletableFuture<Void> trabalhoFuture = CompletableFuture.runAsync(this::readJTableTrabalho, executor);
    CompletableFuture<Void> outrosFuture = CompletableFuture.runAsync(this::readJTableOutros, executor);

    try {
        CompletableFuture.allOf(familiaFuture, amizadeFuture, emergenciaFuture, saudeFuture, trabalhoFuture, outrosFuture).get();
    } catch (InterruptedException | ExecutionException e) {
        e.printStackTrace();
    } finally {
        executor.shutdown();
    }
}*/
  



    public void readJTableFamilia() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) TabelaFamilia.getModel();
            modelo.setNumRows(0);
            ContatoFamiliaDAO contato = new ContatoFamiliaDAO();

            for (ContatoFamiliaDTO c : contato.read()) {
                modelo.addRow(new Object[]{
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
    
    public void readJTableAmizade() {
    try {
        DefaultTableModel modelo = (DefaultTableModel) TabelaAmizade.getModel();
        modelo.setNumRows(0);
        ContatoAmizadeDAO contato = new ContatoAmizadeDAO();

        for (ContatoAmizadeDTO c : contato.read()) {
            modelo.addRow(new Object[]{
                c.getNome(),
                c.getEmail(),
                c.getCelular(),
                c.getApelido()
            });
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Lida com a exceção de alguma forma apropriada, como exibir uma mensagem de erro.
    }
    }

    public void readJTableEmergencia() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) TabelaEmergencia.getModel();
            modelo.setNumRows(0);
            ContatoEmergenciaDAO contato = new ContatoEmergenciaDAO();

            for (ContatoEmergenciaDTO c : contato.read()) {
                modelo.addRow(new Object[]{
                    c.getNome(),
                    c.getEmail(),
                    c.getCelular()
                });
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Lida com a exceção de alguma forma apropriada, como exibir uma mensagem de erro.
        }
    }

    public void readJTableSaude() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) TabelaSaude.getModel();
            modelo.setNumRows(0);
            ContatoSaudeDAO contato = new ContatoSaudeDAO();

            for (ContatoSaudeDTO c : contato.read()) {
                modelo.addRow(new Object[]{
                    c.getNome(),
                    c.getEmail(),
                    c.getCelular(),
                    c.getTelefone_comercial(),
                    c.getEspecializacao()
                });
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Lida com a exceção de alguma forma apropriada, como exibir uma mensagem de erro.
        }
    }

    public void readJTableTrabalho() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) TabelaTrabalho.getModel();
            modelo.setNumRows(0);
            ContatoTrabalhoDAO contato = new ContatoTrabalhoDAO();

            for (ContatoTrabalhoDTO c : contato.read()) {
                modelo.addRow(new Object[]{
                    c.getNome(),
                    c.getEmail(),
                    c.getCelular(),
                    c.getTelefone_comercial(),
                    c.getDeparatamento()
                });
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Lida com a exceção de alguma forma apropriada, como exibir uma mensagem de erro.
        }
    }

    public void readJTableOutros() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) TabelaOutro.getModel();
            modelo.setNumRows(0);
            ContatoOutrosDAO contato = new ContatoOutrosDAO();

            for (ContatoOutrosDTO c : contato.read()) {
                modelo.addRow(new Object[]{
                    c.getNome(),
                    c.getEmail(),
                    c.getCelular(),
                    c.getTelefone_comercial()
                });
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Lida com a exceção de alguma forma apropriada, como exibir uma mensagem de erro.
        }
    }
    /*public void ChamarEmOutroFrame() {
        Thread threadFamilia = new Thread(() -> {
            SwingUtilities.invokeLater(() -> readJTableFamilia());
        });
        Thread threadAmizade = new Thread(() -> {
            SwingUtilities.invokeLater(() -> readJTableAmizade());
        });
        Thread threadEmergencia = new Thread(() -> {
            SwingUtilities.invokeLater(() -> readJTableEmergencia());
        });
        Thread threadSaude = new Thread(() -> {
            SwingUtilities.invokeLater(() -> readJTableSaude());
        });
        Thread threadTrabalho = new Thread(() -> {
            SwingUtilities.invokeLater(() -> readJTableTrabalho());
        });
        Thread threadOutros = new Thread(() -> {
            SwingUtilities.invokeLater(() -> readJTableOutros());
        });

        threadFamilia.start();
        threadAmizade.start();
        threadEmergencia.start();
        threadSaude.start();
        threadTrabalho.start();
        threadOutros.start();

        try {
            threadFamilia.join();
            threadAmizade.join();
            threadEmergencia.join();
            threadSaude.join();
            threadTrabalho.join();
            threadOutros.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/
    public void ChamarEmOutroFrame() {
    
            readJTableFamilia();
            readJTableAmizade();
            readJTableEmergencia();
            readJTableSaude();
            readJTableTrabalho();
            readJTableOutros();       
}
  





    
     

}
