
package ejercicio2objetos.entidades;

import static java.lang.Math.PI;


public class Circunferencia {
    
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double area(){
        return PI*radio*radio;
    }
    
    public double perimetro(){
        return 2*PI*radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + " radio=" + radio + " area: " + area() + " perimetro: " + perimetro() + "}";
    }
    
    
}
