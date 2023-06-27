/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.ConexaoDAO;
import DAO.ContatoAmizadeDAO;

import DAO.ContatoFamiliaDAO;
import DAO.ContatoTrabalhoDAO;
import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import Interfaces.ObservarDadosTabela;
import Interfaces.ObservarDadosTabelaAmizade;
import Interfaces.ObservarDadosTabelaFamilia;
import Interfaces.ObservarDadosTabelaOutros;
import Interfaces.ObservarDadosTabelaTrabalho;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sabri
 */
public class frmPrincipal extends javax.swing.JFrame {

//    frmAdicionarContato AdicionarContato = new frmAdicionarContato();
//    EditarContato EditarContato = new EditarContato();
    public frmPrincipal() throws SQLException {
        initComponents();
        lerTabelas();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        lblUsuario = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaFamilia = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        TextPesquisar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblFamilia = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaFamilia = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TabelaTrabalho = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        TabelaAmizade = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        TabelaOutros = new javax.swing.JTable();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        menuEditarUser = new javax.swing.JRadioButtonMenuItem();
        menuSairUser = new javax.swing.JRadioButtonMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUsuario.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblUsuario.setText("Usuario");

        panelPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TabelaFamilia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Email", "Celular", "Parentesco"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaFamilia);

        jScrollPane8.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        TextPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPesquisarActionPerformed(evt);
            }
        });
        TextPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextPesquisarKeyPressed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblFamilia.setText("Família");

        tabelaFamilia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Email", "Celular", "Parentesco"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tabelaFamilia);

        jLabel3.setText("Trabalho");

        TabelaTrabalho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Email", "Celular", "Celular comercial", "Departamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(TabelaTrabalho);

        jLabel1.setText("Amizade");

        jLabel2.setText("Outros");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
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

        TabelaAmizade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Email", "Celular", "Apelido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(TabelaAmizade);

        TabelaOutros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Email", "Celular", "Celular comercial"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(TabelaOutros);

        jDesktopPane2.setLayer(TextPesquisar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btnBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(lblFamilia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jScrollPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btnCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btnExcluir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btnEditar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jScrollPane6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jScrollPane7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(TextPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnBuscar))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFamilia)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(btnCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)))
                .addContainerGap(300, Short.MAX_VALUE))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(10, 10, 10)
                .addComponent(lblFamilia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar))
                .addGap(185, 185, 185))
        );

        jScrollPane8.setViewportView(jDesktopPane2);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(359, 359, 359)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 722, Short.MAX_VALUE)
        );

        jMenu2.setText("Opções de usuário");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        menuEditarUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuEditarUser.setSelected(true);
        menuEditarUser.setText("Editar");
        menuEditarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarUserActionPerformed(evt);
            }
        });
        jMenu2.add(menuEditarUser);

        menuSairUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuSairUser.setSelected(true);
        menuSairUser.setText("Sair");
        menuSairUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairUserActionPerformed(evt);
            }
        });
        jMenu2.add(menuSairUser);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void menuSairUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairUserActionPerformed
        //Deslogar
        sair();
    }//GEN-LAST:event_menuSairUserActionPerformed

    private void menuEditarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarUserActionPerformed
        //Envia para tela de edição do usuario
        retornaNomeUsuario();

    }//GEN-LAST:event_menuEditarUserActionPerformed

    private void TextPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextPesquisarActionPerformed

    private void TextPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextPesquisarKeyPressed
        if (evt.getKeyCode() == 10) {
            try {
                // enter pressionado
                lerTabelas();
            } catch (SQLException ex) {
                Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_TextPesquisarKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {

            lerTabelas();
        } catch (SQLException ex) {
            Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        cadastrarContatos();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        Excluir();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        enviaDadoTabela();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel( new FlatDarkLaf());
        } catch(Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frmPrincipal().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable TabelaAmizade;
    public javax.swing.JTable TabelaFamilia;
    public static javax.swing.JTable TabelaOutros;
    public static javax.swing.JTable TabelaTrabalho;
    private javax.swing.JTextField TextPesquisar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JDesktopPane jDesktopPane1;
    public javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblFamilia;
    public static javax.swing.JLabel lblUsuario;
    private javax.swing.JRadioButtonMenuItem menuEditarUser;
    private javax.swing.JRadioButtonMenuItem menuSairUser;
    public javax.swing.JPanel panelPrincipal;
    public static javax.swing.JTable tabelaFamilia;
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
                    jDesktopPane1.add(telaUsuarioVIEW);
                } catch (Exception erro) {
                    JOptionPane.showMessageDialog(null, "NOME DE USUARIO" + erro);
                }
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "NOME DE USUARIO" + erro);
        }

    }

    public void Excluir() {

        if (tabelaFamilia.getSelectedRow() != -1) {
            int linha = tabelaFamilia.getSelectedRow();
            int idContato = (int) tabelaFamilia.getValueAt(linha, 0);

            int confirma = JOptionPane.showConfirmDialog(null, "Deseja apagar contato?", "Atenção", JOptionPane.YES_NO_OPTION);

            if (confirma == JOptionPane.YES_OPTION) {
                ContatoFamiliaDAO contatoFamiliaDAO = new ContatoFamiliaDAO();
                contatoFamiliaDAO.delete(idContato);

                DefaultTableModel model = (DefaultTableModel) tabelaFamilia.getModel();
                model.removeRow(linha);
                model.fireTableDataChanged();
            }

        } else if (TabelaAmizade.getSelectedRow() != -1) {
            int linha = TabelaAmizade.getSelectedRow();
            int idContato = (int) TabelaAmizade.getValueAt(linha, 0);
            int confirma = JOptionPane.showConfirmDialog(null, "Deseja apagar contato?", "Atenção", JOptionPane.YES_NO_OPTION);
            if (confirma == JOptionPane.YES_OPTION) {
                ContatoAmizadeDAO contatoAmizadeDAO = new ContatoAmizadeDAO();
                contatoAmizadeDAO.delete(idContato);

                DefaultTableModel model = (DefaultTableModel) TabelaAmizade.getModel();
                model.removeRow(linha);
                model.fireTableDataChanged();
            }

        } else if (TabelaTrabalho.getSelectedRow() != -1) {
            int linha = TabelaTrabalho.getSelectedRow();
            int idContato = (int) TabelaTrabalho.getValueAt(linha, 0);

            int confirma = JOptionPane.showConfirmDialog(null, "Deseja apagar contato?", "Atenção", JOptionPane.YES_NO_OPTION);

            if (confirma == JOptionPane.YES_OPTION) {
                ContatoTrabalhoDAO contatoTrabalhoDAO = new ContatoTrabalhoDAO();
                contatoTrabalhoDAO.delete(idContato);

                DefaultTableModel model = (DefaultTableModel) TabelaTrabalho.getModel();
                model.removeRow(linha);
                model.fireTableDataChanged();
            }

        } else if (TabelaOutros.getSelectedRow() != -1) {
            int linha = TabelaOutros.getSelectedRow();
            int idContato = (int) TabelaOutros.getValueAt(linha, 0);
            int confirma = JOptionPane.showConfirmDialog(null, "Deseja apagar contato?", "Atenção", JOptionPane.YES_NO_OPTION);

            if (confirma == JOptionPane.YES_OPTION) {
                ContatoTrabalhoDAO contatoTrabalhoDAO = new ContatoTrabalhoDAO();
                contatoTrabalhoDAO.delete(idContato);

                DefaultTableModel model = (DefaultTableModel) TabelaOutros.getModel();
                model.removeRow(linha);
                model.fireTableDataChanged();
            }
        }
    }

    private void enviaDadoTabela() {
        if (tabelaFamilia.getSelectedRow() != -1) {
            DefaultTableModel model = (DefaultTableModel) tabelaFamilia.getModel();
            int selectedRow = tabelaFamilia.getSelectedRow();

            int id = Integer.parseInt(tabelaFamilia.getValueAt(selectedRow, 0).toString());
            String nome = (String) tabelaFamilia.getValueAt(selectedRow, 1);
            String email = (String) tabelaFamilia.getValueAt(selectedRow, 2);
            String celular = (String) tabelaFamilia.getValueAt(selectedRow, 3);
            String parentesco = (String) tabelaFamilia.getValueAt(selectedRow, 4);

            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(null, "Nenhum contato selecionado");
                return;
            } else {
                frmAttContato editarContato = new frmAttContato();
                editarContato.TextNome.setText(nome);
                editarContato.lblId.setText(String.valueOf(id));
                editarContato.TextCelular.setText(celular);
                editarContato.TextEmail.setText(email);
                editarContato.TextParentesco.setText(parentesco);
                editarContato.TextComercial.setEnabled(false);
                editarContato.TextDepartamento.setEditable(false);
                editarContato.TextApelido.setEditable(false);
                editarContato.TextComercial.setEditable(false);
                editarContato.setVisible(true);
                jDesktopPane1.add(editarContato);
                //editarContato.setLocationRelativeTo(null);
                editarContato.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            }
        } else if (TabelaAmizade.getSelectedRow() != -1) {
            DefaultTableModel model = (DefaultTableModel) TabelaAmizade.getModel();
            int selectedRow = TabelaAmizade.getSelectedRow();

            int id = Integer.parseInt(TabelaAmizade.getValueAt(selectedRow, 0).toString());
            String nome = (String) TabelaAmizade.getValueAt(selectedRow, 1);
            String email = (String) TabelaAmizade.getValueAt(selectedRow, 2);
            String celular = (String) TabelaAmizade.getValueAt(selectedRow, 3);
            String parentesco = (String) TabelaAmizade.getValueAt(selectedRow, 4);

            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(null, "Nenhum contato selecionado");
                return;
            } else {
                frmAttContato editarContato = new frmAttContato();
                editarContato.TextNome.setText(nome);
                editarContato.lblId.setText(String.valueOf(id));
                editarContato.TextCelular.setText(celular);
                editarContato.TextEmail.setText(email);
                editarContato.TextApelido.setText(parentesco);
                editarContato.TextDepartamento.setEditable(false);
                editarContato.TextComercial.setEditable(false);
                editarContato.TextParentesco.setEditable(false);
                editarContato.setVisible(true);
                jDesktopPane1.add(editarContato);
                editarContato.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            }
        } else if (TabelaTrabalho.getSelectedRow() != -1) {
            DefaultTableModel model = (DefaultTableModel) TabelaTrabalho.getModel();
            int selectedRow = TabelaTrabalho.getSelectedRow();
            int id = Integer.parseInt(TabelaOutros.getValueAt(selectedRow, 0).toString());
            String nome = (String) TabelaTrabalho.getValueAt(selectedRow, 1);
            String email = (String) TabelaTrabalho.getValueAt(selectedRow, 2);
            String celular = (String) TabelaTrabalho.getValueAt(selectedRow, 3);
            String parentesco = (String) TabelaTrabalho.getValueAt(selectedRow, 4);

            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(null, "Nenhum contato selecionado");
                return;
            } else {
                frmAttContato editarContato = new frmAttContato();
                editarContato.TextNome.setText(nome);
                editarContato.lblId.setText(String.valueOf(id));
                editarContato.TextCelular.setText(celular);
                editarContato.TextEmail.setText(email);
                editarContato.TextComercial.setText(parentesco);
                editarContato.TextDepartamento.setText(parentesco);
                editarContato.TextParentesco.setEditable(false);
                editarContato.TextApelido.setEditable(false);
                editarContato.setVisible(true);
                jDesktopPane1.add(editarContato);
                //editarContato.setLocationRelativeTo(null);
                editarContato.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            }
        } else if (TabelaOutros.getSelectedRow() != -1) {
            DefaultTableModel model = (DefaultTableModel) TabelaOutros.getModel();
            int selectedRow = TabelaOutros.getSelectedRow();

            int id = Integer.parseInt(TabelaOutros.getValueAt(selectedRow, 0).toString());
            String nome = (String) TabelaOutros.getValueAt(selectedRow, 1);
            String email = (String) TabelaOutros.getValueAt(selectedRow, 2);
            String celular = (String) TabelaOutros.getValueAt(selectedRow, 3);
            String parentesco = (String) TabelaOutros.getValueAt(selectedRow, 4);

            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(null, "Nenhum contato selecionado");
                return;
            } else {
                frmAttContato editarContato = new frmAttContato();
                editarContato.lblId.setText(String.valueOf(id));
                editarContato.TextNome.setText(nome);
                editarContato.TextCelular.setText(celular);
                editarContato.TextEmail.setText(email);
                editarContato.TextComercial.setText(parentesco);
                editarContato.TextApelido.setEditable(false);
                editarContato.TextParentesco.setEditable(false);
                editarContato.TextDepartamento.setEditable(false);
                editarContato.setVisible(true);
                jDesktopPane1.add(editarContato);
                //editarContato.setLocationRelativeTo(null);
                editarContato.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            }
        }

    }

    public void cadastrarContatos() {   // Encaminhando para a tela de adicionar contato
        frmAdcContato adicionarContato = new frmAdcContato();
        adicionarContato.setVisible(true);
        jDesktopPane1.add(adicionarContato);
    }

    /* Esses métodos tem como objetivo atualizar a tabela com 
    os dados mais recentes obtidos do banco de dados, refletindo 
    assim as alterações realizadas nos contatos e tambem para o campo de pesquisa */
    public void lerTabela(ObservarDadosTabela observador, JTable tabela, JTextField campoPesquisa) throws SQLException {

        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        observador.lerDados(modelo, campoPesquisa.getText());

    }

    public void lerTabelas() throws SQLException {
        lerTabela((ObservarDadosTabela) new ObservarDadosTabelaFamilia(), tabelaFamilia, TextPesquisar);
        lerTabela((ObservarDadosTabela) new ObservarDadosTabelaAmizade(), TabelaAmizade, TextPesquisar);
        lerTabela((ObservarDadosTabela) new ObservarDadosTabelaTrabalho(), TabelaTrabalho, TextPesquisar);
        lerTabela((ObservarDadosTabela) new ObservarDadosTabelaOutros(), TabelaOutros, TextPesquisar);

    }

}
