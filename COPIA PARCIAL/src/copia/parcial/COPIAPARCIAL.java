/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copia.parcial;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jose kaleb
 */
public class COPIAPARCIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int iVal;
        int iVal2;
        Scanner input = new Scanner(System.in);
        int[] iArreglo = new int[15];
        for (int i = 0; i < iArreglo.length; i++) {
            Random r = new Random();
            iArreglo[i] = r.nextInt(20) + 1;  // Entre 0 y 5, más 1
            System.out.print(iArreglo[i] + ",");
        }
        System.out.println("");

        // do {
        System.out.println("¿De donde a donde quiere copiar?(inicio)");
        iVal = input.nextInt();
        System.out.println("¿De donde a donde quiere copiar?(final)");
        iVal2 = input.nextInt();
        // } while (a == 0);
        int[] icopia = new int[iVal2];
        int b = 0;
        for (int i = iVal - 1; i < iVal2; i++) {
            icopia[b] = iArreglo[i];
            if (icopia[b] % 2 == 0) {
                System.out.print(icopia[b] + ",");
            } else {

            }
            b++;
        }
        System.out.println("");
    }

}
