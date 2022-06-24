//Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
//muestre por pantalla en orden descendente.

package ejercicio.pkg15;
import java.util.Scanner;

/**
 * @author Agus
 */

public class Ejercicio15 {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {

        int[] vec = new int[100];
        
        for(int i = 0; i < vec.length; i++){
        
            vec[i] = i + 1;
            
            
            if(i % 10 == 0){
            
                System.out.println("");
            
            }else{
            
                System.out.print(", ");
            
            }
            
            if(i + 1 < 10){
            
                System.out.print("0" + vec[i]);
                
            }else {
            
                System.out.print(vec[i]);
            
            }
            
            
        }
        
        System.out.println("");
        
    }
    
}
