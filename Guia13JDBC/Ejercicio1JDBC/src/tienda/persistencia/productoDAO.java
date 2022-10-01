/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;
import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;

/**
 *
 * @author usuario
 */
public final class productoDAO extends DAO {
    
   public void guardarProducto(Producto producto) throws Exception{
        
         try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto");
            }

            String sql = "INSERT INTO producto (codigo, nombre, precio, codigo_fabricante)"
                    + "VALUES ( '" + producto.getCodigo() 
                    + "' , '" + producto.getNombre() 
                    + "' , '" + producto.getPrecio() 
                    + "' , '" + producto.getCodigo_fabricante() + "' );";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }   
    }
   
   public void modificarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el el prodcuto que desea modificar");
            }

            String sql = "UPDATE producto SET "
                    + "nombre = '" + producto.getNombre() 
                    + "', precio = '" + producto.getPrecio() 
                    + "', codigo_fabricante = '" + producto.getCodigo_fabricante() + "' WHERE codigo = '" + producto.getCodigo()+ "'";
            
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
   
   public Collection<Producto> listarProductos() throws Exception {
        try {
            String sql = "SELECT * FROM producto ";

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigo_fabricante(resultado.getInt(4));

                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
   
   public Collection<Producto> listarEntre120y202() throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE precio BETWEEN 120 AND 202;";

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigo_fabricante(resultado.getInt(4));

                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
   
   public Collection<Producto> buscarPortatiles() throws Exception {
        try {

            String sql = "SELECT * FROM producto WHERE nombre LIKE '%portatil%';";

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigo_fabricante(resultado.getInt(4));

                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

   public Producto buscarMasBarato() throws Exception {
        try {

            String sql = "SELECT nombre FROM producto WHERE precio IN (SELECT min(precio) FROM producto)";

            consultarBase(sql);

            Producto producto;
            producto = null;
            
            while(resultado.next()){
                producto = new Producto();
                producto.setNombre(resultado.getString("nombre"));
            }
                
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
   
   public Producto buscarPorCodigo(int cod) throws Exception {
        try {

            String sql = "SELECT * FROM producto WHERE codigo = " + cod + ";";

            consultarBase(sql);

            Producto producto;
            producto = null;
            
            while(resultado.next()){
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigo_fabricante(resultado.getInt(4));
            }
            
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
   }
   
   public void eliminarProducto(Integer codigo) throws Exception {
        try {

            String sql = "DELETE FROM producto WHERE codigo = '" + codigo + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
   
}


