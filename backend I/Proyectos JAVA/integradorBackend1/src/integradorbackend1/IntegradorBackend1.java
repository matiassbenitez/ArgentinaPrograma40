/**
 * Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron el
 * examen final. La escuela nos ha pedido que calculemos el promedio de notas
 * final de todos sus alumnos y saber qué alumnos han recibido una nota por
 * encima de ese promedio.
 * Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos
 * van a ser nombre y nota (representando la nota obtenida en el final).
 * La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8
 * estudiantes con sus respectivas notas.
 * Una vez creado los estudiantes deberemos guardar los estudiantes en un
 * arreglo de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las
 * dos tareas que nos ha pedido la escuela.
 * 1. Calcular y mostrar el promedio de notas de todo el curso
 * 2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
 * nota mayor al promedio del curso
 * 3. Por último, deberemos mostrar todos los estudiantes con una nota
 * mayor al promedio
 */
package integradorbackend1;

import integradorbackend1.Servicios.EstudianteService;
import integradorbackend1.entidades.Estudiante;

public class IntegradorBackend1 {

    public static void main(String[] args) {

        Estudiante[] alumnos = new Estudiante[8];
        alumnos[0] = new Estudiante("Matias", 7.8f);
        alumnos[1] = new Estudiante("Sebastian", 6.3f);
        alumnos[2] = new Estudiante("juan", 5.2f);
        alumnos[3] = new Estudiante("Carlos", 8.3f);
        alumnos[4] = new Estudiante("Pao", 9.5f);
        alumnos[5] = new Estudiante("Marce", 4.2f);
        alumnos[6] = new Estudiante("Fernan", 10f);
        alumnos[7] = new Estudiante("Flor", 5.5f);
        
        float promedio;
        promedio = EstudianteService.calcularPromedio(alumnos);
        String[] sup = EstudianteService.alumnosSup(promedio, alumnos);
        EstudianteService.mostrarAlumnos(sup);
        
    }

}
