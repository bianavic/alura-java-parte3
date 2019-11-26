// herda atributos metodos MAS nao herda CONSTRUTORES.
// O CONSTRUTOR nunca passa para os filhos

// new ContaCorrente
public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero) { // adicionamos 1 construtor esoecifico
        // com o super podemos chamar construtor padrao e especifico
        super(agencia, numero); // criamos construtor ESPECIFICO - nao existe construtor padrao

    }
}
