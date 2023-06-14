/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriajpa.persistencia;

import libreriajpa.entidades.Autor;

/**
 *
 * @author usuario
 */
public class AutorDAO extends DAO<Autor>{

    @Override
    public void eliminar(Autor autor) {
        super.eliminar(autor); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Autor autor) {
        super.editar(autor); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardar(Autor autor) {
        super.guardar(autor); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desconectar() {
        super.desconectar(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void conectar() {
        super.conectar(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Autor buscarAutor(String nombre){
    
        conectar();

        em.getTransaction().begin();
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
        return autor;

    }
    
}
