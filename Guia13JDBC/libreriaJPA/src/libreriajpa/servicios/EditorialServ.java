/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriajpa.servicios;

import libreriajpa.entidades.Editorial;
import libreriajpa.persistencia.EditorialDAO;

/**
 *
 * @author usuario
 */
public class EditorialServ {
 
    EditorialDAO eDAO;
    
    public EditorialServ(){
        this.eDAO = new EditorialDAO();
    }    
    
    public Editorial crearEditorial(String id, String nombre, Boolean alta) throws Exception{
        
        try{
            if(id == null){
                throw new Exception("ID invalido");
            }
            if(nombre == null){
                throw new Exception("Nombre invalido");
            }

            Editorial editorial = new Editorial(id,nombre,true);
            eDAO.guardar(editorial);
            return editorial;
            
        }catch(Exception e){
            throw e;
        }
        
    }
    
    public Editorial buscarEditorial(String nombre) throws Exception{
        
        try{
            if(nombre == null){
                throw new Exception("Nombre invalido");
            }

            Editorial editorial = eDAO.buscarPorNombre(nombre);
            return editorial;
        }catch(Exception e){
            return null;
        }
        
    }
    
}
