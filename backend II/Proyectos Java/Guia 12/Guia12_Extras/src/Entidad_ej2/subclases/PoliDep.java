/*
Estos métodos serán abstractos y los implementarán las siguientes clases:

• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.

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


public class PoliDep extends Edificio {
    
    protected String nombre;
    protected char instalacion;

    public PoliDep() {
    }

    public PoliDep(String nombre, char instalacion, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.instalacion = instalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(char instalacion) {
        this.instalacion = instalacion;
    }
    

    @Override
    public int calcularSuperficie() {
     //de una superficie, simplemente multiplica el largo por el ancho del lugar (en metros).
     return largo * ancho ;
    }

    @Override
    public int calcularVolumen() {
        //Para calcular el volumen de un objeto se multiplica su longitud por su ancho y altura.
        //largo * ancho * altura
        return largo * ancho * alto ;
    }

    @Override
    public String toString() {
        return "PoliDep{" + "Nombre = " + nombre + ", Instalacion = " + instalacion + " Superficie = " + calcularSuperficie() + "Volumen = " + calcularVolumen() + '}';
    }
    
}
