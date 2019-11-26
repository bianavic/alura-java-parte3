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
    Cliente titular; // colocar nome igual ao da Classe criada
    // STATIC quer dizer = da Classe.
    private static int total; //agora o obj conta tem acesso a 1 total, torna 1 atributo compartilhavel

    // quero q a classe conta tenha o atributo total, nao quero que seja atributo do objeto

    // CONSTRUTOR utilizado para inicializacao dos atributos.
    // CONSTRUTOR padrao, basicamente nao faz nada. Com eles adquirimos controle sobre a construcao do objeto
    // CONSTRUTOR pode receber parametros.
    // ele nao ter retorno, nao é void. sintaticamente nao é um metodo.
    // executado apenas uma vez. nas proximas precisara do 'new
    public Conta(int agencia, int numero) { // feirta a composicao
        Conta.total ++;
        System.out.println("o total de contas é " + total);
        // inicializar/popular atributos
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100;
        System.out.println("estou criando uma conta " + this.numero);


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

    //ENCAPSULAMENTO: seu principio é declarar um atributo como privado.
    // ideal é que todos os atributos sejam privados

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) { // atributo imutavel, depois criado com aquele numero, nunca mais é alterado.
        // variavel temporaria numero tem o mesmo atributro da Classe (numero)
        if(numero <= 0) {
            System.out.println("nao pode valor menor ou igual a zero");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {

        if(agencia <= 0) {
            System.out.println("nao pode conta menor ou igual a zero");
            return;
        }
            this.agencia = agencia;
    }

    public void setTitular(Cliente titular) { this.titular = titular; }

    public Cliente getTitular() { return titular; }

    public static int getTotal() { return Conta.total; } // o static diz que o metodo é da classe.

    //SETTERS & GETTERS
    public double getSaldo() {
        return this.saldo;
    }

    // cuidado ao usar setSaldo na classe Conta
    // QUESTIONE: precisa criar um metodo para set saldo para modificar o saldo? Nao neste caso pq
    // transfete, deposita ... ja age desta forma.
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
