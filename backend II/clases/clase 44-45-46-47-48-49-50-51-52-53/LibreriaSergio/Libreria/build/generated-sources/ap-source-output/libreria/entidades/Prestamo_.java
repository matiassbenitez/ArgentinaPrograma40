package libreria.entidades;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import libreria.entidades.Cliente;
import libreria.entidades.Libro;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-07-06T23:25:46")
@StaticMetamodel(Prestamo.class)
public class Prestamo_ { 

    public static volatile SingularAttribute<Prestamo, Libro> libro;
    public static volatile SingularAttribute<Prestamo, Cliente> cliente;
    public static volatile SingularAttribute<Prestamo, Date> fechaDevolucion;
    public static volatile SingularAttribute<Prestamo, Date> fechaPrestamo;
    public static volatile SingularAttribute<Prestamo, Integer> id;

}