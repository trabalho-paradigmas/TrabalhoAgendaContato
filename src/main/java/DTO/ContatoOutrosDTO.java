package DTO;

import DAO.ContatoOutrosDAO;
import java.sql.SQLException;

public class ContatoOutrosDTO extends ContatoDTO {
    private String telefone_comercial;
  

    public ContatoOutrosDTO(int id, String nome, String celular, String email, String telefone_comercial) {
        super(id, nome, celular, email);
        this.telefone_comercial = telefone_comercial;
    }

    // Getter e Setter para o atributo telefone_comercial

    public String getTelefone_comercial() {
        return telefone_comercial;
    }

    public void setTelefone_comercial(String telefone_comercial) {
        this.telefone_comercial = telefone_comercial;
    }
    
     @Override
        public void cadastrar() throws SQLException {
        ContatoOutrosDAO contatoOutrosDAO = new ContatoOutrosDAO();
        contatoOutrosDAO.cadastrarContatoFamiliaDAO(this);
        System.out.println("Contato de família inserido com sucesso!");
    }

    public Object getEspecializacao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
