package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

public class AutorServicio {

    AutorDAO autorDAO = new AutorDAO();

    public Autor crearAutor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Autor autor = null;

        do {
            System.out.println("Ingrese el nombre completo del autor: ");
            String nombre = leer.nextLine().trim();

            while (nombre.isEmpty() || nombre.length() < 2 || nombre.contains("@")) {
                System.out.println("Nombre inválido. Por favor, ingrese un nombre válido: ");
                nombre = leer.nextLine().trim();
            }

            autor = new Autor(nombre, true);
            // Guardar el autor utilizando el método "agregarAutor"
            if (autor == null) {
                autorDAO.agregarAutor(autor);
            }

            System.out.println("¿Desea crear otro autor? (S/N)");
            String respuesta = leer.next();

            if (!respuesta.equalsIgnoreCase("S")) {
                break;
            }

        } while (true);

        return autor;
    }

    public Autor crearAutorMenu() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Autor autor = null;

        System.out.println("Ingrese el nombre completo del autor: ");
        String nombre = leer.nextLine().trim();

        while (nombre.isEmpty() || nombre.length() < 2 || nombre.contains("@")) {
            System.out.println("Nombre inválido. Por favor, ingrese un nombre válido: ");
            nombre = leer.nextLine().trim();
        }

        autor = new Autor(nombre, true);
        // Guardar el autor utilizando el método "agregarAutor"
        if (autor == null) {
            autorDAO.agregarAutor(autor);
        }

        return autor;
    }

    public void mostrarAutor() {
        List<Autor> autores = autorDAO.listar();

        if (autores != null && !autores.isEmpty()) {
            System.out.println("Lista de autores:");
            for (Autor autor : autores) {
                System.out.println("Id: " + autor.getId() + "\tNombre: " + autor.getNombre() + "\talta: " + autor.getAlta());
            }
        } else {
            System.out.println("No se encontraron autores.");
        }
    }

    public void altaAutor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        List<Autor> listaInactivos = autorDAO.listarInactivos();
        if (listaInactivos.isEmpty()) {
            System.out.println("No existen autores inactivos.");
        } else {
            do {
                System.out.println("Lista de autores inactivos: ");
                listaInactivos.forEach(System.out::println);
                System.out.print("Ingrese el ID del autor que desea dar de alta: ");
                int id = leer.nextInt();

                Autor autor = autorDAO.buscarPorId(id);

                if (autor != null) {
                    autor.setAlta(true);
                    autorDAO.modificarAutor(autor);
                    System.out.println("Autor dado de alta exitosamente.");
                }
                System.out.print("¿Desea dar de alta a otro autor? (S/N): ");
                String rta = leer.next();

                if (!rta.equalsIgnoreCase("S")) {
                    break;
                }
            } while (true);
        }
    }

    public void bajaAutor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        List<Autor> listaActivos = autorDAO.listar();
        if (listaActivos.isEmpty()) {
            System.out.println("No existen autores activos.");
        } else {
            do {
                System.out.println("Lista de autores activos:");
                listaActivos.forEach(System.out::println);
                System.out.print("Ingrese el Id del autor que desea dar de baja: ");
                int id = leer.nextInt();

                Autor autor = autorDAO.buscarPorId(id);

                if (autor != null) {
                    autor.setAlta(false);
                    autorDAO.modificarAutor(autor);
                    System.out.println("Autor dado de baja exitosamente.");
                }
                System.out.print("¿Desea dar de baja a otro autor? (S/N): ");
                String rta = leer.next();

                if (!rta.equalsIgnoreCase("S")) {
                    break;
                }
            } while (true);
        }

    }

    public void editarAutor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        do {
            List<Autor> lista = autorDAO.listar();
            System.out.println("Lista de autores: ");
            lista.forEach(System.out::println);
            System.out.println("Ingrese el ID del autor que desea modificar: ");
            int id = leer.nextInt();

            Autor autor = autorDAO.buscarPorId(id);

            if (autor != null) {
                String nombre;
                do {
                    System.out.println("Ingrese el nuevo nombre: ");
                    nombre = leer.next();
                } while (!nombre.trim().isEmpty()
                        && nombre.length() >= 2
                        && !nombre.trim().matches("\\D*")
                        && !nombre.contains("@"));

                autor.setNombre(nombre);
                autorDAO.modificarAutor(autor);
                System.out.println("Autor modificado exitosamente.");
            } else {
                System.out.println("No se encontró ningún autor con el ID proporcionado.");
            }

            System.out.print("¿Desea editar otro autor? (S/N): ");
            String respuesta = leer.next();

            if (!respuesta.equalsIgnoreCase("S")) {
                break;
            }
        } while (true);
    }

    public void eliminarAutor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        do {
            // Mostrar la lista de autores
            List<Autor> autores = autorDAO.listar();
            System.out.println("Lista de autores:");
            for (Autor autor : autores) {
                System.out.println(autor);
            }
            // Solicitar al usuario el ID o nombre del autor que desea eliminar
            System.out.print("Ingrese el ID o el nombre del autor que desea eliminar: ");
            String input = leer.next();

            // Verificar si el input es un número (ID) o una cadena (nombre)
            boolean isId = input.matches("\\d+");

            // Buscar el autor en la base de datos
            Autor autor = null;
            if (isId) {
                // Buscar por ID
                int id = Integer.parseInt(input);
                autor = autorDAO.buscarPorId(id);
            } else {
                // Buscar por nombre
                autor = autorDAO.buscarPorNombre(input);
            }

            // Verificar si se encontró el autor y proceder con la eliminación
            if (autor != null) {
                autorDAO.eliminarAutor(autor);
                System.out.println("Autor eliminado exitosamente.");
            } else {
                System.out.println("No se encontró ningún autor con el ID o nombre proporcionado.");
            }
            System.out.print("¿Desea eliminar otro autor? (S/N): ");
            String respuesta = leer.next();

            if (!respuesta.equalsIgnoreCase("S")) {
                break;
            }
        } while (true);
    }
}
