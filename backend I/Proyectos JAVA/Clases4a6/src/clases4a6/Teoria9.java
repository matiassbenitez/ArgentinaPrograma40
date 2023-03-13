
package clases4a6;

import java.util.Scanner;
/**
 *
 * @author elTuk
 */
public class Teoria9 {

    public static void main(String[] args) {
        int num, cont=1, suma=0;
        Scanner leer = new Scanner(System.in);
        do{
            System.out.println("Ingrese el " + cont + "º número: ");
            num = leer.nextInt();
            cont++;
            if (num>0){
                suma += num;
            }else{
                if (num==0){
                    System.out.println("Se capturó el número 0.");
                    break;
                }
            }
        }while(cont<=20);
        System.out.println("La suma de los números positivos es: " + suma);
    }

}
