/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/
package ejercicio.pkg3;
import java.util.Scanner;
/**
 *
 * @author Agus
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        
        String frase;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese una frase: ");
        
        frase = new Scanner(System.in).nextLine();
        
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
            
    }
    
}
