
public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    Cliente titular; // colocar nome igual ao da Classe criada
    // STATIC quer dizer = da Classe.
    private static int total;

    public Conta(int agencia, int numero) {
        Conta.total ++;
        System.out.println("o total de contas é " + total);
        // inicializar/popular atributos
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100;
        System.out.println("estou criando uma conta " + this.numero);

    }


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

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
