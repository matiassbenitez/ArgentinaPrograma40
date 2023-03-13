
package clases4a6;

import java.util.Scanner;

/**
 * @author Tuchito
 */
public class Extras7 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números: ");
        int n = leer.nextInt();
        int cont=0, num, min = 0, max = 0, suma = 0;
        double prom;
        while (n<=0){
            System.out.println("El número debe ser mayor a 0, vuelva a ingresarlo: ");
            n = leer.nextInt();
        }
        while (cont<n){
            System.out.printf("Ingrese su %dº número: ", cont+1);
            num = leer.nextInt();
            cont++;
            if (cont==1){
                min = num;
                max = num;
            }else{
                if (num>max)
                    max = num;
                if (num<min)
                    min = num;
                suma += num;
            }
        }
        System.out.printf("El máximo es: %d, el mínimo es: %d y el promedio es: %.2f%n", max, min, (double)suma/n);
    }

}
