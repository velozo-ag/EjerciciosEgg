//Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
//pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
//la función equals() en Java.

package ejercicio.pkg7;
import java.util.Scanner;

/**
 * @author Agus
 */

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String pass;

        System.out.print("Enter the password: ");
        pass = read.nextLine(); 
        
        passVerification(pass);

    }
    
    public static void passVerification(String password){
    
        if ("eureka".equals(password)){
        
            System.out.println("Correct.");
            
        } else {
            
            System.out.println("Incorrect");
            
        }
        
    }
    
}
