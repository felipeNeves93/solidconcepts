package br.com.solidconcepts.interfacesegregation.examples.incorrect;

/**
 * Essa classe faz sentido ter uma validação digital, pois
 * é necessario autenticar com a operadora do cartao de credito
 */
public class CartaoCredito implements MeioPagamento {

    @Override
    public void pagar(Double valor) {
        System.out.println("Realizando o pagamento de: " + valor);
    }

    @Override
    public void validacaoDigital() {
        System.out.println("Validando se pagamento e valido nos servidores");
    }
}
