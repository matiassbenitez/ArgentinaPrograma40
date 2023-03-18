
package Clases7a8;

import java.util.Scanner;

/**
 * @author Tuchito
 */
public class NewMain {

    public static void main(String[] args) {
        int n, cont, cont1 ;
        double prom1, prom2 ;
        double alt, sum, sum1 ;
        cont=0 ;
        cont1=0 ;
        sum=0 ;
        sum1=0 ;
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas a evaluar");
        n=leer.nextInt();
        do{
            cont=cont+1 ;
            System.out.println("Ingrese su altura");
            alt=leer.nextDouble();
            if (alt<1.60){
                cont1=cont1+1 ;
                sum=sum+alt ;
                break;
            }
            sum1=sum1+alt ; 
            System.out.println(cont);
            
        } while (cont<=n) ;
        
        if (cont1!=0){
            prom1=sum/cont1 ;
            System.out.println("El promedio de las estaturas debajo del 1.60 es: " + prom1);
        }else{
            System.out.println("No existe alturas menores a 1.60");
        }
        prom2=sum1/n ;
        System.out.println("El promedio de las estaturas en general es: " + prom2);
    }
}