/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import interfaz.Descargable;

/**
 *
 * @author usuario
 */
public class JuegoDigital extends Juego implements Descargable {

    private int pesoEnMbs;

    public JuegoDigital() {
    }

    public JuegoDigital(int pesoEnMbs, String nombre, Integer precio, int nivel) {
        super(nombre, precio, nivel);
        this.pesoEnMbs = pesoEnMbs;
    }
    
    @Override
    public double vender() {
        return getPrecio();
    }

    @Override
    public void descargar(int velocidadDeDescarga) {
        System.out.println("Espere, el juego se descargara en: " + this.pesoEnMbs/velocidadDeDescarga + " minutos.");
    }
    
}
