// INTERFACE é uma classe abstrata com todos os metodos sao abstratos
// dentro da INTERFACE nada é concreto
// deixamos apenas as ASSINATURAS dos METODOS
// e substituimos class por interface

// definimos 1 CONTRATO que se chama AUTENTICAVEL
// quem ASSINA esse contrato precisa implementar (assinar == implementar)
// METODO setSenha
// METODO autentica
// INTERFACE = DEFINICAO OBRIGACOES
public abstract interface Autenticavel {

    // este atributo abaixo é concreto, portanto precisa ser eliminado
    // private int senha;
    // concreto tb significa ter uma implementacao
    // por isso abaixo adicionaremos ABSTRATO
    public abstract void setSenha(int senha);
    public abstract boolean autentica(int senha);

}
