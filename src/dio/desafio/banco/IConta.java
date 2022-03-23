package dio.desafio.banco;

import dio.desafio.banco.Conta;

public interface IConta {

    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);
    void imprimirInformacoes();
}
