public class Cliente extends Funcionario implements Autenticavel {

    private int senha;

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
