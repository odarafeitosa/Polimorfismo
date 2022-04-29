package funcionarios;

public abstract class Pessoa {
    private String nome;
    private String identidade;
    private String nascimento;

    protected Pessoa(String nome, String id, String nascimento) {
        this.nome = nome;
        this.identidade = id;
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return String.format("NOME: %s, IDENTIDADE: %s, NASCIMENTO: %s, ", this.nome, this.identidade, this.nascimento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String Identidade) {
        this.identidade = Identidade;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
}