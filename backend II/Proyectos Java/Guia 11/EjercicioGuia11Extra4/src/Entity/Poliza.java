/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Enum.Vehiculo;
import java.util.ArrayList;

/**Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
muchos a uno o de muchos a muchos.
 *
 * @author godoy
 */
public class Poliza {
    private Vehiculo v;
    private gestionCliente gc;
    private int numeroPoliza, fechaInicio, fechaFinal, cantidadCuotas, montoTotalAsegurado, montoMaximoGranizo;
    private String formaPago;
    private boolean incluyeGranizo;
    private ArrayList <String> tipoCobertura;

    public Poliza(Vehiculo v, gestionCliente gc, int numeroPoliza, int fechaInicio, int fechaFinal, int cantidadCuotas, int montoTotalAsegurado, int montoMaximoGranizo, String formaPago, boolean incluyeGranizo, ArrayList tipoCobertura) {
        this.v = v;
        this.gc = gc;
        this.numeroPoliza = numeroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.cantidadCuotas = cantidadCuotas;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.montoMaximoGranizo = montoMaximoGranizo;
        this.formaPago = formaPago;
        this.incluyeGranizo = incluyeGranizo;
        this.tipoCobertura = tipoCobertura;
    }

    public Poliza() {
    }

    public Vehiculo getV() {
        return v;
    }

    public void setV(Vehiculo v) {
        this.v = v;
    }

    public gestionCliente getGc() {
        return gc;
    }

    public void setGc(gestionCliente gc) {
        this.gc = gc;
    }

    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public int getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(int fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(int fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public int getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(int montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public int getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public void setMontoMaximoGranizo(int montoMaximoGranizo) {
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public ArrayList getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(ArrayList tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }
    
    
    
    
}
