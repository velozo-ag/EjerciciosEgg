//Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
//matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
//signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
//denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

package ejercicio.pkg19;
import java.util.Scanner;

/**
 * @author Agus
 */

public class Ejercicio19 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] matrix = new int[3][3];
        int counter;
        
        System.out.println("----- refilling matrix -----");
        fillMatrix(matrix);
        printMatrix(matrix);
        printTransposedMatrix(matrix);
        counter = compareMatrix(matrix);
        
        if(counter == 9){
            
            System.out.println("\n Result: \n > The matrix is asymmetric \n");
            
        }
        
    }
    
    public static void fillMatrix(int[][] matrix){
    
        for(int i = 0; i < 3; i++){
        
            for(int j = 0; j < 3; j++){
                
                System.out.print("Enter the value for (" + i + ", " + j + ") > ");
                matrix[i][j] = input.nextInt();
                
            }

        }

    }

    public static void printMatrix(int[][] matrix){
        
        System.out.println("\n -  Matrix  -");
        
        for(int i = 0; i < 3; i++){
        
            System.out.print(" ");
            
            for(int j = 0; j < 3; j++){
            
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
        
        System.out.println("\n -  Transp  -");
        
        for(int i = 0; i < 3; i++){
        
            System.out.print(" ");
            
            for(int j = 0; j < 3; j++){
            
                if(j == 3){
                
                    System.out.print(matrix[j][i]);
                
                }else{
                
                    System.out.print(" " + matrix[j][i] + ", ");
                
                }
                
            }
            
            System.out.println("");
        
        }
        
        System.out.println(" ------------ ");
        
    }
    
    public static int compareMatrix(int[][] matrix){
        
        int opposite; 
        int count = 0;
        
        for(int i = 0; i < 3; i++){
            
            for(int j = 0; j < 3; j++){
            
                opposite = matrix[j][i] - (2 * matrix[j][i]) ;
                
                if(matrix[i][j] == opposite){
                    
                    count ++;
                    
                }
                
            }
            
        }
        
        return count;
        
    }
    
}
