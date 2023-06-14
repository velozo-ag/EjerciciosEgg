/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import libreria.entidades.Autor;


/**
 *
 * @author tonga
 */
public class AutorDAO extends DAO<Autor>{
    
    @Override
    public void guardar(Autor autor) {
        super.guardar(autor);
    }

    public void eliminarPorNombre(String nombre) {
       Autor autor = buscarPorNombreA(nombre);
        super.eliminar(autor);
    }
    public Autor buscarPorNombreA(String nombre){
        conectar();
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre",Autor.class)
                .setParameter("nombre", nombre) .getSingleResult();
        desconectar();
        System.out.println(autor.toString());
        return autor;
    }
}
