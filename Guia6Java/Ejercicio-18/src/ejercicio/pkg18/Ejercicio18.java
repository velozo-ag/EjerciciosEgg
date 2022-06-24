//Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
//traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
//cambiando sus filas por columnas (o viceversa).

package ejercicio.pkg18;
import java.util.Scanner;
import java.lang.Math;

/**
 * @author Agus
 */

public class Ejercicio18 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int value;
        int[][] matrix = new int[4][4];
        
        fillMatrix(matrix);
        
        printMatrix(matrix);

        printTransposedMatrix(matrix);
        
    }
    
    public static void fillMatrix(int[][] matrix){
    // Fill a 4x4 matrix
    
        for(int i = 0; i < 4; i++){
            
            for(int j = 0; j < 4; j++){
        
                matrix[i][j] = (int) (Math.random() * 10);
        
            }
            
        }
    
    }
    
    public static void printMatrix(int[][] matrix){
    // Print correct matrix
    
        System.out.println("\n - Matrix A -");
        
        for(int i = 0; i < 4; i++){
        
            for(int j = 0; j < 4; j++){
            
                if(j == 3){
                
                    System.out.print(matrix[i][j]);
                
                }else{
                
                    System.out.print(" " + matrix[i][j] + ", ");
                
                }
                
                
            }
            
            System.out.println("");
        
        }
        
        System.out.println(" ------------ ");
        
    }
    
    public static void printTransposedMatrix(int[][] matrix){
    // Print transposed matrix
        
        System.out.println("\n - Matrix B -");
    
        for(int i = 0; i < 4; i++){
            
            for(int j = 0; j < 4; j++){
                
                if(j == 3){
                    
                    System.out.print(matrix[j][i]);
                    
                }else{
                    
                    System.out.print(" " + matrix[j][i] + ", ");
                    
                }
                
            }
            
            System.out.println("");
            
        }
        
        System.out.println(" ------------ \n");
        
    }
    
}
