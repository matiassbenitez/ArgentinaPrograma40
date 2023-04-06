
package Entidades;

import static java.lang.Math.PI;
import java.util.Scanner;


public class Circunferencia {
    
    //atributos
    private double radio;

    //constructores
    public Circunferencia() {
    }
    
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    //métodos
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el radio: ");
        radio = leer.nextDouble();
    }
    
    public double area(){
        return PI*radio*radio;
    }
    
    public double perimetro(){
        return 2*PI*radio;
    }
    
    
    
    
    
}
