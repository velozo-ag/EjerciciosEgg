/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.LibroDAO;

/**
 *
 * @author tonga
 */
public class LibroServicio {
    
    
    private AutorServicio autorservicio;
    private EditorialServicio editorialservicio;
    private final LibroDAO DAO;
    
    public LibroServicio(){
        this.DAO = new LibroDAO();
    }
    
    public void setServicios (AutorServicio autorservicio,EditorialServicio editorialservicio){
        this.autorservicio = autorservicio;
        this.editorialservicio = editorialservicio;
    }
    
    public void crearLibro (Long isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Autor autor, Editorial editorial)throws Exception{
        
        try{
            Libro libro = new Libro();
            if (isbn == null || titulo == null || anio == null || ejemplares == null || ejemplaresPrestados == null || ejemplaresRestantes == null){
                throw new Exception ("Debe completar todos los campos");
            }
            if (DAO.buscarPorISBN(isbn)!= null){
                throw new Exception ("Ya existe un libro con ese codigo ISBN");
            }
            if (DAO.buscarPorTitulo(titulo)!= null){
                throw new Exception ("Ya existe un titulo con ese nombre");
            } 
            
            libro.setIsbn(isbn);
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            libro.setEjemplaresRestantes(ejemplaresRestantes);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            libro.setAlta(true);
            
            DAO.guardar(libro);
            System.out.println(libro.toString());
        }catch (Exception e){
            System.out.println(e.getMessage());
                    
        }
    }
        
    public Libro buscarPorISBN (Long isbn) {
           
        try {
            return DAO.buscarPorISBN(isbn);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    public Libro buscarPorTitulo (String titulo) {
           
        try {
            return DAO.buscarPorTitulo(titulo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    public void buscarPorAutor (String nomautor) {
           
        try {
            List<Libro> libros = DAO.buscarPorNombreAutor(nomautor);
            for (Libro l : libros) {
            System.out.println(l.toString());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            
        }
    }
    public List<Libro> buscarPorEditorial (String nomeditorial) {
           
        try {
            return DAO.buscarPorNombreEditorial(nomeditorial);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    public void eliminarPorISBN (Long isbn){
        try{
            DAO.eliminar(isbn);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
