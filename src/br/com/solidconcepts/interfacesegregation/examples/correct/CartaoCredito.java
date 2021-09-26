package br.com.solidconcepts.interfacesegregation.examples.correct;

/**
 * A classe CartaoCredito agora implementa a nova interface SegurancaMeioPagamento,
 * pois precisa de uma validação digital na hora que for feito o pagamento
 */
public class CartaoCredito implements MeioPagamento, SegurancaMeioPagamento {

    @Override
    public void pagar(Double valor) {
        System.out.println("Realizando o pagamento de: " + valor);
    }

    @Override
    public void validacaoDigital() {
        System.out.println("Implementando segurança e autenticação digital");
    }
}
