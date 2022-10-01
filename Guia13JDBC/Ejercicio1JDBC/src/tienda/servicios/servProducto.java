/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.Collection;
import tienda.persistencia.productoDAO;
import tienda.persistencia.fabricanteDAO;
import tienda.entidades.Producto;

/**
 * @author usuario
 */

public class servProducto {
        
    private productoDAO dao;
    
    private fabricanteDAO fDao = new fabricanteDAO();

    public servProducto() {
        this.dao = new productoDAO();
    }
    
    public void crearProducto(Integer codigo, String nombre, Double precio, Integer codigo_fabricante) throws Exception{
        try{
            
            if(codigo == null){
                throw new Exception("Debe indicar el codigo.");
            }
            if(dao.buscarPorCodigo(codigo) != null){
                throw new Exception("Debe indicar un codigo valido.");
            }
            if(nombre == null){
                throw new Exception("Debe indicar un nombre.");
            }
            if(precio == null){
                throw new Exception("Debe indicar el precio.");
            }
            if(codigo_fabricante == null || fDao.buscarPorCodigo(codigo_fabricante) == null){
                throw new Exception("Debe indicar el codigo del fabricante.");
            }
            
            Producto prod = new Producto(codigo,nombre,precio,codigo_fabricante);
            dao.guardarProducto(prod);
            
        }catch(Exception e){
            throw e;
        }
        
    }
    
    public Collection<Producto> listarProductos() throws Exception{
        try{
            Collection<Producto> productos = dao.listarProductos();
            
            return productos;
        }catch (Exception e){
            throw e;
        }
    }
    
    public void mostrarProductos() throws Exception{
        try{
            Collection<Producto> productos = listarProductos();
            
            if(productos.isEmpty()){
                System.out.println("No hay productos para mostrar.");
            }else{
                System.out.println("Mostrando todos los productos...");
                for(Producto p : productos){
                    System.out.println(p);
                }
            }
        }catch(Exception e){
            throw e;
        }
    }
    
    public void mostrarProductosEntre120y202() throws Exception{
        try{
            Collection<Producto> productos = dao.listarEntre120y202();
            
            if(productos.isEmpty()){
                System.out.println("No hay productos para mostrar.");
            }else{
                System.out.println("Mostrando productos entre 120 y 202...");
                for(Producto p : productos){
                    System.out.println(p);
                }
            }
        }catch(Exception e){
            throw e;
        }
    }
    
    public void mostrarPortatiles() throws Exception{
        try{
            Collection<Producto> productos = dao.buscarPortatiles();
            
            if(productos.isEmpty()){
                System.out.println("No hay productos para mostrar.");
            }else{
                System.out.println("Listando todos los portatiles...");
                for(Producto p : productos){
                    System.out.println(p);
                }
            }
        }catch(Exception e){
            throw e;
        }
    }
    
    public void mostrarMasBarato() throws Exception{
        try{
            Producto prod = dao.buscarMasBarato();
            
            if(prod == null){
                System.out.println("No hay productos.");
            }else{
                System.out.println("El producto mas bataro es: ");
                System.out.println(prod);
            }            
        }catch(Exception e){
            throw e;
        }
    }
    
    public void modificarProducto(Integer codigo, String nombre, Double precio, Integer codigo_fabricante) throws Exception{
        try{
            
            if(codigo == null){
                throw new Exception("Debe indicar el codigo.");
            }
            if(dao.buscarPorCodigo(codigo) == null){
                throw new Exception("Debe indicar un codigo valido.");
            }
            if(nombre == null){
                throw new Exception("Debe indicar un nombre.");
            }
            if(precio == null){
                throw new Exception("Debe indicar el precio.");
            }
            if(codigo_fabricante == null || fDao.buscarPorCodigo(codigo_fabricante) == null){
                throw new Exception("Debe indicar el codigo del fabricante.");
            }
            
            Producto prod = new Producto(codigo,nombre,precio,codigo_fabricante);
            dao.modificarProducto(prod);
            
        }catch(Exception e){
            throw e;
        }
    }
    
    public void eliminarProductoPorCodigo(Integer codigo) throws Exception {

        try {

            //Validamos 
            if (codigo == null || dao.buscarPorCodigo(codigo) == null) {
                throw new Exception("Debe indicar un codigo valido");
            }

            dao.eliminarProducto(codigo);
        } catch (Exception e) {
            throw e;
        }
    }
    
}
