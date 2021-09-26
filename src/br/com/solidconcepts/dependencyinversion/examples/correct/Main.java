package br.com.solidconcepts.dependencyinversion.examples.correct;

public class Main {

    public static void main(String[] args) {

        // Vamos criar nossos meios de pagamentos
        var meioPagamentoDinheiroEmEspecie = new DinheiroEmEspecie();
        var meioPagamentoCartaoCredito = new CartaoCredito();

        // Vamos criar um objeto venda passando dinheiro em especie como meio de pagamento
        var vendaDinheiroEmEspecie = new Venda(meioPagamentoDinheiroEmEspecie);

        // Agora vamos criar um outro objeto venda passando cartao de credito como meio de pagamento
        var vendaCartaoDeCredito = new Venda(meioPagamentoCartaoCredito);

        // Criando a Venda dessas formas, deixamos para o momento da criação a decisão de qual
        // Meio de pagamento utilizar, desacoplando a responsabilidade da classe Venda de tomar
        // essa decisão por nos, deixando-a muito mais flexível

        vendaCartaoDeCredito.realizarVenda();
        vendaDinheiroEmEspecie.realizarVenda();
    }
}
