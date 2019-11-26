public class ControleBonificacao {

    private double soma;

    // Gerente + Funcionario: 3 metodos que variam nos parametros
    // aqui vamos usar apenas 1 metodo (Funcionario)
    // é uma referencia do tipo funcionario

    public void registra(Funcionario f) { // mesmo com referencia generica (tipo funcionario), ao executar o codigo sempre sera chamado o metodo especifico
        double boni = f.getBonificacao();
        this.soma = this.soma + boni;
    }

    public double getSoma() {
        return soma;
    }
}
