/*
    Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
    ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
    atributo, puede hacerlo. Los métodos que se implementarán son:

    • Un constructor por defecto.

    • Un constructor con todos los atributos como parámetro.

    • Métodos getters y setters de cada atributo.

    • Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
    usuario y después se le asignan a sus respectivos atributos para llenar el objeto
    Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
    Si no es correcto se deberá mostrar un mensaje

    • Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
    kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
    que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
    fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
    está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
    fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
    función devuelve un 1.

    • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
    un booleano.

    A continuación, en la clase main hacer lo siguiente:
    Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
    los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
    sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
    mayor de edad.

    Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
    distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
    cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
    también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
*/

package ejercicio.pkg7;
import Entidades.Persona;
import Servicios.ServPersona;
import java.util.Scanner;

/**
 * @author Agus
 */

public class Ejercicio7 {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {

        ServPersona sPer = new ServPersona();
        
        int[] IMCPersonas = new int[4]; 
        boolean[] Mayor = new boolean[4]; 
        
        float pesoSegunAltura;
        
        // Persona 1 --------------------------
        
        Persona p1 = sPer.crearPersona(); 
        
        IMCPersonas[0] = sPer.calcularIMC(p1);
        Mayor[0] = sPer.esMayorDeEdad(p1);
        
        System.out.println("");
        
        // Persona 2 --------------------------
        
        Persona p2 = sPer.crearPersona(); 
        
        IMCPersonas[1] = sPer.calcularIMC(p2);
        Mayor[1] = sPer.esMayorDeEdad(p2);
        
        System.out.println("");

        // Persona 3 --------------------------
        
        Persona p3 = sPer.crearPersona(); 
        
        IMCPersonas[2] = sPer.calcularIMC(p3);
        Mayor[2] = sPer.esMayorDeEdad(p3);
   
        System.out.println("");

        // Persona 4 --------------------------
        
        Persona p4 = sPer.crearPersona(); 
        
        IMCPersonas[3] = sPer.calcularIMC(p4);
        Mayor[3] = sPer.esMayorDeEdad(p4);

        System.out.println("");

        // Porcentajes ------------------------
        
        porcentajeEdad(Mayor);
        porcentajePeso(IMCPersonas);
        
    }
    
    public static void porcentajePeso(int[] IMC){
        
        float mas = 0;
        float menor = 0;
        int i;
        
        float porcentajeMenos, porcentajeMas, porcentajeIdeal;
        
        for (i = 0; i < 4; i++){
            
            if(IMC[i] == -1){
                
                menor++;
                
            }else if(IMC[i] == 1){
                
                mas++;
                
            }
            
        }
        
        porcentajeMenos = (float)(menor * 100) / 4;
        porcentajeMas = (float)(mas * 100) / 4;
        porcentajeIdeal = 100 - porcentajeMas - porcentajeMenos;
        
        System.out.println("\nPeso ideal: > %" + porcentajeIdeal + 
                           "\nDesnutricion: > %" + porcentajeMenos + 
                           "\nSobrepeso: > %" + porcentajeMas);
        
    }
    
    public static void porcentajeEdad(boolean[] Mayor){
        
        int i;
        int may = 0;
        float porcentajeMayor;
        
        for(i = 0; i < 4; i++){
            
            if(Mayor[i]){
            
                may++;
            
            }
        }

        porcentajeMayor = (float)(may * 100) / 4;

        System.out.println("Personas Mayor de edad: > %" + porcentajeMayor + 
                           "\nPersonas Menor de edad: > %" + (100 - porcentajeMayor));
        
        
    }

}
