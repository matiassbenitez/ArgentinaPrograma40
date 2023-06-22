package integrador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Practica {

//    La función recibirá un numero x y deberá determinar si es capicúa o no. 
//    Este deberá devolver verdadero(true) si es capicúa y falso(false) si no lo es. 
//    Además deberemos contemplar los siguientes escenarios: 
//    Contemplar que el numero que llega puede ser negativo. 
//    Contemplar que el numero que llega puede ser de un digito, si es así debe devolver true. 
//    Contemplar que el numero que llega puede ser null, si es así debe devolver false.
//    @param num
//    @return esPalindromo
    public Boolean numeroCapicua(Integer x) {
        boolean capicua = true;
        if (x == null) {
            capicua = false;
        } else {
            if (x / 10 != 0) {
                if (x < 0) {
                    x = Math.abs(x);
                }
                capicua = Practica.capicua(x);
            }
        }
        return capicua;
    }

    public static boolean capicua(Integer x) {
        int primero, cont = 0;
        if (x / 10 == 0) {//tiene una sola cifra
            return true;
        } else {
            primero = x; // declaro variable para encontrar el primer digito
            while (primero > 9) {
                cont++;
                primero = primero / 10;
            }
            x = (x - primero * (int) (Math.pow(10, cont)));
            if (x % 10 == primero) {
                return Practica.capicua(x / 10);
            } else {
                return false;
            }
        }
    }

//    Estamos en caramelolandia, donde estan los peores ladrones de dulces. 
//    Una vez al mes, se sienta una n cantidad de presos en ronda, contemplando 
//    al preso que inicia la ronda, como el preso 0. 
//    A los presos se les da una m cantidad de caramelos, estos caramelos se repartirán de uno en uno a cada preso, 
//    contemplando que se comenzaran a repartir los caramelos desde el primer preso (inicio). 
//    Se repartirán los caramelos hasta que no queden más y el ultimo caramelo en repartirse estará podrido, 
//    determinar a que preso, según su posición en la ronda le tocara el caramelo podrido.
//     @param inicio
//     @param cantidadCaramelos
//     @param cantidadLadrones
//     @return ladronQueLeTocoElCarameloPodrido
    public int prisioneroDulce(int inicio, int cantidadCaramelos, int cantidadLadrones) {
        //(0, 10, 6));
        //(7, 4, 8));
        //(1, 5, 2));
        //(0, 10, 1));
        //(455, 1585, 500));
        //ladronQueLeTocoElCarameloPodrido
        //cantidadCaramelos
        //cantidadLadrones
//        int ladronQueLeTocoElCarameloPodrido;
//        cantidadCaramelos = cantidadCaramelos%cantidadLadrones;
//        if (cantidadCaramelos == 1){
//            ladronQueLeTocoElCarameloPodrido = inicio;
//        }else if (cantidadCaramelos == 0){
//            if (inicio == 0){
//                ladronQueLeTocoElCarameloPodrido = cantidadLadrones - 1;
//            }else{
//                ladronQueLeTocoElCarameloPodrido = inicio - 1;
//            }
//        }else{
//            ladronQueLeTocoElCarameloPodrido = inicio + cantidadCaramelos - 1;
//            if (ladronQueLeTocoElCarameloPodrido > cantidadLadrones-1){
//                ladronQueLeTocoElCarameloPodrido = ladronQueLeTocoElCarameloPodrido - cantidadLadrones;
//            }
//        }
//        return ladronQueLeTocoElCarameloPodrido;
        int ladronQueLeTocoElCarameloPodrido = 0;
        while (cantidadCaramelos > 0) {
            cantidadCaramelos--;
            if (cantidadCaramelos == 0) {
                ladronQueLeTocoElCarameloPodrido = inicio;
                break;
            }
            inicio++;
            if (inicio == cantidadLadrones) {
                inicio = 0;
            }
        }
        return ladronQueLeTocoElCarameloPodrido;
    }

//    En un universo paralelo, donde los habitantes son medias, existe un crucero de medias donde 
//    se sube una lista de medias. 
//    Esta lista de tripulantes del crucero es una Collection de letras. 
//    Lo que se deberá hacer, es filtrar la lista de medias que se suben al crucero y 
//    retornar una lista que contenga los grupos de medias que si tenían pares. 
//    Esta lista final de medias pares se mostraran ordenadas de menor a mayor.
//    A continuación un ejemplo: 
//    List de medias que llegan : A,B,A,B,C,A,F,Z,C,H. A,B y C tiene pares, mientras que F,Z y H no. 
//    Entonces la List que se debería retornar sería: A,B,C.
//   @param pasajeros
//   @return mediasAmigas
    // Añade el elemento al ArrayList
//nombreArrayList.add("Elemento");
// Añade el elemento al ArrayList en la posición 'n'
//nombreArrayList.add(n, "Elemento 2");
    // Borra el elemento de la posición '5' del ArrayList   
//nombreArrayList.remove(5); 
// Borra la primera ocurrencia del 'Elemento' que se le pasa como parametro.  
//nombreArrayList.remove("Elemento");
    public List<String> mediasAmigas(List<String> medias) {
        //Aca escribir la logica necesaria
        ArrayList<String> sueltas = new ArrayList();
        ArrayList<String> pares = new ArrayList();
//expected:<[A, C, D]> but was:<[A, A, B, C, D, D]>

        for (int i = 0; i < medias.size(); i++) { //"A", "B", "C", "D", "A", "C", "D", "A"
                  //System.out.println("media buscada: " + medias.get(i));
                  //System.out.println("sueltas size: " + sueltas.size());
            if (sueltas.isEmpty()) {
                sueltas.add(medias.get(i)); 
                //System.out.println("sueltas cuando está vacía: "+Arrays.toString(sueltas.toArray())  );
            } else {
                int cont = 0;
                boolean encontrada = false;
                while (cont < sueltas.size() && !encontrada) { // nunca agregamos la media si no la encuentra, hacerlo con un while
                    if (sueltas.get(cont).equals(medias.get(i))) {
                        sueltas.remove(sueltas.get(cont));
                        //System.out.println("sueltas cuando lo encuentra: "+Arrays.toString(sueltas.toArray())  );
                        pares.add(medias.get(i)); 
                        //System.out.println("pares cuando lo encuentra: "+Arrays.toString(pares.toArray())  );
                        encontrada = true;
                    }else{
                        cont++;  //CONT = 1
                        if (cont == sueltas.size()){ 
                            cont++; //CONT = 2
                            sueltas.add(medias.get(i)); 
                           //System.out.println("sueltas cuando no lo encontró: "+Arrays.toString(sueltas.toArray())  );
                        }
                    }
                }
            }
        }

        Collections.sort(pares);

        return pares;
        
//        ArrayList <String> pares = new ArrayList();
//    Collections.sort(medias);
//    int c = 1;
//    for (int i = 0; i < medias.size()-1; i++) {
//        if (medias.get(i).equalsIgnoreCase(medias.get(i+1))) {
//            c++;
//            if (c == 2) {
//                pares.add(medias.get(i));
//                c = 0;
//            }
//        }else{
//            c=1;
//        }
//    }
//    return pares;
//    }
        
    }
}
