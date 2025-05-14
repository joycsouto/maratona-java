# 🔧 Métodos em Java

Os métodos são blocos de código reutilizáveis que realizam uma tarefa específica. Eles ajudam a organizar o código, evitando repetição e facilitando a manutenção.

---
 [Métodos](../Dmetodos/dominio)

## 📌 Estrutura de um Método
Um método pode ser definido com:
- **Modificadores de acesso** (`public`, `private`, etc.)
- **Tipo de retorno** (`void` se não retornar nada)
- **Nome do método**
- **Parâmetros opcionais**
- **Corpo do método**

### ✏️ Exemplo de um método simples:
```java
public void saudacao() {
    System.out.println("Olá, bem-vindo ao Java!");
}
```
Esse método não recebe parâmetros e apenas imprime uma mensagem na tela.

---

## 📌 Métodos com Retorno
Se um método deve retornar um valor, ele precisa de um tipo de retorno diferente de `void` e utilizar `return`.

### ✏️ Exemplo:
```java
public int soma(int a, int b) {
    return a + b;
}
```
🔹 **Explicação:** Esse método recebe dois inteiros e retorna a soma deles.

---

## 📌 Métodos Estáticos
Métodos marcados como `static` pertencem à classe e não ao objeto.

### ✏️ Exemplo:
```java
public class Util {
    public static int quadrado(int x) {
        return x * x;
    }
}
```
🔹 Para chamar um método estático: `Util.quadrado(4);`

---

## 📌 Métodos com Sobrecarga (Overloading)
Um método pode ter o mesmo nome, mas com parâmetros diferentes.

### ✏️ Exemplo:
```java
public int multiplicar(int a, int b) {
    return a * b;
}

public double multiplicar(double a, double b) {
    return a * b;
}
```
🔹 O Java escolhe automaticamente o método adequado com base nos argumentos.

---

## 📌 Métodos Recursivos
Um método pode chamar a si mesmo para resolver problemas recursivos.

### ✏️ Exemplo: Fatorial
```java
public int fatorial(int n) {
    if (n == 0) return 1;
    return n * fatorial(n - 1);
}
```
🔹 A função se chama repetidamente até atingir `n == 0`.

---

## 📌 Passagem de Parâmetros
Em Java, os parâmetros podem ser passados por **valor** (para tipos primitivos) e por **referência** (para objetos).

### ✏️ Exemplo:
```java
public void alteraValor(int x) {
    x = 10;
}
```
🔹 O valor original não é alterado, pois Java trabalha com **cópia** para tipos primitivos.

---

## 📌 Boas Práticas
✔️ Escolha **nomes descritivos** para os métodos.  
✔️ Evite métodos muito grandes; separe lógicas diferentes.  
✔️ Sempre documente métodos importantes com **JavaDoc**.  
✔️ Prefira **passar objetos imutáveis** para evitar efeitos colaterais.  


