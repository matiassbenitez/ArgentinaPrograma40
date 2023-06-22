/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11extras3.entidades;

/**
 *
 * Se registrarán y podrán consultar las cuotas generadas en cada póliza. 
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la 
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia, 
etc.).
 */
public class GestionDeCuotas {
    private int nCuota;
    private int montoTotalCuota;
    private boolean pagada;
    private int fechaVencimiento;
    private String formaDePago;

    public GestionDeCuotas() {
    }

    public GestionDeCuotas(int nCuota, int montoTotalCuota, boolean pagada, int fechaVencimiento, String formaDePago) {
        this.nCuota = nCuota;
        this.montoTotalCuota = montoTotalCuota;
        this.pagada = pagada;
        this.fechaVencimiento = fechaVencimiento;
        this.formaDePago = formaDePago;
    }

    public int getnCuota() {
        return nCuota;
    }

    public void setnCuota(int nCuota) {
        this.nCuota = nCuota;
    }

    public int getMontoTotalCuota() {
        return montoTotalCuota;
    }

    public void setMontoTotalCuota(int montoTotalCuota) {
        this.montoTotalCuota = montoTotalCuota;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public int getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(int fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    @Override
    public String toString() {
        return "GestionDeCuotas{" + "nCuota=" + nCuota + ", montoTotalCuota=" + montoTotalCuota + ", pagada=" + pagada + ", fechaVencimiento=" + fechaVencimiento + ", formaDePago=" + formaDePago + '}';
    }

    
    
    
}
