
package guia12ej1.entidades;


public class Perro extends Animal {


    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println("Yo como " + super.getAlimento());
    }

}
