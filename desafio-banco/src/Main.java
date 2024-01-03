public class Main {
    public static void main(String[] args) {
        Cliente vinicius = new Cliente("Vinicius", "123.456.789-10");

        ContaCorrente cc = new ContaCorrente(vinicius);
        ContaPoupanca cp = new ContaPoupanca(vinicius);

        cc.depositar(1000);
        cc.transferir(500, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc.setLimiteCredito(100);
        cc.utilizarCredito(20);

        cp.calcularRendimento(12);
    }
}
