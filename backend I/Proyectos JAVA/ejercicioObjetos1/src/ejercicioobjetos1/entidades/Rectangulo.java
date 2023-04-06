
package ejercicioobjetos1.entidades;

import java.util.Scanner;

/**
 *
 * @author Tuchito
 */
public class Rectangulo {
    
    static Scanner leer = new Scanner(System.in);
    private int base;
    private int altura;

    public Rectangulo() {
        
        System.out.println("Ingrese el tamaño de la base: ");
        base = leer.nextInt();
        System.out.println("Ingrese el tamaño de la altura: ");
        altura = leer.nextInt();
        
    }
    
    public int perimetro(){
        
        return (base+altura)*2;
        
    }
    
    public int superficie(){
        
        return base*altura;
        
    }
    
    public void dibujar(){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
             if (i==0 || i ==altura-1){
                 System.out.print(" * ");
             }else{
                 if (j==0 || j==base-1){
                     System.out.print(" * ");
                 }else{
                     System.out.print("   ");
                 }
             }
            }
            System.out.println("");
        }
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rectangulo{");
        sb.append("base=").append(base);
        sb.append(", altura=").append(altura);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
