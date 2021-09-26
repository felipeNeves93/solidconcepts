package br.com.solidconcepts.openclosed.examples.correct;

/**
 * A classe pessoa fisica conterá apenas as informações e logicas
 * relacionadas a pessoa fisica.
 */
public class PessoaFisica extends Pessoa {

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
