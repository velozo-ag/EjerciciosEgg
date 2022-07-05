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
import java.util.Map;
import java.util.Scanner;
import Entidades.Producto;

public class ServTienda {

    Scanner input = new Scanner(System.in);
    Integer count = 0;
    
    public Producto crearProducto(){

        Producto product = new Producto();

        System.out.print("Ingrese el produto: \n > ");
        product.setTipo(input.next());

        System.out.print("Ingrese el precio del producto: \n > ");
        product.setPrecio(input.nextInt());


        return product;

    }

    public String preguntar(){

        System.out.print("Desea ingresar un producto? s/n \n > ");
        return input.next().toLowerCase();
        
    }

    public HashMap<Integer, Producto> llenarTienda(){

        HashMap<Integer, Producto> tienda = new HashMap<>();
        Producto product = new Producto();
        String seguir;
        
        seguir = preguntar();

        while(!seguir.equals("n")){

            product = crearProducto();

            tienda.put(count, product);
            
            count++;

            seguir = preguntar();
        
        }

        return tienda;

    }

    public void ingresarUnProducto(HashMap<Integer, Producto> tienda){

        Producto product = new Producto();

        product = crearProducto();

        tienda.put(count, product);

        count++;

    }

    public void modificarPrecio(HashMap<Integer, Producto> tienda){

        Integer lugar;

        System.out.print("\nIngrese el lugar del objeto a modificar: \n > ");
        lugar = input.nextInt();

        System.out.println(tienda.get(lugar));

        System.out.print("Ingrese el nuevo precio: \n > ");
        tienda.get(lugar).setPrecio(input.nextInt());

        System.out.println(tienda.get(lugar));

    }

    public void eliminarProduto(HashMap<Integer, Producto> tienda){

        String prod;

        System.out.print("\nIngrese el producto a eliminar: \n > ");
        prod = input.next();

        for (Map.Entry<Integer, Producto> set : tienda.entrySet()) {

            if(set.getValue().getTipo().equals(prod)){
                
                tienda.remove(set.getKey());

            }

        }

    }

    public void mostrarProductos(HashMap<Integer, Producto> tienda){

        System.out.println();

        tienda.entrySet().forEach(
            entry ->{System.out.println(entry.getKey() + " = " + entry.getValue());
        });

        System.out.println();

    }

}
