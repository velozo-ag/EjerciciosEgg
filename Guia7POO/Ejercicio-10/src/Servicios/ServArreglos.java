/*
    Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
    de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
    programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
    Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
    ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
    0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
    20.
*/

package Servicios;
import Entidades.Arreglos;
import java.util.Arrays;
import java.util.Scanner;

public class ServArreglos {
    
    Scanner input = new Scanner(System.in);

    public Arreglos altaArrays(){

        Arreglos arreglo = new Arreglos();
        int i;
        float[] arLargo = new float[50];
        float[] arCorto = new float[20];

        for(i = 0; i < 50; i++){

            arLargo[i] = (int)((float)(Math.random() * 100));
        
        }
        
        for(i = 0; i < 20; i++){
            
            arCorto[i] = (int)((float)(Math.random() * 100));
            
        }
        
        arreglo.setArrayLargo(arLargo);
        arreglo.setArrayCorto(arCorto);

        return arreglo;

    }

    public void mostrarArrays(Arreglos arreglo){

        System.out.println("Array largo generado: " + Arrays.toString(arreglo.getArrayLargo()) + "\n");
        System.out.println("Array corto generado: " + Arrays.toString(arreglo.getArrayCorto()) + "\n");

    }

    public void ordenarLargo(Arreglos arreglo){

        float[] arLargo = new float[50];
        
        arLargo = arreglo.getArrayLargo();

        Arrays.sort(arLargo);

        arreglo.setArrayLargo(arLargo);

        System.out.println("Array largo ordenado: " + Arrays.toString(arreglo.getArrayLargo()) + "\n");

    }

    public void rellenar(Arreglos arreglo){

        float[] arCorto = new float[20];
        int i;

        for(i = 0; i < 20; i++){

            if(i < 10){

                arCorto[i] = arreglo.getArrayLargo()[i];

            }else {

                arCorto[i] = (float)0.5;

            }

        }

        arreglo.setArrayCorto(arCorto);

        System.out.println("Array corto rellenado: "+ Arrays.toString(arreglo.getArrayCorto()));

    }

}