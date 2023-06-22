/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.).
 * @author godoy
 */
public class Cuotas {
    private Poliza p;
    private int numCuota, montoTotalCuota, fechaVencimiento;
    private boolean estaPagado;
    private String formaDePago;

    public Cuotas(Poliza p, int numCuota, int montoTotalCuota, int fechaVencimiento, boolean estaPagado, String formaDePago) {
        this.p = p;
        this.numCuota = numCuota;
        this.montoTotalCuota = montoTotalCuota;
        this.fechaVencimiento = fechaVencimiento;
        this.estaPagado = estaPagado;
        this.formaDePago = formaDePago;
    }

    public Cuotas() {
    }

    public Poliza getP() {
        return p;
    }

    public void setP(Poliza p) {
        this.p = p;
    }

    public int getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }

    public int getMontoTotalCuota() {
        return montoTotalCuota;
    }

    public void setMontoTotalCuota(int montoTotalCuota) {
        this.montoTotalCuota = montoTotalCuota;
    }

    public int getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(int fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public boolean isEstaPagado() {
        return estaPagado;
    }

    public void setEstaPagado(boolean estaPagado) {
        this.estaPagado = estaPagado;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    @Override
    public String toString() {
        return "Cuotas{" + "\npoliza : " + p + ", \nnumCuota :  " + numCuota + ", \nmontoTotalCuota: " + montoTotalCuota + ", \nfechaVencimiento: " + fechaVencimiento + ", \nestaPagado: " + estaPagado + ", \nformaDePago: " + formaDePago + '}';
    }
    
    
}
