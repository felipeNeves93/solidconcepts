## Principio da Substituição de Liskov

* Single Responsability Principle
* Open Closed Principle
* **Liskov Subistitution Principle**
* Interface Segregation Principle
* Dependency Iversion Principle

### Objetivo Principal

Esse principio define que deve ser possível substituir objetos de uma classe
pai por objetos da classe filho. Esse comportamento pode ser atingido utilizando
o conceito de contratos, promovido através da herança ou implementação de interfaces.

### Explicação Exemplo

No exemplo incorreto, criamos uma interface chamada **MeioPagamento** que contem um metodo void chamado **pagar**.
Em seguida, criamos as classes **CartaoCredito** e **Pix**, que implementam essa interface. A classe CartaoCredito
fornece uma implementação válida para a interface, enquanto a classe Pix dispara uma exceção. Em seguida criamos a classe
**Venda** com o metodo **realizarVenda** que recebe por parametro um objeto do tipo **MeioPagamento** e um valor.

Ao passarmos a classe CartaoCredito (que implementa MeioPagamento), o codigo funcionará corretamente pois a classe
possui uma implementação válida do metodo pagar, porém, ao passarmos a classe Pix, o codigo ira quebrar, pois a classe 
Pix dispara uma exceção ao ser chamado o metodo pagar, violando o principio citado pois o sistema ira apresentar erro
quando a classe Pix for usada em algum lugar no codigo.

No exemplo correto mudamos a classe pix pela classe **DinheiroEmEspecie** que contém uma implementação válida
do metodo pagar, podendo ser usar em qualquer lugar do sistema que o codigo continuará funcionando.
