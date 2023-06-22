/*
 En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
package Entidad_ej1.subClases;

import Entidad_ej1.Barco;

/**
 *
 * @author Usuario
 */
public class Yate extends Barco{
    protected Double CVmotor;
    protected int numCamarotes;

    public Yate() {
    }

    public Yate(Double CVmotor, int numCamarotes, String matricula, int eslora, int anio) {
        super(matricula, eslora, anio);
        this.CVmotor = CVmotor;
        this.numCamarotes = numCamarotes;
    }

    public Double getCVmotor() {
        return CVmotor;
    }

    public void setCVmotor(Double CVmotor) {
        this.CVmotor = CVmotor;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    @Override
    public String toString() {
        return "Yate | " + "CVmotor = " + CVmotor + ", numCamarotes = " + numCamarotes + super.toString();
    }
    
}
