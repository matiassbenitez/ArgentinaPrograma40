/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11extras3.entidades;

/**
 *
 * Se registrará una póliza, donde se guardará los datos tanto de un 
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de 
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total 
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra 
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las 
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de 
muchos a uno o de muchos a muchos. 
 */
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
