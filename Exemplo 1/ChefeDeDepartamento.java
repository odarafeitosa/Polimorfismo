package funcionarios;


public class ChefeDeDepartamento extends Funcionario {
    private String departamento;

   public ChefeDeDepartamento(Funcionario funcionario, String departamento, String admissao){

    super(funcionario.getNome(), funcionario.getIdentidade(), funcionario.getNascimento(), admissao, funcionario.qualSalario());
    this.departamento = departamento;
   }

    public String qualDepartamento(){
        return departamento;
    }
    
    @Override
    public double qualSalario() {
    	return super.qualSalario()*0.75;
    }
}
