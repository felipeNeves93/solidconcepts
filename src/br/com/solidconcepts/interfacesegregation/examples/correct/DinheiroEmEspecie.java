package br.com.solidconcepts.interfacesegregation.examples.correct;

/**
 * Dinheiro em especie nao faz uso de autenticação digital,
 * logo, nao precisa implementar a nova interface e poluir
 * o codigo com uma implementação que não será utilizada
 */
public class DinheiroEmEspecie implements MeioPagamento {

    @Override
    public void pagar(Double valor) {
        System.out.println("Realizando o pagamento de: " + valor);
    }
}
