
package Clases7a8;

import java.util.Scanner;

/**
 * @author Tuchito
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        String op;
        do {
            op = proceso();
        } while (!op.equalsIgnoreCase("NO"));
    }

    public static String proceso() {
        Scanner leer = new Scanner(System.in);
        String nombre, op;
        int edad;
        System.out.println("Introduzca Su Nombre");
        nombre = leer.next();
        System.out.println("Ahora su edad");
        edad = leer.nextInt();
        if (edad >= 18) {
            System.out.println("Bienvenido " + nombre + " su edad es " + edad + " y usted es mayor de edad");
        } else {
            System.out.println("Bienvenido " + nombre + " su edad es " + edad + " y usted es menor de edad");
        }
        System.out.println("Desea continuar ?");
        op = leer.next();
        return op;
    }

}