/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad_Ej4.Services;

import Entidad_Ej4.Empleados;
import Entidad_Ej4.Facultad;
import Entidad_Ej4.Personas;
import Entidad_Ej4.Subclases.Estudiante;
import Entidad_Ej4.Subclases.PServicio;
import Entidad_Ej4.Subclases.Profesores;
import java.util.HashSet;
import java.util.Scanner;

public class Services {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ServicesEmpleados scemp = new ServicesEmpleados();
    ServicePersona scp = new ServicePersona();
    ServiceEstudiantes scest = new ServiceEstudiantes();

    public Facultad crearFacult(HashSet<Personas> est, HashSet<Empleados> perS, HashSet<Empleados> prof) {
        System.out.println("Ingrese el Nombre de la Facultad.");
        String nombre = leer.next();
        return new Facultad(nombre, perS, prof, est);
    }

    public void crearListEstud(HashSet<Personas> est, int cont) {
        String opc;
        do {
            System.out.println("Desea Seleccionar su Materia ? S/N ");
            opc = leer.next();
            while (!opc.equalsIgnoreCase("S") && !opc.equalsIgnoreCase("N")) {
                System.out.println("Seleccion la Opcion Correctamente S/N");
                opc = leer.next();
            }
            if (opc.equalsIgnoreCase("S")) {
                est.add(scest.crearEstxMat());
            } else {
                est.add(scest.crearEst());
            }
        } while (est.size() != cont);
    }

    public void crearListPerSer(HashSet<Empleados> perS, int cont) {
        String opc;
        do {
            System.out.println("Desea Seleccionar el Area de Servicio ? S/N ");
            opc = leer.next();
            while (!opc.equalsIgnoreCase("S") && !opc.equalsIgnoreCase("N")) {
                System.out.println("Seleccion la Opcion Correctamente S/N");
                opc = leer.next();
            }
            if (opc.equalsIgnoreCase("S")) {
                perS.add(scemp.crearPservxArea());
            } else {
                perS.add(scemp.crearPserv());
            }

        } while (perS.size() != cont);
    }

    public void crearListProfes(HashSet<Empleados> prof, int cont) {
        String opc;
        do {
            System.out.println("Desea Seleccionar su Especialidad ? S/N ");
            opc = leer.next();
            while (!opc.equalsIgnoreCase("S") && !opc.equalsIgnoreCase("N")) {
                System.out.println("Seleccion la Opcion Correctamente S/N");
                opc = leer.next();
            }
            if (opc.equalsIgnoreCase("S")) {
                prof.add(scemp.crearProfxMat());
            } else {
                prof.add(scemp.crearProf());
            }
        } while (prof.size() != cont);
    }

    public void MostrarEstudiantes(HashSet<Personas> est) {
        System.out.println("Lista de estudiantes : ");
        for (Personas per : est) {
            if (per instanceof Estudiante) {
                System.out.println(per.getNombre() + ", " + per.getApell() + ", Mat = " + ((Estudiante) per).getMateria() + ".");
            }
        }
    }

    public void SeleccionarEst(HashSet<Personas> est) {
        MostrarEstudiantes(est);
        System.out.println("\nSeleccione el estudiante por Nombre y Apellido");
        System.out.println("Nombre : ");
        String nombre = leer.next();
        System.out.println("Apellido : ");
        String apellido = leer.next();
        boolean boo = false;
        for (Personas alumno : est) {
            if (alumno instanceof Estudiante) {
                if (alumno.getNombre().equalsIgnoreCase(nombre) && alumno.getApell().equalsIgnoreCase(apellido)) {
                    CambioOpcionEstud((Estudiante) alumno);
                    boo = true;
                    break;
                }
            }
        }
        if (!boo) {
            System.out.println("Estudiante " + nombre + ", " + apellido + " no se encuentra en la lista");
        }
    }

    public void MostrarPerServ(HashSet<Empleados> perS) {
        System.out.println("Lista de Personal de Servicio :");
        for (Empleados emple : perS) {
            if (emple instanceof PServicio) {
                System.out.println(emple.getNombre() + ", " + emple.getApell() + ", Serv = " + ((PServicio) emple).getServi() + ".");
            }
        }
    }

    public void SeleccionarPservicio(HashSet<Empleados> perS) {
        MostrarPerServ(perS);
        System.out.println("\nSeleccione el Personal por Nombre y Apellido");
        System.out.println("Nombre : ");
        String nombre = leer.next();
        System.out.println("Apellido : ");
        String apellido = leer.next();
        boolean boo = false;
        for (Empleados emple : perS) {
            if (emple instanceof PServicio) {
                if (emple.getNombre().equalsIgnoreCase(nombre) && emple.getApell().equalsIgnoreCase(apellido)) {
                    CambioOpcionPersServ((PServicio) emple);
                    boo = true;
                    break;
                }
            }
        }
        if (!boo) {
            System.out.println("Personal de Servicio " + nombre + ", " + apellido + " no se encuentra en la lista");
        }
    }

    public void MostrarProfesores(HashSet<Empleados> prof) {
        System.out.println("Lista de Profesores : ");
        for (Empleados emple : prof) {
            if (emple instanceof Profesores) {
                System.out.println(emple.getNombre() + ", " + emple.getApell() + ", mat = " + ((Profesores) emple).getProfesor() + ".");
            }
        }
    }

    public void SeleccionarProfesor(HashSet<Empleados> profe) {
        MostrarProfesores(profe);
        System.out.println("\nSeleccione el Profesor por Nombre y Apellido");
        System.out.println("Nombre : ");
        String nombre = leer.next();
        System.out.println("Apellido : ");
        String apellido = leer.next();
        boolean boo = false;
        for (Personas prof : profe) {
            if (prof instanceof Profesores) {
                if (prof.getNombre().equalsIgnoreCase(nombre) && prof.getApell().equalsIgnoreCase(apellido)) {
                    CambioOpcionProfe((Profesores) prof);
                    boo = true;
                    break;
                }
            }
        }
        if (!boo) {
            System.out.println("Profesor " + nombre + ", " + apellido + " no se encuentra en la lista");
        }
    }

    public void CambioOpcionEstud(Estudiante e1) {
        System.out.println("Que desea cambiar Estado Civil o Materia ? E / M ");
        String opc = leer.next();
        while (!opc.equalsIgnoreCase("E") && !opc.equalsIgnoreCase("M")) {
            System.out.println("Seleccion la Opcion Correctamente E/M");
            opc = leer.next();
        }
        switch (opc.toUpperCase()) {
            case "M":
                scest.CambiarCarrera(e1);
                break;
            case "E":
                scp.cambioEstado(e1);
                break;
        }
    }

    public void CambioOpcionProfe(Profesores p1) {
        System.out.println("Que desea cambiar Estado Civil o Materia ? E / M ");
        String opc = leer.next();
        while (!opc.equalsIgnoreCase("E") && !opc.equalsIgnoreCase("M")) {
            System.out.println("Seleccion la Opcion Correctamente E/M");
            opc = leer.next();
        }
        switch (opc.toUpperCase()) {
            case "M":
                p1.setProfesor(scemp.cambioMateria());
                break;
            case "E":
                scp.cambioEstado(p1);
                break;
        }
    }

    public void CambioOpcionPersServ(PServicio p1) {
        System.out.println("Que desea cambiar Estado Civil o Area de Servicio ? A / E ");
        String opc = leer.next();
        while (!opc.equalsIgnoreCase("E") && !opc.equalsIgnoreCase("A")) {
            System.out.println("Seleccion la Opcion Correctamente A / E");
            opc = leer.next();
        }
        switch (opc.toUpperCase()) {
            case "A":
                p1.setServi(scemp.cambioServicio());
                break;
            case "E":
                scp.cambioEstado(p1);
                break;
        }
    }

    public void MostrarLEst(HashSet<Personas> est) {
        System.out.println("Lista de estudiantes : ");
        for (Personas per : est) {
            if (per instanceof Estudiante) {
                Estudiante ob = (Estudiante) per;
                System.out.println(ob.toString());
            }
        }
    }

    public void MostrarLProf(HashSet<Empleados> prof) {
        System.out.println("Lista de Profesores : ");
        for (Empleados emple : prof) {
            if (emple instanceof Profesores) {
                Profesores ob = (Profesores) emple;
                System.out.println(ob.toString());
            }
        }
    }

    public void MostrarLPserv(HashSet<Empleados> perS) {
        System.out.println("Lista de Personal de Servicio :");
        for (Empleados emple : perS) {
            if (emple instanceof PServicio) {
                PServicio ob = (PServicio) emple;
                System.out.println(ob.toString());
            }
        }
    }

    public void Menu(Facultad f1) {
        int opc;
        boolean op1 = false;
        boolean op2 = false;
        boolean op3 = false;
        do {
            System.out.println("> > Menu < < Facultad " + f1.getNombreFacult() + " < <");
            System.out.println("1 . CrearLista de Estudiantes");
            System.out.println("2 . CrearLista de Profesores");
            System.out.println("3 . CrearLista de Personal Servicio");
            System.out.println("4 . MostrarLista de Estudiantes");
            System.out.println("5 . MostrarLista de Profesores");
            System.out.println("6 . MostrarLista del Personal Servicio");
            System.out.println("7 . Cambiar Datos de Estudiantes");
            System.out.println("8 . Cambiar Datos de Profesores");
            System.out.println("9 . Cambiar Datos de Personal Servicio");
            System.out.println("10 . Buscar Estudiantes por Materia");
            System.out.println("11 . Buscar Profesor por Materia");
            System.out.println("12 . Buscar Personal Servicio por Area");
            System.out.println("13 . Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Cuantos Estudiante quiere crear ?");
                    int num = leer.nextInt();
                    crearListEstud(f1.getEstudiantes(), num);
                    op1 = true;
                    break;
                case 2:
                    System.out.println("Cuantos Profesores quiere crear ?");
                    int num2 = leer.nextInt();
                    crearListProfes(f1.getProfesores(), num2);
                    op2 = true;
                    break;
                case 3:
                    System.out.println("Cuanto Personal de Servicio quiere crear ?");
                    int num3 = leer.nextInt();
                    crearListPerSer(f1.getPerServ(), num3);
                    op3 = true;
                    break;
                case 4:
                    if (op1) {
                        MostrarLEst(f1.getEstudiantes());
                    } else {
                        System.out.println("Primero llene los Datos de los Estudiantes");
                    }
                    break;
                case 5:
                    if (op2) {
                        MostrarLProf(f1.getProfesores());
                    } else {
                        System.out.println("Primero llene los Datos de los Profesores");
                    }
                    break;
                case 6:
                    if (op3) {
                        MostrarLPserv(f1.getPerServ());
                    } else {
                        System.out.println("Primero llene los Datos del Personal de Servicio");
                    }
                    break;
                case 7:
                    if (op1) {
                        SeleccionarEst(f1.getEstudiantes());
                    } else {
                        System.out.println("Primero llene los Datos de los Estudiantes");
                    }
                    break;
                case 8:
                    if (op2) {
                        SeleccionarProfesor(f1.getProfesores());
                    } else {
                        System.out.println("Primero llene los Datos de los Profesores");
                    }
                    break;
                case 9:
                    if (op3) {
                        SeleccionarPservicio(f1.getPerServ());
                    } else {
                        System.out.println("Primero llene los Datos del Personal de Servicio");
                    }
                    break;
                case 10:
                    if (op1) {
                        BuscarEstxMat(f1.getEstudiantes());
                    } else {
                        System.out.println("Primero llene los Datos de los Estudiantes");
                    }
                    break;
                case 11:
                    if (op2) {
                        BuscarProfxMat(f1.getProfesores());
                    } else {
                        System.out.println("Primero llene los Datos de los Profesores");
                    }
                    break;
                case 12:
                    if (op3) {
                        BuscarPerSxArea(f1.getPerServ());
                    } else {
                        System.out.println("Primero llene los Datos del Personal de Servicio");
                    }
                    break;
                case 13:
                    System.out.println("Hasta Luego");
                    break;
                default:
                    System.out.println("Digito Invalido");
            }
        } while (opc != 13);
    }

    public void BuscarEstxMat(HashSet<Personas> est) {
        HashSet<Personas> nuevo = new HashSet();
        scemp.MostrarMateria();
        System.out.println("\nSeleccione la Materia por Numero =");
        int num = leer.nextInt();
        while (num < 1 || num > 21) {
            System.out.println("Solo numeros de 1 a 21");
            num = leer.nextInt();
        }
        String mat = scemp.auxCambMat(num);
        for (Personas pe : est) {
            if (pe instanceof Estudiante) {
                Estudiante ob = (Estudiante) pe;
                if (ob.getMateria().equalsIgnoreCase(mat)) {
                    nuevo.add(pe);
                }
            }
        }

        if (nuevo.isEmpty()) {
            System.out.println("No hay Estudiantes en " + mat);
        } else {
            MostrarLEst(nuevo);
        }

    }

    public void BuscarProfxMat(HashSet<Empleados> profe) {
        HashSet<Empleados> nuevo = new HashSet();
        scemp.MostrarMateria();
        System.out.println("\nSeleccione la Materia por Numero =");
        int num = leer.nextInt();
        while (num < 1 || num > 21) {
            System.out.println("Solo numeros de 1 a 21");
            num = leer.nextInt();
        }
        String mat = scemp.auxCambMat(num);
        for (Empleados emple : profe) {
            if (emple instanceof Profesores) {
                Profesores ob = (Profesores) emple;
                if (ob.getProfesor().equalsIgnoreCase(mat)) {
                    nuevo.add(emple);
                }
            }
        }

        if (nuevo.isEmpty()) {
            System.out.println("No hay Profesores en " + mat);
        } else {
            MostrarLProf(nuevo);
        }

    }

    public void BuscarPerSxArea(HashSet<Empleados> perS) {
        HashSet<Empleados> nuevo = new HashSet();
        scemp.MostrarServiP();
        System.out.println("\nSeleccione el Area de Servicio por Numero =");
        int num = leer.nextInt();
        while (num < 1 || num > 16) {
            System.out.println("Solo numeros de 1 a 16");
            num = leer.nextInt();
        }
        String serv = scemp.auxCambSer(num);
        for (Empleados emple : perS) {
            if (emple instanceof PServicio) {
                PServicio ob = (PServicio) emple;
                if (ob.getServi().equalsIgnoreCase(serv)) {
                    nuevo.add(emple);
                }
            }
        }

        if (nuevo.isEmpty()) {
            System.out.println("No hay Personal en " + serv);
        } else {
            MostrarLPserv(nuevo);
        }

    }

}
