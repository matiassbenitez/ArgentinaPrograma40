/**
 * Para las residencias se
 * indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
 * campo deportivo.
 */
package guia12ej3extra.entidades;

public class Residencia extends Extrahoteleros {

    private int cantHabitaciones;
    private boolean descuentosGremios;
    private boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(int cantHabitaciones, boolean descuentosGremios, boolean campoDeportivo, boolean privado, int metrosCuadrados, String nombre, String direccion, String localidad, String encargado) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, encargado);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentosGremios = descuentosGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuentosGremios() {
        return descuentosGremios;
    }

    public void setDescuentosGremios(boolean descuentosGremios) {
        this.descuentosGremios = descuentosGremios;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return super.toString() + "Residencia: " + "cantHabitaciones=" + cantHabitaciones + ", descuentosGremios=" + descuentosGremios + ", campoDeportivo=" + campoDeportivo;
    }
    
    
}
