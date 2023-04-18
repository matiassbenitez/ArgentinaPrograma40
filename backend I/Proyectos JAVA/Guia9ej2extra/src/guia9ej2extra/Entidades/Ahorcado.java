package guia9ej2extra.Entidades;

public class Ahorcado {

    private char[] palabra;
    private int encontradas;
    private int intentos;
    private char[] descubierta;
    private String st1;
    private String st2;
    private String st3;
    private String st4;
    private String st5;
    private String st6;

    public Ahorcado() {
    }

    public Ahorcado(String palabra) {
        this.palabra = palabra.toCharArray();
        this.encontradas = 0;
        this.intentos = 6;
        
        descubierta = new char [palabra.length()];
        
        for (int i = 0; i < palabra.length(); i++) {
            descubierta[i] = '_';
        }
        st1 = "      _____    ";
        st2 = "     |    |    ";
        st3 = "     |    O    ";
        st4 = "     |         ";
        st5 = "     |         ";
        st6 = " ---------     ";
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public char[] getDescubierta() {
        return descubierta;
    }

    public void setDescubierta(char[] descubierta) {
        this.descubierta = descubierta;
    }

    public String getSt1() {
        return st1;
    }

    public void setSt1(String st1) {
        this.st1 = st1;
    }

    public String getSt2() {
        return st2;
    }

    public void setSt2(String st2) {
        this.st2 = st2;
    }

    public String getSt3() {
        return st3;
    }

    public void setSt3(String st3) {
        this.st3 = st3;
    }

    public String getSt4() {
        return st4;
    }

    public void setSt4(String st4) {
        this.st4 = st4;
    }

    public String getSt5() {
        return st5;
    }

    public void setSt5(String st5) {
        this.st5 = st5;
    }

    public String getSt6() {
        return st6;
    }

    public void setSt6(String st6) {
        this.st6 = st6;
    }
    

}
