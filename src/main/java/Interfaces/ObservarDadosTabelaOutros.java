/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;


import DAO.ContatoOutrosDAO;
import DTO.ContatoOutrosDTO;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sabri
 */
public class ObservarDadosTabelaOutros implements  ObservarDadosTabela{
    
    @Override
     public void  lerDados(DefaultTableModel modelo, String textoPesquisa) throws SQLException {
        modelo.setNumRows(0);
        ContatoOutrosDAO contato = new ContatoOutrosDAO();
        modelo.setRowCount(0); // limpar os registros da tabela
        for (ContatoOutrosDTO c : contato.pesquisar(textoPesquisa)) {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getEmail(),
                c.getCelular(),
                c.getTelefone_comercial()
            });
        }
    }
}
