
package guia10ej3;

import guia10ej3.servicios.AlumnoService;


public class Guia10ej3 {

    public static void main(String[] args) {
        AlumnoService.crearAlumno();
        double nota = AlumnoService.notaFinal();
        if(nota>0){
            System.out.println("La nota final del alumno es: " + nota);
        }else{
            System.out.println("No existe el alumno.");
        }
    }

}
