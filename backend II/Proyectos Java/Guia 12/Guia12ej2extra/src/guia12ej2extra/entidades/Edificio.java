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

public abstract class Edificio {
    protected int ancho;
    protected int alto;
    protected int largo;

    public Edificio() {
    }

    public Edificio(int ancho, int alto, int largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    public abstract void calcularSuperficie();
    public abstract void calcularVolumen();
    
    
    @Override
    public String toString() {
        return "Edificio{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + '}';
    }
    
}
