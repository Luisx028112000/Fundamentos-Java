
public class Libro {
    
    //Atributos privados
    private String titulo;
    private String autor;
    private String ISBN;
    private boolean disponible;
    
    //Constructores 
    public Libro(String titulo, String autor, String ISBN){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.disponible = true; //Por defecto esta disponible
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public String getISBN() {
        return ISBN;
    }
    
    //Getters boleanos no utilizan get, utilizan is.
    public boolean isDisponible() {
        return disponible;
    }
    
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    //Metodo para consultar disponibilidad 
    public String consultarDisponibilidad(){
        if (disponible) {
            return "\tEl libro '" + titulo + " by " + autor + "' esta DISPONIBLE";
        } else {
            return "\tEl libro '" + titulo + " by " + autor + "' esta PRESTADO";
        }
    }
    
    
}
