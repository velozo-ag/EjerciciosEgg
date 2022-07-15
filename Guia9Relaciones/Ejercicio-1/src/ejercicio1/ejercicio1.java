/*
    Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
    clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
    atributos: nombre, apellido, edad, documento y Perro.
    Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
    pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
    la clase Persona, la información del Perro y de la Persona.
*/

package ejercicio1;
import java.util.ArrayList;

import Entidades.Perro;
import Entidades.Persona;
import Servicios.ServPersona;


public class ejercicio1 {

    public static void main(String[] args) {
        
        ServPersona sP = new ServPersona();

        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<Perro> perros = new ArrayList<>(); 

        personas.add(sP.crearPersona());
        personas.add(sP.crearPersona());

        perros.add(sP.crearPerro());
        perros.add(sP.crearPerro());

        personas.get(0).setMascota(perros.get(0));        
        personas.get(1).setMascota(perros.get(1));        

        System.out.println(personas.get(0).toString());
        System.out.println(personas.get(1).toString());

    }

}
