package dio.desafio.banco;

import static dio.desafio.banco.Banco.nomeBanco;

public class Main {
    public static void main(String[] args) {
        Cliente teste1 = new Cliente();
        teste1.setNomeCliente("Teste 01");
        teste1.setDocumento("12345678912");
        //teste1.setDocumento("12345678912345");


        Conta contaCorrente = new ContaCorrente(teste1);

        Cliente teste2 = new Cliente();
        teste2.setNomeCliente("Teste 02");
        teste2.setDocumento("12345678912345");
        //teste2.setDocumento("12345678912");


        Conta contaPoupanca = new ContaPoupanca(teste2);

        System.out.println("Bem vindo(a) ao banco " + nomeBanco);

        contaCorrente.depositar(190);
        contaCorrente.transferir(100, contaPoupanca);
        contaPoupanca.sacar(50);

        contaCorrente.imprimirInformacoes();
        contaPoupanca.imprimirInformacoes();
    }
}
