# Descrição do Problema

Um cliente de um banco deseja sacar uma quantia em um caixa eletrônico que possui apenas notas de R$50, R$10 e R$2 disponíveis. Escreva uma classe chamada `CaixaEletronico` que:

- Exiba quantas notas de cada tipo devem ser entregues ao cliente.

## Considerações:

- O cliente pode inserir – intencionalmente ou não – um valor inválido, tal como um número negativo ou um número ímpar.
- Seu programa deve exibir a mensagem `"Valor Inválido"` nessas situações.

## Exemplo de Entrada e Saída Esperada:

- **Entrada:** 378
- **Saída:** 7 notas de R$50, 2 notas de R$10 e 4 notas de R$2

## Dicas:

- Comece pelas notas de valor mais alto.
- Use o operador de resto da divisão (`%`) para determinar a quantidade de notas de valor imediatamente mais baixo.
