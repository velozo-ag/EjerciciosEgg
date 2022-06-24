//Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
//usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
//pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
//Nota: investigar la función Lenght() en Java.

package ejercicio.pkg8;
import java.util.Scanner;

/**
 * @author Agus
 */

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String phrase;
        
        do{
        
            phrase = read.nextLine();
            printPhrase(phrase);
        
        }while (phrase.length() != 8);
        
    }
    
    public static void printPhrase(String str){
    
        if(str.length() == 8){
        
            System.out.println("Correct.");
            
        }else{
        
            System.out.println("Incorrect.");
        
        }
    
    }
    
}
