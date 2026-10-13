
import java.util.ArrayList;


public class Usuario {
    //Atributos privados 
    private String nombre;
    private int idUnico;
    private ArrayList<Libro> librosPrestados;
    private static int contadorIds = 1; //Para general IDs unicos 
    
    //Constructores 
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.idUnico = contadorIds++;
        this.librosPrestados = new ArrayList<>();
    }
    
    //Getters 
    public String getNombre(){
        return nombre;
    }
    public int getIdUnico(){
        return idUnico;
    }
    public ArrayList<Libro> getLibrosPrestados(){
        return librosPrestados;
    } 
    
    //Metodo para prestar libros 
    public boolean prestarLibro(Libro libro){
        if (libro.isDisponible()) {
            librosPrestados.add(libro);
            libro.setDisponible(false);
            System.out.println("\t" + nombre + " tomo prestado: " + libro.getTitulo() + " by " + libro.getAutor());
            return true;
        } else {
            System.out.println("\tEl libro '" + libro.getTitulo() + " by " + libro.getAutor() + "' no esta disponible");
            return false;
        }
    }
    
    //Metodo para devolver libro 
    public boolean devolverLibro (Libro libro) {
        if (librosPrestados.contains(libro)) {
            librosPrestados.remove(libro);
            libro.setDisponible(true);
            System.out.println("\t" +nombre + " devolvio: " + libro.getTitulo() + " by " + libro.getAutor());
            return true;
        } else {
            System.out.println("\t" + nombre + " no tiene este libro");
            return false;
        }
    }
    
    //Mostrar libros prestados 
    public void mostrarLibroPrestados() {
        System.out.println("\tLibros prestados a " + nombre + ": ");
        if (librosPrestados.isEmpty()) {
            System.out.println("\t No tiene libros prestados.");
        } else {
            for (Libro libro : librosPrestados){
            System.out.println("\t - " + libro.getTitulo() + " by " + libro.getAutor());
            }
        }
    }
}
