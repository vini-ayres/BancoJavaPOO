public class ContaPoupanca extends Conta {

    private static final double TAXA_SELIC = 0.5/100.0;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("=== EXTRATO CONTA POUPANCA ===");
        super.imprimirInfos();
    }

    public void calcularRendimento(int meses) {
        double valor = saldo + (this.saldo * TAXA_SELIC) * meses;
        System.out.println("O seu rendimento para o(s) proximo(s) " + meses + " mes(es) sera de " + valor);
    }
}
