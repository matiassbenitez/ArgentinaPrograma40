package guia13ej9;

import guia13ej9.Tres;

public class Guia13ej9 {

    public static void main(String[] args) {
        try {
            System.out.println(Tres.metodo());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo()");
            e.printStackTrace();
        }
    }

}
