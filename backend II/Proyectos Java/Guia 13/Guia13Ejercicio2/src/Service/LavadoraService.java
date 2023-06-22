/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.Electrodomestico;
import Entity.Lavadora;
import java.util.Scanner;

/**
 * • Método crearLavadora (): este método llama a crearElectrodomestico() de la
 * clase padre, lo utilizamos para llenar los atributos heredados del padre y
 * después llenamos el atributo propio de la lavadora. 
 * 
 * • Método precioFinal():
 * este método será heredado y se le sumará la siguiente funcionalidad. Si tiene
 * una carga mayor de 30 kg, aumentará el precio en $500, si la carga es menor o
 * igual, no se incrementará el precio. Este método debe llamar al método padre
 * y añadir el código necesario. Recuerda que las condiciones que hemos visto en
 * la clase Electrodoméstico también deben afectar al precio.
 *
 * @author godoy
 */
public class LavadoraService {
    ElectrodomesticoService es = new ElectrodomesticoService();
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Electrodomestico electro = es.crearElectrodomestico();
    Lavadora lav = new Lavadora();
    
    //precio, colo, consumo, peso
    
    public Lavadora crearLavadora(){
        System.out.println("Seleccione la carga maxima que puede tener el lavarropas: (5kg,10kg,20kg o 30kg o mas)");
        int carga = sc.nextInt();
        
        return new Lavadora(electro.getPrecio(),electro.getColor(),electro.getConsumoEnergetico(),electro.getPeso(),carga);
    }
    
    
    public double precioFinal(int carga){
        
        if (carga>30) {
            //Estamos haciendo que se devuelva el precio final, sumando los valores del precio final de la clase ElectrodomesticoService y los 500 extras
            return es.precioFinal(electro.getConsumoEnergetico())+ electro.getPrecio()+500; 
        } else {
            return es.precioFinal(electro.getConsumoEnergetico())+electro.getPrecio();
        }
    }
}
