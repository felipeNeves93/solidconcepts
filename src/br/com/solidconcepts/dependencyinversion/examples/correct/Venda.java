package br.com.solidconcepts.dependencyinversion.examples.correct;

/**
 * A classe venda possui o metodo realizar Venda e
 * agora passamos no construtor qual tipo de meio de pagamento queremos
 * Utilizar
 */
public class Venda {

    private final MeioPagamento meioPagamento;

    // Aqui recebemos como parametro uma abstração da interface meio pagamento,
    // Podendo ser qualquer classe que implementa a interface
    public Venda(MeioPagamento meioPagamento) {
        this.meioPagamento = meioPagamento;
    }

    public void realizarVenda() {
        System.out.println("Realizando a venda utilizando o meio de pagamento: " + meioPagamento.getClass().getSimpleName());
    }
}
