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

package Entidades;

import java.util.ArrayList;

public class Alumno {
    
    String nombre;
    ArrayList<Double> notas = new ArrayList<>();
    
    // Constructor
    public Alumno() {
    }
    
    public Alumno(String nombre, ArrayList<Double> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    public String toString(){

        String alumno = "Alumno {" + nombre + ", Notas {" + notas.get(0) + ", " + notas.get(1) + ", " + notas.get(2) + "}}";

        return alumno;

    }

}
