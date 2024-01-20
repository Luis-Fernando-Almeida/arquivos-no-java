## Configuração

Antes de executar o projeto, certifique-se de ter as seguintes ferramentas e dependências instaladas:

- [Java](https://www.oracle.com/java/technologies/javase-downloads.html)
- [IDE (Eclipse, IntelliJ, etc.)](https://www.eclipse.org/)

## Instruções de Execução


1. Abra o projeto na sua IDE preferida.

2. Certifique-se de configurar as variáveis de ambiente necessárias, se houver.

3. Execute a classe `Main.java` para processar o arquivo de entrada e gerar o arquivo de saída.

## Formato do Arquivo de Entrada

O arquivo de entrada (`test.csv`) deve seguir o formato CSV (Comma-Separated Values) com as seguintes colunas:

1. **Nome do Produto**: String
2. **Valor do Produto**: Número decimal
3. **Quantidade do Produto**: Número decimal

Exemplo:

```csv
Produto1,20.50,5
Produto2,15.75,10
```

## Saída

Os resultados serão gravados no arquivo `summary.csv` no diretório `out`. Este arquivo conterá os nomes dos produtos e seus valores totais formatados com duas casas decimais.

