A aplicação foi desenvolvida com base em uma classe simples que contém um atributo do tipo lista (List). No entanto, diferentemente da abordagem tradicional, todas as operações realizadas sobre essa lista — desde a instanciação até a manipulação de seus dados — são feitas exclusivamente por meio de Reflection.

⚙️ Funcionamento:

O programa executa as seguintes etapas:
Inicialmente, a classe é carregada dinamicamente em tempo de execução, sem o uso direto do operador new. Em seguida, uma instância dessa classe é criada utilizando mecanismos de Reflection.
Após isso, o programa acessa o atributo privado responsável por armazenar a lista, utilizando a API de Reflection para contornar as restrições de visibilidade impostas pelo modificador private.
Na sequência, uma implementação de lista (ArrayList) é instanciada dinamicamente e atribuída ao atributo da classe. Com a lista devidamente inicializada, métodos como add, size e get são acessados e executados também via Reflection, permitindo a inserção e leitura dos elementos.
Por fim, o programa percorre todos os itens armazenados na lista e exibe seus valores no console, demonstrando a capacidade de manipulação completa da estrutura de dados sem acesso direto aos seus métodos.

🎯 Objetivo Educacional:

O principal objetivo deste programa é reforçar o entendimento sobre:
Programação orientada a objetos
Manipulação de classes em tempo de execução
Uso da API de Reflection em Java
Acesso a atributos e métodos privados
Invocação dinâmica de métodos
Além disso, o projeto evidencia como o Java permite alto nível de flexibilidade e dinamismo, sendo esse tipo de abordagem amplamente utilizado em frameworks como Hibernate e Spring.
