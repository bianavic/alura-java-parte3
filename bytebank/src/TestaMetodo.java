public class TestaMetodo {

    public static void main(String[] args) {
        Conta conta = new Conta();
        // invocar metodo usa ponto + parenteses
       // conta.saldo = 100; // atribuicao
        conta.deposita(50); // invocar metodo
        System.out.println(conta.getSaldo());

        boolean conseguiuRetirar = conta.saca(20);
        System.out.println(conta.getSaldo());
        System.out.println(conseguiuRetirar);

        Conta outraConta = new Conta();
        outraConta.deposita(1000);
    // transferir da outraConta para a conta
    // por que é metodo = porque é a maneira de transferir uma conta dentro de outra conta.
        // lado esquerdo é sempre uma referencia (outraConta) a um objeto(deposita)
        boolean sucessoTransferencia = outraConta.transfere(3000, conta);
       if (sucessoTransferencia) {
           System.out.println("Sucesso");
       } else {
           System.out.println("Faltou dinheiro");
       }
        System.out.println(outraConta.getSaldo());
        System.out.println(conta.getSaldo());

        conta.setTitular("Fabiana Ferlin");
        System.out.println(conta.getTitular());
    }
}
