package br.edu.faculdadefacec;

public abstract class AbstractFuncionario {
    private String nome;
    protected Double salario;
    private String endereco;

    public AbstractFuncionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public AbstractFuncionario(String nome, Double salario,
                               String endereco) {
        this.nome = nome;
        this.salario = salario;
        this.endereco = endereco;
    }

    public String getNome(){
        return this.nome;
    }
    public String getEndereco() {return this.endereco;}

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    abstract Double getSalario();
}
