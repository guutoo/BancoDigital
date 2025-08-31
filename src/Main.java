public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente(1, 123);
        Conta poupanca = new ContaPoupanca(1, 456);

        cc.depositar(1000);
        cc.transferir(300, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
