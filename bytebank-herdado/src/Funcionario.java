// Parent class
// base class
// Super class
// abstrato
// METODOS E ATRIBUTOS definidos na classe mae
public abstract class Funcionario {
        private String nome;
        private String cpf;
        // PROTECTED = publico para os FILHOS
        private double salario; // MODIFICADOR de visibilidade

        // criar construtor (qdo construtor nao é criado, o compilador insere automaticamente o construtor padrao.
//        public Funcionario() {
//
//        }

        // esta é a assinatura do metodo
        public double getBonificacao() {
            return this.salario * 0.05; // esta é a bonificacao PADRAO
        }

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
