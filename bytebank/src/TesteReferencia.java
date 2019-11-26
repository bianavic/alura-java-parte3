public class TesteReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.deposita(300);

        System.out.println("O getSaldo() da primeira conta é: " + primeiraConta.getSaldo());

        Conta segundaConta = primeiraConta;
        System.out.println("O getSaldo() da segunda conta é: " + segundaConta.getSaldo());

        segundaConta.setSaldo(100);
        // System.out.println(segundaConta.getSaldo());

        System.out.println(primeiraConta.getSaldo());

        if(primeiraConta == segundaConta) {
            System.out.println("sao a mesmissima conta");
        }
    }
}
