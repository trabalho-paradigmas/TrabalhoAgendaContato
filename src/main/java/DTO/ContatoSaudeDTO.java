package DTO;
import DAO.ContatoSaudeDAO;
import java.sql.SQLException;

public class ContatoSaudeDTO extends ContatoDTO {
    private String telefone_comercial;
    private String especializacao;

    public ContatoSaudeDTO(int id, String nome, String celular, String email, String telefone_comercial, String especializacao) {
        super(id, nome, celular, email);
        this.telefone_comercial = telefone_comercial;
        this.especializacao = especializacao;
    }

    // Getter e Setter para o atributo Apelido

    public String getTelefone_comercial() {
        return telefone_comercial;
    }

    public void setTelefone_comercial(String telefone_comercial) {
        this.telefone_comercial = telefone_comercial;
    }
    
    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }
    
    @Override
        public void cadastrar() throws SQLException {
        ContatoSaudeDAO contatoSaudeDAO = new ContatoSaudeDAO();
        contatoSaudeDAO.cadastrarContatoSaudeDAO(this);
        System.out.println("Contato de Saúde inserido com sucesso!");
    }
}
