//Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
//dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
//fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
//X y el último tiene que ser una O.

//Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
//especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
//de FDE, que no respete el formato se considera incorrecta.

//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
//incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
//siguientes funciones de Java Substring(), Length(), equals().

package ejercicio.pkg12;
import java.util.Scanner;

/**
 * @author Agus
 */

public class Ejercicio12 {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {

        String pass;
        int value;
        int correctVol = 0;
        int incorrectVol = 0;
        
        do{
        
            System.out.print("Enter a string: \n > ");
            pass = input.nextLine();
        
            if(!pass.equals("&&&&&")){
            
                value = verifyFormat(pass);
            
                if(value == 1){
                    correctVol ++;
                }else{
                    incorrectVol ++;
                }
                
            }
            
            System.out.println("\n");
            
        }while(!pass.equals("&&&&&"));
        
        printResults(correctVol, incorrectVol);

    }
    
    public static int verifyFormat(String str){
    
//      char firstChar = str.charAt(0);
//      char lastChar = str.charAt(str.length());
        int val;
        int length = str.length();
        String firstLetter;
        String lastLetter;


        if(str.length() <= 5 && str.length() > 1){
        
            firstLetter = str.substring(0,1);
            lastLetter = str.substring(length-1,length);
            
            if(firstLetter.equals("X") && lastLetter.equals("O")){
            
                val = 1;
            
            }else {
            
                val = 0;
                
            }
        
        }else {
        
            val = 0;
        
        }
        
        return val;
        
    };
    
    public static void printResults(int correct, int incorrect){
    
        System.out.print(" ------------------------------------- \n ");
        
        System.out.println("\n \t Correct strings: " + correct);
        System.out.println("\n \t Incorrect strings: " + incorrect);
        
        System.out.print("\n ------------------------------------- \n\n\n\n");
    
    }
    
}
