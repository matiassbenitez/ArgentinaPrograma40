package Clases7a8;

import java.util.Scanner;

/**
 * @author Tuchito
 */
public class Teoria11 {

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
        String cadena = "";
        int longitud;
        longitud = cad.length();
        for (int i = 0; i < longitud; i++) {
            char letra = cad.charAt(i);
            switch (letra) {
                case 'a':
                case 'A':
                    cadena += "@";
                    break;
                case 'e':
                case 'E':
                    cadena += "#";
                    break;
                case 'i':
                case 'I':
                    cadena += "$";
                    break;
                case 'o':
                case 'O':
                    cadena += "%";
                    break;
                case 'u':
                case 'U':
                    cadena += "*";
                    break;
                default:
                    cadena += letra;
            }
        }

        return cadena;
    }
}
