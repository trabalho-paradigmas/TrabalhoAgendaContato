package DTO;
import DAO.ContatoFamiliaDAO;
import java.sql.SQLException;


public class ContatoFamiliaDTO extends ContatoDTO {
    private String parentesco;
  

    public ContatoFamiliaDTO(int id, String nome, String celular, String email, String parentesco) {
        super(id, nome, celular, email);
        this.parentesco = parentesco;
;
    }

   

    // Getter e Setter para o atributo Apelido

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
    
    @Override
        public void cadastrar() throws SQLException {
        ContatoFamiliaDAO contatoFamiliaDAO = new ContatoFamiliaDAO();
        contatoFamiliaDAO.cadastrarContatoFamiliaDAO(this);
        System.out.println("Contato de família inserido com sucesso!");
    }
}
