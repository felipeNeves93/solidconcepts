## Principio da Inversão de dependencias (Dependency Inversion Principle)

* [Single Responsability Principle](https://github.com/felipeNeves93/solidconcepts/tree/master/src/br/com/solidconcepts/singleresponsability)
* [Open Closed Principle](https://github.com/felipeNeves93/solidconcepts/tree/master/src/br/com/solidconcepts/openclosed)
* [Liskov Subistitution Principle](https://github.com/felipeNeves93/solidconcepts/tree/master/src/br/com/solidconcepts/liskovsubstitution)
* [Interface Segregation Principle](https://github.com/felipeNeves93/solidconcepts/tree/master/src/br/com/solidconcepts/interfacesegregation)
* **[Dependency Iversion Principle](https://github.com/felipeNeves93/solidconcepts/tree/master/src/br/com/solidconcepts/dependencyinversion)**


### Objetivo Principal

Esse principio prega o desacoplamento dos modulos do programa, defendendo a alta
coesão e baixo acoplamento. Dessa forma, se recomenda utilizar abstrações ao inves de
os modulos mais altos do software dependerem dos mais baixos.

### Explicação Exemplo

No exemplo incorreto criamos a classe **Venda**, que possui um metodo *realizarVenda* e um *meio de pagamento*.
Esse meio de pagamento é setado no momento da criação da classe **Venda** através de seu construtor. A deicsão 
de qual meio de pagamento utilizar fica a cargo do construtor, onde ele define que o metodo de pagamento é 
sempre o **CartaoCredito**. Dessa forma estamos criando um forte acoplamento entre a classe **Venda** e a implementação concreta
da classe **CartaoCredito**.

Ja no exemplo correto, criamos a classe **Venda** recebendo por parâmetro uma abstração do **MeioDePagamento**, ou seja, passamos a 
interface como parâmetro. Decidiremos qual meio de pagamento usar no momento que criarmos uma instancia da classe venda, 
a partir desse momento temos a flexibilidade de passar qualquer meio de pagamento desde que implemente a interface **MeioPagamento**.