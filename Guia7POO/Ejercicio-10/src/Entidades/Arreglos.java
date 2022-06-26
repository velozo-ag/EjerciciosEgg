/*
    Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
    de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
    programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
    Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
    ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
    0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
    20.
*/

package Entidades;

public class Arreglos {

    float[] arrayLargo = new float[50];
    float[] arrayCorto = new float[20];

    // Constructores
    public Arreglos() {
    }
    
    public Arreglos(float[] arrayLargo, float[] arrayCorto) {
        this.arrayLargo = arrayLargo;
        this.arrayCorto = arrayCorto;
    }
    
    // Getters and Setters
    public float[] getArrayLargo() {
        return arrayLargo;
    }

    public float[] getArrayCorto() {
        return arrayCorto;
    }

    public void setArrayLargo(float[] arrayLargo) {
        this.arrayLargo = arrayLargo;
    }

    public void setArrayCorto(float[] arrayCorto) {
        this.arrayCorto = arrayCorto;
    }

}
