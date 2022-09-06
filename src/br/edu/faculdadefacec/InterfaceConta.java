package br.edu.faculdadefacec;

public interface InterfaceConta {
    void creditar(Double valor);
    void debitar(Double valor);
    Double getSaldo();
    void investir(Double valor);
}
