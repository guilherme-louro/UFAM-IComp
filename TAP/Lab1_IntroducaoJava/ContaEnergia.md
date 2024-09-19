# ContaEnergia

Escreva um programa (classe `ContaEnergia`) que determine o preço a pagar pelo fornecimento de energia elétrica. O programa deve:

- Receber como entrada o consumo de energia (em kWh) e o tipo de instalação (`R` para residências, `I` para indústrias, e `C` para comércios).
- Usar a tabela a seguir para calcular o preço devido:

## Tabela de Preços por Tipo e Faixa de Consumo

| Tipo        | Faixa (kWh) | Preço  |
|-------------|-------------|--------|
| Residencial | Até 500     | R$ 0,40|
|             | Acima de 500| R$ 0,65|
| Comercial   | Até 1000    | R$ 0,55|
|             | Acima de 1000|R$ 0,60|
| Industrial  | Até 5000    | R$ 0,55|
|             | Acima de 5000|R$ 0,60|

## Requisitos da Saída

- A saída deve ter duas casas decimais.
- Caso algum valor inválido seja inserido, o programa deve imprimir `-1.00`.

## Exemplo de Entrada e Saída Esperada:

- **Entrada:** 6340 R
- **Saída:** 4121.00

## Dica:

- A classe `Scanner` não possui o método `nextChar()`. Para ler um caractere do teclado, use: `char tipo = scan.next().charAt(0);`
