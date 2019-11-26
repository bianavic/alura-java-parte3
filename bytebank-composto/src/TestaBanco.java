public class TestaBanco {

    // referencia à cliente Fabi esta criada e populada
    public static void main(String[] args) {
        Cliente fabiana = new Cliente();
        fabiana.nome = "Fabiana Ferlin";
        fabiana.cpf = "222.222.222-22";
        fabiana.profissao = "programadora";

        // criar conta da Fabi e colocar saldo
        // criou OBJETO na memoria, devolveu o numero e colocou dentro da REFERENCIA
        Conta contaDaFabiana = new Conta();
        contaDaFabiana.deposita(100);

        // fazer referencia ao atributo titular. compor 1 objeto para outro.
        // associa a cliente Fabi à conta contaDaFabiaqna
        contaDaFabiana.titular = fabiana;
        System.out.println(contaDaFabiana.titular.nome);
        System.out.println(contaDaFabiana.titular);
        System.out.println(fabiana);

    }
}
