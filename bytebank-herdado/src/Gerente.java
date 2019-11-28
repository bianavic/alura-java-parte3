// gerente é um funcionario / gerente herda da classe funcionario
public class Gerente extends FuncionarioAutenticavel { // extends => caracteristicas, atributos e metodos da classe Funcionario, senha = 0

        public double getBonificacao() { // mesma ASSINATURA /repare que é o mesmo metodo, parametors, nome... da super class
        System.out.println("Chamando o metodo de bonificacao do Gerente");
        return super.getSalario();
        }

    }
