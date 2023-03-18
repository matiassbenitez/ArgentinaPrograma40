package Clases7a8;

import java.util.Scanner;

/**
 * @author Tuchito Crea una aplicación que le pida dos números 
 * al usuario y este pueda elegir entre sumar, restar, 
 * multiplicar y dividir. La aplicación debe tener una 
 * función para cada operación matemática y deben devolver 
 * sus resultados para imprimirlos en el main
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int a, b, op, res;
        System.out.println("Ingrese el primer número: ");
        a = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        b = leer.nextInt();
        System.out.println("MENU\n1-Sumar\n2-Restar\n3-Multiplicar\n4-Dividir\n5-Salir");
        
        do{
            System.out.println("Ingrese la operación a realizar: ");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    res = sumar(a,b);
                    System.out.println("La suma es: " + res);
                    break;
                case 2:
                    res = restar(a,b);
                    System.out.println("La resta es: " + res);
                    break;
                case 3:
                    res = multiplicar(a,b);
                    System.out.println("La multiplicación es: " + res);
                    break;
                case 4:
                    if (b==0){
                        System.out.println("División por cero.");
                       // res=0;
                    }else{
                    res = dividir(a,b);
                    System.out.println("La división es: " + res);
                    }
                    break;
                case 5:
                    System.out.println("Hasta Luego");
                    break;
                default:
                    System.out.println("Ingreso incorrecto.");
            }
            
        }while(op!=5);

    }

    public static int sumar(int a, int b) {
        int c = a + b;
        return c;
    }

    public static int restar(int a, int b) {
        int c = a - b;
        return c;
    }

    public static int multiplicar(int a, int b) {
        int c = a * b;
        return c;
    }

    public static int dividir(int a, int b) {
        int c = a / b;
        return c;
    }
}
