
package guia12teoria1.entidades;


public class Perro extends Animal {

    private int patas;

    public Perro(int patas) {
        this.patas = patas;
    }
    
    
    @Override
    public void hacerRuido(){
        System.out.println("Guau!");
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
    
}
