/*
    Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
    programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
    después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
    salir, se mostrará todos los perros guardados en el ArrayList.
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
        sP.mostrarPerritos();

    }
    
}
