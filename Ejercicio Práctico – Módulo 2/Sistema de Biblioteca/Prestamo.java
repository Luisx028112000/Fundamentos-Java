
import java.time.LocalDate;


public class Prestamo {
    
    //Atributos privados 
    private LocalDate fecha;
    private Usuario usuario;
    private Libro libro;
    private static int totalPrestamos = 0;
    
    //Constructores 
    public Prestamo(Usuario usuario, Libro libro) {
        this.fecha = LocalDate.now();
        this.usuario = usuario;
        this.libro = libro;
        totalPrestamos++;
    }
    
    //Getters 
    public LocalDate getFecha() {
        return fecha;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public Libro getLibro() {
        return libro;
    }
    
    public static int getTotalPrestamos() {
        return totalPrestamos;
    }
    
    //Mostrar informacion del prestamo 
    public void mostrarInfo(){ 
        System.out.println("\tFecha: " + fecha);
        System.out.println("\tUsuario: " + usuario.getNombre());
        System.out.println("\tLibro: " + libro.getTitulo() + " by " + libro.getAutor());
        System.out.println("\t---------------------------");
    }
}
