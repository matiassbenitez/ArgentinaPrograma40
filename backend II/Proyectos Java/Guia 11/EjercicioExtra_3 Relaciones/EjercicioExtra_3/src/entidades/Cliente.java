package entidades;

import java.util.ArrayList;

public class Cliente {
    private String nombreApellido, email,domicilio;
    private Integer documento, telefono;
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Poliza> polizas;

    public Cliente() {
    }

    public Cliente(String nombreApellido, String email, String domicilio, Integer documento, Integer telefono) {
        this.nombreApellido = nombreApellido;
        this.email = email;
        this.domicilio = domicilio;
        this.documento = documento;
        this.telefono = telefono;
        this.vehiculos = new ArrayList();
        this.polizas = new ArrayList();
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Poliza> getPolizas() {
        return polizas;
    }

    public void setPolizas(ArrayList<Poliza> polizas) {
        this.polizas = polizas;
    }

    @Override
    public String toString() {
        return "Cliente{\n" + "\n\tnombreApellido=" + nombreApellido + ", \n\temail=" + email + ", \n\tdomicilio=" + domicilio + ", \n\tdocumento=" + documento + ", \n\ttelefono=" + telefono + ", \n\tvehiculos=" + vehiculos.toString() + ", \n\tpolizas=" + polizas.toString() + '}';
    }
    
    
    
    
    
    
    
    
    
    
}
