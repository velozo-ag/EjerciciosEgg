/*
    Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
    clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
    atributos: nombre, apellido, edad, documento y Perro.
    Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
    pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
    la clase Persona, la información del Perro y de la Persona.
*/

package Entidades;
import Entidades.Perro;

public class Persona {
    
    String nombre;
    String apellido;
    Integer edad;
    Integer documento;

    Perro mascota = new Perro();

    // Constructor
    public Persona() {
    }
    
    public Persona(String nombre, String apellido, Integer edad, Integer documento, Perro mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.mascota = mascota;
    }

    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public Perro getPerro() {
        return mascota;
    }

    public void setMascota(Perro mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Persona [apellido=" + apellido + ", documento=" + documento + ", edad=" + edad + ", nombre=" + nombre
                + ", mascota=" + mascota + "]";
    }

}
