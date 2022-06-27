/*
    Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
    clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
    Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
    usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
    deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
    puede conseguir instanciando un objeto Date con constructor vacío.
    Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
    Ejemplo fecha actual: Date fechaActual = new Date();
*/

package ejercicio11;

// import java.text.SimpleDateFormat;
// import java.time.LocalDate;
// import java.time.Month;
// import java.time.Period;
import java.util.Date;
import java.util.Scanner;
// import java.util.concurrent.TimeUnit;


public class ejercicio11 {
    
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        int anio,mes,dia;
        Date fecha = new Date();
        Date fechaActual = new Date();

        System.out.print("Ingrese una fecha \n Anio \n > ");
        anio = input.nextInt();

        System.out.print("Mes: \n > ");
        mes = input.nextInt();

        System.out.print("Dia: \n > ");
        dia = input.nextInt();

        fecha.setYear(anio - 1900);
        fecha.setMonth(mes - 1);
        fecha.setDate(dia);

        System.out.println("Hay una diferencia de " + (fechaActual.getYear() - fecha.getYear()));

        // Scanner leer = new Scanner(System.in);

        // int dia, mes, anio;
        // System.out.println("ingere dia de nacimiento");
        // dia = leer.nextInt();
        // System.out.println("ingere mes de nacimiento");
        // mes = leer.nextInt();
        // System.out.println("ingere año de nacimiento");
        // anio = leer.nextInt();

        // LocalDate nacimiento = LocalDate.of(anio, Month.of(mes),dia);
        // LocalDate hoy = LocalDate.now();

        // System.out.println("nacimiento " +nacimiento);
        // System.out.println("hoy es: " +hoy);
        
        // Period diferencia = Period.between(nacimiento, hoy);
        // System.out.println("dias: " +diferencia.getDays());
        // System.out.println("meses: " +diferencia.getMonths());
        // System.out.println("años: " +diferencia.getYears());

    }

}
