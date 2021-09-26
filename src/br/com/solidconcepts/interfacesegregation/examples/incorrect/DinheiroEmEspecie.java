package br.com.solidconcepts.interfacesegregation.examples.incorrect;

/**
 * Essa classe nao tem utilização para o metodo validaçãoDigital.
 * Se tornando um problema implementar essa interface
 */
public class DinheiroEmEspecie implements MeioPagamento {

    @Override
    public void pagar(Double valor) {
        System.out.println("Realizando o pagamento de: " + valor);
    }

    @Override
    public void validacaoDigital() {
        System.out.println("Nao sei o que fazer!");
    }
}
