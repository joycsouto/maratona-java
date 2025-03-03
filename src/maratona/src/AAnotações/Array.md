# 🔢 Arrays em Java

Os arrays permitem armazenar múltiplos valores do mesmo tipo em uma única estrutura. Eles possuem tamanho fixo e índice baseado em zero.

---

## 📌 Declarando e Inicializando Arrays
Existem diferentes formas de declarar e inicializar um array em Java.

### ✏️ Exemplo de declaração e inicialização:
```java
int[] numeros = new int[5]; // Cria um array de 5 posições
```

📌 **Inicializando com valores diretos:**
```java
int[] numeros = {10, 20, 30, 40, 50};
```

---

## 📌 Acessando Elementos
Os elementos de um array são acessados por seus índices, começando do `0`.

### ✏️ Exemplo:
```java
int[] numeros = {10, 20, 30};
System.out.println(numeros[0]); // Saída: 10
```

⚠️ **Cuidado com o erro `ArrayIndexOutOfBoundsException` ao acessar um índice inexistente!**

---

## 📌 Percorrendo Arrays

### ✏️ Usando `for`:
```java
int[] numeros = {10, 20, 30, 40, 50};
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
```

### ✏️ Usando `for-each`:
```java
for (int num : numeros) {
    System.out.println(num);
}
```

🔹 O `for-each` é mais simples e evita erros de índice.

---

## 📌 Arrays Multidimensionais
Os arrays podem ter mais de uma dimensão, funcionando como tabelas.

### ✏️ Exemplo de array bidimensional (matriz):
```java
int[][] matriz = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
System.out.println(matriz[1][2]); // Saída: 6
```

📌 **Percorrendo uma matriz:**
```java
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
    }
    System.out.println();
}
```

---

## ⚠️ Observações Importantes
✔️ Arrays têm tamanho fixo após a inicialização.  
✔️ O índice começa em `0`.  
✔️ `length` retorna o tamanho do array.  
✔️ Arrays multidimensionais podem ser usados para representar tabelas de dados.

