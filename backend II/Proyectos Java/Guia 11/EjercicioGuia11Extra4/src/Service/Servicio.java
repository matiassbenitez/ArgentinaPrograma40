/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.Cuotas;
import Entity.Poliza;
import Entity.gestionCliente;
import Entity.gestionVehiculo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author godoy
 */
public class Servicio {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    gestionCliente cliente = new gestionCliente();
    gestionVehiculo vehiculo = new gestionVehiculo();
    Poliza p = new Poliza();
    Cuotas c = new Cuotas();
    
   public void crearVariosClientes(){
       //nombre, apellido, mail, domicilio, documento, telefono
       ArrayList <gestionCliente> listaClientes = new ArrayList();
       gestionCliente c1 = new gestionCliente("Martin", "Longa","LongMartin@gmail.com","San Martin",4031545,54882431);
       gestionCliente c2 = new gestionCliente("Matias", "Benitez","BenitezAJugarConMigo@gmail.com","Santa Fe",2731525,54882431);
       gestionCliente c3 = new gestionCliente("Pablo", "Godoy","GodoyPabloJuan@gmail.com","Neuquen",37781734,29945454);
       gestionCliente c4 = new gestionCliente("Alex", "Noma","AlexNoma@gmail.com","Capital Federal",24565463,54882431);
       gestionCliente c5 = new gestionCliente("Luna", "Llena","Luna@gmail.com","Marte",1324546,54882431);
       gestionCliente c6 = new gestionCliente("Carolina", "Piedrosa","PiedraLarga@gmail.com","Piedra del Aguila",44321202,299882431);
       listaClientes.add(c1);
       listaClientes.add(c2);
       listaClientes.add(c3);
       listaClientes.add(c4);
       listaClientes.add(c5);
       listaClientes.add(c6);
       
       
       
       
       
       
   }
    
}
