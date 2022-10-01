/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author usuario
 */
public abstract class Juego implements Comparable<Juego>{
    
    private String nombre;
    private Integer precio;
    private int nivel;

    public Juego() {
    }

    public Juego(String nombre, Integer precio, int nivel) {
        this.nombre = nombre;
        this.precio = precio;
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public void jugarNivel(){
        nivel++;
    }
    
    public abstract double vender();
    
    public int compareTo(Juego t){
        return(this.precio-t.precio);
    }
    
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
