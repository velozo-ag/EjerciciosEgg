/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class Ejercicio4 {

    public static void main(String[] args) {
    
        Scanner Scan = new Scanner(System.in);
        float degrees;
        
        System.out.println("Enter the amount of degrees to convert: ");
        degrees = Scan.nextFloat();
        
        System.out.println(degrees + " celcius equals " + centToFahrenheit(degrees) + " fahrenheits.");
        
    }
    
    public static float centToFahrenheit(float cent){
        
        float fahr = 32 + (9 * cent / 5);
        
        return fahr;
        
    }

}
