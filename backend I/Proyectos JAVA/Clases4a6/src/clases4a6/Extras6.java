package clases4a6;

import java.util.Scanner;

/**
 * @author Tuchito
 */
public class Extras6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas: ");
        int cont = 0;
        int n = leer.nextInt();
        double altura, suma = 0, sumaT = 0;
        for (int i = 1; i <= n; i++) {
            System.out.printf("Ingrese la %dº altura: ", i);
            altura = leer.nextDouble();
            if (altura < 1.6) {
                suma += altura;
                cont++;
            }
            sumaT += altura;
        }
        if (n > 0) {
            if (cont > 0) {
                System.out.printf("El promedio de las personas con altura menor a 1.60 es: %.2f%n", (double)suma/cont);
            }else{
                System.out.println("No se ingresaron alturas menores a 1.60.");
            }
            System.out.printf("El promedio total de las alturas es de: %.2f%n", sumaT/n);
        }else{
            System.out.println("No se ingresaron datos.");
        }

    }

}
