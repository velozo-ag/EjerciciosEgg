/*
    Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
    numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
    operaciones asociadas a dicha clase son:
    a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
    b) Agregar los métodos getters y setters correspondientes
    c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
    y se la sumara a saldo actual.
    e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
    restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
    saldo actual en 0.
    f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
    usuario no saque más del 20%.
    g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */

package ejercicio.pkg5;
import Entidades.CuentaBancaria;
import Servicios.ServCuentaBancaria;
import java.util.Scanner;

/**
 * @author Agus
 */

public class Ejercicio5 {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {

        ServCuentaBancaria sCuenta = new ServCuentaBancaria();
        CuentaBancaria cuentaBanco = sCuenta.crearCuenta();

        int opcion;
        
        System.out.println("\nIniciando cuenta bancaria... \n");
        
        do{
            
            desplazarMenu();
            opcion = ingresarOpcion();

            if(opcion < 6 && opcion >= 1){

                realizarOperacion(opcion,sCuenta,cuentaBanco);

            }else{

                System.out.println("\nGracias por utilzar nuestros servicios!");

            }

        }while(opcion != 6 );
        
    }
    
    public static void desplazarMenu(){
        
        System.out.println("--------- Menu ---------");
        System.out.println(" 1-Ingresar dinero.");
        System.out.println(" 2-Retirar dinero.");
        System.out.println(" 3-Extraccion rapida (20%).");
        System.out.println(" 4-Consultar saldo.");
        System.out.println(" 5-Consultar datos.");
        System.out.println(" 6-Salir.");
        
    }
    
    public static int ingresarOpcion(){
        
        System.out.print(" > ");
        return input.nextInt();
        
    }
    
    public static void realizarOperacion(int opcion, ServCuentaBancaria sCuenta, CuentaBancaria cuentaBanco){
        
        System.out.println("");
        
        switch(opcion){
            case 1: 
                
                System.out.print("Ingrese el monto a depositar: \n > ");
                sCuenta.ingresar(input.nextDouble(),cuentaBanco);
                
                break;
            case 2:
                
                System.out.print("Ingrese el monto a retirar: \n > ");
                sCuenta.retirar(input.nextDouble(),cuentaBanco);
                break;
            
            case 3:
            
                sCuenta.extraccionRapida(cuentaBanco);
                break;
            
            case 4:
            
                sCuenta.consultarSaldo(cuentaBanco);
                break;
            
            case 5:
                
                sCuenta.consultarDatos(cuentaBanco);
                break;
                    
        }
        
        System.out.println("");
        
    }
    
    
    
}
