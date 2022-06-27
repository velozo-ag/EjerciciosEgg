/*
    Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
    (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
    métodos:
    • Agregar un método de creación del objeto que respete la siguiente firma:
    crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
    usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
    fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
    • Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
    en cuenta que para conocer la edad de la persona también se debe conocer la fecha
    actual.
    • Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
    edad y retorna true en caso de que el receptor tenga menor edad que la persona que
    se recibe como parámetro, o false en caso contrario.
    • Metodo mostrarPersona(): este método muestra la persona creada en el método
    anterior.
*/

package Servicios;
import Entidades.Persona;
import java.util.Scanner;
import java.util.Date;

public class ServPersona {

    static Scanner input = new Scanner(System.in);
    
    Date fechaActual = new Date();

    public Persona crearPersona(){

        Persona p1 = new Persona();
        Date fecha;
        int dia,anio,mes;

        System.out.print("Ingrese su nombre: \n > ");
        p1.setNombre(input.next());

        System.out.print("Ingrese su fecha de nacimient: \n Anio: \n > ");
        anio = input.nextInt();

        System.out.print("Mes: \n > ");
        mes = input.nextInt();

        System.out.print("Dia: \n > ");
        dia = input.nextInt();

        fecha = new Date(anio - 1900, mes -1, dia);

        p1.setFechaDeNacimiento(fecha);

        return p1;

    }

}
