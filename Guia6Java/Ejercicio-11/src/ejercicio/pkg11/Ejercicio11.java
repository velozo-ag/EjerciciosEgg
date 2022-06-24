//  Realizar un programa que pida dos números enteros positivos por teclado y muestre por
//  pantalla el siguiente menú:
//
//        MENU
//        1. Sumar
//        2. Restar
//        3. Multiplicar
//        4. Dividir
//        5. Salir
//        Elija opción:
//
//  El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
//  y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
//  Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
//  directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
//  desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
//  programa, caso contrario se vuelve a mostrar el menú.

package ejercicio.pkg11;
import java.util.Scanner;

/**
 * @author Agus
 */

public class Ejercicio11 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {                    // Main function

        
        int num1, num2;
        int option;
        char ask = ' ';

        System.out.println("Enter two numbers: ");
        System.out.print("Number 1 > ");
        num1 = input.nextInt();
        System.out.print("Number 2 > ");
        num2 = input.nextInt();
        
        do{                                                     // Do while "Are you sure to left? != 'y' "
        
            option = printMenu();
        
            if(option != 5){
            
                makeOperation(option,num1,num2);
            
            }else {
            
                ask = question();
                
            }
        
        }while(ask != 'Y' && ask != 'y');
        
        
    };
    
    public static int printMenu(){                              // Print the menu
    
        int selection;
        
        System.out.print("\n ----------------------- \n "
                                + "\t   Menu "
                        + "\n 1. Addition "
                        + "\n 2. Substraction "
                        + "\n 3. Multiplicate "
                        + "\n 4. Divide "
                        + "\n 5. Left "
                        + "\n > ");
        selection = input.nextInt();
        System.out.print(" ----------------------- \n");
    
        return selection;
        
    };
    
    public static void makeOperation(int op, int n1, int n2){   // Make mathematics operations
    
        float result;
        
        System.out.println("\n");
        
        switch (op){
        
            case 1:
                result = n1 + n2;
                System.out.println("\t Addition \n");
                System.out.print("       " + n1 + " + " + n2 + " = " + result);
            break;
            
            case 2:
                result = n1 - n2;
                System.out.println("       Substraction\n");
                System.out.print("       " +n1 + " - " + n2 + " = " + result);
            break;
            
            case 3:
                result = n1 * n2;
                System.out.println("       Multiplicate\n");
                System.out.print("       " +n1 + " * " + n2 + " = " + result);
            break;
            
            case 4:
                result = n1 / n2;
                System.out.println("\t  Divide\n");
                System.out.print("       " + n1 + " / " + n2 + " = " + result);
            break;
            
            default: 
                System.out.println("   Incorrect operation. ");
            break;
            
        }
        
        System.out.println("\n");
        
    };
    
    public static char question(){                              // Make question to continue
    
        char answer;
        
        System.out.print("Are you sure? Y/n > ");
        answer = input.next().charAt(0);
        
        return answer;
    
    };
    
}
