// por que TesteContas consegue acessar os metodos da classe Conta?

public class TesteContas {
    public static void main(String[] args) {

        // reaproveitando metodos

        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200.0);

        cc.transfere(10.0, cp);  // polimorfismo

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());

    }
}
