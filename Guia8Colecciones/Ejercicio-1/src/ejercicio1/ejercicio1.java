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

package ejercicio1;
import java.util.Scanner;
import Servicios.ServPerro;

public class ejercicio1 {
    
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        ServPerro sP = new ServPerro();

        System.out.print("Ingrese la cantidad de perritos a crear: \n > ");
        sP.fabricaDePerritos(input.nextInt());
        sP.ordenarPerritos();
        sP.mostrarPerritos();

        System.out.print("Ingrese nombre de perrito a eliminar: \n > ");
        sP.eliminarPerro(input.next());
        sP.mostrarPerritos();

    }
    
}
