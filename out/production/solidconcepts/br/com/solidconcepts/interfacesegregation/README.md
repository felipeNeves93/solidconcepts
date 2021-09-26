## Principio da Segregação de Interfaces

* Single Responsability Principle
* Open Closed Principle
* Liskov Subistitution Principle
* **Interface Segregation Principle**
* Dependency Iversion Principle

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
