public class EditorVideo extends Funcionario {
    public double getBonificacao() {
        System.out.println("Chamando o metodo de bonificacao do EditorVideo");
        return super.getBonificacao() + 100.0;
    }
}
