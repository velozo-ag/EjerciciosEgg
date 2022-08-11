/*
    Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
    geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
    dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
    dos métodos para calcular el área, el perímetro y el valor de PI como constante.

    Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
    calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
    resultado final.
    
    Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
    
    Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
*/

package Entidades;

import Interfaces.calculosFormas;

public class Rectangulo implements calculosFormas {

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    double base, altura;

    @Override
    public void calcularArea(double base, double altura) {
        System.out.println("El area del rectangulo dado es : " + base * altura);
    }

    @Override
    public void calcularPerimetro(double base, double altura) {
        System.out.println("El perimetro del rectangulo dado es : " + (base + altura) * 2);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
