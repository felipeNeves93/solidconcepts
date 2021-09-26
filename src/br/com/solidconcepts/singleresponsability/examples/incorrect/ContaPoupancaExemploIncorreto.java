package br.com.solidconcepts.singleresponsability.examples.incorrect;

public class ContaPoupancaExemploIncorreto {

    // Propriedades Basicas da Conta
    private final String titular;
    private final String numero;
    private final String cpf;
    private Double saldo;

    public ContaPoupancaExemploIncorreto(String titular, String numero, String cpf, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.cpf = cpf;

        if (saldo < 0) {
            this.saldo = 0.0;
        } else {
            this.saldo = saldo;
        }
    }

    // Funcoes Basicas da Conta
    public void depositar(Double valor) {
        this.saldo += valor;
    }

    public Double sacar(Double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
            return 0.0;
        }

        this.saldo -= valor;

        return valor;
    }

    public void mostrarInformacoes() {
        System.out.println("Titular: " + titular);
        System.out.println("Numero: " + numero);
        System.out.println("Saldo: " + saldo);
    }

    // getters
    public String getTitular() {
        return titular;
    }

    public String getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getCpf() {
        return cpf;
    }

    // Funcoes alem do que a classe deve fazer
    public void gerarExtrato() {
        // Logica para gerar extrato
    }

    public void bloquearConta() {
        // Logica para verificar se a conta deve ser bloqueada
    }

    public void verificarEmprestimos() {
        // Logica para buscar emprestimos por Cpf
    }

    public void buscarInvestimentos() {
        // Logica para buscar Investimentos
    }

    /*
     * Essas funções devem ser delegadas a classes específicas que contenham
     * as lógicas necessárias para serem realizadas, cada uma contendo uma responsabilidade unica
     */

}
