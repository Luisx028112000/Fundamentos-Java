/**
 * Clase Vehiculo - Representa un vehículo automotor
 * DEMUESTRA:
 * - Constructores sobrecargados (3 versiones)
 * - Métodos sobrecargados (calcularMantenimiento con diferentes parámetros)
 * - Encapsulamiento (atributos private)
 */
public class Vehiculo {
    //Atributos privados
    private String placa;   // Matrícula del vehículo (ej: ABC-123)
    private String marca;   // Marca del vehículo (ej: Toyota)
    private String modelo;  // Modelo del vehículo (ej: Corolla)
    
    /**
     * Constructores sobrecargados
     * Sobrecarga: mismo nombre, diferentes parámetros
     */     
        
    /**
     * Constructor 1: BÁSICO (sin parámetros)
     * Asigna valores por defecto cuando no se proporcionan datos
     */
    public Vehiculo(){
        this.marca = "Generica";
        this.placa = "Sin asignar";
        this.modelo = "Basico";
        System.out.println("\n\tVehiculo creado (constructor basico)");
        
    } 
    
    /**
     * Constructor 2: SOLO MARCA
     * @param placa Matrícula del vehículo
     * Los demás atributos se asignan con valores por defecto
     */
    public Vehiculo(String marca){
        this.marca = marca;        
        this.placa = "Sin asignar";
        this.modelo = "Desconocida";
        System.out.println("\n\tVehiculo creado con marca: " + marca);
    }
   
    /**
     * Constructor 3: COMPLETO (todos los atributos)
     * @param placa Matrícula del vehículo
     * @param marca Marca del vehículo
     * @param modelo Modelo del vehículo
     */
    public Vehiculo(String placa, String marca, String modelo){
        this.marca = marca;
        this.placa = placa;
        this.modelo = modelo;
        System.out.println("\n\tVehiculo creado: " + marca + " " + modelo + " - " + placa);
    }
        
    //Metodos sobrecargados
    /**
     * Versión 1: calcula costo SOLO con KILOMETRAJE
     * @param km Kilometraje recorrido
     * @return Costo estimado ($0.05 por km)
     */    public double calcularMantenimiento(int km){
        double costo = km * 0.05;   // Tarifa base: $0.05 por kilómetro
        System.out.println("\tMantenimiento basico (km)");
        return costo;
    }
    
    /**
     * Versión 2: calcula costo con KILOMETRAJE + TIPO DE SERVICIO
     * @param km Kilometraje recorrido
     * @param tipoServicio Tipo de servicio (básico, completo, premium)
     * @return Costo total incluyendo recargos por tipo de servicio
     */
    public double calcularMantenimiento(int km, String tipoServicio){
        double costoBase = km * 0.05;   // Costo por kilometraje
        double costoTotal = costoBase;
        
        // Switch para aplicar recargos según tipo de servicio
        switch  (tipoServicio.toLowerCase()){
            case "basico":
                costoTotal = costoBase; // Con recargo $20
                System.out.println("\tServicio BASICO (+$20)");
                costoTotal = costoBase + 20;
                break;
            case "completo":
                costoTotal = costoBase + 50; // Recargo $50
                System.out.println("\tServicio COMPLETO (+$50)");
                break;
            case "premium":
                costoTotal = costoBase + 120;   // Recargo $120
                System.out.println("\tServicio PREMIUM (+$120)");
                break;
            default:
                System.out.println("\tTipo no reconocido, aplicando básico");
        }
        System.out.println(" \tKilometraje: " + km + " km");
        return costoTotal;
          
    }
    
    //GETTERS
    // Métodos públicos para acceder a atributos privados
    /**
     * @return marca del vehículo
     */
    public String getMarca(){
        return marca;
    }
    /**
     * @return placa del vehículo
     */
    public String getPlaca(){
        return placa;
    }
    /**
     * @return modelo del vehículo
     */
    public String getModelo(){
        return modelo;
    }
    
    /**
     * Muestra información completa del vehículo
     */
    public void mostrarInfo(){
        System.out.println("\tVEHICULO:");
        System.out.println(" \tPlaca: " + placa);
        System.out.println(" \tMarca: " + marca);
        System.out.println(" \tModelo: " + modelo);
    }
}
