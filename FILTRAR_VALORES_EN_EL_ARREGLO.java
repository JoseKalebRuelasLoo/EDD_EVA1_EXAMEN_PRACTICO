/* 
 <FILTRAR VALORES EN EL ARREGLO>  
Filtrar valores en el arreglo (EVITAR REPETICION)
Hecho por: Jose Kaleb Ruelas Loo  No. de Control 20550387  
           Irving Javier Gardea Beltran No. de Control 20550406
           <23/10/2021> 
 */
package eva1_practica3.pkg1;

import java.util.Arrays;

public class FILTRAR_VALORES_EN_EL_ARREGLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PRINCIPIANTES – 10 PUNTOS
        //FILTRAR VALORES EN EL ARREGLO
        //Generar un arreglo de tamaño 15, llenarlo con valores aleatorios PARES entre 1 y 100.
        //o Imprimir el arreglo:
        int iArreglo[] = new int[15];
        boolean[] num = new boolean[15];
        for (int i = 0; i < iArreglo.length; i++) {
            do {
                iArreglo[i] = (int) (Math.random() * 100);

                for (int j = 0; j < iArreglo.length; j++) {
                    if (iArreglo[j] != iArreglo[i]&&iArreglo[i] % 2 != 0) {
                        num[i] = false;
                    }
                }

            } while (iArreglo[i] % 2 != 0 && num[i] != true);
            System.out.print("[" + iArreglo[i] + "]" + "-");
        }
    }

}
