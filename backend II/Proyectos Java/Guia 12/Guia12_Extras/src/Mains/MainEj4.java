/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mains;

import Entidad_Ej4.Empleados;
import Entidad_Ej4.Facultad;
import Entidad_Ej4.Personas;
import Entidad_Ej4.Services.Services;
import java.util.HashSet;

public class MainEj4 {

    public static void main(String[] args) {
        Services sc = new Services();
        HashSet<Empleados> PerServ = new HashSet();
        HashSet<Empleados> Profesores = new HashSet();
        HashSet<Personas> Estudiantes = new HashSet();
        Facultad f1 = sc.crearFacult(Estudiantes, PerServ, Profesores);
        sc.Menu(f1);
    }

}
