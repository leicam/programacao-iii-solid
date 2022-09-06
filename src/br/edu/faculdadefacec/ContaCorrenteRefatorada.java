package br.edu.faculdadefacec;

public class ContaCorrenteRefatorada
        implements InterfaceContaRefatorada{
    private Double saldo = 0.0;

    @Override
    public void creditar(Double valor) {
        if (valor <= 0.0)
            throw new RuntimeException("Valor inválido");

        this.saldo += valor;
    }

    @Override
    public void debitar(Double valor) {
        if (valor <= 0.0)
            throw new RuntimeException("Valor inválido");

        if ((this.saldo - valor) <= 0.0)
            throw new RuntimeException("Valor inválido " +
                    "para débito!");

        this.saldo -= valor;
    }

    @Override
    public Double getSaldo() {
        return this.saldo;
    }
}
