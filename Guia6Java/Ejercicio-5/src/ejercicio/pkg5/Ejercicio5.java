/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().*/

package ejercicio.pkg5;
import java.util.Scanner;
/**
 * @author Agus
 */

public class Ejercicio5 {

    static Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {

        int number;
        int doub;
        int triple;
        int sqrt;
        
        System.out.print("Enter a number: ");
        number = scan.nextInt();
        
        doub = number * 2;
        
        triple = number * 3;
        
        sqrt = (int) Math.sqrt(number);
        
        System.out.println("num: " + number + "\ndouble: " + doub + "\ntriple: " + triple + "\nsquare root: " + sqrt );

        
    }
    
    /*
    
    public static void main(String[] args) {

        int number = enterData();
        
        int[] results = mathCalcualtions(number);
        
        printInfo(results);
        
    }
    
    public static int enterData(){
    
        System.out.print("Enter a number: ");
        int num = read.nextInt();
        
        return num;
        
    };
    
    public static int[] mathCalcualtions(int num){

        int[] array = new int[4];
        
        int doub = num * 2;
        array[0] = doub;
        
        int trip = num * 3;
        array[1] = trip;
        
        double sqrt = Math.sqrt((double)num);
        array[2] = (int)sqrt;
        
        array[3] = num;
        
        return array;
        
    };
    
    public static void printInfo(int[] res){
    
        System.out.println("num: " + res[3] + "\ndouble: " + res[0] + "\ntriple: " + res[1] + "\nsquare root: " + res[2] );

    };

    */
    
    
}
