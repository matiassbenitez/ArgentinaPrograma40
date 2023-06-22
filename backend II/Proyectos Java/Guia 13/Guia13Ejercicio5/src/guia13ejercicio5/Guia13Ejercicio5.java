/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Escribir un programa en Java que juegue con el usuario a adivinar un número.
 * La computadora debe generar un número aleatorio entre 1 y 500, y el usuario
 * tiene que intentar adivinarlo. Para ello, cada vez que el usuario introduce
 * un valor, la computadora debe decirle al usuario si el número que tiene que
 * adivinar es mayor o menor que el que ha introducido el usuario. Cuando
 * consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de
 * veces que el usuario ha intentado adivinar el número. Si el usuario introduce
 * algo que no es un número, se debe controlar esa excepción e indicarlo por
 * pantalla. En este último caso también se debe contar el carácter fallido como
 * un intento.
 *
 * @author godoy
 */
public class Guia13Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Integer numAleatorio = (int)(Math.random()*501);
        Integer num = 0;
        Integer intentos = 0;
        boolean adivinado = false;
            System.out.println("Bienvenido al juego de adivinar un numero aleatorio de entre 1 y 500");
        do {
            System.out.println("Ingrese su numero: ");
            try {
                num = Integer.parseInt(sc.next());
                if (num>numAleatorio) {
                    System.out.println("El numero que esta buscando es menor que el numero ingresado");
                }else if (num<numAleatorio){
                    System.out.println("El numero que esta buscando es mayor que el numero ingresado");
                }else{
                    adivinado = true;
                }
            }
            catch (NumberFormatException e){
                System.out.println("Usted no ingreso un numero");
            }
            catch (Exception e){
                System.out.println("Error de sistema");
            }
            finally {
                intentos++;
            }
        } while (!adivinado);
     
        System.out.println("Adivinaste el numero en " + intentos + " intentos");
        
    }

}
