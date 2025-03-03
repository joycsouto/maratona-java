# 🧱 Orientação a Objetos (OO)

A Orientação a Objetos é um paradigma de programação que permite modelar o mundo real no mundo computacional, utilizando conceitos como **classes**, **objetos**, **herança**, **polimorfismo** e muito mais. Vamos explorar cada tópico em detalhes! 🚀

---

### 1.📌 **Classe e Objetos**
- **O que é?**  
  Uma classe é um modelo ou blueprint que define atributos e comportamentos de um objeto. Objetos são instâncias de uma classe.
- **Exemplo:**
  ```java
  class Carro {
      String marca;
      String modelo;

      void acelerar() {
          System.out.println("Acelerando o " + modelo);
      }
  }

  public class Main {
      public static void main(String[] args) {
          Carro meuCarro = new Carro();
          meuCarro.marca = "Toyota";
          meuCarro.modelo = "Corolla";
          meuCarro.acelerar(); // Saída: Acelerando o Corolla
      }
  }
  ```

---

## 2. 🔒 **Modificadores de Acesso**
- **O que são?**  
  Controlam a visibilidade de atributos e métodos.
    - `public`: Acessível de qualquer lugar.
    - `private`: Acessível apenas dentro da classe.
    - `protected`: Acessível dentro da classe, subclasses e mesmo pacote.
    - `default`: Acessível apenas dentro do mesmo pacote.
- **Exemplo:**
  ```java
  class ContaBancaria {
      private double saldo; // Só pode ser acessado dentro da classe

      public void depositar(double valor) {
          saldo += valor;
      }

      public double getSaldo() {
          return saldo;
      }
  }
  ```

---

## 3. 🏗️**Construtores**
- **O que são?**  
  Métodos especiais usados para inicializar objetos.
- **Exemplo:**
  ```java
  class Pessoa {
      String nome;
      int idade;

      Pessoa(String nome, int idade) {
          this.nome = nome;
          this.idade = idade;
      }
  }

  public class Main {
      public static void main(String[] args) {
          Pessoa pessoa = new Pessoa("João", 25);
          System.out.println(pessoa.nome); // Saída: João
      }
  }
  ```

---

## 4. � **Blocos de Inicialização**
- **O que são?**  
  Blocos de código executados antes do construtor.
    - **Bloco estático**: Executado uma vez, quando a classe é carregada.
    - **Bloco de instância**: Executado toda vez que um objeto é criado.
- **Exemplo:**
  ```java
  class Exemplo {
      static {
          System.out.println("Bloco estático executado.");
      }

      {
          System.out.println("Bloco de instância executado.");
      }

      Exemplo() {
          System.out.println("Construtor executado.");
      }
  }

  public class Main {
      public static void main(String[] args) {
          Exemplo ex = new Exemplo();
      }
  }
  ```

---

## 5. 🔄 **Sobrecarga de Métodos**
- **O que é?**  
  Criar métodos com o mesmo nome, mas com diferentes parâmetros.
- **Exemplo:**
  ```java
  class Calculadora {
      int somar(int a, int b) {
          return a + b;
      }

      double somar(double a, double b) {
          return a + b;
      }
  }
  ```

---

## 6. ⚙ **Modificador Estático (static)**
- **O que é?**  
  Atributos e métodos que pertencem à classe, não a instâncias.
- **Exemplo:**
  ```java
  class Contador {
      static int contador = 0;

      Contador() {
          contador++;
      }

      static int getContador() {
          return contador;
      }
  }

  public class Main {
      public static void main(String[] args) {
          new Contador();
          new Contador();
          System.out.println(Contador.getContador()); // Saída: 2
      }
  }
  ```

---

## 7. 🧬 **Herança**
- **O que é?**  
  Extender funcionalidades de uma classe para outra.
- **Exemplo:**
  ```java
  class Animal {
      void fazerSom() {
          System.out.println("Som genérico");
      }
  }

  class Cachorro extends Animal {
      @Override
      void fazerSom() {
          System.out.println("Au Au!");
      }
  }
  ```

---

## 8. ✏ **Sobrescrita**
- **O que é?**  
  Substituir métodos da superclasse na subclasse.
- **Exemplo:**
  ```java
  class Veiculo {
      void mover() {
          System.out.println("Veículo se movendo");
      }
  }

  class Carro extends Veiculo {
      @Override
      void mover() {
          System.out.println("Carro se movendo");
      }
  }
  ```

---

## 9. 🛑 **Modificador Final**
- **O que é?**  
  Criar constantes ou impedir herança/sobrescrita.
- **Exemplo:**
  ```java
  class Matematica {
      static final double PI = 3.14159;
  }

  final class NaoPodeSerHerdada {
      // Classe não pode ser herdada
  }
  ```

---

## 10. 🎲 **Enumeração**
- **O que é?**  
  Conjunto fixo de constantes.
- **Exemplo:**
  ```java
  enum DiaDaSemana {
      SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
  }

  public class Main {
      public static void main(String[] args) {
          DiaDaSemana hoje = DiaDaSemana.SEGUNDA;
          System.out.println(hoje); // Saída: SEGUNDA
      }
  }
  ```

---

## 11. 🧩 **Classes Abstratas**
- **O que são?**  
  Classes que não podem ser instanciadas, apenas herdadas.
- **Exemplo:**
  ```java
  abstract class Forma {
      abstract double calcularArea();
  }

  class Circulo extends Forma {
      double raio;

      Circulo(double raio) {
          this.raio = raio;
      }

      @Override
      double calcularArea() {
          return Math.PI * raio * raio;
      }
  }
  ```

---

## 12. 📜 **Interface**
- **O que é?**
- 
  Contrato que define métodos a serem implementados.
- **Exemplo:**
  ```java
  interface Desenhavel {
      void desenhar();
  }

  class Circulo implements Desenhavel {
      @Override
      public void desenhar() {
          System.out.println("Desenhando um círculo");
      }
  }
  ```

---

## 13. 🎭 **Polimorfismo**
- **O que é?**  
  Capacidade de um objeto ser referenciado de múltiplas formas.
- **Exemplo:**
  ```java
  class Animal {
      void fazerSom() {
          System.out.println("Som genérico");
      }
  }

  class Cachorro extends Animal {
      @Override
      void fazerSom() {
          System.out.println("Au Au!");
      }
  }

  public class Main {
      public static void main(String[] args) {
          Animal meuAnimal = new Cachorro();
          meuAnimal.fazerSom(); // Saída: Au Au!
      }
  }
  ```

---

