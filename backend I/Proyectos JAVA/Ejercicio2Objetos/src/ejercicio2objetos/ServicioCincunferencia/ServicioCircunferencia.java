
package ejercicio2objetos.ServicioCincunferencia;

import ejercicio2objetos.entidades.Circunferencia;

import java.util.Scanner;


public class ServicioCircunferencia {
    private Scanner leer = new Scanner(System.in);
    
    public Circunferencia crearCircunferencia(){
        
        System.out.println("Ingrese el radio: ");
        double radio = leer.nextDouble();
        return new Circunferencia(radio);
        
    }
    
 
    
}
