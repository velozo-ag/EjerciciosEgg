/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Libro;

/**
 *
 * @author tonga
 */
public class LibroDAO extends DAO<Libro> {
    
     @Override
    public void guardar(Libro libro) {
        super.guardar(libro);
    }

    public void eliminar(Long isbn) {
        Libro libro = buscarPorISBN(isbn);
        super.eliminar(libro);
    }
    
    public Libro buscarPorISBN(Long isbn){
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.isbn LIKE :isbn",Libro.class)
                .setParameter("isbn", isbn) .getSingleResult();
        desconectar();
        System.out.println(libro.toString());
        return libro;
    }
    public Libro buscarPorTitulo(String titulo){
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :titulo",Libro.class)
                .setParameter("titulo", titulo) .getSingleResult();
        desconectar();
        System.out.println(libro.toString());
        return libro;
    }
    public List<Libro> buscarPorNombreAutor(String nomautor){
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l JOIN Autor a WHERE l.autor LIKE :nomautor",Libro.class)
                .setParameter("nomautor", nomautor).getResultList();
        desconectar();
        
        
        return libros;
    }
    public List<Libro> buscarPorNombreEditorial(String nomeditorial){
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l JOIN Editorial e WHERE l.editorial LIKE :nomeditorial",Libro.class)
                .setParameter("nomeditorial", nomeditorial).getResultList();
        desconectar();
        for (Libro l : libros) {
            System.out.println(l.toString());
        }
        return libros;
    }
    
}
