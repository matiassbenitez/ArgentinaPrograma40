/**
 *  * • Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
 * Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
 */
package guia12ej3extra.entidades;

public class Hotel4E extends Hotel {

    protected char gimnasio;
    protected String nombreRest;
    protected int capacidadRest;

    public Hotel4E() {
    }

    public Hotel4E(char gimnasio, String nombreRest, int capacidadRest, int cantHabitaciones, int nroCamas, int cantPisos, String nombre, String direccion, String localidad, String encargado) {
        super(cantHabitaciones, nroCamas, cantPisos, nombre, direccion, localidad, encargado);
        this.gimnasio = gimnasio;
        this.nombreRest = nombreRest;
        this.capacidadRest = capacidadRest;
        this.precioHabitaciones = precioHabitacion(capacidadRest,gimnasio);
    }

    public char getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(char gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRest() {
        return nombreRest;
    }

    public void setNombreRest(String nombreRest) {
        this.nombreRest = nombreRest;
    }

    public int getCapacidadRest() {
        return capacidadRest;
    }

    public void setCapacidadRest(int capacidadRest) {
        this.capacidadRest = capacidadRest;
    }


    public double precioHabitacion(int capac, char gym) {
        double precio = super.precioHabitacion(this.cantHabitaciones);
        if (capac < 30) {
            precio += 10;
        } else if (capac <= 50) {
            precio += 30;
        } else {
            precio += 50;
        }
        if (gym == 'A') {
            precio += 50;
        } else {
            precio += 30;
        }
        return precio;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "gimnasio=" + gimnasio + ", nombreRest=" + nombreRest + ", capacidadRest=" + capacidadRest;
    }

}
