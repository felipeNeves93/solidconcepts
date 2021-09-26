## Principio da Segregação de Interfaces

* [Single Responsability Principle](https://github.com/felipeNeves93/solidconcepts/tree/master/src/br/com/solidconcepts/singleresponsability)
* [Open Closed Principle](https://github.com/felipeNeves93/solidconcepts/tree/master/src/br/com/solidconcepts/openclosed)
* [Liskov Subistitution Principle](https://github.com/felipeNeves93/solidconcepts/tree/master/src/br/com/solidconcepts/liskovsubstitution)
* **[Interface Segregation Principle](https://github.com/felipeNeves93/solidconcepts/tree/master/src/br/com/solidconcepts/interfacesegregation)**
* [Dependency Iversion Principle](https://github.com/felipeNeves93/solidconcepts/tree/master/src/br/com/solidconcepts/dependencyinversion)


### Objetivo Principal

Esse princípio defende que interfaces maiores devem ser quebradas em menores, dessa forma as classes
concretas podem implementar somente aquilo que lhes é conveniente.

### Explicação Exemplo

Nos exemplos incorretos, foi criada uma interface **MeioPagamento**
que contem os metodos pagar e validacao digital. As classes **CartaoCredito
e DinheiroEmEspecie** implementam essa interface, porém somente a classe
**CartaoCredito** fornece uma implementação concreta para a validação digital.
A classe DinheiroEmEspecie nao tem a necessidade de implementar uma validação digital,
porém como segue o contrato da interface, é obrigado a fazê-lo.

No exemplo correto, essa interface MeioPagamento foi dividida em duas, a **MeioPagamento**
e a **SegurancaMeioPagamento**. Agora ma classe CartaoCredito implementa as duas interfaces, pois
necessita da validação digital, enquanto a classe **DinheiroEmEspecie** implementa somente a MeioPagamento.
