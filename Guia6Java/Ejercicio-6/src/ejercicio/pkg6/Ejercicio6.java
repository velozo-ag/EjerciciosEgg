//Crear un programa que dado un numero determine si es par o impar.


package ejercicio.pkg6;
import java.util.Scanner;

/**
 * @author Agus
 */

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int num;
        
        System.out.print("Enter a number: ");
        num = read.nextInt();
        
        parImpar(num);
        
    }
    
    public static void parImpar(int num){
    
        
        if (num % 2 == 0){
        
            System.out.println("Par");
            
        }else {

            System.out.println("Impar");
            
        }
        
    }
    
}
