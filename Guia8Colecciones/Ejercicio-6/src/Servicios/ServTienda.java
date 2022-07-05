/*
    Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
    productos que venderemos y el precio que tendrán. Además, se necesita que la
    aplicación cuente con las funciones básicas.
    Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
    eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
    Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
    Realizar un menú para lograr todas las acciones previamente mencionadas.
*/

package Servicios;
import java.util.HashMap;
import java.util.Scanner;

public class ServTienda {

    Scanner input = new Scanner(System.in);
    Integer count = 0;
    
    public String preguntar(){

        System.out.print("Desea ingresar un producto? s/n \n > ");
        return input.next().toLowerCase();
        
    }

    public HashMap<String, Integer> llenarTienda(){

        HashMap<String, Integer> tienda = new HashMap<>();
        String seguir;
        String nombre;
        Integer precio;
        
        seguir = preguntar();

        while(!seguir.equals("n")){

            System.out.print("  Ingrese el produto: \n > ");
            nombre = input.next();
            System.out.print("  Ingrese el precio del producto: \n > ");
            precio = input.nextInt();

            tienda.put(nombre, precio);
            
            seguir = preguntar();
        
        }

        return tienda;

    }

    public void ingresarUnProducto(HashMap<String, Integer> tienda){
        
        String nombre;
        Integer precio;
        
        System.out.print("  Ingrese el produto: \n > ");
        nombre = input.next();
        System.out.print("  Ingrese el precio del producto: \n > ");
        precio = input.nextInt();

        tienda.put(nombre, precio);
                
    }

    public void modificarPrecio(HashMap<String, Integer> tienda){

        String producto;

        System.out.print("\n  Ingrese el producto a modificar: \n > ");
        producto = input.next();

        if(tienda.containsKey(producto)){

            System.out.println(tienda.get(producto));
    
            System.out.print("  Ingrese el nuevo precio: \n > ");
            tienda.put(producto, input.nextInt());
    
            System.out.println(tienda.get(producto));
        
        }else if(!tienda.containsKey(producto)){

            System.out.println("  Ese producto no existe.");

        }

    }

    public void eliminarProduto(HashMap<String, Integer> tienda){

        String aux;
        System.out.println("  Que producto desea eliminar?");
        aux = input.next();

        if(tienda.containsKey(aux)){

            tienda.remove(aux);
    
            System.out.println("  Producto removido con exito");
        
        }

    }

    public void mostrarProductos(HashMap<String, Integer> tienda){

        System.out.println();

        tienda.entrySet().forEach(
            entry ->{System.out.println(entry.getKey() + " -> [ $" + entry.getValue() + " ]");
        });

        System.out.println();

    }

}
