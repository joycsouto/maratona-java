# 🔹 Estruturas Condicionais em Java

As estruturas condicionais permitem que o programa tome decisões com base em condições lógicas. Em Java, as principais estruturas condicionais são `if`, `else`, `else if` e `switch`.

---

## 📌 Estrutura `if` e `else`
A estrutura `if` executa um bloco de código apenas se a condição for verdadeira (`true`). O `else` é utilizado para definir um bloco de código que será executado caso a condição seja falsa.

### ✏️ Exemplo:
```java
int numero = 10;

if (numero > 0) {
    System.out.println("O número é positivo.");
} else {
    System.out.println("O número é negativo ou zero.");
}
```

🔹 **Explicação:** Se `numero` for maior que zero, exibe "O número é positivo."; caso contrário, exibe "O número é negativo ou zero.".

---

## 📌 Estrutura `else if`
O `else if` permite testar múltiplas condições dentro do mesmo bloco condicional.

### ✏️ Exemplo:
```java
int nota = 85;

if (nota >= 90) {
    System.out.println("Nota A");
} else if (nota >= 80) {
    System.out.println("Nota B");
} else if (nota >= 70) {
    System.out.println("Nota C");
} else {
    System.out.println("Nota insuficiente");
}
```

🔹 **Explicação:** O código verifica a nota e classifica em "A", "B", "C" ou "insuficiente" com base nos intervalos definidos.

---

## 📌 Estrutura `switch`
O `switch` é uma alternativa ao `if-else`, útil quando há múltiplas verificações para o mesmo valor. Cada `case` representa uma possibilidade, e `default` define o que ocorre se nenhum caso for satisfeito.

### ✏️ Exemplo:
```java
int diaSemana = 3;

switch (diaSemana) {
    case 1:
        System.out.println("Domingo");
        break;
    case 2:
        System.out.println("Segunda-feira");
        break;
    case 3:
        System.out.println("Terça-feira");
        break;
    case 4:
        System.out.println("Quarta-feira");
        break;
    default:
        System.out.println("Dia inválido");
}
```

🔹 **Explicação:** Se `diaSemana` for `3`, imprime "Terça-feira". O `break` impede que os outros casos sejam executados após encontrar um correspondente. O `default` cobre os casos não previstos.

---

## ⚠️ Observações Importantes
✔️ O `if` pode ser usado sozinho, mas `else` sempre precisa de um `if` antes dele.  
✔️ O `switch` funciona melhor com valores exatos (inteiros, `char`, `String`), enquanto `if-else` permite condições mais complexas.  
✔️ O `break` no `switch` evita a execução de casos seguintes após um `case` ser satisfeito.  


