
// METODOS E ATRIBUTOS definidos na classe mae
// ABSTRACT NA CLASSE => nao pode instanciar objetos desta classe, pq é abstrata, deixou de ser concreto
// a heranca continua
public abstract class Funcionario {

        private String nome;
        private String cpf;
        // PROTECTED = publico para os FILHOS
        private double salario; // MODIFICADOR de visibilidade

        // ABSTRACT NO METODO => sem corpo, nao ha implementacao. OBRIGA os filhos a implementar esse metodo abstrato.
        // Como não podemos ter um método concreto, o declararemos como abstrato
        public double getBonificacao() {
            return 0;
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

    // implementando metodos concretos
    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);
}
