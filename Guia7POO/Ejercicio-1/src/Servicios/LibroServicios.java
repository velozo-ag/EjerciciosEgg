/*
    Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
    Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
    constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
    luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
    numero de páginas.
 */
package Servicios;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Agus
 */

public class LibroServicios {

    Scanner input = new Scanner(System.in);
    
    Libro lib = new Libro();

    public Libro rellenarLibro(){
    
        System.out.println("Ingrese el titulo: ");
        lib.setTitulo(input.next());

        System.out.println("Ingrese el autor: ");
        lib.setAutor(input.next());

        System.out.println("Ingrese el ISBN: ");
        lib.setISBN(input.nextInt());
        
        System.out.println("Ingrese el numero de paginas: ");
        lib.setNumPag(input.nextInt());

        return lib;
        
    }

    public void mostrarLibro(Libro lib){
        
        System.out.println(lib.getTitulo());
        System.out.println(lib.getAutor());
        System.out.println(lib.getISBN());
        System.out.println(lib.getNumPag());
        
    }
    
}
