/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriajpa.persistencia;

import libreriajpa.entidades.Editorial;

/**
 *
 * @author usuario
 */
public class EditorialDAO extends DAO<Editorial>{

    @Override
    public void eliminar(Editorial editorial) {
        super.eliminar(editorial); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Editorial editorial) {
        super.editar(editorial); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardar(Editorial editorial) {
        super.guardar(editorial); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desconectar() {
        super.desconectar(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void conectar() {
        super.conectar(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Editorial buscarPorNombre(String nombre){
        
        conectar();
        em.getTransaction().begin();
        Editorial editorial = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
        return editorial;
    }
     
}
