/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriajpa.persistencia;

import java.util.ArrayList;
import java.util.List;
import libreriajpa.entidades.Libro;
import libreriajpa.entidades.Autor;
import libreriajpa.entidades.Editorial;

/**
 *
 * @author usuario
 */
public class LibroDAO extends DAO<Libro>{

    @Override
    public void eliminar(Libro libro) {
        super.eliminar(libro); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Libro libro) {
        super.editar(libro); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardar(Libro libro) {
        super.guardar(libro); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desconectar() {
        super.desconectar(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void conectar() {
        super.conectar(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Libro buscarPorISBN(Long isbn){
        conectar();
        Libro libro;
        em.getTransaction().begin();
        libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.isbn LIKE :isbn").setParameter("isbn",isbn).getSingleResult();
        desconectar();
        return libro;
    
    }
    
    public Libro buscarPorTitulo(String titulo){
        conectar();
        Libro libro;
        em.getTransaction().begin();
        libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :titulo").setParameter("titulo",titulo).getSingleResult();
        desconectar();
        return libro;
    
    }
    
    public Libro buscarPorAutor(String nombre){
        conectar();
        em.getTransaction().begin();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l JOIN l.autor a WHERE a.nombre LIKE :nombre").setParameter("nombre",nombre).getSingleResult();
        desconectar();
        return libro;
    
    }
    
    public Libro buscarPorEditorial(String nombre){
        conectar();
        em.getTransaction().begin();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l JOIN l.editorial e WHERE e.nombre LIKE :nombre").setParameter("nombre",nombre).getSingleResult();
        desconectar();
        return libro;
    
    }
    
}
