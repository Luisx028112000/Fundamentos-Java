
public class Cliente {
    private String nombre;
    private String numeroTelefonico;
    private Plan plan; //Referencia a la clase Plan
    
    //Getters
    public String getNombre(){
        return nombre;
    }
    public String getNumeroTelefonico(){
        return numeroTelefonico;
    }
    public Plan getPlan(){
        return plan;
    }
    
    //Constructor 
    public Cliente(String nombre, String numeroTelefonico, Plan plan) {
        this.nombre = nombre;
        this.numeroTelefonico = numeroTelefonico;
        this.plan = plan;
    }
    
    // Mostrar información
    public void mostrarInfo() {
        System.out.println("\n\tCLIENTE:");
        System.out.println("\t  Nombre: " + nombre);
        System.out.println("\t  Telefono: " + numeroTelefonico);
        if (plan != null) {
            plan.mostrarInfo();
        }
    }
    
}
