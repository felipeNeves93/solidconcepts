package br.com.solidconcepts.openclosed.examples.correct;

import java.time.LocalDate;

/**
 * Nesse exemplo, a classe pessoa possui apenas as informações relacionadas a ela,
 * delegando as modificações que seriam introduzidas para pessoas fisica e juridica
 * para as classes filhas
 */
public abstract class Pessoa {

    private String nome;
    private String sobrenome;
    LocalDate dataNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
