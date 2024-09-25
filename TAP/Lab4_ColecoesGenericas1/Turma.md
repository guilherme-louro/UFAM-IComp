# Classe Turma

Crie uma classe para representar uma **Turma**.

## Métodos a serem implementados:

### 1. addAluno
- **Função:** Adiciona um **Aluno** na lista de alunos da turma.
- **Observação:** Caso já exista um aluno com a mesma matrícula, o aluno não deve ser adicionado.
- **Dica:** Use o método `getAluno` para determinar se o aluno já existe na turma.

### 2. getAluno
- **Retorno:** Um **Aluno** da lista de alunos que possui a matrícula especificada.
- **Observação:** Retorna `null` caso o aluno não esteja na turma.

### 3. getMediaIdade
- **Retorno:** A média da idade dos alunos na turma como um valor `double`.

### 4. getDescricao
- **Retorno:** Uma `String` contendo a descrição completa da turma, incluindo as informações do professor (via `getDescricao`) e de seus alunos, de acordo com o exemplo abaixo:
    ```text
    Turma Iniciação Tecnológica e Científica - 2016/1 (Prof. Dr. Hubert J. Farnsworth - mat 2208):
      - Aluno 1: Emmett L. Brown (mat=7714, idade=22)
      - Aluno 2: Egon Spengler (mat=5907, idade=20)
      - Aluno 3: Peter Weyland (mat=7734, idade=19)
    ```

## Testando a Classe
Para testar a classe, modifique a classe **TurmaMain**, criada nas questões anteriores, para criar um ou mais objetos da classe **Turma**. Adicione alunos nas turmas e, em seguida, imprima o resultado da execução do método `getDescricao` dos objetos criados.

> Para essa questão, submeta apenas a classe **Turma**. Não precisa submeter a classe **TurmaMain**.
