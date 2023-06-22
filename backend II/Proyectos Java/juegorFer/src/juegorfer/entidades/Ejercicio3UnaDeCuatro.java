package juegoFer.entidades;

public class Ejercicio3UnaDeCuatro {

    public int opc;
    public String[] respuesta;
    public String[] cadenaDescripcion;

    public Ejercicio3UnaDeCuatro() {
    }

    public Ejercicio3UnaDeCuatro(String[] respuesta, String[] cadenaDescripcion) {
        this.opc = 0;
        this.respuesta = respuesta;
        this.cadenaDescripcion = cadenaDescripcion;
    }

    public int getOpc() {
        return opc;
    }

    public void setOpc(int opc) {
        this.opc = opc;
    }

    public String[] getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String[] respuesta) {
        this.respuesta = respuesta;
    }

    public String[] getCadenaDescripcion() {
        return cadenaDescripcion;
    }

    public void setCadenaDescripcion(String[] cadenaDescripcion) {
        this.cadenaDescripcion = cadenaDescripcion;
    }
    
}
