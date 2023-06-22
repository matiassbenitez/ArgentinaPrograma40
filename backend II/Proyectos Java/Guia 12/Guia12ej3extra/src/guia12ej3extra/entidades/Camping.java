
package guia12ej3extra.entidades;


public class Camping extends Extrahoteleros {

    private int capacidadMaximaCarpas;
    private int cantBanios;
    private boolean restaurante;

    public Camping() {
    }

    public Camping(int capacidadMaximaCarpas, int cantBanios, boolean restaurante) {
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
        this.cantBanios = cantBanios;
        this.restaurante = restaurante;
    }

    public Camping(int capacidadMaximaCarpas, int cantBanios, boolean restaurante, boolean privado, int metrosCuadrados, String nombre, String direccion, String localidad, String encargado) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, encargado);
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
        this.cantBanios = cantBanios;
        this.restaurante = restaurante;
    }

    public int getCapacidadMaximaCarpas() {
        return capacidadMaximaCarpas;
    }

    public void setCapacidadMaximaCarpas(int capacidadMaximaCarpas) {
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(int cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return super.toString() + " Camping: " + "capacidadMaximaCarpas=" + capacidadMaximaCarpas + ", cantBanios=" + cantBanios + ", restaurante=" + restaurante;
    }
    
    
    
}
