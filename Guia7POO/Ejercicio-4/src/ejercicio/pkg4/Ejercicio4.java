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

package ejercicio.pkg4;
import Entidades.Rectangulo;
import Servicios.ServRectangulo;


/**
 * @author Agus
 */

public class Ejercicio4 {

    public static void main(String[] args) {

        ServRectangulo sr = new ServRectangulo();
        
        Rectangulo rec1 = sr.crearRectangulo();
        
        sr.calcularSuperficie(rec1);
        sr.calcularPerimetro(rec1);
        sr.mostrarRectangulo(rec1);
        
    }
    
}
