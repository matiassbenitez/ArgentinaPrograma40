
package guia13integrador.entidades;


public class Guante {
    boolean daniado;
    float consumo;

    public Guante() {
        this.daniado = false;
        this.consumo =1;
    }

    public boolean isDaniado() {
        return daniado;
    }

    public void setDaniado(boolean daniado) {
        this.daniado = daniado;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }
    
    
    
    
}
