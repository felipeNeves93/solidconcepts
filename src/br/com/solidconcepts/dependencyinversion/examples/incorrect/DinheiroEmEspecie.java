package br.com.solidconcepts.dependencyinversion.examples.incorrect;

public class DinheiroEmEspecie implements MeioPagamento {

    @Override
    public void pagar(Double valor) {
        System.out.println("Realizando o pagamento de: " + valor);
    }
}
