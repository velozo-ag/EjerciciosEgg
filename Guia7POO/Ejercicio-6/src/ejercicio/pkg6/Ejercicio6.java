/*
    Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
    (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
    actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
    • Constructor predeterminado o vacío
    • Constructor con la capacidad máxima y la cantidad actual
    • Métodos getters y setters.
    • Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    • Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
    tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
    cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
    método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
    cuanto quedó la taza.
    • Método vaciarCafetera(): pone la cantidad de café actual en cero.
    • Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
    recibe y se añade a la cafetera la cantidad de café indicada.
 */

package ejercicio.pkg6;
import Entidades.Cafetera;
import Servicios.ServCafetera;
import java.util.Scanner;

/**
 * @author Agus
 */

public class Ejercicio6 {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {

        ServCafetera sCafetera = new ServCafetera();
        
        System.out.println("Creando cafetera...");
        
        Cafetera cafetera1 = sCafetera.llenarCafetera();
        
        int opcion = 0;
        
        
        do{
            
            mostrarMenu();
            opcion = validarOpcion();
            
            if(opcion <= 6){

                realizarOperacion(sCafetera, cafetera1, opcion);

            }
                

        }while (opcion < 6 && opcion > 0);
        
}

    public static void mostrarMenu(){

        System.out.println("--------- Menu ---------");
        System.out.println(" 1-Llenar Cafetera.");
        System.out.println(" 2-Servir taza.");
        System.out.println(" 3-Vaciar cafetera.");
        System.out.println(" 4-Agregar cafe.");
        System.out.println(" 5-Ver cafetera.");
        System.out.print(" 6-Salir. \n > ");

    }

    public static int validarOpcion(){

        int op = input.nextInt();
        
        return op;
        
    }
    
    public static Cafetera realizarOperacion(ServCafetera sCafetera, Cafetera cafetera1, int op){
        
        System.out.println("\n------------------------ \n");

        switch(op){
            case 1:
                
                cafetera1 = sCafetera.llenarCafetera();
                
            break;

            case 2:
                
                System.out.print("Ingrese el tamanio de la taza: \n > ");
                sCafetera.servirTaza(input.nextInt(), cafetera1);
                
            break;

            case 3:
                
                sCafetera.vaciarCafetera(cafetera1);
                
            break;

            case 4:
                
                System.out.print("Ingrese la cantidad de cafe a agregar: \n > ");
                sCafetera.agregarCafe(input.nextInt(), cafetera1);
                
            break;

            case 5:

                System.out.println("Capacidad Maxima: > " + cafetera1.getCapacidadMaxima());
                System.out.println("Cantidad Actual > " + cafetera1.getCantidadActual() + "\n");
                
                break;

            case 6:
                
                System.out.println("Cerrando...\n");
                
                break;
                
            default:
                System.out.println("Opcion incorrecta.\n");
                break;
        }
        
        System.out.println("------------------------ \n");
        
        return cafetera1;
        
    } 
    
}