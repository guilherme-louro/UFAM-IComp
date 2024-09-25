# Classe Sala 

## Descrição
Crie uma classe para representar uma **Sala** de aula. Os atributos de um objeto da classe Sala poderão ser setados diretamente (e.g., `sala1.bloco=6`) ou pelo método construtor. Use a técnica de **encadeamento de construtores** para criar os construtores da classe, semelhante ao exemplo mostrado em sala e nos slides.

### Atributos
- O atributo **capacidade** indica a capacidade máxima (quantidade máxima de alunos) que uma sala comporta.
- O atributo **booleano acessivel** indica se uma sala é de fácil acesso (para um cadeirante) ou não.

### Método
Implemente o método:

- `getDescricao`: retorna uma String contendo a descrição da sala de acordo com o exemplo abaixo:
````
Bloco 6, Sala 101 (50 lugares, acessível)
````

### Teste
Para testar a classe, crie uma nova classe chamada `EnsalamentoMain`. Nesta classe, crie o método `main`, que será o ponto de partida do seu programa. No método `main`, crie um ou mais objetos da classe **Sala** e, em seguida, imprima o resultado da execução do método `getDescricao` dos objetos criados.

Para essa questão, submeta apenas a classe **Sala**. Não é necessário submeter a classe `EnsalamentoMain`.

