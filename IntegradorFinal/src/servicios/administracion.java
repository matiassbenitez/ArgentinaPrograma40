/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Estudiantes;
import java.util.Arrays;
import java.util.Scanner;

public class administracion {

    public Estudiantes[] Cargar() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Estudiantes[] alumne = new Estudiantes[8];
        String nombre;
        Double nota;

        for (int i = 0; i < alumne.length; i++) {
            System.out.println("Escriba el nombre del alumne");
            nombre = leer.next();
            System.out.println("Escriba su nota final");
            nota = leer.nextDouble();
            alumne[i] = new Estudiantes(nombre, nota);
        }
        System.out.println(Arrays.toString(alumne));
        return alumne;
    }

    public Double Calcular(Estudiantes[] alumne) {
        Double promedio = 0.0;
        for (int i = 0; i < alumne.length; i++) {
            promedio = promedio + alumne[i].getNota();
        }
        promedio = promedio / 8;
        System.out.println("El promedio gral. fue de: " + promedio);
        return promedio;

    }

    /* Retornar otro arreglo con los nombre de los alumnos que recibieron una
       nota mayor al promedio del curso*/
    public String[] AlumnesMayorNota(Estudiantes[] alumne, Double promedio) {
        int tamanoVector = 0;
        for (int i = 0; i < alumne.length; i++) {
            if (alumne[i].getNota() > promedio) {
                tamanoVector++;
            }
        }
        String[] notasSuperiores = new String[tamanoVector];
        int cont = 0;
        for (int i = 0; i < alumne.length; i++) {
            if (alumne[i].getNota() > promedio) {
                notasSuperiores[cont] = alumne[i].getNombre();
                cont++;
            }
        }
        System.out.println(Arrays.toString(notasSuperiores));
        return notasSuperiores;
    }

    public void Mostrar(String[] notasSuperiores) {
        System.out.println("Alumnos que superan el promedio son");
        for (String i : notasSuperiores) {
            System.out.println("*" + i);
            System.out.println("____________________________________________");
        }
    }
}
