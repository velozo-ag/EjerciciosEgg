/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;
import tienda.entidades.Fabricante;
import tienda.persistencia.fabricanteDAO;
/**
 *
 * @author usuario
 */
public class servFabricante {
 
    fabricanteDAO dao;
    public void servFabricante(){
        this.dao = new fabricanteDAO();
    }
    
    public void crearFabricante(Integer codigo, String nombre) throws Exception{
        try{
            
            if(codigo == null){
                throw new Exception("Debe indicar el codigo.");
            }
//            if(dao.buscarPorCodigo(codigo) != null){
//                throw new Exception("Debe indicar un codigo valido.");
//            }
            
            Fabricante fabricante = new Fabricante(codigo,nombre);
            dao.guardarFabricante(fabricante);
            
        }catch(Exception e){
            throw e;
        }
        
    }

    
}
