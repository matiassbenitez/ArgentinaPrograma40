
package g11extra3.entidades;



public class GestionIntegralClientes {
    private String nombre;
    private String apellido;
    private int dni;
    private String mail;
    private String domicilio;
    private int nDomicilio;
    private int telefono;

    public GestionIntegralClientes() {
    }

    public GestionIntegralClientes(String nombre, String apellido, int dni, String mail, String domicilio, int nDomicilio, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.mail = mail;
        this.domicilio = domicilio;
        this.nDomicilio = nDomicilio;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getnDomicilio() {
        return nDomicilio;
    }

    public void setnDomicilio(int nDomicilio) {
        this.nDomicilio = nDomicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "GestionIntegralClientes{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", mail=" + mail + ", domicilio=" + domicilio + ", nDomicilio=" + nDomicilio + ", telefono=" + telefono + '}';
    }
    
    
}
