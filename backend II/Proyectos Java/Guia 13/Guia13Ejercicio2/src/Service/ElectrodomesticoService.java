/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.Electrodomestico;
import java.util.Scanner;

/**
 * • Método comprobarConsumoEnergetico(char letra): comprueba que la letra es
 * correcta, sino es correcta usara la letra F por defecto. Este método se debe
 * invocar al crear el objeto y no será visible.
 *
 * • Método comprobarColor(String color): comprueba que el color es correcto, y
 * si no lo es, usa el color blanco por defecto. Los colores disponibles para
 * los electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el
 * nombre está en mayúsculas o en minúsculas. Este método se invocará al crear
 * el objeto y no será visible.
 *
 * • Metodo crearElectrodomestico(): le pide la información al usuario y llena
 * el electrodoméstico, también llama los métodos para comprobar el color y el
 * consumo. Al precio se le da un valor base de $1000.
 *
 * • Método precioFinal(): según el consumo energético y su tamaño, aumentará el
 * valor del precio. Esta es la lista de precios
 *
 * @author godoy
 */
public class ElectrodomesticoService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Electrodomestico e = new Electrodomestico();

    public char comprobarConsumoEnergetico(char letra) {
        char[] letraValida = {'A', 'B', 'C', 'D', 'E', 'a', 'b', 'c', 'd', 'e'};
        for (int i = 0; i < letraValida.length; i++) {
            if (letraValida[i] != letra) {
                return 'F';
            } else {
                return letra;
            }
        }
        return 'F';
    }

    public String comprobarColor(String color) {
        String[] colorValido = {"Negro", "Rojo", "Azul", "Gris"};
        for (int i = 0; i < colorValido.length; i++) {
            if (!colorValido[i].equalsIgnoreCase(color)) {
                return "Blanco";
            } else {
                return color;
            }
        }
        return null;
    }

    public Electrodomestico crearElectrodomestico() {
        System.out.println("¿De que color desea su electrodomestico? (Blanco, Negro, Rojo, Azul o Gris)");
        String color = sc.next();
        color = comprobarColor(color);
        System.out.println("¿Que tipo de consumo desea? (A,B,C,D,E,F)");
        char letra = sc.next().charAt(0);
        letra = comprobarConsumoEnergetico(letra);
        System.out.println("Seleccionar el peso del aparato: ");
        System.out.println("1) Entre 1 y 19 kg $100\n"
                + "2) Entre 20 y 49 kg $500\n"
                + "3) Entre 50 y 79 kg $800\n"
                + "4) Mayor que 80 kg $1000");
        int peso = 0;
        double precio = 0d;
        int var = sc.nextInt();
        switch (var) {
            case 1:
                peso = 19;
                precio = 100d;
                break;
            case 2:
                peso = 49;
                precio = 500d;
                break;
            case 3:
                peso = 79;
                precio = 800d;
                break;
            case 4:
                peso = 80;
                precio = 1000d;
                break;
           
        }
        return new Electrodomestico(precio,color,letra,peso);
    }

    
    //Método precioFinal(): según el consumo energético y su tamaño, aumentará el
 // valor del precio. Esta es la lista de precios
    public double precioFinal(char letra){
        int precio = 0;
        String l = Character.toString(letra);
        
        switch (l.toUpperCase()) {
            case "A":
                precio = 1000;
                e.setPrecio(precio + e.getPrecio());
                break;
            case "B":
                precio = 800;
                e.setPrecio(precio + e.getPrecio());
                break;
            case "C":
                precio = 600;
                e.setPrecio(precio + e.getPrecio());
                break;
            case "D":
                precio = 500;
                e.setPrecio(precio + e.getPrecio());
                break;
            case "E":
                precio = 300;
                e.setPrecio(precio + e.getPrecio());
                break;
            case "F":
                precio = 100;
                e.setPrecio(precio + e.getPrecio());
                break;
        }
        
        return e.getPrecio();
    }
}
