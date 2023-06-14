/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriajpa.servicios;

import libreriajpa.entidades.Autor;
import libreriajpa.persistencia.AutorDAO;

/**
 *
 * @author usuario
 */


public class AutorServ {

    private AutorDAO aDAO;

    public AutorServ() {
        this.aDAO = new AutorDAO();
    }
    
    public Autor crearAutor(String id, Boolean alta, String nombre) throws Exception {
        
        Autor nuevoautor = new Autor();

        try {

            if (id == null) {
                throw new Exception("Debe ingresar un id valido y distinto de 0");

            }

            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe ingresar el nombre del Autor");

            }

            if (alta == false) {
                throw new Exception("El autor esta dado de baja");
            }

            nuevoautor.setNombre(nombre);

            aDAO.guardar(nuevoautor);
            return nuevoautor;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Autor buscarAutorPorNombre(String nombre) throws Exception{
        
        try{
            
            Autor autor = aDAO.buscarAutor(nombre);
            return autor;
            
        }catch(Exception e){
            return null;
        }
        
    }
    
}
