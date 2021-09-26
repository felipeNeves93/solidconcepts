## Principio Aberto Fechado (Open Closed Principle)

* Single Responsability Principle
* **Open Closed Principle**
* Liskov Subistitution Principle
* Interface Segregation Principle
* Dependency Iversion Principle

### Objetivo Principal

O objetivo principal desse principio é: As classes devem estar abertas para extensão, e fechadas
para modificação, Com exceção para bugs presentes na classe. Fazendo isso,
se evita que crie novos bugs as classes, assim como evita mudanças que potencialmente
podem quebrar varios pontos do sistema em virtude da modificação muitas vezes de classes 
no ponto alto de alguma hierarquia de herança

### Explicação Exemplo

No exemplo incorreto de codigo, podemos observar a classe **Pessoa**
que contem informações como **nome** e **sobrenome**, e junto dela foram 
adicionadas informações referente a pessoa fisica e juridica, o que viola o
principio "aberto fechado".

Imagine a situação onde voce tem logicas especificas para a classe Pessoa, e precisa
ter que readequar em virtude da adição de novas responsabilidades, isso facilmente
poderia gerar serios problemas de incompatibilidade de codigo, ocorrendo
quebras de contrato e ocasionando diversos problemas.

Ja no exemplo correto, deixamos a classe **Pessoa** somente com as propriedades
condizentes a ela, e na necessidade de adicionarmos as informações da pessoa 
fisica e juridica, criamos duas classes, **PessoaFisica** e **PessoaJuridica** respectivamente,
que ficarão com os campos e logicas necessarias para essas duas classes.