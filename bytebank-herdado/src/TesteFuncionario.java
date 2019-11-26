public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario nero = new Funcionario();
        nero.setNome("Nero");
        nero.setCpf("444444444-77");
        nero.setSalario(2000.0);

        System.out.println(nero.getNome());
        System.out.println(nero.getBonificacao());

        // nero.salario = 300;

    }
}
