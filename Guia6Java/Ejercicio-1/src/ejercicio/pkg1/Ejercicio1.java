
//Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
//dos. El programa deberá después mostrar el resultado de la suma

package ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
    
        int num1, num2;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros");
        
        num1 = read.nextInt();
        num2 = read.nextInt();
        
        System.out.println(num1 + num2);
        
    }
    
}
