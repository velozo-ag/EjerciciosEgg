/*
    Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
    programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
    después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
    salir, se mostrará todos los perros guardados en el ArrayList.
*/

package Servicios;
import Entidades.Perro;
import java.util.Scanner;
import java.util.ArrayList;

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

    public void mostrarPerritos(){

        System.out.println("");
        System.out.println("Los nombres de los " + perritos.size() + " perritos son: ");

        for (Perro p : perritos) {
            System.out.println(p.toString());
        }

    }

}
