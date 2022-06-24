/*
    Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
    y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
    que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
    través de los métodos set, se guardará la frase y la longitud de manera automática según
    la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
    a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
    ingresada.
    b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
    ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
    contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
    compone la clase con otra nueva frase ingresada por el usuario.
    f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
    una nueva frase ingresada por el usuario y mostrar la frase resultante.
    g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
    encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
    frase resultante.
    h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    ingresa el usuario y devuelve verdadero si la contiene y falso si no.
*/

package ejercicio.pkg8;
import java.util.Scanner;
import Entidades.Cadena;
import Servicios.ServCadena;

/**
 * @author Agus
 */

public class Ejercicio8 {

    static Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {

        ServCadena sCad = new ServCadena();
        
        Cadena cadena1 = sCad.crearCadena();
                
        int opcion;
        
        do{
            
            mostrarMenu();
            opcion = validarOpcion();
            
            if(opcion <= 8){

                realizarOperacion(sCad, cadena1, opcion);

            }
                

        }while (opcion < 8 && opcion > 0);
        
    }
    
    public static void mostrarMenu(){

        System.out.println("--------- Menu ---------");
        System.out.println(" 1-ContarVocales().");
        System.out.println(" 2-InvertirFrase().");
        System.out.println(" 3-VecesRepetidas(letra).");
        System.out.println(" 4-CompararLongitud(frase).");
        System.out.println(" 5-UnirFrases(nuevaFrase).");
        System.out.println(" 6-ReemplazarLetraA(caracter).");
        System.out.println(" 7-Contiene(letra).");
        System.out.print(" 8-Salir. \n > ");

    }

    public static int validarOpcion(){

        int op = input.nextInt();
        
        return op;
        
    }
    
    public static Cadena realizarOperacion(ServCadena sCad, Cadena cadena1, int op){
        
        String frase;
        char letra;
        boolean bool;
        
        System.out.println("\n------------------------ \n");

        switch(op){
            case 1:
                sCad.contarVocales(cadena1);
                System.out.println("");
                
            break;

            case 2:
                sCad.invertirFrase(cadena1);
                
            break;
            
            case 3:
                System.out.print("Ingrese la letra a buscar: \n > ");
                sCad.vecesRepetido(input.next(), cadena1);

            break;

            case 4:
                System.out.print("Ingrese la frase a comparar: \n > ");
                frase = input.next();
                sCad.compararLongitud(frase, cadena1);

                
            break;

            case 5:
                System.out.print("Ingrese la frase a concatenar: \n > ");
                frase = input.next();
                sCad.unirFrases(frase, cadena1);

            
            break;

            case 6:
                System.out.print("Ingrese el caracter que reemplazara a la letra A: \n > ");
                frase = input.next();
                sCad.reemplazar(frase, cadena1);

                
            break;
            case 7:
                System.out.print("Ingrese la letra a buscar: \n > ");
                letra = input.next().charAt(0);
                bool = sCad.contiene(letra, cadena1);
                
                System.out.println(bool);
                
                
            break;
            case 8:
                System.out.println("Cerrando programa...");
                
            break;
                
            default:
                System.out.println("Opcion incorrecta.\n");
                break;
        }
        
        System.out.println("\n------------------------ \n");
        
        return cadena1;
        
    } 
    
}
