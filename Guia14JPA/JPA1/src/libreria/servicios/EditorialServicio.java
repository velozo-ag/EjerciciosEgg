/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import libreria.entidades.Editorial;

import libreria.persistencia.EditorialDAO;


public class EditorialServicio {
    
    
    private final EditorialDAO DAO;
    
    
    public EditorialServicio(){
        this.DAO = new EditorialDAO();
    }
    
   
    
     public void crearEditorial (String nombre)throws Exception{
        
        try{
            Editorial editorial = new Editorial();
            if ( nombre == null){
                throw new Exception ("Debe ingresar un nombre");
            }
//            if (DAO.buscarPorNombreE(nombre)!= null){
//                throw new Exception ("Ya existe una editorial con ese nombre");
//            }
           
           editorial.setNombre(nombre);
           editorial.setAlta(true);
            
            DAO.guardar(editorial);
            
        }catch (Exception e){
            System.out.println(e.getMessage());
                    
        }
     }
     public Editorial buscarPorNombre (String nombre){
         try{
             return DAO.buscarPorNombreE(nombre);
         }catch(Exception e){
             System.out.println(e.getMessage());
            return null;
         }
     }
     public void guardarEditorial (Editorial editorial){
         DAO.guardar(editorial);
     }
}
