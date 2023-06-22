package Entidades;

/**
 *
 * @author ALEXIS.R.L
 */
public class HotelDe4Estrellas extends Hoteles {

    protected char GYM;
    protected String nombreDeResto;
    protected int capacidad;

    public HotelDe4Estrellas(char GYM, String nombreDeResto, int capacidad, int cantidadDeHabitaciones, int numeroDeCamas, int cantidadDePisos, String nombre, String direccion, String encargado, String localidad) {
        super(cantidadDeHabitaciones, numeroDeCamas, cantidadDePisos, nombre, direccion, encargado, localidad);
        this.GYM = GYM;
        this.nombreDeResto = nombreDeResto;
        this.capacidad = capacidad;
        this.calcularPrecioHabitacion();
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
        return "HotelDe4Estrellas{" + "GYM=" + GYM + ", nombreDeResto=" + nombreDeResto + ", capacidad=" + capacidad + '}';
    }

    public void calcularPrecioHabitacion() {

        if (this.GYM == 'A') {
            this.precioDeHabitacion += 50;

        }else if(this.GYM=='B'){
            this.precioDeHabitacion += 30;
        }
        //calculando la capacidad del restourante
        
        if (this.capacidad<30) {
            this.precioDeHabitacion+=10;
        }else if(this.capacidad<=50){
            this.precioDeHabitacion+=30;
        }else{
            this.precioDeHabitacion+=50;
        }
    }

}
