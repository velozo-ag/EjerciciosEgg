/*
    Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
    alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
    con sus 3 notas.
    En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
    toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
    pregunta al usuario si quiere crear otro Alumno o no.
    Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
    Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
    final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
    del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
    promedio final, devuelto por el método y mostrado en el main.
*/

package ejercicio3;
import Servicios.ServAlumnos;
import java.util.Scanner;

public class ejercicio3 {
    
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        ServAlumnos sAlum = new ServAlumnos();
        String verNota;
        
        System.out.println("");

        sAlum.crearTodosLosAlumnos();

        System.out.print("Desea ver la nota final de algun alumno? s/n \n > ");
        
        while(!input.next().equals("n")){
        
            System.out.print("\nIngrese el nombre del alumno que quiere ver la nota: \n > ");
            verNota = input.next();

            System.out.println("La nota final de " + verNota + " es " + sAlum.notaFinal(verNota));
            
            System.out.print("\nDesea ver la nota final de algun alumno? s/n \n > ");
        
        }

        sAlum.verAlumnos();

    }

}
