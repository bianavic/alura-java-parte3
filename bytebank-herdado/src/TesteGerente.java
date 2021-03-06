import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class TesteGerente {
    public static void main(String[] args) {

        Autenticavel referencia = new Cliente();

        Gerente g1 = new Gerente();  // gerente HERDA/CHAMA todos os atributos e características da classe Funcionario
        g1.setNome("Lugano");
        g1.setCpf("555555555-79");
        g1.setSalario(5000.0);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        g1.setSenha(2222);
        boolean autentica = g1.autentica(2222);
        System.out.println(autentica);

        System.out.println(g1.getBonificacao());

    }
}
