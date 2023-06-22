/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.Electrodomestico;
import Entity.Televisor;
import java.util.Scanner;

/**
 *• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.

* • Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
* 
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
 * @author godoy
 */
public class TelevisorService {
    ElectrodomesticoService es = new ElectrodomesticoService();
    Electrodomestico electro = es.crearElectrodomestico();
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
     public Televisor crearTelevisor(){
         boolean TDT = false;
         System.out.println("¿De cuantas pulgadas va a ser el televisor?");
         int pulgadas = sc.nextInt();
         System.out.println("¿Desea tenerlo con TDT?");
         String resp = sc.next();
         if (resp.equalsIgnoreCase("Si")) {
             TDT = true;
         }
        return new Televisor(pulgadas,TDT,electro.getPrecio(),electro.getColor(),electro.getConsumoEnergetico(),electro.getPeso());
    }
     
     public double precioFinal(){
         Televisor T = new Televisor();
         double aux = 0d;
         double p = 0d;
         if (T.getResolucion()>39) {
             aux = es.precioFinal(T.getConsumoEnergetico()) + T.getPrecio()*0.3;
              p = es.precioFinal(T.getConsumoEnergetico()) + T.getPrecio() + aux;
         } else {
              p = es.precioFinal(T.getConsumoEnergetico()) + T.getPrecio();
         }
         
         if (T.isTDT()) {
             return p + 500;
         } else {
             return p;
         }
     }
}
