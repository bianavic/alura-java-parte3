public class TesteReferencias {

    public static void main(String[] args) {

        // definir o tipo da variavel <===> nome da classe para chamar o construtor
        // Ja que gerente é 1 funcionario, posso declarar 1 variavel do tipo mais generico: Funcionario

        // Posso utilizar a referencia mais generico (Funcionario)
        Funcionario g1 = new Gerente(); // criando 1 objeto do tipo gerente, declarando uma variavel do tipo gerente e atribuindo a referencia a essa variavel
        g1.setNome("Lugano");
        g1.setSalario(5000.0);

        Funcionario f = new Funcionario();
        f.setSalario(2000.0);

        Funcionario ev = new EditorVideo();
        ev.setSalario(2500.0);

        Design d = new Design();
        d.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(f);
        controle.registra(ev);
        controle.registra(d);

        System.out.println(controle.getSoma());
    }
}
