package alexisrl.ejercicio1guia9.Entidades.CadenaServicio;

import alexisrl.ejercicio1guia9.Entidades.Cadena;

/**
 * Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como
 * atributos una frase (String) y su longitud. Agregar constructor vacío y con
 * atributo frase solamente. Agregar getters y setters. El constructor con frase
 * como atributo debe setear la longitud de la frase de manera automática. Crear
 * una clase CadenaServicio en el paquete servicios que implemente los
 * siguientes métodos: Método mostrarVocales(), deberá contabilizar la cantidad
 * de vocales que tiene la frase ingresada. Método invertirFrase(), deberá
 * invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada:
 * "casa blanca", Salida: "acnalb asac". Método vecesRepetido(String letra),
 * recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se
 * repite el carácter en la frase, por ejemplo: Entrada: frase = "casa blanca".
 * Salida: El carácter 'a' se repite 4 veces. 
 * Método compararLongitud(String
 * frase), deberá comparar la longitud de la frase que compone la clase con otra
 * nueva frase ingresada por el usuario. 
 * Método unirFrases(String frase), deberá
 * unir la frase contenida en la clase Cadena con una nueva frase ingresada por
 * el usuario y mostrar la frase resultante. 
 * Método reemplazar(String letra),
 * deberá reemplazar todas las letras “a” que se encuentren en la frase, por
 * algún otro carácter seleccionado por el usuario y mostrar la frase
 * resultante. 
 * Método contiene(String letra), deberá comprobar si la frase
 * contiene una letra que ingresa el usuario y devuelve verdadero si la contiene
 * y falso si no.
 *
 * @author ALEXIS.R.L
 */
public class CadenaServicios {

    public int mostrarVocales(Cadena frase){
        int cont = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            switch (frase.getCadena().substring(i,i+1)) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u": 
                    cont++;
                    break;
            }
        }
        return cont;
    }
    public void invertirFrase(Cadena frase){
        for (int i = frase.getLongitud()-1; i>=0; i--) {
            System.out.print(frase.getCadena().substring(i, i+1));
            
        }
        System.out.println("");
    }
    public int vecesRepetido(String letra, Cadena frase){
        int cont=0;    
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (frase.getCadena().substring(i, i+1).equalsIgnoreCase(letra)) {
                cont++;
            }
        }
        return cont;
    }
    public void compararLongitud(Cadena cadena,String frase){ 
        if (frase.length()==cadena.getLongitud()) {
            System.out.println("tienen la misma longitud");
        }else{
            System.out.println("no tienen la misma longitud");
        }
    }
    public void unirFrases(Cadena cadena,String frase){
        String fraseUnir=cadena.getCadena().concat(frase);
        System.out.println(fraseUnir);
    }
    public void reemplazar(Cadena frase, String letra){
        String fraseRemplazar=frase.getCadena().replaceAll("a", letra);
        System.out.println(fraseRemplazar);
    }
    public boolean contiene(String letra, Cadena cadena){
        
        String let;
            for (int i = 0; i < cadena.getLongitud(); i++) {
              let=cadena.getCadena().substring(i, i+1);
                if (letra.equalsIgnoreCase(let)) {
                    System.out.println("la letra se encuentra en la posicion "+i);
                    return true;
                }
        }return false;
        
    }
    
}
