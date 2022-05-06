package funcionarios;


public class PacienteClinica extends Pessoa {
    private String planoSaude;

    public PacienteClinica(String nome, String id, String nascimento, String planoSaude) {
        super(nome, id, nascimento);
        this.planoSaude = planoSaude;
    }
    
    @Override
    public String toString() {
        return super.toString()+String.format("PLANO DE SAUDE: %s, ", this.planoSaude);
    }
}
