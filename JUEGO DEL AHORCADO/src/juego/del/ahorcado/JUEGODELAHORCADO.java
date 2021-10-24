package juego.del.ahorcado;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class JUEGODELAHORCADO {

    public static void main(String[] args) {
        int vidas;
        Scanner input = new Scanner(System.in);
        String[] iPalabras = new String[5];
        iPalabras[0] = "fisica";
        iPalabras[1] = "matematicas";
        iPalabras[2] = "ingles";
        iPalabras[3] = "historia";
        iPalabras[4] = "biologia";
        Collections.shuffle(Arrays.asList(iPalabras));
        for (int i = 0; i < iPalabras.length; i++) {
            char[] caracteres;
            caracteres = new char[iPalabras[i].length()];
            boolean[] letraExiste = new boolean[iPalabras[i].length()];
            for (int j = 0; j < iPalabras[i].length(); j++) {
                caracteres[j] = iPalabras[i].charAt(j);
            }
            for (int j = 0; j < iPalabras[i].length(); j++) {
                letraExiste[j] = false;
            }
            vidas = 4;
            do {
                for (int j = 0; j < iPalabras[i].length(); j++) {
                    if (letraExiste[j] == true) {
                        System.out.print("[" + caracteres[j] + "]");
                    } else {
                        System.out.print("[ ]");
                    }
                }
                System.out.println("");
                System.out.println("¿Sabe la palabra?\nSi o No ");
                String iVal = input.nextLine();
                iVal = iVal.toLowerCase();
                if (iVal.equals("si")) {
                    System.out.println("¿Cual es la palabra?");
                    String respuesta = input.nextLine();
                    respuesta = respuesta.toLowerCase();
                    if (respuesta.equals(iPalabras[i])) {
                        System.out.println("ganas");
                        for (int j = 0; j < iPalabras[i].length(); j++) {
                            System.out.print("[" + caracteres[j] + "]");
                            System.out.print("");
                        }
                        vidas = -1;
                    } else {
                        System.out.println("pierdes, respuesta correcta");
                        for (int j = 0; j < iPalabras[i].length(); j++) {
                            System.out.print("[" + caracteres[j] + "]");
                        }
                        vidas =-1;
                    }
                } else if (iVal.equals("no")) {
                    int a = 0;
                    System.out.println("¿Que letra te gustaria buscar?");
                    char letra = input.next().charAt(0);
                    for (int j = 0; j < iPalabras[i].length(); j++) {
                        if (caracteres[j] == letra) {
                            letraExiste[j] = true;
                            a++;
                        }
                    }
                    if (a == 0) {
                        System.out.println("No se encontro la letra, pierde una vida");
                        vidas = vidas - 1;
                    } else {
                        System.out.println("Se encontro la letra " + letra + " en las siguientes casillas");
                    }
                } else if (iVal.equals("no") && iVal.equals("si")) {
                    System.out.println("Inserte una respuesta correcta");
                }System.out.println("");
                System.out.println("Presione enter para continuar");
                input.nextLine();
                if (vidas == -1) {
                    System.out.println("");
                }
                if (vidas == 0) {
                    System.out.println("Usted no cuenta con mas vidas, por lo que a perdido");
                    System.out.println("respuesta correcta");
                    for (int j = 0; j < iPalabras[i].length(); j++) {
                        System.out.print("[" + caracteres[j] + "]");
                    }
                }
            } while (vidas > 0);
            System.out.println("¿Desea jugar de nuevo?");
            String iVal2 = input.nextLine();
            iVal2 = iVal2.toLowerCase();
            if (iVal2.equals("si")) {

                System.out.println("");
            } else if (iVal2.equals("no")) {
                System.out.println("Gracias por utilizar");
                System.exit(0);
            } else {
                System.out.println("Inserte una respuesta correcta");
            }
        }
        System.out.println("Usted ya completo todas las palabras disponibles");
    }
}
