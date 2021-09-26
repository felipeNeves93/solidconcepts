package br.com.solidconcepts.singleresponsability.examples.correct;

/**
 * Classe com uma responsabilidade definida de mostrar os produtos baseados na conta e no cpf do usuario,
 * isolando assim essa logica da classe principal, que nada tem a ver com o que o titular pode ou
 * usar de produtos do banco.
 */
public class ProdutoService {

    public void mostrarEmprestimosDisponiveis(String cpf, ContaPoupancaExemploCorreto conta) {
        System.out.println("Mostrando emprestimos de acordo com score do cpf e conta");
    }

    public void mostrarInvestimentos(String cpf) {
        System.out.println("Mostrando investimentos de acordo com cpf e perfil");
    }
}
