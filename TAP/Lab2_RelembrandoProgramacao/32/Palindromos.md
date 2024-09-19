# Palíndromos

Um palíndromo é uma sequência de caracteres cuja leitura é idêntica se feita da direita para esquerda ou vice−versa. Por exemplo: **"OSSO"** e **"OVO"** são palíndromos. Em textos mais complexos, espaços, acentos e pontuação são ignorados. A frase **"SUBI NO ONIBUS"** é o exemplo de uma frase palíndroma onde os espaços foram ignorados.

Escreva um programa (classe `Palindromos`) que leia uma sequência de caracteres. Em seguida, o programa deve imprimir a mesma sequência em letras maiúsculas com os espaços removidos e informar se ela é um palíndromo (saída 1) ou não (saída 0).

### Exemplo de entrada e saída esperada:


**Entrada:**  
A Rara Arara

**Saída:**  
ARARAARARA 1

**Entrada:**  
Tecnicas Avancadas de Programacao

**Saída:**  
TECNICASAVANCADASDEPROGRAMACAO 0

**Entrada:**  
a torre da derrota

**Saída:**  
ATORREDADERROTA 1


### Dicas:
- Para ler uma string que possui espaços, use o método `nextLine()` da classe `Scanner`. Exemplo:
```java
  String linha = scan.nextLine();
```

- Para converter uma string para maiúscula, use o método toUpperCase() da classe `String`. Exemplo: 
```java 
String linhaMaiusc = linha.toUpperCase();
```

- Use o método replace(CharSequence target, CharSequence replacement) da classe `String` para remover os espaços. Exemplo: 
```java 
linha = linha.replace(" ", "");
```

- Para pegar um caractere de uma `String` usando seu índice, use o método `charAt(int index)` da classe `String`. Exemplo:
   
```java
char carac = textoLimpo.charAt(i);
```
