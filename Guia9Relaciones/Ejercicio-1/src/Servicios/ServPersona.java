/*
    Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
    clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
    atributos: nombre, apellido, edad, documento y Perro.
    Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
    pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
    la clase Persona, la información del Perro y de la Persona.
*/

package Servicios;
import Entidades.Perro;
import Entidades.Persona;
import java.util.Scanner;

public class ServPersona {
    
    Scanner input = new Scanner(System.in);

    public Persona crearPersona(){

        Persona p = new Persona();

        System.out.print("Ingrese el nombre de la persona: \n > ");
        p.setNombre(input.next());

        System.out.print("Ingrese el apellido de la persona: \n > ");
        p.setApellido(input.next());
        
        System.out.print("Ingrese el DNI de la persona: \n > ");
        p.setDocumento(input.nextInt());

        System.out.print("Ingrese la edad de la persona: \n > ");
        p.setEdad(input.nextInt());

        return p;

    }

    public Perro crearPerro(){

        Perro perro = new Perro();

        System.out.print("Ingrese el nombre del perro: \n > ");
        perro.setNombre(input.next());

        System.out.print("Ingrese la raza del perro: \n > ");
        perro.setRaza(input.next());
        
        System.out.print("Ingrese la edad del perro: \n > ");
        perro.setEdad(input.nextInt());

        System.out.print("Ingrese el tamanio del perro: \n > ");
        perro.setTamanio(input.nextDouble());

        return perro;

    }

    public void settearPerroADuenio(Perro perro, Persona persona){

        persona.setMascota(perro);

    }

}
