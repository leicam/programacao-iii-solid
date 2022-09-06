package br.edu.faculdadefacec;

public class PrincipioSegregacaoInterface {
    public static void Executar(){
        ExecutarRefatorado();
    }

    private static void ExecutarLegado(){
        System.out.println("ISP");
        ContaCorrente contaCorrente =
                new ContaCorrente();

        contaCorrente.creditar(120.33);
        contaCorrente.debitar(0.67);
        System.out.println("Meu saldo é: "
                + contaCorrente.getSaldo());
    }

    private static void ExecutarRefatorado(){
        System.out.println("ISP");

        ContaCorrenteRefatorada contaCorrente =
                new ContaCorrenteRefatorada();

        contaCorrente.creditar(121.33);
        contaCorrente.debitar(0.89);
        System.out.println("Saldo conta corrente: "
                + contaCorrente.getSaldo());

        ContaInvestimentoRefatorada contaInvestimento =
                new ContaInvestimentoRefatorada();

        contaInvestimento.creditar(256.99);
        contaInvestimento.debitar(1.73);
        contaInvestimento.investir(200.00);
        System.out.println("Saldo conta investimento:"
                + contaInvestimento.getSaldo());
        System.out.println("Valor investido: "
                + contaInvestimento.getInvestimento());
    }
}
