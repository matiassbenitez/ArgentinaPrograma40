
package recursividad;

public class Recursividad {

   
    public static void main(String[] args) {
        System.out.println(mult(4,3));
    }
    
    public static int mult(int n, int m){
        if (m==0){
            System.out.println("igual a 0");
            System.out.println(n + "x" + m + "+" + n);
            return 0;
        }else{
            System.out.println(n + "x" + m + "+" + n);
            return mult(n,m-1)+n;
        }
    }
    
}
