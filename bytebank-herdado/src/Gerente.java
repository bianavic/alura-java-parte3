// Gerente É UM funcionario | HERDA da Classe funcionario | EXTENDS
// Child class / SUB class
// OBJETO Gerente criado: nome = null, cpf = null, salario = 0.0
public class Gerente extends Funcionario { // extends => caracteristicas, atributos e metodos da classe Funcionario, senha = 0

    private int senha; // se nao tem valor na senha, automaticamente retorna zero

    public void setSenha(int senha) {
        this.senha = senha;
    }
        // SOBRECARGA novo metodo, recebendo 2 parametros
        // agora temos 2 metodos autentica na mesma classe
        // nao leva em conta visibilidade ou retorno do metodo, apenas os parametros. nao depende de haranca
        public boolean autentica(int senha) {
            if(this.senha == senha) {
                return true;
            } else {
                return false;
            }
        }
        // sobrescrita / reescrita da super class na classe filha usando a mesma ASSINATURA / mesma VISIBILIODADE
        public double getBonificacao() { // mesma ASSINATURA /repare que é o mesmo metodo, parametors, nome... da super class
        System.out.println("Chamando o metodo de bonificacao do Gerente");
        return super.getBonificacao() + super.getSalario(); // salario esta definido na classe mae/ vem da super class
        }

    }
