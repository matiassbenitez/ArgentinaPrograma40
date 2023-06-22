package guia13integrador.entidades;

public class Pechera {

    private Generador generador;
    private boolean daniado;

    public Pechera() {
        this.generador = new Generador();
        this.daniado = false;
    }

    public Generador getGenerador() {
        return generador;
    }

    public void setGenerador(Generador generador) {
        this.generador = generador;
    }

    public boolean isDaniado() {
        return daniado;
    }

    public void setDaniado(boolean daniado) {
        this.daniado = daniado;
    }
    
    
    
}
