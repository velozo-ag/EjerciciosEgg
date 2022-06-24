//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
//números al usuario hasta que la suma de los números introducidos supere el límite inicial.

package ejercicio.pkg10;
import java.util.Scanner;

/**
 * @author Agus
 */

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int limit;
        int amount = 0;

        System.out.print("Set a limit: ");
        limit = input.nextInt();
        
        do{

            System.out.print("Add: ");
            amount += input.nextInt();
            
        }while(amount <= limit);
        
    }
    
}
