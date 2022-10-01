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
public class Demo extends Juego implements Descargable{

    private int pesoEnMbs;

    public Demo() {
    }

    public Demo(int pesoEnMbs, String nombre, Integer precio, int nivel) {
        super(nombre, precio, nivel);
        this.pesoEnMbs = pesoEnMbs;
    }
    
    @Override
    public double vender() {
        return 0;
    }

    @Override
    public void descargar(int velocidadDeDescarga) {
        
        System.out.println("Espere, la demo se descargará en: " + this.pesoEnMbs/velocidadDeDescarga + " minutos.");
        
    }

    @Override
    public void jugarNivel() {
        
        if(getNivel() > 2){
            System.out.println("Para continuar, adquiera el juego completo.");
        }else{        
            super.jugarNivel();
        }
        
    }
    
    
    
}
