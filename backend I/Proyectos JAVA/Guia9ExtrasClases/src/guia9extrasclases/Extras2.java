
package guia9extrasclases;


public class Extras2 {

    public static void main(String[] args) {
        
        Integer num = 9;
        int acum = 0;
        for (int i = 1; i < (num/2)+1; i++) {
            if (num%i == 0){
                acum = acum + i;
            }
        }
        if (num.equals(acum)){
            System.out.println("El número " + num + " es un número perfecto");
        }else{
            System.out.println("El número " + num + " no es un número perfecto");
        }
        
    }

}
