
package ejercicioobjetos1.entidades;

import static java.lang.Math.PI;
import java.util.Scanner;

public class Circunferencia {
    
    Scanner leer = new Scanner(System.in);
    
    private double radio;
    
    //constructores
    
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    public Circunferencia(){
        System.out.println("Ingrese el radio de la circunferencia: ");
        radio = leer.nextDouble();
    }
    
    //setter
    public void setRadio(double radio){
        this.radio = radio;
    }
    //getter
    public double getRadio(){
        return radio;
    }
    
    public double area(){
        return PI*radio*radio;
    }
    
    public double perimetro(){
        return 2*PI*radio;
    }
    
    
}
