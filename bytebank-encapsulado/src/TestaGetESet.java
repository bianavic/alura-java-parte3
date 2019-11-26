public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226); // com o construtor precisamos passar a agencia e a conta
        conta.setNumero(1337);

        System.out.println(conta.getNumero());

        Cliente fabi = new Cliente();
        // conta.titular = fabi

        fabi.setNome("fabiana ferlin");
        conta.setTitular(fabi);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("desenvolvedora");

        // o codigo acima em 2 linhas
//        Cliente titularDaConta = conta.getTitular();
//        titularDaConta.setProfissao("desenvolvedora");

        // todas as respostas abaixo imprimem o mesmo cliente
        // System.out.println(titularDaConta);
        System.out.println(fabi);
        System.out.println(conta.getTitular().getNome());

    }
}
