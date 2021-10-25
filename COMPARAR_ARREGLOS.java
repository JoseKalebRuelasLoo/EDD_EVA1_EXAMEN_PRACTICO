/* 
 <COMPARAR ARREGLOS>  
Capturar valores en arreglos y comparar. 
Hecho por: Jose Kaleb Ruelas Loo  No. de Control 20550387  
           Irving Javier Gardea Beltran No. de Control 20550406
           <23/10/2021> 
*/ 
package eva1_practica4;

import java.util.Arrays;
import java.util.Scanner;


public class COMPARAR_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //PRINCIPIANTES – 10 PUNTOS
        //COMPARAR ARREGLOS
        //Capturar valores en arreglos y comparar.
         Scanner entrada=  new Scanner(System.in);
        int array1[]= new int [10];
        int array2[]= new int [10]; 
        boolean iguales = (array1.length==array2.length);
        
         for (int i = 0; i < array1.length; i++) {
             System.out.println("Digite valores para la matriz 1: ");
             array1[i]= entrada.nextInt();
        }
        System.out.println("");
        for (int i = 0; i < array2.length; i++) {
             System.out.println("Digite valores para la matriz 2: ");
             array2[i]= entrada.nextInt();
        }
          for (int i = 0; i <array1.length; i++) {//FILAS 
                System.out.print("[" + array1[i] + "]");
          }
            System.out.println("");
          for (int i = 0; i <array2.length; i++) {//FILAS         
                System.out.print("[" + array2[i] + "]");
          }
    
      if(iguales){
            for(int i=0;i<array1.length && iguales;i++){
                if(array1[i]!=array2[i]){
                    iguales = false;
                }
            }
        }
        if(iguales){
            System.out.println("Los 2 arreglos son iguales.");
        } else {
            System.out.println("Los 2 arreglos no son iguales.");
        }       
    } 
}
