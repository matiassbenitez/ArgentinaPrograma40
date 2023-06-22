/*

Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.


Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
 */
package Guia12ejercicio2;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author Josue
 */
public class Guia12Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Lavadora lavadora1 = new Lavadora(10, 1000.0, "Blanco", 'A', 50);
        Lavadora lavadora2 = new Lavadora(60, 1000.0, "Rojo", 'B', 70);
        Televisor televisor1 = new Televisor(50, true, 1000.0, "Negro", 'C', 30);
        Televisor televisor2 = new Televisor(30, false, 1000.0, "Azul", 'D', 20);
//        lavadora.crearLavadora();
//        televisor.crearTelevisor();     
        double suma = 0;
        double sumaT = 0;
        double sumaL = 0;
        ArrayList<Electrodomestico> elec = new ArrayList();
        
        elec.add(lavadora1);
        elec.add(lavadora2);
        elec.add(televisor1);
        elec.add(televisor2);
        
        for (Electrodomestico aux : elec) {
            aux.precioFinal();  
            //System.out.println(aux instanceof Lavadora); //Esta linea es para diferenciar lavadoras de televisores
            System.out.println(aux.getClass().getSimpleName() + " " +  aux.getColor());
            System.out.println(aux.getPrecio());            
            suma += aux.getPrecio();
            
            if (aux instanceof Lavadora) {
                sumaL += aux.getPrecio();
            }else{
                sumaT += aux.getPrecio();
            }
            
        }
        System.out.println("El precio de todas las lavadoras es de $" + sumaL);
        System.out.println("El precio de todas los televisores es de $" + sumaT);
        System.out.println("El precio de todos los electrodomesticos es de $" + suma);
    }
    }


