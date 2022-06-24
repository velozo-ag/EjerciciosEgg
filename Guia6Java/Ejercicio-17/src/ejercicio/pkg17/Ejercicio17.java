//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
//de 2 dígitos, etcétera (hasta 5 dígitos).

package ejercicio.pkg17;
import java.util.Scanner;
import java.lang.Math;

/**
 * @author Agus
 */

public class Ejercicio17 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[] vec;
        int digits;
        int dig1 = 0;
        int dig2 = 0;
        int dig3 = 0;
        int dig4 = 0;
        int dig5 = 0;
                
        System.out.print("Enter a length for the vector: \n > ");
        vec = new int[input.nextInt()];
        
        for(int i = 0; i < vec.length; i++){
        
            vec[i] = (int) (Math.random() * 100000);
        
            //printVector(vec[i]);
            
            digits = (int) Math.log10(vec[i]) + 1;
            
            switch(digits){
            
                case 1:
                    dig1++;
                break;
                case 2:
                    dig2++;
                break;
                case 3:
                    dig3++;
                break;
                case 4:
                    dig4++;
                break;
                case 5:
                    dig5++;
                break;
            
            }
            
        }
        
        printResults(dig1,dig2,dig3,dig4,dig5);
        
    }

    public static void printResults(int dig1, int dig2,int dig3,int dig4,int dig5){
    
        System.out.println("The amount of numbers with 1 digit is: " + dig1);
        System.out.println("The amount of numbers with 2 digits is: " + dig2);
        System.out.println("The amount of numbers with 3 digits is: " + dig3);
        System.out.println("The amount of numbers with 4 digits is: " + dig4);
        System.out.println("The amount of numbers with 5 digits is: " + dig5);
    
    
    }
    
    /*
    private static void printVector(int i) {

        System.out.print(i + ", ");
            
        if(i > 10 && i % 10 == 0 ){

            System.out.println("");

        }
    }
    */
    
}
