package br.com.solidconcepts.interfacesegregation.examples.incorrect;

/**
 * Esse interface passa a ter um metodo de validação digital, util
 * para pagamentos que autenticam em algum servidor ou possuem algum tipo de validação,
 * mas nao dinheiEmEspecie
 */
public interface MeioPagamento {

    void pagar(Double valor);
    void validacaoDigital();
}
