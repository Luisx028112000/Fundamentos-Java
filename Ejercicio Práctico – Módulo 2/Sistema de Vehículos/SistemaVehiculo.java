
/**
 * Clase principal SistemaVehiculos
 * 
 * PROPÓSITO:
 * Probar los constructores y métodos sobrecargados de la clase Vehiculo
 * 
 * FLUJO DEL PROGRAMA:
 * 1. Crear vehículos usando diferentes constructores
 * 2. Probar calcularMantenimiento() con diferentes parámetros
 * 3. Mostrar resultados
 * 
 * @author Luis E. Vargas
 */

public class SistemaVehiculo {

    public static void main(String[] args) {
        System.out.println("\n\t---SISTEMA DE VEHICULO---");
        
        //Probando constructores sobrecargados 
        // Constructor 1: Básico (sin parámetros)
        Vehiculo v1 = new Vehiculo();
        v1.mostrarInfo();
        
        // Constructor 2: Solo marca
        Vehiculo v2 = new Vehiculo("Honda");
        v2.mostrarInfo();
        
        // Constructor 3: Completo (todos los atributos)
        Vehiculo v3 = new Vehiculo("XYZ-789", "Toyota", "Corolla");
        v3.mostrarInfo();
        
        
        //Probando metodos sobrecargados
        System.out.println("\n\n\tCALCULANDO MANTENIMIENTO");
        
        // Prueba calcularMantenimiento(km)
        System.out.println("\t1. calcularMantenimiento(SOLO KM):");
        double costo1 = v3.calcularMantenimiento(1500);
        System.out.println(" \tCosto total: $" + costo1 + "\n");
        
        //Probando calcularMantenimiento(km, tipo)
        System.out.println("\t2. calcularMantenimiento(KM + TIPO):");
        double costo2 = v3.calcularMantenimiento(15000, "completo");
        System.out.println(" \tCosto total: $" + costo2 + "\n");
        
        System.out.println("\t3. calcularMantenimiento(KM + TIPO):");
        double costo3 = v3.calcularMantenimiento(15000, "premium");
        System.out.println(" \tCosto total: $" + costo3 + "\n");
        
       
    }
    
}
