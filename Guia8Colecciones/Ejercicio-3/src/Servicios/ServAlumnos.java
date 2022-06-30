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

package Servicios;
import Entidades.Alumno;
import java.util.Scanner;
import java.util.ArrayList;
// import java.util.Collections;

public class ServAlumnos {
    
    Scanner input = new Scanner(System.in);
    ArrayList<Alumno> alumnos = new ArrayList<>();

    public Alumno crearAlumno(){

        Alumno alum = new Alumno();

        System.out.print("Ingrese el nombre del alumno: \n > ");
        alum.setNombre(input.next());

        System.out.println("Ingrese las 3 notas del alumno:");
        ingresarNotas(alum);

        return alum;

    }

    public void ingresarNotas(Alumno alum){

        int i;
        ArrayList<Double> notas = new ArrayList<>();

        for(i = 0; i < 3; i++){

            System.out.print(" > ");
            notas.add(input.nextDouble());

        }

        alum.setNotas(notas);

    }

    public void crearTodosLosAlumnos(){

        String seguir = "s";

        while (!seguir.equals("n")){

            alumnos.add(crearAlumno());
            System.out.println("");
            seguir = preguntarPorSeguir();
            System.out.println("");

        }

    }    

    public double notaFinal(String alum){

        double acum = 0;
        ArrayList<Double> notas = new ArrayList<>();
        int i;

        for (Alumno alumno : alumnos) {     // Por cada alumno de alumnos...
            
            if(alumno.getNombre().equals(alum)){        // Si el nombre del alumno es igual al nombre ingresado...

                notas = alumno.getNotas();

                for(i = 0; i < 3; i++){     // Acumular notas...
                
                    acum += notas.get(i);
                
                }
                
            }

        }

        return (acum / 3);      // retorna el promedio / nota final

    }

    public void verAlumnos(){

        for (Alumno alumno : alumnos) {
            System.out.println(alumno.toString() + " Nota Final: " + (int)notaFinal(alumno.getNombre()));

        }

    }

    public String preguntarPorSeguir(){

        String seguir;

        System.out.print("Desea seguir ingresando alumnos? s/n \n > ");
        seguir = input.next();

        return seguir;

    }

}
