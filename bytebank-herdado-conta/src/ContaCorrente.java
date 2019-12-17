// Estendendo a Conta os atributos e métodos são herdados, entretanto, os construtores não são herdados.
// Os construtores pertencem somente à sua própria classe.

// new ContaCorrente
public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero) { // adicionamos 1 construtor esoecifico
        // com o super podemos chamar construtor padrao e especifico
        super(agencia, numero);
    }// criamos construtor ESPECIFICO - nao existe construtor padrao

    @Override  // redefinir o comportamento
    public void deposita(double valor) {
        super.saldo += valor;
    }

        @Override // redefinir o comportamento da classe mae, conta, com override
        // @Override é uma a notacao da configuracao
        // REGRA: manter assinatura igual
        public boolean saca(double valor){
            double valorASacar = valor + 0.2; // criada variavel valorASacar
            return super.saca(valorASacar);
        }

}
