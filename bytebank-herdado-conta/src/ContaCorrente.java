// herda atributos metodos MAS nao herda CONSTRUTORES.
// O CONSTRUTOR nunca passa para os filhos

// new ContaCorrente
public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero) { // adicionamos 1 construtor esoecifico
        // com o super podemos chamar construtor padrao e especifico
        super(agencia, numero);
    }// criamos construtor ESPECIFICO - nao existe construtor padrao

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    // redefinir o comportamento deste metodo com override (@Override é uma a notacao)
        @Override
        public boolean saca(double valor){
            double valorASacar = valor + 0.2;
            return super.saca(valorASacar);
        }

}
