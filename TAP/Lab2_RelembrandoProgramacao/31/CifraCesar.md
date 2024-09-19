# Cifra de César

A criptografia tem por objetivo esconder o significado de uma mensagem para um possível interceptador. Para tanto, os caracteres do texto podem ser misturados de acordo com um protocolo (algoritmo) previamente estabelecido entre emissor e receptor. Assim, o receptor da mensagem pode reverter o protocolo misturador e tornar a mensagem compreensível.

Uma maneira de se criptografar uma mensagem é substituir o "alfabeto original" por um "alfabeto cifrado", deslocado por um determinado número de letras (5, no exemplo abaixo), em relação ao alfabeto original. O registro mais antigo desse procedimento é atribuído ao general romano Júlio César (100-44 a.C.). Por isso, ele é conhecido como Cifra de César. Por convenção, escreve-se o alfabeto original em minúsculas e o alfabeto cifrado em maiúsculas.

### Exemplo da Cifra de César (Código: 5):

- **Alfabeto original:** `a b c d e f g h i j k l m n o p q r s t u v w x y z`
- **Alfabeto cifrado:** `F G H I J K L M N O P Q R S T U V W X Y Z A B C D E`

- **Texto original:** `v o v o  v i u  a  u v a`
- **Texto cifrado:** `A T A T  A N Z  F  Z A F`

Escreva um programa (classe `CifraCesar`) que leia o valor do deslocamento (tal como 5 no exemplo acima) e depois leia um texto a ser codificado. A saída deve ser o texto criptografado segundo a Cifra de César explicada acima.

Independentemente dos caracteres de entrada, a saída deverá ser apresentada em caracteres **MAIÚSCULOS**. Durante a criptografia, ignore qualquer caractere que não seja uma letra do alfabeto, tais como números, pontuação e caracteres com acentos. Estes deverão ser repetidos na saída tal qual foram inseridos na entrada.

### Exemplo de entrada e saída esperada:

**Entrada:**
12 it's an older code, sir, but it checks out

**Saída:**
UF'E MZ AXPQD OAPQ, EUD, NGF UF OTQOWE AGF

**Entrada:**
4 well... here we are all together for the first time

**Saída:**
AIPP... LIVI AI EVI EPP XSKIXLIV JSV XLI JMVWX XMQI


### Dicas:
- Note que, em Java, uma `String` usa aspas duplas (e.g., `"string"`), enquanto que um `char` usa aspas simples (e.g., `'c'`).
- Para ler uma string que possui espaços, use o método `nextLine()` da classe `Scanner`. Exemplo:
  ```java
  String linha = scan.nextLine();

- Para pegar um caractere de uma String usando seu índice, use o método `charAt(int index)` da classe `"string"`. Exemplo: char carac = textoLimpo.charAt(i);

- Assim como em outras linguagens, um char em Java é um número inteiro de acordo com a Tabela ASCII. Você pode fazer:
    - operações matemáticas. Exemplo: carac - `'a'`;
    - comparações de um caractere com um número. Exemplo: carac > 65
    - comparações entre caracteres. Exemplo: carac > `'a'`

- Uma maneira de encontrar a letra do alfabeto cifrado que vai além da letra 'Z' é utilizando o resto da divisão com o número total de letras do alfabeto. Exemplo: 
```java
   char cCifrado;
   cCifrado = (char) (cOriginal - 'a');          // Conv. de char para int entre 0-26
   cCifrado = (char) ((cCifrado + desloc) % 26); // Pega a letra cifrada como int entre 0-26
   cCifrado += 'A';                              // Conv. de int entre 0-26 para char entre A-Z
   ```