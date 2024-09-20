# Classe Mestre

Crie uma classe para representar o Mestre do droid de acordo com o diagrama de classe ao lado. Os atributos de um objeto da classe `Mestre` poderão ser setados diretamente (e.g., `mestre1.nome = "Poe Dameron"`) ou pelo método construtor. Use a técnica de encadeamento de construtores para criar os dois construtores da classe, semelhante ao feito em sala e mostrado nos slides. 

Implemente os métodos:

- `getIdade`: retorna um `int` contendo a idade do mestre em relação ao parâmetro `anoAtual`. Note que a data de nascimento pode ser negativa (o mestre nasceu Antes da Batalha de Yavin -- ABY) ou positiva (nasceu Depois de Batalha de Yavin -- DBY).
  
- `getAnoNascimentoString`: retorna uma `String` contendo o ano de nascimento do mestre seguido da sigla **ABY** (anoNacimento negativo) ou **DBY** (anoNascimento positivo).
  
- `possuiForca`: retorna um `boolean` com o valor `true` caso o atributo `posto` do objeto seja igual a **"Jedi"** ou **"Sith"**.
  
- `getDescricao`: retorna uma `String` contendo a descrição completa do mestre de acordo com a linha a seguir:

```plaintext
  Mestre: nome=Luke Skywalker, anoNascimento=19DBY, afiliacao=Alianca para Restauracao da Republica, posto=Jedi, possuiForca=true.
```

Para testar a classe, crie uma nova classe chamada `AstromechMain`. Nesta classe, crie o método main, que será o ponto de partida do seu programa. No método main, crie um ou mais objetos da classe `Mestre` e, em seguida, imprima o resultado da execução do método getDescricao dos objetos criados.

Observação
Para essa questão, submeta apenas a classe `Mestre`. Não precisa submeter a classe `AstromechMain`.