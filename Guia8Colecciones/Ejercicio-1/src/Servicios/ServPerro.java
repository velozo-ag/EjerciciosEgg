/*
    Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
    programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
    después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
    salir, se mostrará todos los perros guardados en el ArrayList.

    Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
    un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
    está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
    ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
    la lista ordenada.
*/

package Servicios;
import Entidades.Perro;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ServPerro {
    
    Scanner input = new Scanner(System.in);
    ArrayList <Perro> perritos = new ArrayList<>();

    public Perro crearPerro(){

        Perro perrito = new Perro();
        
        System.out.print("\nIngrese el nombre de su perro: \n > ");
        perrito.setNombre(input.next());


        return perrito;

    }

    public void aniadirPerro(Perro perrito){

        perritos.add(perrito);

    }

    public void fabricaDePerritos(int cantidad){

        int i;

        for(i = 0; i < cantidad; i++){

            aniadirPerro(crearPerro());

        }

    }

    public void ordenarPerritos(){

        // Collections.sort(perritos); // Funciona con integers
        Collections.sort(perritos, (Perro p1, Perro p2) -> p1.getNombre().compareTo(p2.getNombre()));

    }

    public void mostrarPerritos(){

        System.out.println("");
        System.out.println("Los nombres de los " + perritos.size() + " perritos son: ");

        for (Perro p : perritos) {
            System.out.println(p.toString());
        }

    }

    public void eliminarPerro(String nombre){

        Iterator<Perro> it = perritos.iterator();
        boolean remove = false;

        while(it.hasNext()){

            if(it.next().getNombre().equals(nombre)){
                it.remove();
                remove = true;
            }

        }

        if(!remove){

            System.out.println("No se ha removido ningun perrito.");

        }

    }

}
