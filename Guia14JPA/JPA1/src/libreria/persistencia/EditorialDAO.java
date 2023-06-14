/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import libreria.entidades.Editorial;

/**
 *
 * @author tonga
 */
public class EditorialDAO extends DAO<Editorial> {
    
    @Override
    public void guardar(Editorial editorial) {
        super.guardar(editorial);
    }

    public void eliminarPorNombre(String nombre) {
       Editorial editorial = buscarPorNombreE(nombre);
        super.eliminar(editorial);
    }
    public Editorial buscarPorNombreE(String nombre){
        conectar();
        Editorial editorial = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.nombre LIKE :nombre",Editorial.class)
                .setParameter("nombre", nombre) .getSingleResult();
        desconectar();
        System.out.println(editorial.toString());
        return editorial;
    }
    
}
