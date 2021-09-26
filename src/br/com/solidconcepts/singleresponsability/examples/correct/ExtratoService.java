package br.com.solidconcepts.singleresponsability.examples.correct;

import java.time.LocalDate;

/**
 * Classe com responsabilidade de mostrar na tela ou imprimir extrato da conta do cliente, e que tem acesso ao banco de dados.
 * A classe Conta principal deve ficar isolada da responsabilidade de conhecer a camada de persistencia
 */
public class ExtratoService {

    public void mostrarExtrato(ContaPoupancaExemploCorreto conta, LocalDate dataInicio, LocalDate dataFim) {
        System.out.println("Mostrando extrato no periodo desejado");
    }
}
