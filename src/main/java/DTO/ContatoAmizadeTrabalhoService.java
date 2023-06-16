/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import DAO.ContatoAmizadeDAO;
import DAO.ContatoTrabalhoDAO;

import java.sql.SQLException;

public class ContatoAmizadeTrabalhoService {
     public static void adicionarContatoAmizadeTrabalho(ContatoAmizadeDTO contato_amizade, ContatoTrabalhoDTO contato_trabalho) throws SQLException {
        ContatoAmizadeDAO contatoAmizadeDAO = new ContatoAmizadeDAO();
        ContatoTrabalhoDAO contatoTrabalhoDAO = new ContatoTrabalhoDAO();

        // Inserir o contato na tabela contato_familia
        contatoAmizadeDAO.cadastrarContatoAmizadeDAO(contato_amizade);

        // Inserir o contato na tabela contato_emergencia
        contatoTrabalhoDAO.cadastrarContatoTrabalhoDAO(contato_trabalho);
    }
    
}
