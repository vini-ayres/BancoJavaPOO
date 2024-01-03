public class ContaCorrente extends Conta {

    private double limiteCredito;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
    
    public void imprimirExtrato() {
        System.out.println("=== EXTRATO CONTA CORRENTE ===");
        super.imprimirInfos();
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public void utilizarCredito(double valor) {
        if (valor <= 0) {
            System.out.println("O valor a ser utilizado deve ser maior que zero.");
        } 
        else if (this.getSaldo() + limiteCredito >= 0) {
            limiteCredito -= valor;
            System.out.println("Crédito utilizado com sucesso! Confira seu novo limite de crédito: R$ " + limiteCredito);
        } else {
            System.out.println("Limite de crédito insuficiente.");
        }
    }
}
