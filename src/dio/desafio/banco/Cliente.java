package dio.desafio.banco;

public class Cliente {
    private String nomeCliente;
    private String documento;
    private String tipoConta;

    private static final int CPF_TAMANHO = 11;
    private static final int CNPJ_TAMANHO = 14;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setDocumento(String documento) {
        if (documento.length() == CPF_TAMANHO) {
            setDocumento(documento, tipoConta = "Pessoa Fisica");
        } else if (documento.length() == CNPJ_TAMANHO) {
            setDocumento(documento, tipoConta = "Pessoa Juridica");
        } else {
            throw new RuntimeException("Documento CPF/CNPJ inválido");
        }
    }

    private void setDocumento(String documento, String tipoConta) {
        this.documento = documento;
        this.tipoConta = tipoConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }
}
