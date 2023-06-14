/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriajpa.servicios;

import java.util.ArrayList;
import java.util.List;
import libreriajpa.entidades.Autor;
import libreriajpa.entidades.Editorial;
import libreriajpa.entidades.Libro;
import libreriajpa.persistencia.LibroDAO;

/**
 *
 * @author usuario
 */
public class LibroServ {
    
    LibroDAO lDAO;
    AutorServ aServ;
    EditorialServ eServ;
    
    public LibroServ(){
        this.lDAO = new LibroDAO();
        this.aServ = new AutorServ();
        this.eServ = new EditorialServ();
    }
    
    public Libro crearLibro(String id, Long isbn, String titulo, Integer anio, Integer ejemplares,
                Integer ejemplaresPrestados, Integer ejemplaresRestantes, Boolean alta, Autor autor, Editorial editorial) throws Exception{
        
        try{
            
            if(id == null){
                throw new Exception("ID invalido.");
            }
            if(isbn == null){
                throw new Exception("isbn invalido.");
            }
            if(titulo == null){
                throw new Exception("titulo invalido.");
            }
            if(anio == null){
                throw new Exception("anio invalido.");
            }
            if(autor == null){
                throw new Exception("autor invalido.");
            }
            if(editorial == null){
                throw new Exception("editorial invalido.");
            }
            
            Libro libro = new Libro(id,isbn,titulo,anio,ejemplares,ejemplaresPrestados,ejemplaresRestantes,alta,autor,editorial);
            lDAO.guardar(libro);
            return libro;
            
        }catch(Exception e){
            throw e;
        }
        
    }
    
    public Libro buscarISBN(Long isbn) throws Exception{
        
        try{
            
            Libro libro = lDAO.buscarPorISBN(isbn);
            return libro;
        
        }catch (Exception e){
            throw e;
        }
        
    }
    
    public Libro buscarTITULO(String titulo) throws Exception{
        
        try{
            
            Libro libro = lDAO.buscarPorTitulo(titulo);
            return libro;
        
        }catch (Exception e){
            throw e;
        }
        
    }
    
    public Libro buscarAutor(String nombre) throws Exception{
        
        try{
            
            Libro libro = (Libro) lDAO.buscarPorAutor(nombre);
            return libro;
        
        }catch (Exception e){
            throw e;
        }
        
    }
    
    public Libro buscarEditorial(String nombre) throws Exception{
        
        try{
            
            Libro libro = (Libro) lDAO.buscarPorEditorial(nombre);
            return libro;
        
        }catch (Exception e){
            throw e;
        }
        
    }
    
}
