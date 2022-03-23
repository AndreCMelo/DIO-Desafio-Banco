package dio.desafio.banco;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;
    protected String tipoConta;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
        this.tipoConta = cliente.getTipoConta();
    }

    @Override
    public void sacar(double valor) {
        if(this.saldo < valor) {
            System.out.println("Operacao cancelada, saldo insuficiente");
        } else {
            this.saldo -= valor;
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(this.saldo < valor) {
            System.out.println("Operacao cancelada, saldo insuficiente");
        } else {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("=====EXTRATO=====");
        System.out.printf("Titular: %s\n", this.cliente.getNomeCliente());
        System.out.printf("Conta: %s\n", this.cliente.getTipoConta());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Numero da Conta: %d\n", this.numeroConta);
        System.out.printf("Saldo: %.2f\n", this.saldo);
        System.out.println("=================");
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }


}
