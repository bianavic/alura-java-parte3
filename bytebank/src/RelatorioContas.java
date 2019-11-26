import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RelatorioContas {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.setTitular("Fabiana");
        System.out.println(conta1.getTitular());

        Conta conta2 = new Conta();
        conta2.setTitular("André");
        conta2.setSaldo(1000);
        System.out.println(conta2.getTitular());

        Conta conta3 = new Conta();
        conta3.setTitular("Vanessa");
        conta3.setSaldo(10000);
        System.out.println(conta3.getTitular());

        List<Conta> contas = new ArrayList<>();

        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);

        List Conta = new ArrayList<>(Arrays.asList(conta1, conta2, conta3));

//        contas = contas.stream()
//                .filter(conta -> conta % 2 == 0);

        System.out.println(contas);
    }
}
