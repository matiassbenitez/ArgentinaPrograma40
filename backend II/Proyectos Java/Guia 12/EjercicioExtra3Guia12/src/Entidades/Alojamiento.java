package Entidades;

/**
 *
 * @author ALEXIS.R.L
 */
public class Alojamiento {

    protected String nombre, direccion, encargado, localidad;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String encargado, String localidad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.encargado = encargado;
        this.localidad = localidad;
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
        return "Alojamiento{" + "nombre=" + nombre + ", direccion=" + direccion + ", encargado=" + encargado + ", localidad=" + localidad + '}';
    }

}
