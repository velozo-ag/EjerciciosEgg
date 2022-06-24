/*
    Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
    Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
    constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
    luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
    numero de páginas.
 */

package Entidades;

/**
 * @author Agus
 */

public class Libro {
    
    public int ISBN, numPag;
    public String titulo, autor;

    
    // Constructores
    public Libro() {
        
    }

    public Libro(int ISBN, int numPag, String titulo, String autor) {
        this.ISBN = ISBN;
        this.numPag = numPag;
        this.titulo = titulo;
        this.autor = autor;
    }

    
    // Getter & setter
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}
