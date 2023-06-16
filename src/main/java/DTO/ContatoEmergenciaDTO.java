package DTO;

import DAO.ContatoEmergenciaDAO;
import java.sql.SQLException;


public class ContatoEmergenciaDTO extends ContatoDTO {

    public ContatoEmergenciaDTO(int id, String nome, String celular, String email) {
        super(id, nome, celular, email);
       
    }  
    @Override
    public void cadastrar() throws SQLException {
        ContatoEmergenciaDAO contatoEmergenciaDAO = new ContatoEmergenciaDAO();
        contatoEmergenciaDAO.cadastrarContatoEmergenciaDAO(this);
        System.out.println("Contato de emergência inserido com sucesso!");
    }

}
