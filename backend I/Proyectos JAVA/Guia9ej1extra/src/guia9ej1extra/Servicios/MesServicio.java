package guia9ej1extra.Servicios;

import guia9ej1extra.entidades.Mes;
import java.util.Scanner;

public class MesServicio {

    

    public static void adivinarMes(Mes m) {
Scanner leer  = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Intente adivinar el mes: ");
        String mes = leer.next();
        while (!mes.equalsIgnoreCase(m.getMesSecreto())){
            System.out.println("Mes incorrecto. Vuelva a intentarlo: ");
            mes = leer.next();
        }
        System.out.println("Felicidades!!! Acertaste!!!");
    }

}
