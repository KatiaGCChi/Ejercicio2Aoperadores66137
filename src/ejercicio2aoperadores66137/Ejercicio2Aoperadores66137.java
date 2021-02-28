/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2aoperadores66137;

/**
 *
 * @author TRUJEQUE
 */
public class Ejercicio2Aoperadores66137 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matriz [][] = new int [3][3] ;
        
        matriz [0][0] = 10 ;
        matriz [0][1] = 14 ;
        matriz [0][2] = 18 ;
        matriz [1][0] = 27 ;
        matriz [1][1] = 35 ;
        matriz [1][2] = 38 ;
        matriz [2][0] = 40 ;
        matriz [2][1] = 41 ;
        matriz [2][2] = 47 ;
        
        int determinante = (matriz [0] [0] * matriz [1] [1] * matriz [2] [2]) - (matriz [0] [2] * matriz [1] [1] * matriz [2] [0]) ;
        
        System.out.println("El determinante de la matriz es: " + determinante) ;
        
                
                
    }
    
}
