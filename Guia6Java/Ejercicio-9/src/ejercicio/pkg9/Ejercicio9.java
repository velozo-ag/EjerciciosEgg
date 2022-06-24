//Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
//es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
//diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
//la función Substring y equals() de Java.

package ejercicio.pkg9;
import java.util.Scanner;

/**
 * @author Agus
 */

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in).useDelimiter("\n");
        String phrase;
        String letter = "A";
        String firstLetter;
        
        do {
            
            phrase = read.nextLine();
            firstLetter = phrase.substring(0,1);
            condition(firstLetter, letter);
            
        }while(!firstLetter.equals(letter));
        
    }
    
    public static void condition(String phr, String lett){
    
        if(phr.equals(lett)){
            
            System.out.println("Correct.");
            
        }else {
            
            System.out.println("Incorrect.");
            
        }
        
    }
    
}
