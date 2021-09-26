package br.com.solidconcepts.interfacesegregation.examples.correct;

/**
 * Essa interface fica responsavel por criar o contrato
 * para todos os meios de pagamento que usarem serviços digitais
 */
public interface SegurancaMeioPagamento {

    void validacaoDigital();
}
