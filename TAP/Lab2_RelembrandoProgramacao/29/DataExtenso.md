# Data por Extenso

Escreva um programa em Java (classe `DataExtenso`) que leia do teclado uma data no formato "ddmmaaaa" e imprima essa data por extenso (suponha valores sempre válidos).

### Exemplo de entrada e saída esperada:

**Entrada:**  
21102015

**Saída:**  
21 de outubro de 2015

### Dicas:

Existem diversas formas de se isolar os números. Sugestão - implemente e teste as duas formas diferentes abaixo:

1. **Usando `String` e `substring`:**

   Leia a data como uma `String` e use o método `substring(int beginIndex, int endIndex)` da classe `String` para isolar os valores e o método `parseInt(String s)` da classe `Integer` para converter de `String` para `int`. Exemplo:
   
   ```java
   String valorStr = "24601";
   String numStr = valorStr.substring(2, 5); // Pega os caracteres 2 a 5 "601"
   int num = Integer.parseInt(numStr);       // Converte a String "601" para o int 601
   ```
