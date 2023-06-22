package entidades;

import enumeraciones.ColorVehiculo;
import enumeraciones.MarcaAuto;
import enumeraciones.TipoVehiculo;

public class Vehiculo {

    private MarcaAuto Marca;
    private String modelo;
    private Integer year;
    private String numeroMotor, chasis;
    private ColorVehiculo color;
    private TipoVehiculo tipo;

    public Vehiculo() {
    }

    public Vehiculo(MarcaAuto Marca, Integer year, String numeroMotor, String chasis, ColorVehiculo color, TipoVehiculo tipo, String modelo) {
        this.Marca = Marca;
        this.year = year;
        this.numeroMotor = numeroMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
        this.modelo = modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public MarcaAuto getMarca() {
        return Marca;
    }

    public void setMarca(MarcaAuto Marca) {
        this.Marca = Marca;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(String numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public ColorVehiculo getColor() {
        return color;
    }

    public void setColor(ColorVehiculo color) {
        this.color = color;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return  "-"+Marca +" "+ modelo + "\n\t\t año: " + year + ",\n\t\t numeroMotor: " + numeroMotor + ",\n\t\t chasis: " + chasis + ",\n\t\t color: " + color + ",\n\t\t tipo: " + tipo+"\n\t\t";
    }

    

}
