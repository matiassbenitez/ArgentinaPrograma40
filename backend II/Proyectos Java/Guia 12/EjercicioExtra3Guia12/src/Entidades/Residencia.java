package Entidades;

/**
 *
 * @author ALEXIS.R.L
 */
public class Residencia extends AlojamientoExtraHoteleros{
    
    private int cantidadDeHabitaciones;
    private boolean descuentosGramios, campoDeportivo;

    public Residencia(int cantidadDeHabitaciones, boolean descuentosGramios, boolean campoDeportivo, boolean privado, double m2) {
        super(privado, m2);
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
        this.descuentosGramios = descuentosGramios;
        this.campoDeportivo = campoDeportivo;
    }

    public Residencia(int cantidadDeHabitaciones, boolean descuentosGramios, boolean campoDeportivo, boolean privado, double m2, String nombre, String direccion, String encargado, String localidad) {
        super(privado, m2, nombre, direccion, encargado, localidad);
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
        this.descuentosGramios = descuentosGramios;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantidadDeHabitaciones() {
        return cantidadDeHabitaciones;
    }

    public void setCantidadDeHabitaciones(int cantidadDeHabitaciones) {
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
    }

    public boolean isDescuentosGramios() {
        return descuentosGramios;
    }

    public void setDescuentosGramios(boolean descuentosGramios) {
        this.descuentosGramios = descuentosGramios;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getM2() {
        return m2;
    }

    public void setM2(double m2) {
        this.m2 = m2;
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
        return "Residencia{" + "cantidadDeHabitaciones=" + cantidadDeHabitaciones + ", descuentosGramios=" + descuentosGramios + ", campoDeportivo=" + campoDeportivo + '}';
    }
    
    
    
}
