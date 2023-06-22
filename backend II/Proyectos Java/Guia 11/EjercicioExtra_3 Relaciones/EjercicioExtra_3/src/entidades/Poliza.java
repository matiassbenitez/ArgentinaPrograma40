package entidades;

import enumeraciones.TipoCobertura;
import java.util.ArrayList;
import java.util.Date;

public class Poliza {
    private Date fechaInicio,fechaFin;
    private Integer numeroPoliza, cantidadCuotas;
    private String formaPago;
    private Double montoTotalAsegurado, montoMaximoGranizo;
    private Boolean incluyeGranizo;
    private TipoCobertura tipoCobertura;
    private Vehiculo vehiculo;
    private Cliente cliente;
    private ArrayList<Cuota> cuotas;

    public Poliza() {
    }

    public Poliza(Date fechaInicio, Date fechaFin, Integer numeroPoliza, Integer cantidadCuotas, String formaPago, Double montoTotalAsegurado, Double montoMaximoGranizo, Boolean incluyeGranizo, TipoCobertura tipoCobertura, Vehiculo vehiculo, Cliente cliente, ArrayList<Cuota> cuotas) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.numeroPoliza = numeroPoliza;
        this.cantidadCuotas = cantidadCuotas;
        this.formaPago = formaPago;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.montoMaximoGranizo = montoMaximoGranizo;
        this.incluyeGranizo = incluyeGranizo;
        this.tipoCobertura = tipoCobertura;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.cuotas = cuotas;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(Integer numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public Integer getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(Integer cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Double getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(Double montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public Double getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public void setMontoMaximoGranizo(Double montoMaximoGranizo) {
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public Boolean getIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(Boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public TipoCobertura getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(TipoCobertura tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Cuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(ArrayList<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

    @Override
    public String toString() {
        return "Poliza{" + "fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", numeroPoliza=" + numeroPoliza + ", cantidadCuotas=" + cantidadCuotas + ", formaPago=" + formaPago + ", montoTotalAsegurado=" + montoTotalAsegurado + ", montoMaximoGranizo=" + montoMaximoGranizo + ", incluyeGranizo=" + incluyeGranizo + ", tipoCobertura=" + tipoCobertura + ", vehiculo=" + vehiculo + ", cliente=" + cliente + ", cuotas=" + cuotas + '}';
    }
    
    
    
}
