package semana6.biblioteca;

import java.util.Objects;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;

    public Livro(){}
    public Livro(String titulo,String autor,String isbn){
        this.autor = autor;
        this.titulo=titulo;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }
    @Override
    public String toString(){
        return "Livro\nTítulo: " + titulo + "\nAutor: " + autor + "\nISBN: " + isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(isbn, livro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}
