/**
 * clase: Armadura
 * color primario
 * color secundario
 * botas[]
 * guantes[]
 * consola
 * sintetizador
 * integridad
 * bateria
 * reactor
 * ubicacion
 *
 *
 */
package guia13integrador.entidades;

public class Armadura {

    String colorPrimario, colorSecundario;
    float salud;
    Bota botas[];
    Guante guantes[];
    Casco casco;
    Pechera pechera;
    Pantalon pantalon;

    public Armadura() {
        this.colorPrimario = "Rojo";
        this.colorSecundario = "Amarillo";
        this.salud = 100;
        this.botas = new Bota[2];
        this.guantes = new Guante[2];
        this.casco = new Casco();
        this.pechera = new Pechera();
        this.pantalon = new Pantalon();
        crearBotas();
        crearGuantes();
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public float getSalud() {
        return salud;
    }

    public void setSalud(float salud) {
        this.salud = salud;
    }

    public Bota[] getBotas() {
        return botas;
    }

    public void setBotas(Bota[] botas) {
        this.botas = botas;
    }

    public Guante[] getGuantes() {
        return guantes;
    }

    public void setGuantes(Guante[] guantes) {
        this.guantes = guantes;
    }

    public Casco getCasco() {
        return casco;
    }

    public void setCasco(Casco casco) {
        this.casco = casco;
    }

    public Pechera getPechera() {
        return pechera;
    }

    public void setPechera(Pechera pechera) {
        this.pechera = pechera;
    }

    public Pantalon getPantalon() {
        return pantalon;
    }

    public void setPantalon(Pantalon pantalon) {
        this.pantalon = pantalon;
    }

    public void crearBotas(){
        this.botas[0] = new Bota();
        this.botas[1] = new Bota();
    }
    public void crearGuantes(){
        this.guantes[0] = new Guante();
        this.guantes[1] = new Guante();
    }

    @Override
    public String toString() {
        return "Armadura{" + "colorPrimario=" + colorPrimario + ", colorSecundario=" + colorSecundario + ", salud=" + salud + ", botas=" + botas + ", guantes=" + guantes + ", casco=" + casco + ", pechera=" + pechera + ", pantalon=" + pantalon + '}';
    }
    
    
    
}
//40% Casco + 10%cada uno  (generador no)
