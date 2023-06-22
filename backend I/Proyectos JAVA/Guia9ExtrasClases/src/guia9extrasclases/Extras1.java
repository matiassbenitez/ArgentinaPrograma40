
package guia9extrasclases;


public class Extras1 {

    public static void main(String[] args) {
        Integer num = 22;
        
        int cont = 2;
        boolean primo = false;
        while (cont<Math.sqrt(num) && !primo) {
            if (num%cont == 0){
                primo = true;
            }else{
                cont++;
            }
        }
        if (primo){
            System.out.println("El número " + num + " no es primo.");
        }else{
            System.out.println("El número " + num + " es primo.");
        }
        
    }

}
