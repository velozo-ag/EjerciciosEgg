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

package Servicios;
import Entidades.Cafetera;
import java.util.Scanner;

/**
 * @author Agus
 */

public class ServCafetera {
    
    Scanner input = new Scanner(System.in);
    
    Cafetera cafe1 = new Cafetera();
    
    public Cafetera llenarCafetera(){
        
        System.out.println("La cafetera se ha rellenado > " + cafe1.getCapacidadMaxima() + "\n");
        cafe1.setCantidadActual(cafe1.getCapacidadMaxima());
        
        return cafe1;
        
    }
    
    public void servirTaza(int cantidad, Cafetera cafe1){
        
        int cantidadActual = cafe1.getCantidadActual();
        
        if(cantidad <= cantidadActual){
            
            System.out.println("Se ha rellenado la taza.");
            
            cantidadActual -= cantidad;
            cafe1.setCantidadActual(cantidadActual);
            
            System.out.println("Cantidad de cafe actual > " + cantidadActual + "\n");
            
        }else{
            
            System.out.println("No se ha podido rellenar la taza.");
                    
            cantidad -= cantidadActual;
            cafe1.setCantidadActual(0);
            
            System.out.println("A la taza le queda " + cantidad + " por llenar. \n");
            
        }
        
    }
    
    public void vaciarCafetera(Cafetera cafe1){
        
        System.out.println("Se ha vaciado la cafetera. \n");
        cafe1.setCantidadActual(0);
        
    }
    
    public void agregarCafe(int cantidad, Cafetera cafe1){
        
        int total = cafe1.getCantidadActual() + cantidad;
        
        if(total > cafe1.getCapacidadMaxima()){
            
            cafe1.setCantidadActual(cafe1.getCapacidadMaxima());
            System.out.println("Se ha llenado la cafetera.\n");
            
        }else{
            
            cafe1.setCantidadActual(total);
            System.out.println("Se ha agregado " + cantidad + " cafe. \n La cantidad actual de cafe es > " + cafe1.getCantidadActual() + "\n");
            
        }
        
    }
    
}
