
package integradorbackend1.Servicios;

import integradorbackend1.entidades.Estudiante;


public class EstudianteService {

    public static float calcularPromedio(Estudiante[] alumnos){
        
        float promedio = 0;
        for (int i = 0; i < alumnos.length; i++) {
            promedio += alumnos[i].getNota();
        }
        promedio = promedio/8.0f;
        System.out.println("El promedio total del curso es: " + promedio);
        return promedio;
    }
    
    public static String[] alumnosSup(float promedio, Estudiante[] alumnos){
        String[] nombres;
        int cont = 0;
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].getNota()>promedio) {
                cont++;
            }
        }
        nombres = new String[cont];
        int cont2 = 0;
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].getNota()>promedio) {
                nombres[cont2] = alumnos[i].getNombre();
                cont2++;
            }
        }
        return nombres;
    }
    public static void mostrarAlumnos(String[] alumnos){
        System.out.println("Los alumnos que superan el promedio son: ");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print(alumnos[i]);
            if (i<alumnos.length - 1) {
                System.out.print(", ");
            }else{
                System.out.println("");
            }
        }
    }
    
}
