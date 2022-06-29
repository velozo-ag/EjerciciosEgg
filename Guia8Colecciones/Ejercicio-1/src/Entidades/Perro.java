/*
    Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
    programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
    después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
    salir, se mostrará todos los perros guardados en el ArrayList.
*/

package Entidades;

import java.util.Objects;

public class Perro {
    
    String nombre;

    // Constructor
    public Perro() {
    }

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    // Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Perro other = (Perro) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    public String toString(){
        
        String perrito = "Perro { " + nombre + " }";
        
        return perrito;

    }

}
