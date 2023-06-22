package servicio;

import entidades.Cliente;
import entidades.Vehiculo;
import enumeraciones.ColorVehiculo;
import enumeraciones.MarcaAuto;
import enumeraciones.TipoVehiculo;
import java.util.ArrayList;
import java.util.Scanner;

public class ClienteService {
    Scanner leer;
    private final ArrayList<Cliente> clientes;
    
    public ClienteService() {
        this.clientes = new ArrayList<>();
        clientes.add(new Cliente("Pepe Perez", "Pepe@gmail.com", "Av siempre viva 456", 12345678, 987654121));
        clientes.add(new Cliente("Pepa Perez", "Pepa@gmail.com", "Av siempre viva 456", 12345678, 987654121));
        clientes.add(new Cliente("Pipo Perez", "Pipo@gmail.com", "Av siempre viva 456", 12345678, 987654121));
        clientes.add(new Cliente("Pepo Perez", "Pepo@gmail.com", "Av siempre viva 456", 12345678, 987654121));
    
    }
    
    
    public void agregarVehiculo(){
        leer =  new Scanner(System.in);
        Vehiculo car = new Vehiculo();//Declaro un objeto coche temporal que iré completando, para al final, setearselo al cliente
        int opcion = 0;
        String opcionPa;
        
        //Muestro las marcas y la Seteo en el auto
        System.out.println("Lista de marcas: ");
        for (int i = 0; i < MarcaAuto.values().length; i++) {
            System.out.println(i +"- "+MarcaAuto.values()[i]);
        }
        opcion = leer.nextInt();
        while (opcion < 0 || (opcion > MarcaAuto.values().length-1)) {
            System.out.println("Opcion invalida");
            opcion = leer.nextInt();
        }
        car.setMarca(MarcaAuto.values()[opcion]);

        
        //Muestro la lista de modelos y se lo seteo al auto
        System.out.println("Lista de modelos: ");
        for (int i = 0; i < car.getMarca().getModelos().length; i++) {
            System.out.println(i +"- "+car.getMarca().getModelos()[i]);
        }
        
        opcion = leer.nextInt();
        while (opcion < 0 || (opcion > car.getMarca().getModelos().length-1)) {
            System.out.println("Opcion invalida");
            opcion = leer.nextInt();
        }
        car.setModelo(car.getMarca().getModelos()[opcion]);
        
        
        //Muestro lista de tipos de vehiculos
        System.out.println("Lista de tipos: ");
        for (int i = 0; i < TipoVehiculo.values().length; i++) {
            System.out.println(i+"- "+TipoVehiculo.values()[i]);
        }
        opcion=leer.nextInt();
        while (opcion < 0 || (opcion > TipoVehiculo.values().length-1)){
            System.out.println("Número inválido, intente nuevamente");
            opcion= leer.nextInt();
        }
        car.setTipo(TipoVehiculo.values()[opcion]);
        
        //Pido el año y lo asigno al auto
        System.out.println("Ingrese el año del vehiculo");
        opcion= leer.nextInt();
        car.setYear(opcion);
        
        //Ingreso una cadena alfanumérica que corresponda al número de motor y seteo al auto
        System.out.println("Ingrese el número de motor del vehiculo");
        opcionPa= leer.next();
        car.setNumeroMotor(opcionPa);
        
        //Ingreso una cadena alfanumérica que corresponda al número de chasis y seteo al auto
        System.out.println("Ingrese el chasis del vehiculo");
        opcionPa= leer.next();
        car.setChasis(opcionPa);
        
        //Pido el color y lo seteo al auto
        System.out.println("Lista de Colores: ");
        for (int i = 0; i < ColorVehiculo.values().length; i++) {
            System.out.println(i+"- "+ColorVehiculo.values()[i]);
        }
        opcion=leer.nextInt();
        while (opcion < 0 || (opcion > ColorVehiculo.values().length-1)){
            System.out.println("Número inválido, intente nuevamente");
            opcion= leer.nextInt();
        }
        car.setColor(ColorVehiculo.values()[opcion]);
       
        //Agrego el auto ficticio al cliente en la posición 0 de la lista de clientes, acá irá un sistema de selección de
        //clientes. También, a modo de testeo, muestro a ese mismo cliente, que ahora tiene un vehiculo agregado
        clientes.get(0).getVehiculos().add(car);
        System.out.println(clientes.get(0).toString());
    }
    
    private void cargarPoliza(){
    }
    
    
}
