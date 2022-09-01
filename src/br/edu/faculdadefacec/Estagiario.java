package br.edu.faculdadefacec;

public class Estagiario extends AbstractFuncionario {

    public Estagiario(String nome, Double salario) {
        super(nome, salario);
    }

    public Estagiario(String nome, Double salario,
                      String endereco) {
        super(nome, salario, endereco);
    }

    @Override
    public Double getSalario() {
        return this.salario;
    }
}
