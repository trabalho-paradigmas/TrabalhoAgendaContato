package DTO;

import DAO.ContatoTrabalhoDAO;
import java.sql.SQLException;

public class ContatoTrabalhoDTO extends ContatoDTO {
    private String telefone_comercial;
    private String departamento;

    public ContatoTrabalhoDTO(int id, String nome, String celular, String email, String telefone_comercial, String departamento) {
        super(id, nome, celular, email);
        this.telefone_comercial = telefone_comercial;
        this.departamento = departamento;
    }

    // Getter e Setter para o atributo Apelido

    public String getTelefone_comercial() {
        return telefone_comercial;
    }

    public void setTelefone_comercial(String telefone_comercial) {
        this.telefone_comercial = telefone_comercial;
    }
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    @Override
        public void cadastrar() throws SQLException {
        ContatoTrabalhoDAO contatoTrabalhoDAO = new ContatoTrabalhoDAO();
        contatoTrabalhoDAO.cadastrarContatoTrabalhoDAO(this);
        System.out.println("Contato de família inserido com sucesso!");
    }

    public Object getDeparatamento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
