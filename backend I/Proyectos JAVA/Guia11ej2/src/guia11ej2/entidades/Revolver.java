
package guia11ej2.entidades;


public class Revolver {
    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual:" + posicionActual + ", posicionAgua:" + posicionAgua + '}';
    }
    
    public void llenarRevolver(){
        posicionActual = (int)(Math.random()*6)+1;
        posicionAgua = (int)(Math.random()*6)+1;
    }
    
    public boolean mojar(){
        boolean mojado = false;
        if (posicionActual == posicionAgua){
            mojado = true;
        }
        return mojado;
    }
    
    public void siguienteChorro(){
        if (posicionActual == 6){
            posicionActual = 1;
        }else{
            posicionActual++;
        }
    }
}
