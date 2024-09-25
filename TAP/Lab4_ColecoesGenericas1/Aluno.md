# Classe Aluno

Crie uma classe para representar o **Aluno**. Os atributos de um objeto da classe **Aluno** poderão ser setados diretamente (e.g., `aluno1.nome="Emmett L. Brown"`) ou pelo método construtor. Use a técnica de **encadeamento de construtores** para criar os construtores da classe, semelhante ao feito em sala e mostrado nos slides.

## Métodos a serem implementados:

### 1. getIdade
- **Retorno:** `int` contendo a idade do aluno em relação ao ano atual.
- **Dica:** Para pegar o ano atual em Java:
    - Importe a classe **Calendar** na primeira linha do arquivo: 
    ```java
    import java.util.Calendar;
    ```
    - No seu método, salve o ano atual em um inteiro: 
    ```java
    int ano = Calendar.getInstance().get(Calendar.YEAR);
    ```

### 2. getDescricao
- **Retorno:** `String` contendo a descrição completa do aluno de acordo com o exemplo:
```text
  Emmett L. Brown (mat=7714, idade=22)
```

Para testar a classe, crie uma nova classe chamada `TurmaMain`. Nesta classe, crie o método main, que será o ponto de partida do seu programa. No método main, crie um ou mais objetos da classe `Aluno` e, em seguida, imprima o resultado da execução do método getDescricao dos objetos criados.
Para essa questão, submeta apenas a classe `Aluno`. Não precisa submeter a classe `TurmaMain`.