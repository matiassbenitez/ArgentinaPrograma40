/*Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break.
*/
package clases4a6;

import java.util.Scanner;

public class Extras8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, pares=0, impares=0, cantidad=0;
        while(true){
            System.out.println("Ingrese un número: ");
            num = leer.nextInt();
            if (num%5 == 0){
                System.out.println("Se ingresaron " + pares + " números pares.");
                System.out.println("Se ingresaron " + impares + " números impares");
                System.out.println("La cantidad de números ingresados es: " + cantidad);
                break;
            }else{
                if (num>0){
                    cantidad++;
                    if (num%2 == 0){
                        pares++;
                    }else{
                        impares++;
                    }
                }
            }
        }
    }

}
