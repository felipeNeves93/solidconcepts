package br.com.solidconcepts.liskovsubstitution.examples.correct;

public class Main {

    public static void main(String[] args) {

        // Nesse exemplo, mudamos os meios de pagamento adicionando dinheiro em especie,
        // Que é um meio de pagamqento "aceito pelo sistema"
        var dinheiroEmEspecie = new DinheiroEmEspecie();
        var cartaoCredito = new CartaoCredito();

        var venda = new Venda();

        // Agora ambos devem funcionar, pois ambas as classes implementam corretamente
        // o contrato de meio de pagamento
        venda.realizarVenda(cartaoCredito, 100.0);
        venda.realizarVenda(dinheiroEmEspecie, 50.0);
    }
}
