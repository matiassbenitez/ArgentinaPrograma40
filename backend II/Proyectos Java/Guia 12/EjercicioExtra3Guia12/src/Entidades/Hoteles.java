package Entidades;


import Entidades.Alojamiento;

/**
 *
 * @author ALEXIS.R.L
 */
public class Hoteles extends Alojamiento{
    protected int cantidadDeHabitaciones, numeroDeCamas, cantidadDePisos;
    protected double precioDeHabitacion;

    public Hoteles(int cantidadDeHabitaciones, int numeroDeCamas, int cantidadDePisos, String nombre, String direccion, String encargado, String localidad) {
        super(nombre, direccion, encargado, localidad);
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
        this.numeroDeCamas = numeroDeCamas;
        this.cantidadDePisos = cantidadDePisos;
        this.precioDeHabitacion = 50;
        this.calcularPrecioHabitacion();
        
    }

    public int getCantidadDeHabitaciones() {
        return cantidadDeHabitaciones;
    }

    public void setCantidadDeHabitaciones(int cantidadDeHabitaciones) {
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
    }

    public int getNumeroDeCamas() {
        return numeroDeCamas;
    }

    public void setNumeroDeCamas(int numeroDeCamas) {
        this.numeroDeCamas = numeroDeCamas;
    }

    public int getCantidadDePisos() {
        return cantidadDePisos;
    }

    public void setCantidadDePisos(int cantidadDePisos) {
        this.cantidadDePisos = cantidadDePisos;
    }

    public double getPrecioDeHabitacion() {
        return precioDeHabitacion;
    }

    public void setPrecioDeHabitacion(double precioDeHabitacion) {
        this.precioDeHabitacion = precioDeHabitacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Hoteles{" + "cantidadDeHabitaciones=" + cantidadDeHabitaciones + ", numeroDeCamas=" + numeroDeCamas + ", cantidadDePisos=" + cantidadDePisos + ", precioDeHabitacion=" + precioDeHabitacion + '}';
    }
    
    public void calcularPrecioHabitacion() {
        
            this.precioDeHabitacion+=this.cantidadDeHabitaciones*this.numeroDeCamas*this.cantidadDePisos;
        
    }
}
