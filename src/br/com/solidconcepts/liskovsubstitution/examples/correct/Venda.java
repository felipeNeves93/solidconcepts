package br.com.solidconcepts.liskovsubstitution.examples.correct;

public class Venda {

    public void realizarVenda(MeioPagamento meioPagamento, Double valor) {
        System.out.println("Realizando o pagamento por meio do: " + meioPagamento.getClass().getSimpleName());
        meioPagamento.pagar(valor);
    }
}
