package br.com.solidconcepts.singleresponsability.examples.correct;

/**
 * Nessa classe, conta poupança possui apenas as propriedades e ações das quais
 * ela precisa para manipular saldo, realizar operações e mostrar informações basicas sobre ela.
 * Para as funcionalidades mostradas no exemplo incorreto, foram criadas uma classe para realizar
 * cada funcionalidade
 */
public class ContaPoupancaExemploCorreto {

    // Propriedades Basicas da Conta
    private final String titular;
    private final String numero;
    private final String cpf;
    private Double saldo;

    public ContaPoupancaExemploCorreto(String titular, String numero, String cpf, double saldo) {
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

    // Getters
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

}
