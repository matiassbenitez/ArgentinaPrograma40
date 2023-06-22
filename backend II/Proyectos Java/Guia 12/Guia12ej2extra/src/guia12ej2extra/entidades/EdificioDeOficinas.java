/**
 * Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
 * edificio tendrá como métodos:
 * • Método calcularSuperficie(): calcula la superficie del edificio.
 * • Método calcularVolumen(): calcula el volumen del edifico.
 * Estos métodos serán abstractos y los implementarán las siguientes clases:
 * • Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
 * Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
 * • Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
 * por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
 * los atributos del padre.
 * De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
 * usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
 * (suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
 * cuantas personas entrarían en un piso y cuantas en todo el edificio.
 *
 * Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
 * dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
 * métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
 * superficie y el volumen de cada edificio.
 * Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
 * techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
 * cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package guia12ej2extra.entidades;

public class EdificioDeOficinas extends Edificio {
    private int nroDeOficinas;
    private int cantPersonasPorOficina;
    private int cantPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int nroDeOficinas, int cantPersonasPorOficina, int cantPisos, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nroDeOficinas = nroDeOficinas;
        this.cantPersonasPorOficina = cantPersonasPorOficina;
        this.cantPisos = cantPisos;
    }
    
    public void cantPersonas(){
        System.out.println("Cantidad de personas por piso: " + cantPersonasPorOficina);
        System.out.println("Cantidad de personas en todo el edificio: " + cantPersonasPorOficina*cantPisos);
    }
    
    @Override
    public void calcularSuperficie() {
        int superficie;
        superficie = ancho * largo;
        System.out.println("La superficie del edificio de oficinas es de: " + superficie + " m2.");
    }

    @Override
    public void calcularVolumen() {
        int volumen;
        volumen = ancho*largo*alto;
        System.out.println("El volumen del polideportivo es de: " + volumen + " m3");
    }

}
