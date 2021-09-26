package br.com.solidconcepts.liskovsubstitution.examples.incorrect;

public class Pix implements MeioPagamento {

    @Override
    public void pagar(Double valor) {
        throw new IllegalStateException("Pix nao suportado pelo sistema!");
    }
}
