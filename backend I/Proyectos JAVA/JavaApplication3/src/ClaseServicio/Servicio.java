/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseServicio;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author Yuan
 */
public class Servicio {

    static Scanner entrada = new Scanner(System.in).useDelimiter("\n");

    /*
   Método getDiscriminante(): devuelve el valor del discriminante (double).
   El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
     */
    public Raices crearObjeto() {
        System.out.println("Ingrese a: ");
        int a = entrada.nextInt();
        System.out.println("Ingrese b: ");
        int b = entrada.nextInt();
        System.out.println("Ingrese c: ");
        int c = entrada.nextInt();
        return new Raices(a,b,c);
    }

    public double Discriminante(Raices obj) {
        return ((Math.pow(obj.getB(), 2)) - 4 * obj.getA() * obj.getC());
    }

    /*
  Método tieneRaices(): devuelve un booleano indicando si tiene
  dos soluciones, para que esto ocurra, el discriminante debe ser
  mayor o igual que 0.
     */
    public boolean tieneRaices(Raices obj) {
        if (this.Discriminante(obj) > 0) {
            return true;
        } else {
            return false;
        }
    }

    /*
  Método tieneRaiz(): devuelve un booleano indicando
  si tiene una única solución, para que esto ocurra,
  el discriminante debe ser igual que 0.
     */
    public boolean tieneRaiz(Raices obj) {
        boolean tiene;

        tiene = this.Discriminante(obj) == 0;

        return tiene;
    }

    /*
  Método obtenerRaices(): llama a tieneRaices() y si devolvió́
  true, imprime las 2 posibles soluciones.
     */
    public void obtenerRaices(Raices obj) {
        double raiz1;
        double raiz2;
        /*
      (-b±√((b^2)-(4*a*c)))/(2*a)
         */
        if (this.tieneRaices(obj)) {
            raiz1 = (-obj.getB() + Math.sqrt(this.Discriminante(obj))) / (2 * obj.getA());
            raiz2 = (-obj.getB() - Math.sqrt(this.Discriminante(obj))) / (2 * obj.getA());
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        }
    }

    /*
  Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true
  imprime una única raíz. Es en el caso en que se tenga una única
  solución posible.
     */
    public void obtenerRaiz(Raices obj) {
        double raiz;
        if (this.tieneRaiz(obj)) {
            raiz = ((-obj.getB()) + (Math.sqrt(this.Discriminante(obj))) / (2 * obj.getA()));
            System.out.println("Raiz: " + raiz);
        }
    }

    /*
  Método calcular(): esté método llamará tieneRaices()
  y a tieneRaíz(), y mostrará por pantalla las posibles
  soluciones que tiene nuestra ecuación con los métodos 
  obtenerRaices() o obtenerRaiz(), según lo que devuelvan
  nuestros métodos y en caso de no existir solución, se mostrara
  un mensaje.
     */
    public void calcular(Raices obj) {
        if (this.tieneRaices(obj)) {
            this.obtenerRaices(obj);
        } else if (this.tieneRaiz(obj)) {
            this.obtenerRaiz(obj);
        } else {
            System.out.println("No tiene raiz");
        }
    }
}
