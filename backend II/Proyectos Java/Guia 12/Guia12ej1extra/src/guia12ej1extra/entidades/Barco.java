/**
 * En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
package guia12ej1extra.entidades;


public class Barco {

    protected String matricula;
    protected int eslora;
    protected int anio;

    public Barco() {
    }

    public Barco(String matricula, int eslora, int anio) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anio = anio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public int calcularModulo(){
        return eslora*10;
    }
    
    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anio=" + anio + '}';
    }
    
    
}

class Velero extends Barco{
    private int cantMastiles;

    public Velero() {
    }

    public Velero(int cantMastiles, String matricula, int eslora, int anio) {
        super(matricula, eslora, anio);
        this.cantMastiles = cantMastiles;
    }

    public int getCantMastiles() {
        return cantMastiles;
    }

    public void setCantMastiles(int cantMastiles) {
        this.cantMastiles = cantMastiles;
    }

     public int calcularModulo(){
        return super.calcularModulo()+cantMastiles;
    }
    
    @Override
    public String toString() {
        super.toString();
        return "Velero{" + "cantMastiles=" + cantMastiles + '}';
    }
    
}
class BarcoAMotor extends Barco{
    protected int potenciaCV;

    public BarcoAMotor() {
    }

    public BarcoAMotor(int potenciaCV, String matricula, int eslora, int anio) {
        super(matricula, eslora, anio);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

     public int calcularModulo(){
        return super.calcularModulo()+potenciaCV;
    }
    
    @Override
    public String toString() {
        super.toString();
        return "BarcoAMotor{" + "potenciaCV=" + potenciaCV + '}';
    }
    
    
}
class YateDeLujo extends BarcoAMotor{
    private int nroCamarotes;

    public YateDeLujo() {
    }

    public YateDeLujo(int nroCamarotes, int potenciaCV, String matricula, int eslora, int anio) {
        super(potenciaCV, matricula, eslora, anio);
        this.nroCamarotes = nroCamarotes;
    }

    public int getNroCamarotes() {
        return nroCamarotes;
    }

    public void setNroCamarotes(int nroCamarotes) {
        this.nroCamarotes = nroCamarotes;
    }

     public int calcularModulo(){
        return super.calcularModulo()+nroCamarotes;
    }
    
    @Override
    public String toString() {

        return "YateDeLujo{" + "nroCamarotes=" + nroCamarotes + "matricula " + super.matricula + '}';
    }
    
    
}