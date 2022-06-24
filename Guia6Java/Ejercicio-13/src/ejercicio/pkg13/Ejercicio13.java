// Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
// cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
// * * * *
// *     *
// *     *
// * * * *

package ejercicio.pkg13;
import java.util.Scanner;

/**
 * @author Agus
 */

public class Ejercicio13 {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {

        int length;
        
        System.out.print("Enter a length: \n > ");
        length = input.nextInt();

        printSquare(length);
        
    }
    
    public static void printSquare(int leng){

        
        for(int i = 0; i < leng; i++){

            if(i == 0 || i == leng -1){
            // Print first and last raws

                for (int j = 0; j < leng; j++){
                
                    System.out.print("* ");
                
                }
                
                System.out.println("");

            }else{
            // Print middles rows
                
                System.out.print("* ");
                
                for (int j = 0; j < leng - 2; j ++){
                
                    System.out.print("  ");
                    
                }
                
                System.out.print("* \n");
                
            }
            
        }
    
    }
    
}
