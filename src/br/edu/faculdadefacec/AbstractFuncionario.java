package br.edu.faculdadefacec;

public abstract class AbstractFuncionario {
    private String nome;
    protected Double salario;

    public AbstractFuncionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome(){
        return this.nome;
    }

    abstract Double getSalario();
}
