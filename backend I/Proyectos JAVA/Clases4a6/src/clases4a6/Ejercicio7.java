package clases4a6;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena, FDE ="&&&&&";
        int i=0,longitud, cCorr=0, cIncorr=0;
        Scanner leer = new Scanner(System.in);
        do{
            System.out.println("Ingrese su " + ++i + "º cadena: ");
            cadena = leer.nextLine();
            longitud = cadena.length();
            if (longitud<=5 || longitud>=2){
                if (cadena.substring(0,1).equals("X")){
                    if (cadena.substring(longitud-1).equals("O")){
                        cCorr++;
                    }else{
                        cIncorr++;
                    }
                }else{
                    cIncorr++;
                }
            }else{
                cIncorr++;
            }
        }while (!cadena.equals(FDE));
        System.out.println("La cantidad de ingresos correctos es de: " + cCorr);
        System.out.println("La cantidad de ingresos incorrectos es de: " + (cIncorr-1));
    }
    
}
