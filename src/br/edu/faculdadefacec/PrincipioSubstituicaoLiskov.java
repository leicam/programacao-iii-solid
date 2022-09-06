package br.edu.faculdadefacec;

public class PrincipioSubstituicaoLiskov {
    public static void Executar(){
        ExecutarRefatorado();
    }

    private static void ExecutarLegado(){
        Estagiario estagiarioDois =
                new Estagiario("Estagiário Dois", 1500.00);
        estagiarioDois.setEndereco("RUA CBA 123");

        Vendedor vendedorDois =
                new Vendedor("Vendedor Dois", 3500.00);
        vendedorDois.setEndereco("RUA HJS 789");

        System.out.println("NOME | SALÁRIO | ENDEREÇO");

        System.out.println(estagiarioDois.getNome() + " | " +
                estagiarioDois.getSalario() + " | " +
                estagiarioDois.getEndereco());

        System.out.println(vendedorDois.getNome() + " | " +
                vendedorDois.getSalario() + " | " +
                vendedorDois.getEndereco());
    }

    private static void ExecutarRefatorado() {
        Estagiario estagiarioDois =
                new Estagiario("Estagiário Dois", 1500.00);
        estagiarioDois.setEndereco("RUA CBA 123");

        Vendedor vendedorDois =
                new Vendedor("Vendedor Dois", 3500.00);
        vendedorDois.setEndereco("RUA HJS 789");

        System.out.println("LSP: NOME | SALÁRIO | ENDEREÇO");

        imprimir(estagiarioDois);
        imprimir(vendedorDois);
    }

    private static void imprimir(AbstractFuncionario funcionario){
        System.out.println(funcionario.getNome() + " | " +
                funcionario.getSalario() + " | " +
                funcionario.getEndereco());
    }
}
