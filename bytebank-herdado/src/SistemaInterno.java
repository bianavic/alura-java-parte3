public class SistemaInterno {

    // senha definida em um atributo
    private int senha = 2222;

    public void autentica(Autenticavel fa) {
        boolean autenticou = fa.autentica(this.senha);
        if(autenticou) {
            System.out.println("Pode entrar no sistema");
        } else {
            System.out.println("Nao pode entrar no sistema");
        }
    }
}
