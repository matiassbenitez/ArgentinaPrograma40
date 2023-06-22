
package relaciones.entidades;


public class Curso {

    private int anio;
    private char division;
    private Profesor profesor;


    public Curso() {
    }

    public Curso(int anio, char division, Profesor profesor) {
        this.anio = anio;
        this.division = division;
        this.profesor = profesor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public char getDivision() {
        return division;
    }

    public void setDivision(char division) {
        this.division = division;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
}
