
package arboles.entidades;


public class ArbolBinario {
    private int valor;
    private ArbolBinario arbolIzq;
    private ArbolBinario arbolDer;

    public ArbolBinario() {
    }

    public ArbolBinario(int valor, ArbolBinario arbolIzq, ArbolBinario arbolDer) {
        this.valor = valor;
        this.arbolIzq = arbolIzq;
        this.arbolDer = arbolDer;
    }
    
    
}
