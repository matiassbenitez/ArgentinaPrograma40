package g11extra3.entidades;

public class GestionDePolizas {
    private GestionIntegralClientes cliente;
    private GestionDeVehiculos vehiculo;
    private GestionDeCuotas cuota;
    private Poliza poli;
    public GestionDePolizas() {
    }

    public GestionDePolizas(GestionIntegralClientes cliente, GestionDeVehiculos vehiculo, GestionDeCuotas cuota) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.cuota = cuota;
    }

    public GestionIntegralClientes getCliente() {
        return cliente;
    }

    public void setCliente(GestionIntegralClientes cliente) {
        this.cliente = cliente;
    }

    public GestionDeVehiculos getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(GestionDeVehiculos vehiculo) {
        this.vehiculo = vehiculo;
    }

    public GestionDeCuotas getCuota() {
        return cuota;
    }

    public void setCuota(GestionDeCuotas cuota) {
        this.cuota = cuota;
    }
    
    
}
