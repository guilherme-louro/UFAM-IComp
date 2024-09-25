# Classe Turma

## Descrição
De forma semelhante às questões anteriores, crie uma classe para representar uma **Turma**.

### Atributos
- O atributo **numAlunos** indica a quantidade de alunos matriculados na disciplina.
- O atributo **acessivel** indica se algum aluno na turma requer uma sala de fácil acesso.
- O atributo **horarios** é uma lista de inteiros que indica os horários desta turma de acordo com a tabela abaixo:

| Hs/Dia | Seg | Ter | Qua | Qui | Sex |
|-------|-----|-----|-----|-----|-----|
| 8     | 1   | 8   | 15  | 22  | 29  |
| 10    | 2   | 9   | 16  | 23  | 30  |
| 12    | 3   | 10  | 17  | 24  | 31  |
| 14    | 4   | 11  | 18  | 25  | 32  |
| 16    | 5   | 12  | 19  | 26  | 33  |
| 18    | 6   | 13  | 20  | 27  | 34  |
| 20    | 7   | 14  | 21  | 28  | 35  |

Ou seja, se a lista de horários de uma turma contém os números `1`, `15` e `29`, isso indica que esta turma tem aulas nas segundas, quartas e sextas das 8 às 10 horas.

### Observação sobre Horários
Como as coleções genéricas em Java só aceitam classes (e não tipos primitivos), estamos usando a classe `Integer` ao invés do tipo primitivo `int`. As conversões entre a classe e o tipo primitivo são feitas automaticamente devido ao autoboxing/auto-unboxing da linguagem Java.

### Métodos
Implemente os métodos:

- `addHorario`: adiciona um horário à lista de horários da turma.
- `getHorariosString`: retorna uma String contendo o horário da turma, de acordo com o exemplo abaixo:
````
segunda 8hs, quarta 8hs, sexta 8hs
````
- `getDescricao`: retorna uma String contendo a descrição completa da turma de acordo com o exemplo abaixo:
````
Turma: Algoritmos e Estrutura de Dados I
Professor: Edleno Silva
Número de Alunos: 60
Horário: segunda 8hs, quarta 8hs, sexta 8hs
Acessível: sim
````

Para testar a classe, modifique a classe `EnsalamentoMain`, criada na questão anterior, para criar um ou mais objetos da classe **Turma** e, em seguida, imprima o resultado da execução do método `getDescricao` dos objetos criados.

Para essa questão, submeta apenas a classe **Turma**. Não é necessário submeter a classe `EnsalamentoMain`.


