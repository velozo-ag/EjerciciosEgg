/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import tienda.entidades.Fabricante;

/**
 *
 * @author usuario
 */

public final class fabricanteDAO extends DAO {
    
    public void guardarFabricante(Fabricante fab) throws Exception{
        
         try {
            if (fab == null) {
                throw new Exception("Debe indicar el fabricante");
            }

            String sql = "INSERT INTO fabricante (codigo, nombre)"
                    + "VALUES ( '" + fab.getCodigo() + "' , '" + fab.getNombre() + "' );";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
        
    }
    
    public Fabricante buscarPorCodigo(int cod) throws Exception {
        try {

            String sql = "SELECT nombre FROM fabricante WHERE codigo = " + cod + ";";

            consultarBase(sql);

            Fabricante fabricante = null;
            
            while(resultado.next()){
                fabricante = new Fabricante();
                fabricante.setNombre(resultado.getString(1));
            }
            
            desconectarBase();
            return fabricante;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
   }

    
}
