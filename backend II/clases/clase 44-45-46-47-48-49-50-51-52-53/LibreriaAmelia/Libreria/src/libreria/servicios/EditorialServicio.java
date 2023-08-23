package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;

public class EditorialServicio {

    EditorialDAO editorialDAO = new EditorialDAO();

    public Editorial crearEditorial() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Editorial editorial = null;

        do {
            System.out.println("Ingrese el nombre de la editorial: ");
            String nombre = leer.next();

            while (nombre.isEmpty() || nombre.length() < 2 || nombre.contains("@")) {
                System.out.println("Nombre inválido. Por favor, ingrese un nombre válido: ");
                nombre = leer.next();
            }

            editorial = new Editorial(nombre, true);

            // Guardar la editorial utilizando el método "agregar"
            if (editorial == null) {
                editorialDAO.agregarEditorial(editorial);
            }

            System.out.println("¿Desea crear otra editorial? (S/N)");
            String respuesta = leer.next();

            if (!respuesta.equalsIgnoreCase("S")) {
                break;
            }

        } while (true);

        return editorial;
    }

    public Editorial crearEditorialMenu() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Editorial editorial = null;

        System.out.println("Ingrese el nombre de la editorial: ");
        String nombre = leer.next();

        while (nombre.isEmpty() || nombre.length() < 2 || nombre.contains("@")) {
            System.out.println("Nombre inválido. Por favor, ingrese un nombre válido: ");
            nombre = leer.next();
        }

        editorial = new Editorial(nombre, true);

        // Guardar la editorial utilizando el método "agregar"
        if (editorial == null) {
            editorialDAO.agregarEditorial(editorial);
        }

        return editorial;
    }

    public void mostrarEditorial() {
        List<Editorial> editoriales = editorialDAO.listar();
        if (editoriales != null && !editoriales.isEmpty()) {
            System.out.println("Lista de editoriales:");
            editoriales.forEach(System.out::println);
        } else {
            System.out.println("No se encontraron editoriales.");
        }
    }

    public void altaEditorial() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        List<Editorial> listaInactivos = editorialDAO.listarInactivos();
        if (listaInactivos.isEmpty()) {
            System.out.println("No existen editoriales inactivas.");
        } else {
            do {
                System.out.println("Lista de editoriales inactivos: ");
                listaInactivos.forEach(System.out::println);
                System.out.print("Ingrese el ID de la editorial que desea dar de alta: ");
                int id = leer.nextInt();

                Editorial editorial = editorialDAO.buscarPorId(id);

                if (editorial != null) {
                    editorial.setAlta(true);
                    editorialDAO.modificarEditorial(editorial);
                    System.out.println("Autor dado de alta exitosamente.");
                }
                System.out.print("¿Desea dar de alta a otra editorial? (S/N): ");
                String rta = leer.next();

                if (!rta.equalsIgnoreCase("S")) {
                    break;
                }
            } while (true);
        }
    }

    public void bajaEditorial() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        List<Editorial> listaActivos = editorialDAO.listar();
        if (listaActivos.isEmpty()) {
            System.out.println("No existen editoriales activas.");
        } else {
            do {
                System.out.println("Lista de editoriales activas:");
                listaActivos.forEach(System.out::println);
                System.out.print("Ingrese el Id de la editorial que desea dar de baja: ");
                int id = leer.nextInt();

                Editorial editorial = editorialDAO.buscarPorId(id);

                if (editorial != null) {
                    editorial.setAlta(false);
                    editorialDAO.modificarEditorial(editorial);
                    System.out.println("Autor dado de baja exitosamente.");
                }
                System.out.print("¿Desea dar de baja a otra editorial? (S/N): ");
                String rta = leer.next();

                if (!rta.equalsIgnoreCase("S")) {
                    break;
                }
            } while (true);
        }

    }

    public void editarEditorial() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        do {
            mostrarEditorial();

            System.out.println("Ingrese el ID de la editorial que desea modificar: ");
            int id = leer.nextInt();

            Editorial editorial = editorialDAO.buscarPorId(id);

            if (editorial != null) {
                String nombre;
                do {
                    System.out.println("Ingrese el nuevo nombre: ");
                    nombre = leer.next();
                } while (!nombre.trim().isEmpty()
                        && nombre.length() >= 2
                        && !nombre.trim().matches("\\D*")
                        && !nombre.contains("@"));

                editorial.setNombre(nombre);
                editorialDAO.modificarEditorial(editorial);
                System.out.println("Editorial modificada exitosamente.");
            } else {
                System.out.println("No se encontró ninguna editorial con el ID proporcionado.");
            }

            System.out.print("¿Desea editar otra editorial? (S/N): ");
            String respuesta = leer.next();

            if (!respuesta.equalsIgnoreCase("S")) {
                break;
            }
        } while (true);
    }

    public void eliminarEditorial() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        do {
            mostrarEditorial();
            // Solicitar al usuario el ID o nombre del autor que desea eliminar
            System.out.print("Ingrese el ID o el nombre de la editorial que desea eliminar: ");
            String input = leer.next();

            // Verificar si el input es un número (ID) o una cadena (nombre)
            boolean isId = input.matches("\\d+");

            // Buscar el autor en la base de datos
            Editorial editorial = null;
            if (isId) {
                // Buscar por ID
                int id = Integer.parseInt(input);
                editorial = editorialDAO.buscarPorId(id);
            } else {
                // Buscar por nombre
                editorial = editorialDAO.buscarPorNombre(input);
            }

            // Verificar si se encontró el autor y proceder con la eliminación
            if (editorial != null) {
                editorialDAO.eliminarEditorial(editorial);
                System.out.println("Editorial eliminada exitosamente.");
            } else {
                System.out.println("No se encontró ninguna editorial con el ID o nombre proporcionado.");
            }
            System.out.print("¿Desea eliminar otra editorial? (S/N): ");
            String respuesta = leer.next();

            if (!respuesta.equalsIgnoreCase("S")) {
                break;
            }
        } while (true);
    }
}
