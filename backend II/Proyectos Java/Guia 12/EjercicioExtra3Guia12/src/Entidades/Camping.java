package Entidades;

/**
 *
 * @author ALEXIS.R.L
 */
public class Camping extends AlojamientoExtraHoteleros{
    
    private int capacidadMaxCarpas, cantidadBañosDisponibles;
    private boolean restourant;

    public Camping(int capacidadMaxCarpas, int cantidadBañosDisponibles, boolean restourant, boolean privado, double m2) {
        super(privado, m2);
        this.capacidadMaxCarpas = capacidadMaxCarpas;
        this.cantidadBañosDisponibles = cantidadBañosDisponibles;
        this.restourant = restourant;
    }

    public Camping(int capacidadMaxCarpas, int cantidadBañosDisponibles, boolean restourant, boolean privado, double m2, String nombre, String direccion, String encargado, String localidad) {
        super(privado, m2, nombre, direccion, encargado, localidad);
        this.capacidadMaxCarpas = capacidadMaxCarpas;
        this.cantidadBañosDisponibles = cantidadBañosDisponibles;
        this.restourant = restourant;
    }

    public int getCapacidadMaxCarpas() {
        return capacidadMaxCarpas;
    }

    public void setCapacidadMaxCarpas(int capacidadMaxCarpas) {
        this.capacidadMaxCarpas = capacidadMaxCarpas;
    }

    public int getCantidadBañosDisponibles() {
        return cantidadBañosDisponibles;
    }

    public void setCantidadBañosDisponibles(int cantidadBañosDisponibles) {
        this.cantidadBañosDisponibles = cantidadBañosDisponibles;
    }

    public boolean isRestourant() {
        return restourant;
    }

    public void setRestourant(boolean restourant) {
        this.restourant = restourant;
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
        return "Camping{" + "capacidadMaxCarpas=" + capacidadMaxCarpas + ", cantidadBa\u00f1osDisponibles=" + cantidadBañosDisponibles + ", restourant=" + restourant + '}';
    }
    
    
    
}
