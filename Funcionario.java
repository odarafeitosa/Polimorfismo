package funcionarios;

public class Funcionario extends Pessoa {
    private double salario;
    private String admissao;

    public Funcionario(String nome, String id, String nascimento, String admissao, double salario) {
        super(nome, id, nascimento);
        this.salario = salario;
        this.admissao = admissao;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("ADIMISSAO: %s, SALARIO: %f",  this.admissao, this.salario);
    }

    public double qualSalario(){
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getAdmissao() {
        return admissao;
    }

    public void setAdmissao(String admissao) {
        this.admissao = admissao;
    }

    
}
