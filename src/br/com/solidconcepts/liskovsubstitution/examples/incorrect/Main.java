package br.com.solidconcepts.liskovsubstitution.examples.incorrect;

public class Main {

    public static void main(String[] args) {

        // Primeiro de tudo, vamos instanciar os meios de pagamentos que criamos, CartaoCredito
        // E pix

        // Nesses exemplos, ambos seguem o contrato de MeioPagamento, implementando uma logica para pagar,
        // Porem na classe Pix, o sistema "nao esta pronto", logo, ele lança uma exceção informando isso.
        var pix = new Pix();
        var cartaoCredito = new CartaoCredito();

        // Vamos instanciar a classe venda, e fazer uma venda para cada meio de pagamento
        var venda = new Venda();

        // O metodo realizarVenda espera um objeto do tipo MeioPagamento e um valor para ser realizado
        // o pagamento, portanto podemos passar qualquer objeto que siga o contrato de MeioPagamento

        // Nessa primeira chamada, o metodo ira funcionar, pois cartao de credito implementa a logica de realizar pagamento
        venda.realizarVenda(cartaoCredito, 100.0);

        // Nessa segunda chamada nao ira fucnionar, pois pix lança uma exceção, o que quebra o fluxo
        // Violando o principio da substituição de Liskov
        venda.realizarVenda(pix, 100.0);
    }
}
