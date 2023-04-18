
package colecciones2.entidades;

import java.util.ArrayList;


public class Alumno {
private String nombre;
    ArrayList <Integer> notas;

    public Alumno(String nombre,int n1,int n2,int n3) {
        this.nombre = nombre;
        notas = new ArrayList();
        notas.add(n1);
        notas.add(n2);
        notas.add(n3);
    }

    public String getNombre() {
        return nombre;
    }
    

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }
   public double notaFinal(){
       double calculo = 0;
       for (Integer nota : notas) {
           calculo +=nota;
       }
    return calculo / 3;
}
}