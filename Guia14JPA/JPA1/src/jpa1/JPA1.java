/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa1;

import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.persistencia.DAO;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;

/**
 *
 * @author tonga
 */
public class JPA1 {

   
    public static void main(String[] args) throws Exception {
       
        LibroServicio lsv = new LibroServicio();
        EditorialServicio esv =  new EditorialServicio();
        AutorServicio asv =  new AutorServicio();
        
//        Autor a1 = new Autor ("Roman", true);
//        Editorial e1 = new Editorial ("el barquito",true);
//        
//       asv.guardarAutor(a1);
//       esv.guardarEditorial(e1);
        
        
        int opc;
        do{
            System.out.println("Ingrese una opcion:\n"
                    + "1- Crear un Autor \n"
                    + "2-Crear una Editorial \n"
                    + "3-Crear un Libro \n"
                    + "4-Buscar un libro por ISBN \n"
                    + "5-Buscar un libro por Titulo \n"
                    + "6-Buscar libros por nombre de Autor \n"
                    + "7-Buscar libros por nombre de Editorial \n"
                    + "8-Buscar autor por nombre \n"
                    + "9-Salir");
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            opc = leer.nextInt();
            
            try{
            switch(opc){
                case 1:
                    System.out.println("Ingrese el nombre del autor ");
                    asv.crearAutor(leer.next());
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la editorial");
                    esv.crearEditorial(leer.next());
                    break;
                case 3:
                    System.out.println("Ingrese: ISBN ,Titulo, Año, ejemplares, ejemplares presatados, ejemplares restantes, autor, editorial");
                    lsv.crearLibro(leer.nextLong(), leer.next(), leer.nextInt(), leer.nextInt(),leer.nextInt() , leer.nextInt(),asv.buscarPorNombre(leer.next()),esv.buscarPorNombre(leer.next()));
                    break;
                case 4:
                    System.out.println("Ingrese el ISBN");
                    lsv.buscarPorISBN(leer.nextLong());
                    break;
                case 5:
                    System.out.println("Ingrese el Titulo");
                    lsv.buscarPorTitulo(leer.next());
                    break;
                case 6:
                    System.out.println("Ingrese el autor");
                    lsv.buscarPorAutor(leer.next());
                    break;
                case 7:
                    System.out.println("Ingrese la editorial");
                    lsv.buscarPorEditorial(leer.next());
                    break;
                case 8:
                    System.out.println("Ingrese el nombre del autor");
                    asv.buscarPorNombre(leer.next());
                    break;
                case 9:
                    System.out.println("Gracias vuelva prontos :) ");
                    break;
            }        
            }catch (Exception e){
                    throw e;
            }
        }while (opc !=8);
        
        
        
    }
    
}
