/*
    Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
    tipo real. A continuación, se deben crear los siguientes métodos:
    a) Método constructor que inicialice el radio pasado como parámetro.
    b) Métodos get y set para el atributo radio de la clase Circunferencia.
    c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
    objeto.
    d) Método area(): para calcular el área de la circunferencia (Area = pi * radio^2).
    e) Método perimetro(): para calcular el perímetro (Perimetro = 2 * pi * radio).
*/

package Entidades;

/**
 * @author Agus
 */

public class Circunferencia {
    
    private float radio;

    // Constructores
    public Circunferencia() {
    
    }

    public Circunferencia(float radio) {
        this.radio = radio;
    }
    
    // Getter & Setter

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
}
