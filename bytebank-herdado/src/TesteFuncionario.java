public class TesteFuncionario {
    public static void main(String[] args) {

        // por nao ser mais possivel criar 1 funcionario, alteramos 'new Funcionario' para 'new Gerente
        // assim temos um filho concreto (Gerente), da classe Funcionario
        Funcionario nero = new Gerente();
        nero.setNome("Nero");
        nero.setCpf("444444444-77");
        nero.setSalario(2000.0);

        System.out.println(nero.getNome());
        System.out.println(nero.getBonificacao());

    }
}
