/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

/**
 *
 * @author tonga
 */
public class AutorServicio {
    
   
    private final AutorDAO DAO;
    
    
    public AutorServicio(){
        this.DAO = new AutorDAO();
    }
    
     public void crearAutor (String nombre)throws Exception{
        
        try{
            Autor autor = new Autor();
            if ( nombre == null){
                throw new Exception ("Debe ingresar un nombre");
            }
///           if (DAO.buscarPorNombreA(nombre)!= null){
//                throw new Exception ("Ya existe una editorial con ese nombre");
//            }
           
           autor.setNombre(nombre);
           autor.setAlta(true);
            
            DAO.guardar(autor);
            
        }catch (Exception e){
            System.out.println(e.getMessage());
                    
        }
     }
     public Autor buscarPorNombre (String nombre){
         try{
             return DAO.buscarPorNombreA(nombre);
         }catch(Exception e){
             System.out.println(e.getMessage());
            return null;
         }
     }
     public void guardarAutor (Autor autor){
         DAO.guardar(autor);
     }
}
