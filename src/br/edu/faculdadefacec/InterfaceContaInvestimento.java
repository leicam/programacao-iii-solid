package br.edu.faculdadefacec;

public interface InterfaceContaInvestimento
        extends InterfaceContaRefatorada{
    void investir(Double valor);
    Double getInvestimento();
}
