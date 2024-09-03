# Descrição do Problema

Mário precisa pintar um muro, que tem 12m de comprimento e 3m de altura. O material de pintura (galão de tinta, lixa, rolo, etc.) custa R$100. Cada pintor cobra um preço diferente por m² pelo serviço de pintura. Escreva uma classe chamada `PinturaMuro` em Java que, dado o valor cobrado por um pintor (R$/m²), informe o custo total da pintura (com uma casa decimal).

## Exemplo de Entrada e Saída Esperada:

- **Entrada:** 3.2
- **Saída:** 215.2

## Dicas:

- Você pode representar os números reais usando `float` ou `double`.
- Em Java, um número real isolado (e.g., 1.21) é considerado como sendo do tipo `double`. Para usar um número como sendo do tipo `float`, utilize o 'f' ao final do número (e.g., 1.21f).
- Java converte automaticamente tipos quando não há perda de precisão. Exemplo: `double nota = 8.7f;` // Converte de `float` para `double` automaticamente.
- Entretanto, quando há perda de precisão, isso não é possível e o uso do cast é obrigatório. Exemplo: `float nota = (float) 8.7;` // Converte de `double` para `float` usando o cast.
- A classe `Scanner`, usada para ler dados do teclado, utiliza as configurações do sistema para definir o formato dos números reais. Dependendo da linguagem do seu sistema, um número real pode usar "." (ponto) ou "," (vírgula).
- Para imprimir algo formatado em Java, use o método `System.out.printf(String format, Object... args)`. Exemplo: `System.out.printf("%.3f\n", media);`
