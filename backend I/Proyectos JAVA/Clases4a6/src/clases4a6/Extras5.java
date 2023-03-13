
package clases4a6;

import java.util.Scanner;

/**
 * @author Tuchito
 */
public class Extras5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        String clase;
        double monto;
        System.out.println("Ingrese la clase del socio(A, B o C): ");
        clase = leer.next();
        clase = clase.toUpperCase();
        while (!clase.equals("A") && !clase.equals("B") && !clase.equals("C")){
            System.out.println("Clase incorrecta, vuelva a ingresarla: ");
            clase = leer.next();
            clase = clase.toUpperCase();
        }
        System.out.println("Ingrese el monto del tratamiento: ");
        monto = leer.nextDouble();
        switch (clase) {
            case "A":
                System.out.printf("El monto total a pagar es de: $%.2f%n", monto*0.5);
                break;
            case "B":
                System.out.printf("El monto total a pagar es de: $%.2f%n", monto*0.65);
                break;
            case "C":
                System.out.printf("El monto total a pagar es de: $%.2f%n", monto);
                break;
        }   
    }
}
