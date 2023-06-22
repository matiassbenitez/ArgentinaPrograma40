/**
 * * • Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
 * Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
 * Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
 */
package guia12ej3extra.entidades;

public class Hotel5E extends Hotel4E {

    private int cantSalonesConferencias;
    private int cantSuites;
    private int cantLimosinas;

    public Hotel5E() {
    }

    public Hotel5E(int cantSalonesConferencias, int cantSuites, int cantLimusinas, char gimnasio, String nombreRest, int capacidadRest, int cantHabitaciones, int nroCamas, int cantPisos, String nombre, String direccion, String localidad, String encargado) {
        super(gimnasio, nombreRest, capacidadRest, cantHabitaciones, nroCamas, cantPisos, nombre, direccion, localidad, encargado);
        this.cantSalonesConferencias = cantSalonesConferencias;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimusinas;
        this.precioHabitaciones = this.precioHabitacion(cantLimusinas);
    }

    public int getCantSalonesConferencias() {
        return cantSalonesConferencias;
    }

    public void setCantSalonesConferencias(int cantSalonesConferencias) {
        this.cantSalonesConferencias = cantSalonesConferencias;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimusinas() {
        return cantLimosinas;
    }

    public void setCantLimusinas(int cantLimusinas) {
        this.cantLimosinas = cantLimusinas;
    }


    @Override
    public double precioHabitacion(int cant){
        double precio = super.precioHabitacion(this.capacidadRest,this.gimnasio);
        precio += cant*15;
        return precio;
    }
    
    @Override
    public String toString() {
        return super.toString() + " " + "cantSalonesConferencias=" + cantSalonesConferencias + ", cantSuites=" + cantSuites + ", cantLimusinas=" + cantLimosinas;
    }
    
}
