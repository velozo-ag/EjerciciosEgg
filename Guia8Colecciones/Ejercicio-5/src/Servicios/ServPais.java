/*
    Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
    usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
    conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
    si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
    los servicios en la clase correspondiente)
    Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
    cómo se ordena un conjunto.
    Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
    buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
    usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
    al usuario.
*/

package Servicios;
import Entidades.Pais;

// import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class ServPais {
    
    Scanner input = new Scanner(System.in);

    public Pais crearPais(){

        Pais p = new Pais();

        System.out.print("Ingrese el nombre del pais: \n > ");
        p.setNombre(input.next());

        return p;

    }

    public void agregarPais(TreeSet<Pais> listaPaises, Pais p){
        listaPaises.add(p);
    }

    public TreeSet<Pais> crearPaises(){

        TreeSet<Pais> listaPaises = new TreeSet<>();
        Integer seguir;

        System.out.print("Desea ingresar un pais? 1-Si 2-No \n > ");
        seguir = input.nextInt();

        while(seguir != 2){
            
            agregarPais(listaPaises,crearPais());    

            System.out.print("Desea ingresar un pais? 1-Si 2-No \n > ");
            seguir = input.nextInt();
            
        }

        return listaPaises;

    }

    public void mostrarPaises(TreeSet<Pais> listaPaises){

        listaPaises.forEach((p) -> {
            System.out.println(p);
        });

        // for (Pais p : listaPaises) {
            
        //     System.out.println(p.toString());

        // }

        System.out.println();

    }

    public void eliminarPais(TreeSet<Pais> listaPaises){

        Iterator<Pais> it = listaPaises.iterator();
        String nombre1;

        System.out.print("Ingrese un pais a eliminar: \n > ");
        nombre1 = input.next();

        while(it.hasNext()){
            Pais aux = it.next();
            
            if(aux.getNombre().equals(nombre1)){
                it.remove();
            }
            
        }

    }

}
