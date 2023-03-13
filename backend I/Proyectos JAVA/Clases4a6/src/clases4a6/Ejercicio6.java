package clases4a6;

import java.util.Scanner;

/**
 * @author elTuk
 */
public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num1, num2;
        byte op;
        String conf = "N";
        System.out.println("Ingrese el 1º número: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese el 2º número: ");
        num2 = leer.nextInt();
        do {
            System.out.println("MENU\n1-Suma\n2-Resta\n3-Multiplicación\n4-División\n5-Salir");
            System.out.println("Ingrese una opción: ");
            op = leer.nextByte();
            switch (op) {
                case 1:
                    System.out.println("La suma de los números es: " + (num1+num2));
                    break;
                case 2:
                    System.out.println("La resta de los números es: " + (num1-num2));
                    break;
                case 3:
                    System.out.println("El producto de los números es: " + (num1*num2));
                    break;
                case 4:
                    System.out.println("La división de los números es: " + (double)num1/num2);
                    break;
                case 5:
                    System.out.print("Está seguro de salir?(s/n): ");
                    conf = leer.next(); // si uso nextLine me pasa por alto esta instrucción :(
                    break;
                default:
                    System.out.println("Por favor ingrese una opción válida: ");
            }
        }while(!conf.equalsIgnoreCase("s"));
    }
}
