import javax.sql.rowset.serial.SQLOutputImpl;
import java.sql.SQLOutput;

public class SistemaInterno {

    // senha definida em um atributo
    private int senha = 2222;

    public void autentica(FuncionarioAutenticavel fa) {
        boolean autenticou = fa.autentica(this.senha);
        if(autenticou) {
            System.out.println("Pode entrar no sistema");
        } else {
            System.out.println("Nao pode entrar no sistema");
        }
    }
}
