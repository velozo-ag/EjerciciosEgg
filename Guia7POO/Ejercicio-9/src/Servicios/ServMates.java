/*
    Realizar una clase llamada Matemática que tenga como atributos dos números reales con
    los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
    constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
    Math.random para generar los dos números y se guardaran en el objeto con su
    respectivos set. Deberá además implementar los siguientes métodos:
    a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
    al menor número. Previamente se deben redondear ambos valores.
    c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
    Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */

package Servicios;
import Entidades.Matematica;
import java.util.Scanner;

/**
 * @author Agus
 */

public class ServMates {
    
    Scanner input = new Scanner(System.in);
    
    public Matematica altaMates(){
        
        Matematica mate1 = new Matematica();
        
        System.out.print("Ingrese el primer numero entero: \n > ");
        mate1.setNum1(input.nextInt());
        
        System.out.print("Ingrese el segundo numero entero: \n > ");
        mate1.setNum2(input.nextInt());
        
        return mate1;
        
    }
    
    public void devolverMayor(Matematica mate1){
        
        int num1 = mate1.getNum1();
        int num2 = mate1.getNum2();
        
        if(num1 > num2){
            
            System.out.println(num1);

        }else{

            System.out.println(num2);
            
        }
        
    }

    public void calcularPotencia(Matematica mate1){

        int num1 = mate1.getNum1();
        int num2 = mate1.getNum2();
        int potencia;

        if(num1 > num2){
            
            potencia = (int)Math.pow(num1, num2);

            System.out.println(num1 + " elevado a " + num2 + " es igual a: " + potencia);

        }else{

            potencia = (int)Math.pow(num2, num1);

            System.out.println(num2 + " elevado a " + num1 + " es igual a: " + potencia);
            
        }
        
    }

    public void calcularRaiz(Matematica mate1){

        int num1 = mate1.getNum1();
        int num2 = mate1.getNum2();
        int absoluto;

        if(num1 < num2){

            absoluto = Math.abs(num1);

            System.out.println("La raiz cuadrada de " + num1 + " es: " + Math.sqrt(absoluto));
            
        } else {
            
            absoluto = Math.abs(num2);

            System.out.println("La raiz cuadrada de " + num2 + " es: " + Math.sqrt(absoluto));
            
        }

    }

   
}
