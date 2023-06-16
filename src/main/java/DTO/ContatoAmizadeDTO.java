package DTO;
import DAO.ContatoAmizadeDAO;
import java.sql.SQLException;

import java.sql.SQLException;

public class ContatoAmizadeDTO extends ContatoDTO {
    private String apelido;

    public ContatoAmizadeDTO(int id, String nome, String celular, String email, String apelido) {
        super(id, nome, celular, email);
        this.apelido = apelido;
    }

    // Getter e Setter para o atributo Apelido

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    
     @Override
        public void cadastrar() throws SQLException {
        ContatoAmizadeDAO contatoAmizadeDAO = new ContatoAmizadeDAO();
        contatoAmizadeDAO.cadastrarContatoAmizadeDAO(this);
        System.out.println("Contato de família inserido com sucesso!");
    }
}
