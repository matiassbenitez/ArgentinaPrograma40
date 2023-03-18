
package Clases7a8;

import java.util.Scanner;

/**
 * @author Tuchito
 */
public class Teoria11b {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String cadena;
        System.out.println("Ingrese su cadena: ");
        cadena = leer.nextLine();
        if (cadena.endsWith(".")){
        System.out.println(convertir(cadena));
        }else{
            System.out.println("No termina en punto.");
        }

    }

    public static String convertir(String cad) {
        int longitud;
        longitud = cad.length();
        String letra;
        for (int i = 0; i < longitud; i++) {
            letra = cad.substring(i,i+1);
            
            switch (letra) {
                case "a":
                case "A":
                    cad=cad.substring(0,i) + "@" + cad.substring(i+1);
                    break;
                case "e":
                case "E":
                    cad=cad.substring(0,i) + "#" + cad.substring(i+1);
                    break;
                case "i":
                case "I":
                    cad=cad.substring(0,i) + "$" + cad.substring(i+1);
                    break;
                case "o":
                case "O":
                    cad=cad.substring(0,i) + "%" + cad.substring(i+1);
                    break;
                case "u":
                case "U":
                    cad=cad.substring(0,i) + "*" + cad.substring(i+1);
                    break;
                default:
            }
        }
        return cad;
    }
}
