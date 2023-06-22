/*
 Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package Guia12ejercicio4;

import Entidades.Circulo;
import Entidades.Rectangulo;

/**
 *
 * @author Josue
 */
public class Guia12Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo rec = new Rectangulo(10,20);
        Circulo cir = new Circulo(30);
        
        System.out.println(rec.calcularArea());
        System.out.println(rec.calcularPerimetro());
        System.out.println(cir.calcularPerimetro());
        System.out.println(cir.calcularArea());
    }
    
}
