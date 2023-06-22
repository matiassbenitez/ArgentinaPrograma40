/*
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.

Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package Entidad_ej2.subclases;

import Entidad_ej2.Edificio;
import java.util.ArrayList;

public class Oficina extends Edificio {

    protected ArrayList<Integer> numOficinas;
    protected ArrayList<Integer> cantPersonas;
    protected int numPisos;

    public Oficina() {
    }

    public Oficina(ArrayList<Integer> numOficinas, ArrayList<Integer> cantPersonas, int numPisos, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.cantPersonas = cantPersonas;
        this.numPisos = numPisos;
    }

    @Override
    public int calcularSuperficie() {
        //de una superficie, simplemente multiplica el largo por el ancho del lugar (en metros).
        return largo * ancho;
    }

    @Override
    public int calcularVolumen() {
        //Para calcular el volumen de un objeto se multiplica su longitud por su ancho y altura.
        //largo * ancho * altura
        return largo * ancho * alto;
    }

    public ArrayList<Integer> getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(ArrayList<Integer> numOficinas) {
        this.numOficinas = numOficinas;
    }

    public ArrayList<Integer> getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(ArrayList<Integer> cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    @Override
    public String toString() {
        return "Oficina{" + "numOficinas=" + numOficinas + ", cantPersonas=" + cantPersonas + ", numPisos=" + numPisos + '}';
    }

}
