/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import DAO.ContatoFamiliaDAO;
import DTO.ContatoFamiliaDTO;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sabri
 */
public class ObservarDadosTabelaFamilia implements  ObservarDadosTabela  {    
   
    @Override
    public void  lerDados(DefaultTableModel modelo, String textoPesquisa) throws SQLException {
        modelo.setNumRows(0);
        ContatoFamiliaDAO contato = new ContatoFamiliaDAO();
        modelo.setRowCount(0); // limpar os registros da tabela
        for (ContatoFamiliaDTO c : contato.pesquisar(textoPesquisa)) {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getEmail(),
                c.getCelular(),
                c.getParentesco()
            });
        }
    }
    
}
