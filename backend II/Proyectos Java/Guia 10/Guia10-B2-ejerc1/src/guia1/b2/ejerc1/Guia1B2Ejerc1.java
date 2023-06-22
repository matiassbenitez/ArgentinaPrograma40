/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1.b2.ejerc1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author juan
 */
public class Guia1B2Ejerc1 {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        /**
         * Continuando el ejercicio anterior, después de mostrar los perros, al
         * usuario se le pedirá un perro y se recorrerá la lista con un
         * Iterator, se buscará el perro en la lista. Si el perro está en la
         * lista, se eliminará el perro que ingresó el usuario y se mostrará la
         * lista ordenada. Si el perro no se encuentra en la lista, se le
         * informará al usuario y se mostrará la lista ordenada.
         */
        ArrayList<String> perro = new ArrayList();
        String resp = "";
        String buscado;
        while (!resp.equalsIgnoreCase("s")) {
            System.out.println("Ingrese raza de perros: ");
            perro.add(entrada.next());
            System.out.println("Desea salir del menú? SI || NO ");
            /*
            Nhola
            */
            resp = entrada.next().substring(0, 1);
        }
        for (String string : perro) {
            System.out.println(string);
        }
       
        boolean bandera = false;
        System.out.println("Ingrese raza de perro a buscar: ");
        buscado = entrada.next();
        Iterator <String> iterador = perro.iterator();
        while (iterador.hasNext()) {
            if (iterador.next().equals(buscado)) {
                iterador.remove();
                bandera = true;
            }
        }
        if (bandera) {
            System.out.println("Se encontró el perro y se elimó");
        }else{
            System.out.println("No se encontro el perro");
        }
        Collections.sort(perro);
        for (String string : perro) {
            System.out.println(string);
        }
    }

}
