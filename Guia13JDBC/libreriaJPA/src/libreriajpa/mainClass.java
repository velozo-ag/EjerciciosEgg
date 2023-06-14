/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriajpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreriajpa.entidades.Autor;
import libreriajpa.entidades.Editorial;
import libreriajpa.entidades.Libro;
import libreriajpa.servicios.AutorServ;
import libreriajpa.servicios.EditorialServ;
import libreriajpa.servicios.LibroServ;

/**
 *
 * @author usuario
 */
public class mainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAPU");
        EntityManager em = emf.createEntityManager();
        
        AutorServ aS = new AutorServ();
        LibroServ lS = new LibroServ();
        EditorialServ eS = new EditorialServ();
        
        Autor autor1 = aS.crearAutor("1", Boolean.TRUE, "NuevoAutor1");
        Autor autor2 = aS.crearAutor("2", Boolean.TRUE, "NuevoAutor2");
        Autor autor3 = aS.crearAutor("3", Boolean.TRUE, "NuevoAutor3");
        Autor autor4 = aS.crearAutor("4", Boolean.TRUE, "NuevoAutor4");
        Autor autor5 = aS.crearAutor("5", Boolean.TRUE, "NuevoAutor5");

        Editorial editorial1 = eS.crearEditorial("1", "Editorial1",Boolean.TRUE);
        Editorial editorial2 = eS.crearEditorial("2", "Editorial2",Boolean.TRUE);
        Editorial editorial3 = eS.crearEditorial("3", "Editorial3",Boolean.TRUE);
        Editorial editorial4 = eS.crearEditorial("4", "Editorial4",Boolean.TRUE);
        Editorial editorial5 = eS.crearEditorial("5", "Editorial5",Boolean.TRUE);
        
        Libro libro1 = lS.crearLibro("1", 12345678L, "Libro1", 2000, 2, 1, 1, Boolean.TRUE, autor1, editorial1);
        Libro libro2 = lS.crearLibro("2", 12256678L, "Libro2", 2001, 2, 1, 1, Boolean.TRUE, autor5, editorial5);
        Libro libro3 = lS.crearLibro("3", 12347658L, "Libro3", 2002, 2, 1, 1, Boolean.TRUE, autor4, editorial2);
        Libro libro4 = lS.crearLibro("4", 13357678L, "Libro4", 2003, 2, 1, 1, Boolean.TRUE, autor2, editorial4);
        Libro libro5 = lS.crearLibro("5", 12342638L, "Libro5", 2004, 2, 1, 1, Boolean.TRUE, autor3, editorial3);
        
        System.out.println("Por id " + lS.buscarISBN(12345678L));
        System.out.println("Por titulo " + lS.buscarTITULO("Libro1"));
        System.out.println("Por autor " + lS.buscarAutor("NuevoAutor3"));
        System.out.println("Por editorial " + lS.buscarEditorial("Editorial1"));
        
        System.out.println("-----------------------------------------------------------");
        
        System.out.println("Por id " + lS.buscarISBN(12256678L));
        System.out.println("Por titulo " + lS.buscarTITULO("Libro4"));
        System.out.println("Por autor " + lS.buscarAutor("NuevoAutor2"));
        System.out.println("Por editorial " + lS.buscarEditorial("Editorial5"));
        
        System.out.println("-----------------------------------------------------------");
        
        System.out.println("Por id " + lS.buscarISBN(13357678L));
        System.out.println("Por titulo " + lS.buscarTITULO("Libro5"));
        System.out.println("Por autor " + lS.buscarAutor("NuevoAutor3"));
        System.out.println("Por editorial " + lS.buscarEditorial("Editorial3"));
        
    }
    
}
