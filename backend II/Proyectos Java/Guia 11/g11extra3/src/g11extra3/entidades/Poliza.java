
package g11extra3.entidades;

public class Poliza {
    private int poliza;
    private int fechaInicio;
    private int fechaFin;
    private int cantidadCuotas;
    private String formaPago;
    private int montoTotalAsegurado;
    private boolean granizoPoN;
    private int montoMaxGranizo;
    private String tipoCobertura;

    public Poliza() {
        
    }

    public Poliza(int poliza, int fechaInicio, int fechaFin, int cantidadCuotas, String formaPago, int montoTotalAsegurado, boolean granizoPoN, int montoMaxGranizo, String tipoCobertura) {
        this.poliza = poliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantidadCuotas = cantidadCuotas;
        this.formaPago = formaPago;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.granizoPoN = granizoPoN;
        this.montoMaxGranizo = montoMaxGranizo;
        this.tipoCobertura = tipoCobertura;
    }

    

    public int getPoliza() {
        return poliza;
    }

    public void setPoliza(int poliza) {
        this.poliza = poliza;
    }

    public int getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(int fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(int fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public boolean isGranizoPoN() {
        return granizoPoN;
    }

    public void setGranizoPoN(boolean granizoPoN) {
        this.granizoPoN = granizoPoN;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public int getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(int montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public int getMontoMaxGranizo() {
        return montoMaxGranizo;
    }

    public void setMontoMaxGranizo(int montoMaxGranizo) {
        this.montoMaxGranizo = montoMaxGranizo;
    }

    @Override
    public String toString() {
        return "Poliza{" + "poliza=" + poliza + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", cantidadCuotas=" + cantidadCuotas + ", formaPago=" + formaPago + ", montoTotalAsegurado=" + montoTotalAsegurado + ", granizoPoN=" + granizoPoN + ", montoMaxGranizo=" + montoMaxGranizo + ", tipoCobertura=" + tipoCobertura + '}';
    }

    
    
    
    
}
