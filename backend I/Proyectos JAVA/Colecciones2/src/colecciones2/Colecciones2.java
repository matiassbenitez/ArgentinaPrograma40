package colecciones2;

import colecciones2.entidades.Alumno;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecciones2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Alumno> Alumnos = new ArrayList();
        Alumno a1;
        int n1, n2, n3;
        String nombre, resp;
        do {
            System.out.println("Ingrese nombre: ");
            nombre = leer.next();
            System.out.println("Ingrese nota 1: ");
            n1 = leer.nextInt();
            System.out.println("Ingrese nota 2: ");
            n2 = leer.nextInt();
            System.out.println("Ingrese nota 3: ");
            n3 = leer.nextInt();
            a1 = new Alumno(nombre, n1, n2, n3);
            Alumnos.add(a1);
            System.out.println("Desea continuar? ");
            resp = leer.next().substring(0, 1).toUpperCase();
        } while (!resp.equalsIgnoreCase("N"));
        leer.close();
        System.out.println("Ingrese nombre del alumno: ");
        String nombreAlumno = leer.next();
        for (Alumno Alumno1 : Alumnos) {
            if (Alumno1.getNombre().equalsIgnoreCase(nombreAlumno)) {
                System.out.println("Nota final: " + a1.notaFinal());
            }
        }
    }
    
}
