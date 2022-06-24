//    Crea una aplicación que a través de una función nos convierta una cantidad de euros
//    introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
//    función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
//    una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
//    (void).
//    El cambio de divisas es:
//    * 0.86 libras es un 1 €
//    * 1.28611 $ es un 1 €
//    * 129.852 yenes es un 1 €

package ejercicio.pkg14;
import java.util.Scanner;

/**
 * @author Agus
 */

public class Ejercicio14 {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {

        float balance;
        String type;
        
        System.out.print("Enter the amount to change: \n > ");
        balance = input.nextInt();
        
        System.out.print("Enter the type: lib - usd - yen \n > ");
        type = new Scanner(System.in).nextLine();
        
        calculateChange(balance,type);

    }
    
    public static void calculateChange(float bal, String currency){
    
        float value;
        
        switch(currency){
        
            case "lib":
                
                value = (float) (bal * 0.86);
                System.out.println(bal + " eur -> " + value + " lib");
                
            break;
            case "usd":
            
                value = (float) (bal * 1.28611);
                System.out.println(bal + " eur -> " + value + " usd");
                
            break;
            case "yen":
            
                value = (float) (bal * 129.852);
                System.out.println(bal + " eur -> " + value + " yen");
                
            break;
        
        }
    
    }
    
}
