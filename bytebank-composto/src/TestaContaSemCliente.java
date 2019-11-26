public class TestaContaSemCliente {

    public static void main(String[] args) {
        Conta contaDaVanessa = new Conta();
        System.out.println(contaDaVanessa.getSaldo());

        // criar novo Cliente parta associar Conta e Cliente
        contaDaVanessa.titular = new Cliente();
        System.out.println(contaDaVanessa.titular);

        // aqui ainda nao existe 1 cliente na memoria
        // associacao da variavel contaDaVanessa ao objeto Conta
        contaDaVanessa.titular.nome = "Vanessa";
        System.out.println(contaDaVanessa.titular.nome);
    }
}
