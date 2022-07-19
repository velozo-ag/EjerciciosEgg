/*
    Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
    y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
    contener un método toString() que retorne el número de carta y el palo. La baraja estará
    compuesta por un conjunto de cartas, 40 exactamente.
    Las operaciones que podrá realizar la baraja son:

    • barajar(): cambia de posición todas las cartas aleatoriamente.

    • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
    se haya llegado al final, se indica al usuario que no hay más cartas.

    • cartasDisponibles(): indica el número de cartas que aún se puede repartir.

    • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
    cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
    debemos indicárselo al usuario.

    • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
    indicárselo al usuario

    • mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
    luego se llama al método, este no mostrara esa primera carta.
*/

package Servicios;

import java.util.Random;

import Entidades.Baraja;
import Entidades.Carta;

public class ServBaraja {

    String palos[] = {"Espada","Basto","Oro","Copa"};
    Integer cantMax = 40;
    ServCarta sC = new ServCarta();

    public Baraja crearBaraja(){

        Baraja baraja = new Baraja();
        baraja.setSiguienteCarta(0);
        int pos = 0;

        for(int i = 0; i < 4; i++){

            for(int j = 1; j <= 10; j++){

                if(j > 7){

                    baraja.getCartas()[pos] = new Carta(j + 2, palos[i]);
                    
                }else{
                    
                    baraja.getCartas()[pos] = new Carta(j, palos[i]);
                    
                }

                pos++;
                
            }

        }

        System.out.println("\nBaraja creada...\n");

        return baraja;

    }

    public void barajar(Baraja baraja){

        Carta c;
        int posRandom;

        System.out.println("\n");
        
        for(int j = 0; j < 3; j++){

            for(int i = 0; i < cantMax; i++){

                posRandom = new Random().nextInt(cantMax);

                c = baraja.getCartas()[i];
                baraja.getCartas()[i] = baraja.getCartas()[posRandom];
                baraja.getCartas()[posRandom] = c;

                // System.out.print(posRandom + ", ");

            }

        }

        System.out.println("\nSe ha mezclado la baraja...\n");

    }

    public Carta siguienteCarta(Baraja baraja){

        int posActual = baraja.getSiguienteCarta();
        
        if(posActual < cantMax){

            Carta carta = baraja.getCartas()[posActual];

            baraja.setSiguienteCarta(posActual + 1);
    
            System.out.println("Se ha sacado la carta " + carta.toString());
            
            return carta;
        
        }else{

            System.out.println("Ya no quedan cartas en la baraja.");
            
            return null;
            
        }


    }

    public void cartasDisponibles(Baraja baraja){

        System.out.println("Quedan " + (cantMax - baraja.getSiguienteCarta()) + " cartas en la baraja.");

    }

    public void darCartas(Baraja baraja, int cantidad){

        int quedan = cantMax - baraja.getSiguienteCarta();

        if(cantidad > quedan){

            System.out.println("No quedan suficientes cartas.");

        }else{

            for(int i = 0; i < cantidad; i++){
                
                siguienteCarta(baraja);

            }

        }

    }

    public void cartasMonton(Baraja baraja){

        int cantCartasTiradas = baraja.getSiguienteCarta();

        if(cantCartasTiradas == 0){

            System.out.println("Aun no se a tirado ninguna carta.");

        }else{

            System.out.println("Las cartas que han salido son:");

            for(int i = 0; i < cantCartasTiradas; i++){

                System.out.print(baraja.getCartas()[i] + " | ");

            }

        }

        System.out.println("");

    }

    public void mostrarBaraja(Baraja baraja){

        int cantCartasTiradas = baraja.getSiguienteCarta();

        for(int i = cantCartasTiradas; i < cantMax; i++){

            if(i == 10 || i == 20 || i == 30){
                
                System.out.println();
                System.out.print(baraja.getCartas()[i]);

            }else{

                System.out.print(baraja.getCartas()[i]);
            
            }

            System.out.print(" | ");

        }

        System.out.println("");

    }

}
