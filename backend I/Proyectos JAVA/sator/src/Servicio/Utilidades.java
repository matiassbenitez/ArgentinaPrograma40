package Servicio;

public class Utilidades {

    public static String invertir(String cadena) {

        String aux = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            aux += cadena.substring(i, i + 1);
        }

        return aux;
    }

    public static int buscar(String cad, String [] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            if (cad.equalsIgnoreCase(arreglo[i])){
                return i;
            }
        }
        return -1;
 
    }
    
}
