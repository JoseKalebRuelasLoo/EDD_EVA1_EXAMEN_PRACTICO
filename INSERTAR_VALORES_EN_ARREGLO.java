/* 
 <INSERTAR VALORES EN ARREGLO>  
Agregar valores a un arreglo, en el orden que les corresponde.
Hecho por: Jose Kaleb Ruelas Loo  No. de Control 20550387  
           Irving Javier Gardea Beltran No. de Control 20550406
           <23/10/2021> 
*/ 
package eva1_practica2;

import java.util.Arrays;
import java.util.Scanner;

public class INSERTAR_VALORES_EN_ARREGLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //INTERMEDIOS – 20 PUNTOS
        //INSERTAR VALORES EN ARREGLO
        //Agregar valores a un arreglo, en el orden que les corresponde
        //Generar un arreglo de tamaño 15.
        //o Solicitar los valores al usuario desde el teclado.
        //o Los valores deben INSERTARSE en la posición correcta
        Scanner entrada = new Scanner(System.in);
        int iArreglo[] = new int[4];

        System.out.println("LLenar el arreglo ");
        for (int i = iArreglo.length; i > 0; i--) {
            System.out.println("Digite un numero: ");
            iArreglo[i - 1] = entrada.nextInt();
            for (int j = 0; j < iArreglo.length; j++) {
                Arrays.sort(iArreglo);
                System.out.print("[" + iArreglo[j] + "]");
            }
            System.out.println("");
        }
        Arrays.sort(iArreglo);
        System.out.println("Tu arreglo es: ");
        for (int i = 0; i < iArreglo.length; i++) {
            System.out.print("[" + iArreglo[i] + "]");
        }
    }

}
