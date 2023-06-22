package Entidades;

/**
 *
 * @author ALEXIS.R.L
 */
public class AlojamientoExtraHoteleros extends Alojamiento {
    
    protected boolean privado;
    protected double m2;

    public AlojamientoExtraHoteleros(boolean privado, double m2) {
        this.privado = privado;
        this.m2 = m2;
    }

    public AlojamientoExtraHoteleros(boolean privado, double m2, String nombre, String direccion, String encargado, String localidad) {
        super(nombre, direccion, encargado, localidad);
        this.privado = privado;
        this.m2 = m2;
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
        return "AlojamientoExtraHoteleros{" + "privado=" + privado + ", m2=" + m2 + '}';
    }

    
}
