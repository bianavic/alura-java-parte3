// Parent class
// base class
// Super class
// abstrato
// METODOS E ATRIBUTOS definidos na classe mae
// nao pode instanciar esta classe, pq é abstrata
public abstract class Funcionario {
        private String nome;
        private String cpf;
        // PROTECTED = publico para os FILHOS
        private double salario; // MODIFICADOR de visibilidade

        // criar construtor (qdo construtor nao é criado, o compilador insere automaticamente o construtor padrao.
//        public Funcionario() {
//
//        }

        // Como não podemos ter um método concreto, o declararemos como abstrato
        // Metodo sem corpo, nao ha implementacao
        public abstract double getBonificacao();

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

    }
