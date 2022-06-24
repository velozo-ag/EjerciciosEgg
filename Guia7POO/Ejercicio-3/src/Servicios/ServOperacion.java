/*
    Crear una clase llamada Operacion que tenga como atributos privados numero1 y
    numero2. A continuación, se deben crear los siguientes métodos:
    a) Método constructor con todos los atributos pasados por parámetro.
    b) Metodo constructor sin los atributos pasados por parámetro.
    c) Métodos get y set.
    d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
    los atributos del objeto.
    e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
    f) Método restar(): calcular la resta de los números y devolver el resultado al main
    g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
    fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
    no, se hace la multiplicación y se devuelve el resultado al main
    h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
    una división por cero, el método devuelve 0 y se le informa al usuario el error se le
    informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */

package Servicios;
import java.util.Scanner;
import Entidades.Operacion;

/**
 * @author Agus
 */

public class ServOperacion {
    
    Scanner input = new Scanner(System.in);

    Operacion op = new Operacion();
    
    public Operacion crearOperacion(){
        
        System.out.print("Ingrese el primer numero para la operacion \n > ");
        op.setNumero1(input.nextInt());
        
        System.out.print("Ingrese el segundo numero para la operacion \n > ");
        op.setNumero2(input.nextInt());
     
        return op;
        
    }
    
    public void sumar(Operacion op){
        
        int num1 = op.getNumero1();
        int num2 = op.getNumero2();
        
        System.out.println("\nSuma : " + num1 + " + " + num2 + "\n > " + (num1 + num2));
        
    }
    
    public void restar(Operacion op){
        
        int num1 = op.getNumero1();
        int num2 = op.getNumero2();
        
        System.out.println("\nResta : " + num1 + " - " + num2 + "\n > " + (num1 - num2));
        
    }
    
    public void multiplicar(Operacion op){
        
        int num1 = op.getNumero1();
        int num2 = op.getNumero2();
        
        if(num1 != 0 && num2 != 0){
            
            System.out.println("\nMultiplicacion : " + num1 + " * " + num2 + "\n > " + (num1 * num2));
            
        }else{
            
            System.out.println("\nError: Todo numero multiplicado por 0, es 0.\n > 0");
            
        }
        
        
    }
    
    public void division(Operacion op){
        
        int num1 = op.getNumero1();
        int num2 = op.getNumero2();
        
        if(num1 != 0 && num2 != 0){
            
            System.out.println("\nDivision : " + num1 + " / " + num2 + "\n > " + ((float)num1 / (float)num2));
            
        }else{
            
            System.out.println("\nError: Todo numero dividido por 0, es 0.\n > 0");
            
        }
        
    }
    
}
