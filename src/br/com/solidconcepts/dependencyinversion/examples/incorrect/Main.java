package br.com.solidconcepts.dependencyinversion.examples.incorrect;

public class Main {

    public static void main(String[] args) {

        // Vamos criar um objeto venda
        var venda = new Venda();

        // Ao criar esse objeto, nao especificamos o meio de pagamento que
        // queremos utilizar, ficando presos ao que a classe Venda cria
        // No momento em que estamos instanciando ela, criando um alto acoplamento
        // entre a classe Venda e a implementação CartaoCredito da interface MeioPagamento
        venda.realizarVenda();
    }
}
