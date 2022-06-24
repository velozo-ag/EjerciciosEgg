//Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
//usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
//numero y si se encuentra repetido

package ejercicio.pkg16;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

/**
 * @author Agus
 */

public class Ejercicio16 {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {

        int[] vec;
        int length;
        
        System.out.print("Enter a length for the vector: \n > ");
        length = input.nextInt();
        
        vec = new int[length];
        
        for(int i = 1; i <= length; i++){
        
            vec[i-1] = (int) (Math.random() * 100);

            System.out.print(vec[i-1] + ", ");
            
            if(length > 10 && i % 10 == 0 ){
            
                System.out.println("");
                
            }
        
        }
        
    }
    
}
