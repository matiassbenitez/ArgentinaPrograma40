package Entidad_Ej4.Services;

import Entidad_Ej4.Enums.Apellido;
import Entidad_Ej4.Enums.Estado;
import Entidad_Ej4.Enums.NombresH;
import Entidad_Ej4.Enums.NombresM;
import Entidad_Ej4.Enums.Sexo;
import Entidad_Ej4.Personas;
import java.util.Scanner;

public class ServicePersona {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //String nombre, String apell, Sexo sex, int numIdent, String estado
    public Personas crearPersona() {
        System.out.println("Ingrese el Sexo");
        MostrarSexo();
        String let = leer.next();
        Sexo sex = crearSexo(let);
        String apell = crearApell();
        String nomb = crearNombre(sex.getCodigo());
        System.out.println("Seleccione el Estado Civil por numero :");
        MostrarEstados();
        int num = leer.nextInt();
        String estado = Estado(num);
        System.out.println("Ingrese el numero de Identificacion");
        int numIdent = leer.nextInt();

        return new Personas(nomb, apell, sex, numIdent, estado);
    }

    public String Estado(int cont) {
        String nombre = Estado.SOLTERO_A.getCodigo();
        for (Estado aux : Estado.values()) {
            if (aux.getNum() == cont) {
                nombre = aux.getCodigo();
                break;
            }
        }
        return nombre;
    }

    public void MostrarEstados() {
        for (Estado aux : Estado.values()) {
            System.out.println(aux.getNum() + "_ " + aux.getCodigo() + ".");
        }
    }

    public String crearNombre(String sex) {
        int cont = (int) (Math.random() * 2);
        String nuevo = "";
        switch (sex) {
            case "Hombre":
                nuevo = NombreH();
                break;
            case "Mujer":
                nuevo = NombreM();
                break;
            case "Otro":
                nuevo = NombreMixto(cont);
                break;
        }
        return nuevo;
    }

    public String NombreH() {
        String nombre = "";
        int cont = (int) (Math.random() * 20);
        int vuelta = 0;
        for (NombresH aux : NombresH.values()) {
            if (vuelta == cont) {
                nombre = aux.getCodigo();
                break;
            }
            vuelta++;
        }
        return nombre;
    }

    public String NombreM() {
        String nombre = "";
        int cont = (int) (Math.random() * 20);
        int vuelta = 0;
        for (NombresM aux : NombresM.values()) {
            if (vuelta == cont) {
                nombre = aux.getCodigo();
                break;
            }
            vuelta++;
        }
        return nombre;
    }

    public String NombreMixto(int random) {
        String nombre = "";
        int cont = (int) (Math.random() * 20);
        int vuelta = 0;
        if (random == 1) {
            for (NombresH aux : NombresH.values()) {
                if (vuelta == cont) {
                    nombre = aux.getCodigo();
                    break;
                }
                vuelta++;
            }
        } else {
            for (NombresM aux : NombresM.values()) {
                if (vuelta == cont) {
                    nombre = aux.getCodigo();
                    break;
                }
                vuelta++;
            }
        }
        return nombre;
    }

    public String crearApell() {
        String apel = "";
        int cont = (int) (Math.random() * 20);
        int vuelta = 0;
        for (Apellido aux : Apellido.values()) {
            if (vuelta == cont) {
                apel = aux.getCodigo();
                break;
            }
            vuelta++;
        }
        return apel;
    }

    public Sexo crearSexo(String sex) {
        Sexo s = Sexo.Otro;
        for (Sexo res : Sexo.values()) {
            String st = res.getCodigo();
            if (st.equalsIgnoreCase(sex)) {
                s = res;
            }
        }
        return s;
    }

    public void MostrarSexo() {
        for (Sexo res : Sexo.values()) {
            System.out.print(res.getCodigo() + ". ");
        }
        System.out.println("");
    }

    public void cambioEstado(Personas p1) {
        System.out.println(p1.getNombre() + " Seleccione el nuevo Estado Civil por numero :");
        MostrarEstados();
        int num = leer.nextInt();
        String estado = Estado(num);
        p1.setEstado(estado);
        System.out.println("Ahora usted es : " + p1.getEstado());
    }

}
