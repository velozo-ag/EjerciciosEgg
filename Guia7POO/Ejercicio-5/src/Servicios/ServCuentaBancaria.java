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

package Servicios;
import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 * @author Agus
 */

public class ServCuentaBancaria {
    
    Scanner input = new Scanner(System.in);
    
    CuentaBancaria cuenta1 = new CuentaBancaria();
    
    public CuentaBancaria crearCuenta(){
        
        System.out.print("Ingrese su numero de cuenta: \n > ");
        cuenta1.setNumeroCuenta(input.nextInt());
        
        System.out.print("Ingrese su DNI: \n > ");
        cuenta1.setDNI(input.nextInt());
        
        System.out.print("Ingrese el saldo actual: \n > ");
        cuenta1.setSaldoActual(input.nextInt());
        
        return cuenta1;
        
    }
    
    public void ingresar(double ingreso, CuentaBancaria cuenta1){

        double saldo = cuenta1.getSaldoActual();
        
        cuenta1.setSaldoActual(saldo + ingreso);
        
    }
    
    public void retirar(double retiro, CuentaBancaria cuenta1){
        
        double saldo = cuenta1.getSaldoActual();
        
        if(saldo != 0){
            
            if(saldo < retiro){

                cuenta1.setSaldoActual(0);

                System.out.println("Solo se han podido retirar $" + saldo + ".");

            }else {

                cuenta1.setSaldoActual(saldo - retiro);

            }
            
        }else {
            
            System.out.println("No se ha podido retirar el dinero deseado.");
            
        }
    }
    
    public void extraccionRapida(CuentaBancaria cuenta1){
        
        double saldo = cuenta1.getSaldoActual();
        double extRapida = saldo * 0.2;

        if(saldo != 0){
            
            System.out.println("Se ha retirado el 20% del saldo: " + extRapida);
            cuenta1.setSaldoActual(saldo - extRapida);
            
        }else {
            
            System.out.println("No se ha podido retirar el dinero deseado.");
            
        }
        
    }
    
    public void consultarSaldo(CuentaBancaria cuenta1){
        
        System.out.println("El saldo actual de su cuenta es: $" + cuenta1.getSaldoActual());
        
    }
    
    public void consultarDatos(CuentaBancaria cuenta1){
        
        System.out.println("------ Datos de la Cuenta ------");
        System.out.println("  Numero de Cuenta: " + cuenta1.getNumeroCuenta());
        System.out.println("  Numero de DNI: " + cuenta1.getDNI());
        System.out.println("  Saldo Actual: " + cuenta1.getSaldoActual());
        
    }
    
}
