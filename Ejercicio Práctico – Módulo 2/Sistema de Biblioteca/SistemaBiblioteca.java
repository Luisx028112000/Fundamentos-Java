


/**
 *
 * @author Ymalai Dorangel Leonardo Ramon
 */
public class SistemaBiblioteca {
    
    public static void main(String[] args) {
        System.out.println("\t<<Sistema de biblioteca>>\n");
        
        //Crear libros 
        System.out.println("\tCREANDO LIBROS...");
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "978-84-9759-5");
        Libro libro2 = new Libro("1984", "George Orwell", "978-84-9759-6");
        Libro libro3 = new Libro("El Principito", "Antoine de Saint-Exupéry", "978-84-9759-7");
        
        System.out.println("\tLibros creados con exito:");
        System.out.println("\n\tLibro 1: " + libro1.getTitulo() + (" by ") + libro1.getAutor());
        System.out.println("\tLibro 2: " + libro2.getTitulo() + (" by ") + libro2.getAutor());
        System.out.println("\tLibro 3: " + libro3.getTitulo() + (" by ") + libro3.getAutor());
        
        //Crear usuarios 
        System.out.println("\n\tCREANDO USUARIOS...");
           
        Usuario usuario1 = new Usuario("Ymalai Leonardo");
        Usuario usuario2 = new Usuario("Ysmael Leonardo");
        Usuario usuario3 = new Usuario("Ramon Leonardo");
        
        
        System.out.println("\tUsuario: " + usuario1.getNombre() + " (ID: " + usuario1.getIdUnico() + ")");
        System.out.println("\tUsuario: " + usuario2.getNombre() + " (ID: " + usuario2.getIdUnico() + ")");
        System.out.println("\tUsuario: " + usuario3.getNombre() + " (ID: " + usuario3.getIdUnico() + ")");
        
        //Disponibilidad 
        System.out.println("\n\tCONSULTANDO DISPONIBILIDAD...");
        System.out.println(libro1.consultarDisponibilidad());
        System.out.println(libro2.consultarDisponibilidad());
        System.out.println(libro3.consultarDisponibilidad());
        
        //Realizar prestamos 
        System.out.println("\n\tREALIZANDO PRESTAMOS...");
        usuario1.prestarLibro(libro3);
        usuario1.prestarLibro(libro1);
        usuario3.prestarLibro(libro2);
        
        //Crear registros de prestamo 
        System.out.println("\n\tREGISTRO DE PRESTAMOS");
        Prestamo prestamo1 = new Prestamo(usuario1, libro3);
        Prestamo prestamo2 = new Prestamo(usuario1, libro1);
        Prestamo prestamo3 = new Prestamo(usuario3, libro2);
        
        prestamo1.mostrarInfo();
        prestamo2.mostrarInfo();
        prestamo3.mostrarInfo();
        
        System.out.println("\n\tTOTAL DE PRESTAMOS REALIZADOS: " + Prestamo.getTotalPrestamos());
        
        //Consutlar disponibilidad de prestamos
        System.out.println("\n\tDISPONIBILIDAD ACTUAL");
        System.out.println(libro1.consultarDisponibilidad());
        System.out.println(libro2.consultarDisponibilidad());
        System.out.println(libro3.consultarDisponibilidad());
        
        
        //Mostrar libros prestados por usuario
        System.out.println("\n\tLIBROS PRESTADOS:");
        usuario1.mostrarLibroPrestados();
        usuario2.mostrarLibroPrestados();
        usuario3.mostrarLibroPrestados();
        
        //Devolver libro 
        System.out.println("\n\tDEVOLVIENDO LIBRO:");
        usuario1.devolverLibro(libro3);
        
        //Verificar despues de devolucion 
        System.out.println("\n\tDESPUES DE DEVOLUCION:");
        System.out.println(libro3.consultarDisponibilidad());
        usuario1.mostrarLibroPrestados();
    }
    
}
