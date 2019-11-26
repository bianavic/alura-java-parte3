/*
 - DEFINIR primeira CLASSE, o primeiro TIPO. ela nao é uma conta, apenas uma especificacao de conta. Na especificacao nao podemos alterar seus atributos.
 - possui 4 ATRIBUTOS (caracteristicas)
 - a partir deste esquema (classe Conta) eu posso construir qtas contas eu quiser. Ou seja, todas as contas que conseguirmos
 serao OBJETOS do tipo conta |  OBJETO == INSTANCIA. O projeto de tirar do papel para construir é o que chamamos de construcao ou INSTANCIACAO
 - É uma instancia do tipo conta, é um objeto do tipo conta.
 - Num OBJETO do tipo conta eu posso alterar seu ATRIBUTO
*/
// Estas sao as variaveis denominadas ATRIBUTOS de um objeto, pode ser chamado de campo ou propriedade.
// Qdo java constroi/instacia objetos, todos os seus atributos sao zerados. == VALOR DEFAULT é o valor zerado
public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private String titular;

    //construtor


    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //setters getters
    public double getSaldo() {
        return saldo;
    }

    // cuidado ao usar setSaldo na classe Conta
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // o que eu deposito dentro do ()? o valor.
    // vou receber um argumento (parametro) do tipo double.
    // deposita == o que o metodo devolve | valor == o que o metodo recebe
// deposita é metodo pq é a maneira de depositar numa conta dentro do (this), de outra conta
    public void deposita(double valor) {
        // palavra chave que é referencia para este objeto/esta conta que dei o NEW que é o testaMetodo
        this.saldo =+ valor; // saldo é um atributo
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo =- valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }
}
