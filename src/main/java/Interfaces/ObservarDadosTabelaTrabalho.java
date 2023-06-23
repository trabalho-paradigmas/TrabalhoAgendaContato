/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;



import DAO.ContatoTrabalhoDAO;

import DTO.ContatoTrabalhoDTO;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sabri
 */
public class ObservarDadosTabelaTrabalho implements  ObservarDadosTabela{
    
     @Override
     public void  lerDados(DefaultTableModel modelo, String textoPesquisa) throws SQLException {
        modelo.setNumRows(0);
        ContatoTrabalhoDAO contato = new ContatoTrabalhoDAO();
        modelo.setRowCount(0); // limpar os registros da tabela
        for (ContatoTrabalhoDTO c : contato.pesquisar(textoPesquisa)) {
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
