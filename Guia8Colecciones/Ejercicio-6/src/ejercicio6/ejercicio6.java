/*
    Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
    productos que venderemos y el precio que tendrán. Además, se necesita que la
    aplicación cuente con las funciones básicas.
    Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
    eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
    Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
    Realizar un menú para lograr todas las acciones previamente mencionadas.
*/

package ejercicio6;
import Servicios.ServTienda;
import java.util.Scanner;
import java.util.HashMap;

public class ejercicio6 {
    
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
    
        ServTienda sT = new ServTienda();
        HashMap<String, Integer> tienda = sT.llenarTienda();
        Integer op = 0;

        while(op != 5){

            mostrarMenu();
            op = ingresarOpcion();
            realizarOperacion(op, tienda, sT);

        }

    }

    public static void mostrarMenu(){
        System.out.println();
        System.out.println("        Tienda manolito    ");
        System.out.println("    1 > Ingresar producto.");
        System.out.println("    2 > Modificar precio.");
        System.out.println("    3 > Eliminar producto.");
        System.out.println("    4 > Mostrar producto.");
        System.out.println("    5 > Salir.");
        System.out.print("    Ingresar opcion > ");
    }

    public static Integer ingresarOpcion(){

        return input.nextInt();

    }

    public static void realizarOperacion(Integer op, HashMap<String, Integer> tienda, ServTienda sT){

        switch(op){
            case 1:
                sT.ingresarUnProducto(tienda);
                break;
            case 2:
                sT.modificarPrecio(tienda);
                break;
            case 3:
                sT.eliminarProduto(tienda);
                break;
            case 4:
                sT.mostrarProductos(tienda);
                break;
            case 5:
                System.out.println("\n  Saliendo...");
                break;
            default:
                System.out.println("\n  Numero erroneo...");
                break;
        }

    }

}
