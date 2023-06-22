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
package Entidad_ej1;

import java.util.Date;

public class AlquilerB {
    private String nombre;
    private Long documento;
    private Date fechaAlq;
    private Date fechaDev;
    private char amarre;
    private Barco barc;
    private int Pago;
    
    public AlquilerB() {
    }

    public AlquilerB(String nombre, Long documento, Date fechaAlq, Date fechaDev, char amarre, Barco barc, int pago) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlq = fechaAlq;
        this.fechaDev = fechaDev;
        this.amarre = amarre;
        this.barc = barc;
        this.Pago = pago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getDocumento() {
        return documento;
    }

    public void setDocumento(Long documento) {
        this.documento = documento;
    }

    public Date getFechaAlq() {
        return fechaAlq;
    }

    public void setFechaAlq(Date fechaAlq) {
        this.fechaAlq = fechaAlq;
    }

    public Date getFechaDev() {
        return fechaDev;
    }

    public void setFechaDev(Date fechaDev) {
        this.fechaDev = fechaDev;
    }

    public char getAmarre() {
        return amarre;
    }

    public void setAmarre(char amarre) {
        this.amarre = amarre;
    }

    public Barco getBarc() {
        return barc;
    }

    public void setBarc(Barco barc) {
        this.barc = barc;
    }

    public int getPago() {
        return Pago;
    }

    public void setPago(int Pago) {
        this.Pago = Pago;
    }

    @Override
    public String toString() {
        return "Alquiler de Barco {" + "nombre=" + nombre + ", documento=" + documento + ", fechaAlq=" + fechaAlq + ", fechaDev=" + fechaDev + ", amarre=" + amarre + ", " + barc + ", Pago=" + Pago + '|';
    }
    
}
