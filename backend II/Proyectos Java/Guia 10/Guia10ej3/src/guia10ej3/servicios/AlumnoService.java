
package guia10ej3.servicios;

import guia10ej3.entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;


public class AlumnoService {

    static ArrayList <Alumno>  lista = new ArrayList();
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void crearAlumno(){
        boolean salir = false;
        do {
            ArrayList<Integer> notas = new ArrayList();
            System.out.println("Ingrese el nombre del alumno: ");
            String nombre = leer.next();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la "+ (i+1) + "º nota: ");
                notas.add(leer.nextInt());
            }
            System.out.println("Desea seguir ingresando alumnos? si/no");
            String resp = leer.next();
            if (resp.equalsIgnoreCase("no")){
                salir = true;
            }
           
            lista.add(new Alumno(nombre,notas));
        } while (!salir);
        
    }
    public static double notaFinal(){
        System.out.println("Ingrese el nombre del alumno: ");
        String nombre = leer.next();
        double promedio = 0;
        for (Alumno alumno : lista) {
            if (nombre.equalsIgnoreCase(alumno.getNombre())){
                for (Integer nota : alumno.getNotas()) {
                    promedio += nota;
                }
                promedio = promedio/alumno.getNotas().size();
            }
        }
        return promedio;
    }
    
}
