package br.edu.faculdadefacec;

public class PrincipioResposabilidadeUnica {
    public static void Executar(){
        Funcionario estagiario =
                new Funcionario("Estagiario 1",
                        1500.00,
                        TipoFuncionario.Estagiario);

        Funcionario vendedor =
                new Funcionario("Vendedor 1",
                        3500.00,
                        TipoFuncionario.Vendedor);

        System.out.println("NOME | SALARIO");
        System.out.println(estagiario.getNome() + " | " +
                estagiario.getSalario());

        System.out.println(vendedor.getNome() + " | " +
                vendedor.getSalario());
    }
}