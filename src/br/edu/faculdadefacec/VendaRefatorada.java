package br.edu.faculdadefacec;

public class VendaRefatorada {
    private Produto produto;

    public VendaRefatorada(Produto produto){
        this.produto = produto;
    }

    @Override
    public String toString(){
        return this.produto.getNome() +
                " | " + this.produto.getValor();
    }
}
