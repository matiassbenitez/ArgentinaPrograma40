
package clases4a6;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Teoria7 {

    public static void main(String[] args) {
        byte tipoMotor;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tipo de motor (1-4): ");
        tipoMotor = leer.nextByte();
        switch (tipoMotor){
            case 1:
                System.out.println("La bomba es una bomba de agua.");
                break;    
            case 2:
                System.out.println("La bomba es una bomba de gasolina.");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón.");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia.");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba.");
        }
    }
    
}
