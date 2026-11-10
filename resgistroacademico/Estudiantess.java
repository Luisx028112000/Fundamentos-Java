
package resgistroacademico;

/**
 *
 * @author Luis E. Vargas
 */
public class Estudiantess {
    // Atributos de texto
    private String matricula;
    private String nombre;
    private String carrera;
    
    // Atributos numéricos (Las calificaciones)
    private double practicas;
    private double parciales;
    private double asignaciones;
    private double examenFinal;

    // Constructor vacío
    public Estudiantess() {
    }

    // --- MÉTODOS DE LÓGICA ---
    public double calcularNotaTotal() {
        return practicas + parciales + asignaciones + examenFinal;
    }

    public String obtenerEstado() {
        if (calcularNotaTotal() >= 60) {
            return "APROBADO ✅";
        } else {
            return "REPROBADO ❌";
        }
    }

    // --- GETTERS Y SETTERS ---
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    public double getPracticas() { return practicas; }
    public void setPracticas(double practicas) { this.practicas = practicas; }

    public double getParciales() { return parciales; }
    public void setParciales(double parciales) { this.parciales = parciales; }

    public double getAsignaciones() { return asignaciones; }
    public void setAsignaciones(double asignaciones) { this.asignaciones = asignaciones; }

    public double getExamenFinal() { return examenFinal; }
    public void setExamenFinal(double examenFinal) { this.examenFinal = examenFinal; }
} 
