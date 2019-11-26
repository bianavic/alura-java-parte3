public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226); // agora que temos o construtor esta linha de codigo nao é mais utilizada.
        System.out.println(conta.getAgencia());
        conta.setAgencia(123123);
//        // conta esta inconsistencia com nossa regra de negocio
//        conta.setAgencia((-50));
//        conta.setNumero(-330);

        Conta conta2 = new Conta(1337, 161616);
        Conta conta3 = new Conta(2121, 262626);

        System.out.println(Conta.getTotal());
    }
}
