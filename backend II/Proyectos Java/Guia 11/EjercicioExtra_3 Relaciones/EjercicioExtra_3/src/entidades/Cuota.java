package entidades;

import enumeraciones.MetodoDePago;
import java.util.Date;

public class Cuota {
    private Integer numeroCuota;
    private Double monto;
    private Boolean pagado;
    private Date vencimiento;
    private MetodoDePago metodoPago;

    public Cuota() {
    }

    public Cuota(Integer numeroCuota, Double monto, Boolean pagado, Date vencimiento, MetodoDePago metodoPago) {
        this.numeroCuota = numeroCuota;
        this.monto = monto;
        this.pagado = pagado;
        this.vencimiento = vencimiento;
        this.metodoPago = metodoPago;
    }

    public Integer getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(Integer numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Boolean getPagado() {
        return pagado;
    }

    public void setPagado(Boolean pagado) {
        this.pagado = pagado;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public MetodoDePago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoDePago metodoPago) {
        this.metodoPago = metodoPago;
    }

    @Override
    public String toString() {
        return "Cuota{" + "numeroCuota=" + numeroCuota + ", monto=" + monto + ", pagado=" + pagado + ", vencimiento=" + vencimiento + ", metodoPago=" + metodoPago + '}';
    }
    
    
    
}
