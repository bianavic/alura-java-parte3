// classe gerente é um funcionario / gerente herda da classe funcionario
// proibido no java fazer heranca multipla - resolvemos este caso atraves de INTERFACES
// INTERFACES podem ser implsmentadas 2
// a classe GERENTE é um FUNCIONARIO, herda da classe FUNCIONARIO, assina o contrato AUTENTICAVEL, e é um AUTENTICAVEL
// a classe GERENTE é FUNCIONARIO e é AUTENTICÁVEL
public class Gerente extends Funcionario implements Autenticavel { // extends => caracteristicas, atributos e metodos da classe Funcionario, senha = 0

    private int senha;

        public double getBonificacao() { // mesma ASSINATURA /repare que é o mesmo metodo, parametors, nome... da super class
        System.out.println("Chamando o metodo de bonificacao do Gerente");
        return super.getSalario();
        }

    // implementando metodos concretos
    @Override
    public void setSenha(int senha) {
this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
}
