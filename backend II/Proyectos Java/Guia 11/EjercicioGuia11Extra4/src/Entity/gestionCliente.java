/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *Gestión Integral de clientes. En este módulo vamos a registrar la información personal de
cada cliente que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail,
domicilio, teléfono.
 * @author godoy
 */
public class gestionCliente {
    private String nombre, apellido, mail, domicilio;
    private int documento, telefono;


    // Constructor, como Bob
    public gestionCliente() {
    }

    public gestionCliente(String nombre, String apellido, String mail, String domicilio, int documento, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.domicilio = domicilio;
        this.documento = documento;
        this.telefono = telefono;
    }
    
    
    // Getter & Setter
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMail() {
        return mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public int getDocumento() {
        return documento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Gestion de Clientes: " + "\nnombre= " + nombre + ", \napellido= " + apellido + ", \nmail= " + mail + ", \ndomicilio= " + domicilio + ", \ndocumento= " + documento + ", \ntelefono= " + telefono + ' ';
    }
    
    
}
