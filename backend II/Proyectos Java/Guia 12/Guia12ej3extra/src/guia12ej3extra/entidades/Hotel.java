/**
 * Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
 * Pisos, Precio de Habitaciones. 
 */
package guia12ej3extra.entidades;


public class Hotel extends Alojamiento {

    protected int cantHabitaciones;
    protected int nroCamas;
    protected int cantPisos;
    protected double precioHabitaciones;

    public Hotel() {
    }

    public Hotel(int cantHabitaciones, int nroCamas, int cantPisos, String nombre, String direccion, String localidad, String encargado) {
        super(nombre, direccion, localidad, encargado);
        this.cantHabitaciones = cantHabitaciones;
        this.nroCamas = nroCamas;
        this.cantPisos = cantPisos;
        this.precioHabitaciones = this.precioHabitacion(cantHabitaciones);
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNroCamas() {
        return nroCamas;
    }

    public void setNroCamas(int nroCamas) {
        this.nroCamas = nroCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public double getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(double precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }
    
    public double precioHabitacion(int cant){
        return (double) 50 + cant;
    }

    @Override
    public String toString() {
        return super.toString() + " cantHabitaciones=" + cantHabitaciones + ", nroCamas=" + nroCamas + ", cantPisos=" + cantPisos + ", precioHabitaciones=" + precioHabitaciones;
    }
    
    
}
