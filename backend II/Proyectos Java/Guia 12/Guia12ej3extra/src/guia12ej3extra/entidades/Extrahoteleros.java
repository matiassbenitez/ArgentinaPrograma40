/**
 *  * Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
 * cuadrados que ocupa.
 */
package guia12ej3extra.entidades;


public class Extrahoteleros extends Alojamiento {

    protected boolean privado;
    protected int metrosCuadrados;

    public Extrahoteleros() {
    }

    public Extrahoteleros(boolean privado, int metrosCuadrados, String nombre, String direccion, String localidad, String encargado) {
        super(nombre, direccion, localidad, encargado);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        return super.toString() + "privado=" + privado + ", metrosCuadrados=" + metrosCuadrados + '}';
    }
    
    
    
}
