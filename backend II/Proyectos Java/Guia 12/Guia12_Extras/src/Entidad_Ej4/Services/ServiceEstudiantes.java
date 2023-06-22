/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad_Ej4.Services;

import Entidad_Ej4.Enums.Materias;
import Entidad_Ej4.Personas;
import Entidad_Ej4.Subclases.Estudiante;

/**
 * String materia, String nombre, String apell, Sexo sex, int numIdent, String
 * estado
 */
public class ServiceEstudiantes extends ServicePersona {

    ServicesEmpleados sc = new ServicesEmpleados();

    public Estudiante crearEst() {
        Personas p1 = super.crearPersona();
        String materia = CrearMateria();
        return new Estudiante(materia, p1.getNombre(), p1.getApell(), p1.getSex(), p1.getNumIdent(), p1.getEstado());
    }

    public Estudiante crearEstxMat() {
        Personas p1 = super.crearPersona();
        String materia = sc.cambioMateria();
        return new Estudiante(materia, p1.getNombre(), p1.getApell(), p1.getSex(), p1.getNumIdent(), p1.getEstado());
    }

    public String CrearMateria() {
        String nuevo = "";
        int cont = (int) (Math.random() * 21);
        int vuelta = 0;
        for (Materias aux : Materias.values()) {
            if (vuelta == cont) {
                nuevo = aux.getCodigo();
                break;
            }
            vuelta++;
        }
        return nuevo;
    }

    public void CambiarCarrera(Estudiante e1) {
        sc.MostrarMateria();
        System.out.println("\n" + e1.getNombre() + " " + e1.getApell() + " Seleccione la Nueva Materia a Cursar por Numero :");
        int num = leer.nextInt();
        while (num < 1 || num > 21) {
            System.out.println("Solo numeros de 1 a 21");
            num = leer.nextInt();
        }
        String nuevo = sc.auxCambMat(num);
        e1.setMateria(nuevo);
        System.out.println(e1.getNombre() + " " + e1.getApell() + ". Materia cambiada con exito");
        System.out.println("Ahora cursa : " + e1.getMateria());
    }

}
