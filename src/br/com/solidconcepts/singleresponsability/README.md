## Principio da Responsabilidade Unica (Single Responsability Principle)

* **[Single Responsability Principle](https://github.com/felipeNeves93/solidconcepts/tree/master/src/br/com/solidconcepts/singleresponsability)**
* [Open Closed Principle](https://github.com/felipeNeves93/solidconcepts/tree/master/src/br/com/solidconcepts/openclosed)
* [Liskov Subistitution Principle](https://github.com/felipeNeves93/solidconcepts/tree/master/src/br/com/solidconcepts/liskovsubstitution)
* [Interface Segregation Principle](https://github.com/felipeNeves93/solidconcepts/tree/master/src/br/com/solidconcepts/interfacesegregation)
* [Dependency Iversion Principle](https://github.com/felipeNeves93/solidconcepts/tree/master/src/br/com/solidconcepts/dependencyinversion)


### Objetivo Principal

Esse principio defende que uma classe deve ter somente ***uma responsabilidade***, e realizar
bem aquilo para que ela se propõe, fazendo com que seu código seja mais ***facilmente testável***,
tenha um ***baixo acoplamento***, e ***fique mais organizado***.

### Explicação Exemplo

No exemplo descrito, temos a classe ContaPoupancaExemploIncorreto, que contem 
as propriedades relacionadas a o que uma Conta Poupança deve ter, porém, temos os metodos
***gerarExtrato, bloquearConta, buscarInvestimentos, verificarEmprestimos***, que são ações que 
não devem fazer parte da mesma, pois foge do escopo do que uma conta deve saber.
 
Essas ações são movidas para classes especificas  no pacote **correct**, que são 
***BloqueioService, ExtratoService e ProdutoService***, que contem as responsabilidades definidas
de somente fazerem aquilo que são propostas dentro do escopo estabelecido, desonerando a responsabilidade
da classe ContaPoupancaExemploCorreto, que a partir de agora se preocupa somente 
com o estado e ações que dizem respeito as operações de uma conta.

Imagine que a logica desses metodos precise mudar ou ser expandida. Aplicando esse principio
da responsabilidade unica, quebrando essa funções em classes que fazem somente aquilo para qual são destinadas, torna muito
mais facil a expansão e manutenção do código.