package br.com.solidconcepts.openclosed.examples.incorrect;

import java.time.LocalDate;

/**
 * A classe pessoa nesse exemplo conterá as informações básicas referentes a uma pessoa,
 * e depois incrementada as informações referentes a pessoa fisica e juridica
 */
public class Pessoa {

    // Informações basicas de uma pessoa
    private String nome;
    private String sobreNome;
    private LocalDate dataNascimento;

    // Agora imagine que precisamos adicionar informações referente a pessoa fisica
    // Para isso teriamos que adicionar o campo cpf
    private String cpf;

    // E Agora precisamos adicionar informações relacionadas a pessoa jurídica
    private String razaoSocial;
    private String nomeFantasia;
    private String cpnj;

    // É possivel observar tres fases da classe Pessoa, a primeira onde temos apenas as 3 primeiras
    // propriedades, na segunda fase temos a adição do cpf e na terceira a adição das informações relacionadas
    // a pessoa juridica

    // Imagine que voce tenha que modificar todos os pontos onde essa classe é usada no sistema para
    // Contemplar as logicas relacionadas a pessoas fisica e juridica, a chance de ocorrer quebra
    // no sistema é muito grande.

}
