package br.edu.faculdadefacec;

public class PrincipioAbertoFechado {
    public static void Executar(){
        ExecutarRefatorado();
    }

    private static void ExecutarLegado(){
        Estagiario estagiarioDois =
                new Estagiario("Estagiário Dois",
                        1500.00,
                        "RUA CBA 123");

        Vendedor vendedorDois =
                new Vendedor("Vendedor Dois",
                        3500.00,
                        "RUA ZXY 987");

        System.out.println("NOME | SALÁRIO | ENDEREÇO");

        System.out.println(estagiarioDois.getNome() + " | " +
                estagiarioDois.getSalario() + " | " +
                estagiarioDois.getEndereco());

        System.out.println(vendedorDois.getNome() + " | " +
                vendedorDois.getSalario() + " | " +
                vendedorDois.getEndereco());
    }

    private static void ExecutarRefatorado(){
        Estagiario estagiarioDois =
                new Estagiario("Estagiário Dois", 1500.00);
        estagiarioDois.setEndereco("RUA CBA 123");

        System.out.println("OCP: NOME | SALÁRIO | ENDEREÇO");

        System.out.println(estagiarioDois.getNome() + " | " +
                estagiarioDois.getSalario() + " | " +
                estagiarioDois.getEndereco());
    }
}
