/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ejercicio2;

import Entity.Electrodomestico;
import Entity.Lavadora;
import Entity.Televisor;
import Service.ElectrodomesticoService;
import Service.LavadoraService;
import Service.TelevisorService;
import java.util.ArrayList;

/**
 *
 * @author godoy
 */
public class Guia12Ejercicio2 {

    /**
     * Crear una superclase llamada Electrodoméstico con los siguientes
     * atributos: precio, color, consumo energético (letras entre A y F) y peso.
     * Los constructores que se deben implementar son los siguientes: • Un
     * constructor vacío. • Un constructor con todos los atributos pasados por
     * parámetro.
     *
     * Los métodos a implementar son: • Métodos getters y setters de todos los
     * atributos. • Método comprobarConsumoEnergetico(char letra): comprueba que
     * la letra es correcta, sino es correcta usara la letra F por defecto. Este
     * método se debe invocar al crear el objeto y no será visible. • Método
     * comprobarColor(String color): comprueba que el color es correcto, y si no
     * lo es, usa el color blanco por defecto. Los colores disponibles para los
     * electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el
     * nombre está en mayúsculas o en minúsculas. Este método se invocará al
     * crear el objeto y no será visible.
     *
     * • Metodo crearElectrodomestico(): le pide la información al usuario y
     * llena el electrodoméstico, también llama los métodos para comprobar el
     * color y el consumo. Al precio se le da un valor base de $1000. • Método
     * precioFinal(): según el consumo energético y su tamaño, aumentará el
     * valor del precio. Esta es la lista de precios
     *
     *
     * LETRA PRECIO A $1000 B $800 C $600 D $500 E $300 F $100
     *
     * PESO PRECIO Entre 1 y 19 kg $100 Entre 20 y 49 kg $500 Entre 50 y 79 kg
     * $800 Mayor que 80 kg $1000
     *
     *
     * A continuación, se debe crear una subclase llamada Lavadora, con el
     * atributo carga, además de los atributos heredados. Los constructores que
     * se implementarán serán: • Un constructor vacío. • Un constructor con la
     * carga y el resto de los atributos heredados. Recuerda que debes llamar al
     * constructor de la clase padre. Los métodos que se implementara serán: •
     * Método get y set del atributo carga. • Método crearLavadora (): este
     * método llama a crearElectrodomestico() de la clase padre, lo utilizamos
     * para llenar los atributos heredados del padre y después llenamos el
     * atributo propio de la lavadora. • Método precioFinal(): este método será
     * heredado y se le sumará la siguiente funcionalidad. Si tiene una carga
     * mayor de 30 kg, aumentará el precio en $500, si la carga es menor o
     * igual, no se incrementará el precio. Este método debe llamar al método
     * padre y añadir el código necesario. Recuerda que las condiciones que
     * hemos visto en la clase Electrodoméstico también deben afectar al precio.
     *
     * Se debe crear también una subclase llamada Televisor con los siguientes
     * atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además
     * de los atributos heredados. Los constructores que se implementarán serán:
     * • Un constructor vacío. • Un constructor con la resolución, sintonizador
     * TDT y el resto de los atributos heredados. Recuerda que debes llamar al
     * constructor de la clase padre.
     *
     * Los métodos que se implementara serán: • Método get y set de los
     * atributos resolución y sintonizador TDT. • Método crearTelevisor(): este
     * método llama a crearElectrodomestico() de la clase padre, lo utilizamos
     * para llenar los atributos heredados del padre y después llenamos los
     * atributos del televisor. • Método precioFinal(): este método será
     * heredado y se le sumará la siguiente funcionalidad. Si el televisor tiene
     * una resolución mayor de 40 pulgadas, se incrementará el precio un 30% y
     * si tiene un sintonizador TDT incorporado, aumentará $500. Recuerda que
     * las condiciones que hemos visto en la clase Electrodomestico también
     * deben afectar al precio. Finalmente, en el main debemos realizar lo
     * siguiente: Vamos a crear una Lavadora y un Televisor y llamar a los
     * métodos necesarios para mostrar el precio final de los dos
     * electrodomésticos.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Electrodomestico electro = new Electrodomestico();
        Lavadora lavadora = new Lavadora();
        Televisor tele = new Televisor();
        
        System.out.println("Creamos los dos objetos: ");
        ElectrodomesticoService el = new ElectrodomesticoService();
        LavadoraService lav = new LavadoraService();
        TelevisorService tv = new TelevisorService();

       System.out.println("Mostramos los objetos, para ver como se llenaron: ");
        System.out.println(el.crearElectrodomestico());
        double precioElectrodomestico = el.precioFinal(electro.getConsumoEnergetico());
        System.out.println("Creamos el lavarropas: ");
        System.out.println(lav.crearLavadora());
        double precioLavadora = lav.precioFinal(lavadora.getCarga());
        System.out.println("Creamos la TV: ");
        System.out.println(tv.crearTelevisor());
        double precioTv = tv.precioFinal();
        
        //Mostrar los precios finales
        System.out.println("El precio final del electrodomestico es: " + precioElectrodomestico);
        System.out.println("El precio final de la Lavadora es: " + precioLavadora);
        System.out.println("El precio final de la TV es: " + precioTv);
        
        ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList<> ();
        //precio, colo, consumo, peso, carga
        Lavadora l1 = new Lavadora(2300,"Blanco",'A',50,80);
        listaElectrodomesticos.add(l1);
        Lavadora l2 = new Lavadora(2700,"Azul",'F',45,50);
        listaElectrodomesticos.add(l2);
        //pulgadas, tdt, precio, colo, consumo, peso
        Televisor t1 = new Televisor(40,true,4500,"Negro",'F',5);
        listaElectrodomesticos.add(t1);
        Televisor t2 = new Televisor(60,false,3000,"Negro",'A',25);
        listaElectrodomesticos.add(t2);
        
        for (Electrodomestico aux : listaElectrodomesticos) {
            System.out.println(aux);
        }
        
        //Variables para guardar y alamcenar 
        double suma1 = 0;
        double suma2 = 0;
        double suma3 = 0;
        
        for (Electrodomestico aux : listaElectrodomesticos) {
            if (aux instanceof Electrodomestico) {
                suma1+= aux.getPrecio();
            }
            if (aux instanceof Lavadora) {
                suma2+=aux.getPrecio();
            }
            if (aux instanceof Televisor) {
                suma3+=aux.getPrecio();
                
            }
        }
    }

}
