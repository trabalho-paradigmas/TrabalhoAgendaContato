/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import DAO.ContatoAmizadeDAO;
import DTO.ContatoAmizadeDTO;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sabri
 */
public class ObservarDadosTabelaAmizade  implements  ObservarDadosTabela{   
  
    @Override
    public void lerDados(DefaultTableModel modelo, String textoPesquisa) throws SQLException {
        modelo.setNumRows(0);
        ContatoAmizadeDAO contato = new ContatoAmizadeDAO();
        for (ContatoAmizadeDTO c : contato.pesquisar(textoPesquisa)) {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getEmail(),
                c.getCelular(),
                c.getApelido()
            });
        }
    }
}
