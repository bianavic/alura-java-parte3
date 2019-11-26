// aqui colocamos o metodo que vai iniciar nossa aplicacao, que vai INSTANCIAR, criar um objeto do tipo conta.
// "NEW" = tiramos a Classe do papel e criamos/instanciamos um novo objeto daquele tipo. Ele foi guardado na memoria.
public class CriaConta {
    public static void main(String[] args) {
        // atribuir valor ao atributp
        Conta primeiraConta = new Conta(); // agora consigo me referencar a uma conta X
        primeiraConta.deposita(200);
        System.out.println(primeiraConta.getSaldo()); // acesso de 1 atributo de 1 objeto

        primeiraConta.saca(100);
        System.out.println("Primeira conta tem " + primeiraConta.getSaldo());

        Conta segundaConta = new Conta();
        segundaConta.saca(300);
        System.out.println("Segunda conta tem " + segundaConta.getSaldo());

        primeiraConta.setAgencia(146);

        // a cada novo objeto criado todos os campos dos atributos sao zerados
        System.out.println(primeiraConta.getAgencia());
        System.out.println(primeiraConta.getNumero());

        segundaConta.setAgencia(146);
        System.out.println("agora a segunda conta esta na agencia " + segundaConta.getAgencia());

        if(primeiraConta == segundaConta) { // dentro desta variavel nao tem objetos por isso continuam sendo contas diferentes
            System.out.println("mesma conta");
        } else {
            System.out.println("as contas sao diferentes");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);

        Conta conta1 = new Conta();
        conta1.setTitular("Fabiana");

        Conta conta2 = new Conta();
        conta2.setTitular("André");
        conta2.setSaldo(1000);

        Conta conta3 = new Conta();
        conta3.setTitular("Vanessa");
        conta3.setSaldo(10000);

        System.out.println(conta1.getTitular());
        System.out.println(conta2.getTitular());
        System.out.println(conta3.getTitular());

    }
}
