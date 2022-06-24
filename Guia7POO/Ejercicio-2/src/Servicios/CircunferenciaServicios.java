/*
    Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
    tipo real. A continuación, se deben crear los siguientes métodos:
    a) Método constructor que inicialice el radio pasado como parámetro.
    b) Métodos get y set para el atributo radio de la clase Circunferencia.
    c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
    objeto.
    d) Método area(): para calcular el área de la circunferencia (Area = pi * radio^2).
    e) Método perimetro(): para calcular el perímetro (Perimetro = 2 * pi * radio).
*/

package Servicios;

import java.util.Scanner;
import Entidades.Circunferencia;

/**
 * @author Agus
 */

public class CircunferenciaServicios {
    
    Scanner input = new Scanner(System.in);
    
    Circunferencia cir = new Circunferencia();
    
    public Circunferencia crearCircunferencia(){
        
        System.out.print("Ingrese el radio de la circunferencia: \n > ");
        cir.setRadio(input.nextFloat());
        
        return cir;
        
    }
    
    public void area(Circunferencia cir){
        
        float radio = cir.getRadio();
        
        System.out.println("\n El area de la circunferencia es: > " + (3.14 * (radio * radio)));
        
    }

    public void perimetro(Circunferencia cir){
        
        float radio = cir.getRadio();
        
        System.out.println("\n El perimetro de la circunferencia es: > \n" + (2 * 3.14 * radio));
        
    }
    
}
