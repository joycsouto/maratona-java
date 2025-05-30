package VCollections.domain;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private Long id;
    private String nome;
    private double preco;

    public Book(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "id não pode ser nulo");
        Objects.requireNonNull(nome, "nome não pode ser nulo");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(preco, book.preco) == 0 && Objects.equals(id, book.id) && Objects.equals(nome, book.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Book o) {

//        if (this.id < o.getId()) {
//            return -1;
//        } else if (this.id.equals(o.getId())) {
//            return 0;
//        } else {
//            return 1;
//        }
//    }
  //  return id.compareTo(o.getId());
   //return this.nome.compareTo(o.getNome());
 return Double.compare(preco,o.getPreco());
 //return Double.valueOf(preco).compareTo(o.getPreco());
}}
