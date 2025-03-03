# 📌 Variáveis em Java

As variáveis armazenam dados na memória e são fundamentais para a programação em Java. Elas podem ser classificadas em **tipos primitivos** e **tipos de referência**.

## 🔹 Tipos Primitivos

Os tipos primitivos armazenam valores diretamente na memória e possuem tamanhos fixos.

| Tipo     | Tamanho  | Intervalo / Descrição |
|----------|---------|----------------------|
| `byte`   | 8 bits  | -128 a 127 |
| `short`  | 16 bits | -32.768 a 32.767 |
| `int`    | 32 bits | -2.147.483.648 a 2.147.483.647 |
| `long`   | 64 bits | -9 quintilhões a 9 quintilhões |
| `float`  | 32 bits | Números decimais de precisão simples |
| `double` | 64 bits | Números decimais de precisão dupla |
| `char`   | 16 bits | Armazena um único caractere (`'A'`, `'9'`, `'%'`, etc.) |
| `boolean` | 1 bit  | Pode ser `true` ou `false` |

### ✏️ Exemplo de declaração de variável:

```java
int num1 = 12; // Primeiro vem o tipo, depois o nome da variável e, em seguida, o valor atribuído
```

---

## 🔹 Tipos de Referência

Os **tipos de referência** armazenam **endereços de memória** que apontam para objetos. Eles não armazenam valores diretamente como os tipos primitivos.

### 🔸 Exemplos de tipos de referência:
- **`String`** (classe que representa textos)
- **Arrays** (`int[] numeros = {1, 2, 3};`)
- **Objetos de classes personalizadas** (`Pessoa p = new Pessoa();`)

A classe `String` é um tipo de referência muito utilizado, pois contém diversos métodos úteis para manipulação de texto.

### ✏️ Exemplo de uso do tipo `String`:
```java
String name = "Joyce";
name = name.concat(" Souto"); // Concatenação de Strings
int tamanho = name.length();  // Retorna o tamanho da String

System.out.println(name);     // Saída: Joyce Souto
System.out.println(tamanho);  // Saída: 12
```

⚠️ **Importante**: Strings em Java são **imutáveis**, ou seja, qualquer modificação gera um novo objeto na memória.
