/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad_Ej4.Services;

import Entidad_Ej4.Empleados;
import Entidad_Ej4.Enums.Materias;
import Entidad_Ej4.Enums.PersoSer;
import Entidad_Ej4.Personas;
import Entidad_Ej4.Subclases.PServicio;
import Entidad_Ej4.Subclases.Profesores;

/**
 *
 * @author Usuario
 */
public class ServicesEmpleados extends ServicePersona {

    public Profesores crearProf() {
        Empleados e1 = crearEmpleado();
        String materia = CrearMateria();
        return new Profesores(materia, e1.getAnio(), e1.getDespacho(), e1.getNombre(), e1.getApell(), e1.getSex(), e1.getNumIdent(), e1.getEstado());
    }

    public Profesores crearProfxMat() {
        String materia = cambioMateria();
        Empleados e1 = crearEmpleado();
        return new Profesores(materia, e1.getAnio(), e1.getDespacho(), e1.getNombre(), e1.getApell(), e1.getSex(), e1.getNumIdent(), e1.getEstado());
    }

    public Empleados crearEmpleado() {
        Personas p1 = crearPersona();
        System.out.println("En que año Ingreso a la facultad?");
        int anio = leer.nextInt();
        while (anio < 1900 || anio > 2024) {
            System.out.println("Ingrese el año correctamente");
            anio = leer.nextInt();
        }

        System.out.println("Numero de despacho ?");
        int despacho = leer.nextInt();
        return new Empleados(anio, despacho, p1.getNombre(), p1.getApell(), p1.getSex(), p1.getNumIdent(), p1.getEstado());
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

    public PServicio crearPserv() {
        Empleados e1 = crearEmpleado();
        String servi = Servi();
        return new PServicio(servi, e1.getAnio(), e1.getDespacho(), e1.getNombre(), e1.getApell(), e1.getSex(), e1.getNumIdent(), e1.getEstado());
    }

    public PServicio crearPservxArea() {
        String servi = cambioServicio();
        Empleados e1 = crearEmpleado();
        return new PServicio(servi, e1.getAnio(), e1.getDespacho(), e1.getNombre(), e1.getApell(), e1.getSex(), e1.getNumIdent(), e1.getEstado());
    }

    public String Servi() {
        String nuevo = "";
        int cont = (int) (Math.random() * 16);
        int vuelta = 0;
        for (PersoSer aux : PersoSer.values()) {
            if (vuelta == cont) {
                nuevo = aux.getCodigo();
                break;
            }
            vuelta++;
        }
        return nuevo;
    }

    public void MostrarServiP() {
        //16 Servicios
        int cont = 0;
        System.out.println("Areas de Servicio : ");
        for (PersoSer aux : PersoSer.values()) {
            System.out.print(aux.getNum() + "). " + aux.getCodigo() + ". ");
            if (cont == 5) {
                cont = 0;
                System.out.println("");
            }
            cont++;
        }
    }

    public void MostrarMateria() {
        // 21 materias
        int cont = 0;
        System.out.println("Materias Disponibles : ");
        for (Materias aux : Materias.values()) {
            System.out.print(aux.getNum() + "). " + aux.getCodigo() + ". ");
            if (cont == 4) {
                cont = 0;
                System.out.println("");
            }

            cont++;
        }
    }

    public String cambioMateria() {
        MostrarMateria();
        System.out.println("\nSeleccione la Materia por Numero =");
        int num = leer.nextInt();
        while (num < 1 || num > 21) {
            System.out.println("Solo numeros de 1 a 21");
            num = leer.nextInt();
        }
        String nuevo = auxCambMat(num);
        System.out.println("Ahora usted esta en la Materia : " + nuevo);
        return nuevo;
    }

    public String auxCambMat(int num) {
        String cambio = "";
        for (Materias aux : Materias.values()) {
            if (num == aux.getNum()) {
                cambio = aux.getCodigo();
                break;
            }
        }
        return cambio;
    }

    public String cambioServicio() {
        MostrarServiP();
        System.out.println("\nSeleccione el Area de Servicio por Numero =");
        int num = leer.nextInt();
        while (num < 1 || num > 16) {
            System.out.println("Solo numeros de 1 a 16");
            num = leer.nextInt();
        }
        String cambio = auxCambSer(num);
        System.out.println("Ahora usted presta Servicio en : " + cambio);

        return cambio;
    }

    public String auxCambSer(int num) {
        String cambio = "";
        for (PersoSer aux : PersoSer.values()) {
            if (num == aux.getNum()) {
                cambio = aux.getCodigo();
                break;
            }
        }
        return cambio;
    }

}
