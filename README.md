# Documentação do Projeto: Idade

## Descrição Geral

O projeto `Idade` é uma aplicação em Java que calcula a idade de uma pessoa com base no ano de nascimento fornecido pelo usuário. A aplicação também determina se a pessoa é maior ou menor de idade, considerando a maioridade como 18 anos. O programa inclui validações para garantir que o ano de nascimento inserido seja um número válido e que não seja maior que o ano atual.

## Estrutura da Classe

### Classe: `Idade`

- **Responsabilidade**: Calcular a idade de uma pessoa e determinar se ela é maior ou menor de idade, com validação de entrada.

### Método `main(String[] args)`

```java
public static void main(String[] args) {
    // Lógica principal da aplicação
}
```

- **Descrição**: Este é o ponto de entrada da aplicação. O método realiza as seguintes operações:
  1. Cria um objeto `Scanner` para ler a entrada do usuário.
  2. Obtém o ano atual utilizando a classe `Calendar`.
  3. Solicita ao usuário que insira seu ano de nascimento.
  4. Valida a entrada do usuário para garantir que o ano de nascimento seja um número e que não seja maior que o ano atual.
  5. Calcula a idade subtraindo o ano de nascimento do ano atual.
  6. Verifica se a idade é maior ou igual a 18 anos e exibe a mensagem correspondente.

### Detalhes da Implementação

1. **Importação de Bibliotecas**:
   - `import java.util.Calendar;`: Importa a classe `Calendar` para obter a data atual.
   - `import java.util.Scanner;`: Importa a classe `Scanner` para ler a entrada do usuário.

2. **Criação do Scanner**:
   ```java
   Scanner s = new Scanner(System.in);
   ```
   - Um objeto `Scanner` é criado para permitir a leitura de dados do console.

3. **Obtenção do Ano Atual**:
   ```java
   Calendar calendario = Calendar.getInstance();
   int anoAtual = calendario.get(Calendar.YEAR);
   ```
   - Utiliza a classe `Calendar` para obter o ano atual.

4. **Leitura e Validação do Ano de Nascimento**:
   ```java
   boolean entradaValida = false;
   while (!entradaValida) {
       System.out.println("Digite ano de nascimento válido:");
       if (s.hasNextInt()) {
           nas = s.nextInt();
           if (nas > anoAtual) {
               System.out.println("Ano de nascimento não pode ser maior que o ano atual (" + anoAtual + "). Tente novamente.");
           } else {
               entradaValida = true; // Saia do loop se a entrada for válida
           }
       } else {
           System.out.println("Entrada inválida. Por favor, insira um número.");
           s.next(); // Limpa a entrada inválida
       }
   }
   ```
   - Um loop `while` é utilizado para garantir que o usuário insira um ano de nascimento válido. O programa verifica se a entrada é um número e se o ano de nascimento não é maior que o ano atual.

5. **Cálculo da Idade**:
   ```java
   int i = anoAtual - nas;
   ```
   - A idade é calculada subtraindo o ano de nascimento do ano atual.

6. **Verificação da Maioridade**:
   ```java
   if(i >= 18) {
       System.out.println("Você tem " + i + " anos.");
       System.out.println("Então é maior de idade.");
   } else {
       System.out.println("Você tem " + i + " anos.");
       System.out.println("Menor de idade.");
   }
   ```
   - O programa verifica se a idade é maior ou igual a 18 e exibe a mensagem apropriada.

7. **Fechamento do Scanner**:
   ```java
   s.close(); // Fecha o scanner
   ```
   - O scanner é fechado no final do programa para liberar os recursos.

## Considerações Finais

- **Limitações**: O programa assume que o usuário insere um ano de nascimento em formato numérico. Se o usuário inserir um valor não numérico, o programa solicitará uma nova entrada.

