public class ControleBonificacao {

    private double soma;

    public void registra(Funcionario f) { // mesmo com referencia generica (tipo funcionario), ao executar o codigo sempre sera chamado o metodo especifico
        double boni = f.getBonificacao();
        this.soma = this.soma + boni;
    }

    public double getSoma() {
        return soma;
    }
}
