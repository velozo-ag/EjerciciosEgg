/*
    Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
    tendremos una clase Pelicula con el título, director y duración de la película (en horas).
    Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
    que se pide a continuación:
    En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
    todos sus datos y guardándolos en el objeto Pelicula.
    Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
    crear otra Pelicula o no.
    Después de ese bucle realizaremos las siguientes acciones:
    • Mostrar en pantalla todas las películas.
    • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
    pantalla.
    • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
    pantalla.
    • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
*/

package Servicios;
import Entidades.Pelicula;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ServPeliculas {
    
    Scanner input = new Scanner(System.in);

    public Pelicula crearPelicula(){

        Pelicula peli;
        String titulo;
        String director;
        int duracion;

        System.out.print("Ingrese el titulo de la pelicula: \n > ");
        titulo = input.next();
        
        System.out.print("Ingrese el autor de la pelicula: \n > ");
        director = input.next();

        System.out.print("Ingrese la duracion de la pelicula: \n > ");
        duracion = input.nextInt();
        
        peli = new Pelicula(titulo,director,duracion);

        return peli;

    }

    public void agregarPelicula(Pelicula peli, ArrayList<Pelicula> cine){
        cine.add(peli);
    }

    public ArrayList<Pelicula> crearCine(){

        ArrayList<Pelicula> cine = new ArrayList<>();
        int seguir;
        System.out.print("Desea ingresar una pelicula? (1) si - (2) no \n > ");
        seguir = input.nextInt();
        
        while(seguir != 2){
            
            agregarPelicula(crearPelicula(), cine);
            
            System.out.print("\nDesea ingresar una pelicula? (1) si - (2) no \n > ");
            seguir = input.nextInt();

        }

        return cine;

    }

    public void mostrarPeliculas(ArrayList<Pelicula> cine){

        for (Pelicula peli : cine) {
            System.out.println(" > " + peli.toString());
        }

        System.out.println("");
    }

    public void mostrarMayorAHora(ArrayList<Pelicula> cine){

        System.out.println("\nPeliculas que duran mas de 1 hora: ");

        for (Pelicula peli : cine) {
            if(peli.getDuracion() > 1){
                System.out.println(" > " + peli.toString());
            }
        }

    }

    public void deMayorAMenorDuracion(ArrayList<Pelicula> cine){

        System.out.println("\nPeliculas de Mayor a Menor duracion: ");
        
        Collections.sort(cine, (Pelicula p1, Pelicula p2) -> p2.getDuracion().compareTo(p1.getDuracion()));
        
        mostrarPeliculas(cine);
        
    }
    
    public void deMenorAMayorDuracion(ArrayList<Pelicula> cine){

        System.out.println("\nPeliculas de Menor a Mayor duracion: ");
        
        Collections.sort(cine, (Pelicula p1, Pelicula p2) -> p1.getDuracion().compareTo(p2.getDuracion()));

        mostrarPeliculas(cine);

    }
    
    public void ordenarPorTitulo(ArrayList<Pelicula> cine){

        System.out.println("\nPeliculas por titulo: ");
        
        Collections.sort(cine, (Pelicula p1, Pelicula p2) -> p1.getTitulo().compareTo(p2.getTitulo()));

        mostrarPeliculas(cine);

    }
    
    public void ordenarPorDirector(ArrayList<Pelicula> cine){

        System.out.println("\nPeliculas por director: ");
        
        Collections.sort(cine, (Pelicula p1, Pelicula p2) -> p1.getDirector().compareTo(p2.getDirector()));

        mostrarPeliculas(cine);

    }

}
