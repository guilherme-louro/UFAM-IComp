# Operações Básicas em uma String

Escreva um programa (classe `OperacoesString`) que leia uma string digitada pelo usuário. Em seguida, imprima as seguintes informações sobre a string, necessariamente na ordem indicada:

1. Quantidade de caracteres da string
2. Primeiro caractere da string
3. Último caractere da string
4. Conversão da string em caracteres maiúsculos
5. Conversão da string em caracteres minúsculos
6. Substituição de todas as letras "a" por "e"
7. Impressão dos caracteres com índices pares
8. Quantidade de vogais na string

### Dica:
Use a documentação oficial da classe `String` para ver os diversos métodos que você pode executar para conseguir as informações acima. Por exemplo, para pegar a quantidade de caracteres, a classe `String` tem o método `length()`, como mostrado a seguir: 
```java
String nome = "Jebediah Kerman";
int tamNome = nome.length();

Para ler uma string que possui espaços, use o método nextLine() da classe Scanner. Exemplo:
String linha = scan.nextLine();
```

### Dicas:

- Use a documentação oficial da classe `String` para ver os diversos métodos que você pode executar para conseguir as informações acima. Por exemplo, para pegar a quantidade de caracteres, a classe `String` tem o método `length()`, como mostrado a seguir: 
```java
String nome = "Jebediah Kerman";
int tamNome = nome.length();
```
- Para ler uma string que possui espaços, use o método nextLine() da classe Scanner. Exemplo: String linha = scan.nextLine();
- Note que, em Java, uma String usa aspas duplas (e.g., `"string"`), enquanto que um char usa aspas simples (e.g., `'c'`).
- Ao contar a quantidade de vogais, não esqueça de contar também as vogais em maiúsculas.

**Exemplo de entrada e saída esperada::**  
Jebediah Kerman

**Saída:**  
````
15
J
n
JEBEDIAH KERMAN
jebediah kerman
Jebedieh Kermen
Jbda emn
6
````
