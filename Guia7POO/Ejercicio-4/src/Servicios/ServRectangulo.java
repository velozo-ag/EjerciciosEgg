/*
    Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
    base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
    los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
    superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
    tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
    altura. Se deberán además definir los métodos getters, setters y constructores
    correspondientes.
    Superficie = base * altura / Perímetro = (base + altura) * 2.
 */

package Servicios;
import Entidades.Rectangulo;
import java.util.Scanner;
/**
 * @author Agus
 */

public class ServRectangulo {

    Scanner input = new Scanner(System.in);
    
    Rectangulo rec = new Rectangulo();
    
    public Rectangulo crearRectangulo(){
        
        System.out.print("Ingrese la base del rectangulo: \n> ");
        rec.setBase(input.nextFloat());
        
        System.out.print("Ingrese la altura del rectangulo: \n> ");
        rec.setAltura(input.nextFloat());
        
        return rec;
        
    }
    
    public void calcularSuperficie(Rectangulo rec){
        
        float base = rec.getBase();
        float altura = rec.getAltura();
        
        System.out.println("Superfice: " + base + " * " + altura + " = " + (base * altura));
        
    }
    
    public void calcularPerimetro(Rectangulo rec){
        
        float base = rec.getBase();
        float altura = rec.getAltura();
        
        System.out.println("Perimetro: " + base + "*2 + " + altura + "*2 = " + ((base*2) + (altura*2)));
                
        
    }
    
    public void mostrarRectangulo(Rectangulo rec){
       
        int i,j;
        
        System.out.println("");
        
        for(i = 0; i < rec.getAltura(); i++){
            
            for(j = 0; j < rec.getBase(); j++){
                
                if(i == 0 || i == rec.getAltura()-1){
                    
                    System.out.print("* ");
                    
                }else if(j == 0 || j == rec.getBase()-1){
                    
                    System.out.print("* ");
                    
                }else{
                    
                    System.out.print("  ");
                    
                }
                
            }
            
            System.out.println("");
            
        }
        
        System.out.println("");
        
    }
    
}
