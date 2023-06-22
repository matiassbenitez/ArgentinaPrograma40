/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradorfinal;

import entidades.Estudiantes;
import servicios.administracion;

/**
 *
 * @author 107136
 */
public class IntegradorFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        administracion servicio = new administracion();
        
        Estudiantes [] alumne=servicio.Cargar();
        double promedio=servicio.Calcular(alumne);
        String [] mayorNota=servicio.AlumnesMayorNota(alumne, promedio);
        servicio.Mostrar(mayorNota);
        
    }
    
}
