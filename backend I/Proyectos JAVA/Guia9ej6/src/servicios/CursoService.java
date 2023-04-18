/*
Un profesor particular está dando cursos para grupos de cinco alumnos
y necesita un programa para organizar la información de cada curso.
Para ello, crearemos una clase entidad llamada Curso, cuyos atributos
serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana,
turno (mañana o tarde), precioPorHora y alumnos. Donde alumnos es un
arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los
siguientes métodos:
a) Un constructor por defecto.
b) Un constructor con todos los atributos como parámetro.
c) Métodos getters y setters de cada atributo.

d) Método cargarAlumnos(): este método le permitirá al usuario ingresar
los alumnos que asisten a las clases. Nosotros nos encargaremos de
almacenar esta información en un arreglo e iterar con un bucle,
solicitando en cada repetición que se ingrese el nombre de cada
alumno.

e) Método crearCurso(): el método crear curso, le pide los valores de
los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Curso. En este método invocamos al
método cargarAlumnos() para asignarle valor al atributo alumnos

f) Método calcularGananciaSemanal(): este método se encarga de
calcular la ganancia en una semana por curso. Para ello, se deben
multiplicar la cantidad de horas por día, el precio por hora, la
cantidad de alumnos y la cantidad de días a la semana que se repite
el encuentro.
 */
package servicios;

import entidades.Curso;
import java.util.Scanner;

public class CursoService {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void cargarAlumnos(Curso c) {
        String[] arreglo = new String[5];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1) + ": ");
            arreglo[i] = leer.next();
        }
        c.setAlumnos(arreglo);
    }

    public static Curso crearCurso() {

        System.out.println("Ingrese el nombre del curso: ");
        String nombre = leer.next();
        System.out.println("Ingrese la cantidad de horas por día: ");
        float horasDia = leer.nextFloat();
        System.out.println("Ingrese la cantidad de días a la semana: ");
        int dias = leer.nextInt();
        System.out.println("Ingrese el turno: ");
        String turno = leer.next();
        while (!turno.equalsIgnoreCase("mañana") && !turno.equalsIgnoreCase("tarde")) {
            System.out.println("El turno debe ser mañana o tarde. Vuelva a ingresarlo: ");
            turno = leer.next();
        }
        System.out.println("Ingrese el precio por hora: ");
        float precio = leer.nextFloat();
        Curso c = new Curso(nombre, horasDia, dias, turno, precio);
        CursoService.cargarAlumnos(c);
        return c;
    }

    public static double calcularGananciasSemanal(Curso c) {
        double ganancia;
        ganancia = c.getCantidadHorasPorDia() * c.getPrecioPorHora() * c.getAlumnos().length * c.getCantidadDiasPorSemana();
        return ganancia;
    }

}
