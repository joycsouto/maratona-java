# 🔄 Laços de Repetição em Java

Os laços de repetição permitem executar um bloco de código várias vezes, enquanto uma condição for verdadeira. Em Java, os principais laços são `for`, `while` e `do-while`.

---

## 📌 Estrutura `for`
O `for` é usado quando sabemos exatamente quantas vezes o loop deve ser executado.

### ✏️ Exemplo:
```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Número: " + i);
}
```

🔹 **Explicação:**
1. `int i = 1` → Inicializa a variável de controle (`i`).
2. `i <= 5` → Condição para continuar o loop.
3. `i++` → Incrementa `i` a cada iteração.

Saída:
```
Número: 1
Número: 2
Número: 3
Número: 4
Número: 5
```

📌 **Também é possível declarar a variável antes do `for`, mantendo o controle externo:**
```java
int i = 1;
for (; i <= 5; i++) {
    System.out.println("Número: " + i);
}
```
Isso pode ser útil quando queremos reutilizar a variável depois do loop.

📌 **Usando uma variável como limite dinâmico:**
```java
int limite = 5;
for (int i = 1; i <= limite; i++) {
    System.out.println("Número: " + i);
}
```
Isso é útil quando o número de repetições depende de uma entrada do usuário ou de um cálculo. O ideal é que o valor seja conhecido, mas quando não for possível, usar uma variável torna o código mais flexível.

---

## 📌 Estrutura `while`
O `while` é usado quando **não sabemos** previamente quantas vezes o loop será executado.

### ✏️ Exemplo:
```java
int contador = 1;
while (contador <= 5) {
    System.out.println("Contagem: " + contador);
    contador++;
}
```

🔹 **Explicação:** O loop continua executando enquanto `contador` for menor ou igual a `5`. O valor é incrementado a cada repetição.

---

## 📌 Estrutura `do-while`
O `do-while` é semelhante ao `while`, mas **garante que o bloco de código seja executado pelo menos uma vez**, pois a condição é verificada depois da execução.

### ✏️ Exemplo:
```java
int numero = 1;
do {
    System.out.println("Número: " + numero);
    numero++;
} while (numero <= 5);
```

🔹 **Explicação:** O código dentro do `do` será executado pelo menos uma vez, mesmo que a condição seja falsa na primeira verificação.

---

## 📌 Loop `for-each`
O `for-each` é usado para percorrer arrays e coleções sem a necessidade de um índice manual.

### ✏️ Exemplo:
```java
int[] numeros = {10, 20, 30, 40, 50};
for (int num : numeros) {
    System.out.println("Número: " + num);
}
```

🔹 **Explicação:** Para cada elemento no array `numeros`, a variável `num` assume seu valor e executa o código.

---

## ⚠️ Observações Importantes
✔️ Use `for` quando o número de repetições for **definido previamente**.  
✔️ Use `while` quando a repetição **depender de uma condição externa** e não soubermos o número exato de execuções.  
✔️ Use `do-while` quando precisar que o bloco de código **seja executado pelo menos uma vez**, independentemente da condição.  
✔️ Use `for-each` para percorrer arrays e coleções de forma **mais simples e eficiente** do que um `for` tradicional.  
✔️ Se o número de repetições for variável, utilize uma variável no limite do `for` para maior flexibilidade.

