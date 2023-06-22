
package guia13integrador.entidades;


public class Casco {
    protected boolean daniado;
    private Consola consola;
    private Sintetizador sintetizador;

    public Casco() {
        this.daniado = false;
        this.consola = new Consola();
        this.sintetizador = new Sintetizador();
    }

    public boolean isDaniado() {
        return daniado;
    }

    public void setDaniado(boolean daniado) {
        this.daniado = daniado;
    }

    public Consola getConsola() {
        return consola;
    }

    public void setConsola(Consola consola) {
        this.consola = consola;
    }

    public Sintetizador getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(Sintetizador sintetizador) {
        this.sintetizador = sintetizador;
    }

    @Override
    public String toString() {
        return "Casco{" + "daniado=" + daniado + ", consola=" + consola + ", sintetizador=" + sintetizador + '}';
    }
    
    
}

class Consola {
    protected String mensaje;
    protected float consumo;

    public Consola() {
        this.mensaje = "";
        this.consumo = 1;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return "Consola{" + "mensaje=" + mensaje + ", consumo=" + consumo + '}';
    }
    
    
    
}
class Sintetizador {
    protected float consumo;

    public Sintetizador() {
        this.consumo = 1;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return "Sintetizador{" + "consumo=" + consumo + '}';
    }
    
    
    
    
}
