public class EstructuraBasica {
    public static void main(String[] args) {
        // Declaración de variables
        String nombre = "María";
        int edad = 28;
        double salario = 45000.50;
        boolean esEmpleado = true;

        // Operaciones
        double salarioAnual = salario * 12;
        int edadProxima = edad + 1;

        // Salida de datos
        System.out.println("=== INFORMACIÓN DEL EMPLEADO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad actual: " + edad);
        System.out.println("Edad próximo año: " + edadProxima);
        System.out.println("Salario mensual: $" + salario);
        System.out.println("Salario anual: $" + salarioAnual);
        System.out.println("¿Es empleado activo? " + esEmpleado);
    }
}
