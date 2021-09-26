package br.com.solidconcepts.dependencyinversion.examples.incorrect;

/**
 * A classe venda possui o metodo realizar Venda e é instaciado
 * um meio de pagamento no momento que criamos um objeto da classe Venda
 */
public class Venda {

    private final MeioPagamento meioPagamento;

    // Estamos acoplados ao meio de pagamento cartao de credito
    // Sempre que criarmos uma venda!
    public Venda() {
        this.meioPagamento = new CartaoCredito();
    }

    public void realizarVenda() {
        System.out.println("Realizando a venda utilizando o meio de pagamento: " + meioPagamento.getClass().getSimpleName());
    }
}
