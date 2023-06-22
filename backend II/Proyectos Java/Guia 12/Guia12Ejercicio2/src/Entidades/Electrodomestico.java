/*
 Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.

13

• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public abstract class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumo;
    protected double peso;

    public Electrodomestico() {
        this.precio = 1000.0;
        this.color = "Blanco";
        this.consumo = 'F';
        this.peso = 0;
    }

    public Electrodomestico(Double precio, String color, char consumo, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char comprobarConsumoEnergico(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            return letra;
        } else {
            return 'F';
        }

    }

    public String comprobarColor(String color) {
        String[] colores = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};

        for (String aux : colores) {
            if (color.equalsIgnoreCase(aux)) {
                return color;
            }
        }
        return "Blanco";
    }

    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cual es el color del electrodomestico?");
        String colorElec = comprobarColor(leer.next());
        System.out.println("Cual es la letra que indica el consumo energetico?");
        char ConsumoElec = comprobarConsumoEnergico(leer.next().charAt(0));
        System.out.println("Indique el peso");
        double pesoElec = leer.nextDouble();

        setColor(colorElec);
        setConsumo(ConsumoElec);
        setPeso(pesoElec);
    }

    public void precioFinal() {
        switch (consumo) {
            case 'A':
                setPrecio(precio += 1000);
                break;
            case 'B':
                setPrecio(precio += 800);
                break;
            case 'C':
                setPrecio(precio += 600);
                break;
            case 'D':
                setPrecio(precio += 500);
                break;
            case 'E':
                setPrecio(precio += 300);
                break;
            case 'F':
                setPrecio(precio += 100);
                break;
        }

        if (peso <= 19 && peso >= 1) {
            precio += 100;
        } else if (peso <= 49 && peso > 20) {
            precio += 500;
        } else if (peso <= 79 && peso > 50) {
            precio += 800;
        } else if (peso < 80) {
            precio += 1000;
        }

    }
    /**
     * LETRA PRECIO A $1000 B $800 C $600 D $500 E $300 F $100 PESO PRECIO Entre 1 y 19 kg $100 Entre 20 y 49 kg $500 Entre 50 y 79 kg $800 Mayor que 80 kg $1000
     */
}
