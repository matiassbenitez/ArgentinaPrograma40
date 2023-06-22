package Entidades;

public class Ejercicio3Libro {

    private String título;
    private String autor;
    private Integer ejemplares;
    private Integer ejemplaresPrestados;

    public Ejercicio3Libro() {
    }

    public Ejercicio3Libro(String título, String autor, Integer ejemplares, Integer ejemplaresPrestados) {
        this.título = título;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Integer getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(Integer ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    @Override
    public String toString() {
        return "Ejercicio3Libro{" + "t\u00edtulo=" + título + ", autor=" + autor + ", ejemplares=" + ejemplares + ", ejemplaresPrestados=" + ejemplaresPrestados + '}';
    }
    
}
