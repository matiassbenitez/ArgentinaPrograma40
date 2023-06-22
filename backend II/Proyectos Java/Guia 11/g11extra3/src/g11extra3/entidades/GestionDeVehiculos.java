package g11extra3.entidades;




public class GestionDeVehiculos {
    private String marca;
    private String modelo;
    private int anio;
    private int nMotor;
    private String chasis;
    private String color;
    private String tipo;

    public GestionDeVehiculos() {
    }

    public GestionDeVehiculos(String marca, String modelo, int anio, int nMotor, String chasis, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.nMotor = nMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getnMotor() {
        return nMotor;
    }

    public void setnMotor(int nMotor) {
        this.nMotor = nMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "GestionDeVehiculos{" + "marca=" + marca + ", modelo=" + modelo + ", a\u00f1o=" + anio + ", nMotor=" + nMotor + ", chasis=" + chasis + ", color=" + color + ", tipo=" + tipo + '}';
    }
    
    
    
}
