

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial)  {
        if (titular == null || titular.isBlank()) {
            throw new NomeInvalidoException("Nome do titular inválido!");
        }
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente!");
        }
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }
    public String getTitular() {
        return titular;
    }
}
