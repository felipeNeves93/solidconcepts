package br.com.solidconcepts.singleresponsability.examples.correct;

/**
 * Classe responsavel por realizar bloqueio de uma conta ou todas as contas vinculadas a um CPF.
 */
public class BloqueioService {

    public void bloquear(ContaPoupancaExemploCorreto conta) {
        System.out.println("Bloqueando uma conta em especifico");
    }

    public void bloequear(String cpf) {
        System.out.println("Bloqueando todas as contas baseadas no cpf");
    }
}
