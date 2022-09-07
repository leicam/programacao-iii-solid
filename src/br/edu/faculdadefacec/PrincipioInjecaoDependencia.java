package br.edu.faculdadefacec;

public class PrincipioInjecaoDependencia {
    public static void Executar(){
        ExecutarRefatorado();
    }

    private static void ExecutarLegado(){
        Venda venda = new Venda();
        venda.setNomeProduto("COCA-COLA 350ml");
        venda.setValorProduto(2.99);

        System.out.println("VENDA FATURADA");
        System.out.println("PRODUTO | VALOR");
        System.out.println(venda.getProduto().getNome() +
                " | " + venda.getProduto().getValor());

    }

    private static void ExecutarRefatorado(){
        Produto produto =
                new Produto();

        produto.setNome("COCA-COLA 350ml");
        produto.setValor(2.99);

        VendaRefatorada venda =
                new VendaRefatorada(produto);

        System.out.println("VENDA FATURADA");
        System.out.println("PRODUTO | VALOR");
        System.out.println(venda.toString());
    }
}
