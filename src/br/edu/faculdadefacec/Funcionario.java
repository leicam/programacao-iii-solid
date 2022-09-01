package br.edu.faculdadefacec;

public class Funcionario {
    private String nome;
    private Double salario;
    private TipoFuncionario tipoFuncionario;

    public Funcionario (String nome, Double salario,
                        TipoFuncionario tipoFuncionario){
        this.nome = nome;
        this.salario = salario;
        this.tipoFuncionario = tipoFuncionario;
    }

    public String getNome(){
        return this.nome;
    }

    public Double getSalario(){
        if (TipoFuncionario
                .Estagiario.equals(this.tipoFuncionario)){
            return this.salario;
        }

        return this.salario + (this.salario * 0.10);
    }
}
