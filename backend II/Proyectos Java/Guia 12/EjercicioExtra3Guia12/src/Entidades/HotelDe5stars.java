package Entidades;

/**
 *
 * @author ALEXIS.R.L
 */
public class HotelDe5stars extends HotelDe4Estrellas {
    private int cantidadDeSalonesDeConferencias, cantidadDeSuits, cantidadDeLimusinas;

    public HotelDe5stars(int cantidadDeSalonesDeConferencias, int cantidadDeSuits, int cantidadDeLimusinas, char GYM, String nombreDeResto, int capacidad, int cantidadDeHabitaciones, int numeroDeCamas, int cantidadDePisos, String nombre, String direccion, String encargado, String localidad) {
        super(GYM, nombreDeResto, capacidad, cantidadDeHabitaciones, numeroDeCamas, cantidadDePisos, nombre, direccion, encargado, localidad);
        this.cantidadDeSalonesDeConferencias = cantidadDeSalonesDeConferencias;
        this.cantidadDeSuits = cantidadDeSuits;
        this.cantidadDeLimusinas = cantidadDeLimusinas;
        this.calcularPrecioHabitacion();
    }

    public int getCantidadDeSalonesDeConferencias() {
        return cantidadDeSalonesDeConferencias;
    }

    public void setCantidadDeSalonesDeConferencias(int cantidadDeSalonesDeConferencias) {
        this.cantidadDeSalonesDeConferencias = cantidadDeSalonesDeConferencias;
    }

    public int getCantidadDeSuits() {
        return cantidadDeSuits;
    }

    public void setCantidadDeSuits(int cantidadDeSuits) {
        this.cantidadDeSuits = cantidadDeSuits;
    }

    public int getCantidadDeLimusinas() {
        return cantidadDeLimusinas;
    }

    public void setCantidadDeLimusinas(int cantidadDeLimusinas) {
        this.cantidadDeLimusinas = cantidadDeLimusinas;
    }

    public char getGYM() {
        return GYM;
    }

    public void setGYM(char GYM) {
        this.GYM = GYM;
    }

    public String getNombreDeResto() {
        return nombreDeResto;
    }

    public void setNombreDeResto(String nombreDeResto) {
        this.nombreDeResto = nombreDeResto;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
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
        return "HotelDe5stars{" + "cantidadDeSalonesDeConferencias=" + cantidadDeSalonesDeConferencias + ", cantidadDeSuits=" + cantidadDeSuits + ", cantidadDeLimusinas=" + cantidadDeLimusinas + '}';
    }
    
    public void calcularPrecioHabitacion() {

        this.precioDeHabitacion+=this.cantidadDeLimusinas*15;
        
    }
}
