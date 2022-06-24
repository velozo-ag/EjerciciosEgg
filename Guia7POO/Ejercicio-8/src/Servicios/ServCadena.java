/*
    Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
    y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
    que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
    través de los métodos set, se guardará la frase y la longitud de manera automática según
    la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
    a) Método mostrarVocales() [contarVocales()*], deberá contabilizar la cantidad de vocales que tiene la frase
    ingresada.
    b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
    ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
    contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
    compone la clase con otra nueva frase ingresada por el usuario.
    f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
    una nueva frase ingresada por el usuario y mostrar la frase resultante.
    g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
    encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
    frase resultante.
    h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    ingresa el usuario y devuelve verdadero si la contiene y falso si no.
*/

package Servicios;
import java.util.Scanner;
import Entidades.Cadena;

/**
 * @author Agus
 */

public class ServCadena {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    Cadena cadena1 = new Cadena();
    
    public Cadena crearCadena(){

        System.out.print("Ingrese una frase: \n > ");
        
        String frase = input.nextLine();      
        cadena1.setFrase(frase);
        cadena1.setLongitud(frase.length());
        
        return cadena1;

    }
    
    public void contarVocales(Cadena cadena1){
        
        int i, j;
        int cantVocales = 0;
        char[] vocales = {'a','e','i','o','u'};
        char letra;
        
        for(i = 0; i < cadena1.getLongitud(); i++){
        
            letra = cadena1.getFrase().charAt(i);
            
            for(j = 0; j < 5; j++){
                
                if(letra == vocales[j]){
                    
                    cantVocales++;
                    
                }
            }
        }
        
        System.out.println("La cantidad de vocales encontradas en la cadena es: " + cantVocales);
        
    }
    
    public void invertirFrase(Cadena cadena1){
        
        int i;
        String cadenaAuxiliar;
       
        for(i = cadena1.getLongitud() -1; i >= 0; i--){
            
            System.out.print(cadena1.getFrase().charAt(i));
            
        }
        
        System.out.println("");
        
    }
    
    public void vecesRepetido(String caracter, Cadena cadena1){
        
        int i;
        int contador = 0;
        String letra;
        
        for(i = 0; i < cadena1.getLongitud(); i++){
            
            letra = cadena1.getFrase().substring(i).toLowerCase();
            
            if(letra.equals(caracter)){
                
                contador++;
                
            }
        }
        
        System.out.println("El caracter '" + caracter + "' se repite " + contador + " veces.");
        
    }
    
    public void compararLongitud(String frase, Cadena cadena1){
        
        int longitudFrase = frase.length();
        boolean igualdad = longitudFrase == cadena1.getLongitud();
        
        if(igualdad){
            System.out.println("Ambas frases son igual de largas.");
        }else{
            System.out.println("Las frases no tienen el mismo largo.");
        }
        
    }
    
    public void unirFrases(String frase, Cadena cadena1){
        
        String fraseCompleta = cadena1.getFrase() + " " + frase;
        
        System.out.println("La frase completa es: " + fraseCompleta);
        
    }
    
    public void reemplazar(String caracter, Cadena cadena1){
        
        int i;
        String let;
        
        for(i = 0; i < cadena1.getLongitud(); i++){
            
            let = cadena1.getFrase().substring(i).toLowerCase();
            
            if("a".equals(let)){
                
                System.out.print(caracter);
                
            } else {
                
                System.out.print(let);
                
            }
        }
        
        System.out.println("");
        
    }
    
    public boolean contiene(char caracter, Cadena cadena1){
        
        int i;
        char letra;
        boolean hay = false;
        
        for(i = 0; i < cadena1.getLongitud(); i++){
            
            letra = cadena1.getFrase().charAt(i);
            
            if(letra == caracter){
                
                hay = true;
                return hay;
                
            }
        }
        
        return hay;
        
    }
    
    
}
