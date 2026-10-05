public class ProcesamientoEmpleados {
    public static void main(String[] args) {
        String[] empleados = {
            "Ana García",
            "Carlos Ruiz",
            "María López",
            "Juan Pérez",
            "Laura Martínez"
        };

        System.out.println("=== LISTA DE EMPLEADOS ACTIVOS ===\n");
        int numeroEmpleado = 1;

        for (String empleado : empleados) {
            String[] nombreCompleto = empleado.split(" ");
            String iniciales = "" + nombreCompleto[0].charAt(0) + nombreCompleto[1].charAt(0);
            System.out.println("ID: EMP-" + String.format("%03d", numeroEmpleado));
            System.out.println("Nombre: " + empleado);
            System.out.println("Iniciales: " + iniciales);
            System.out.println("---");
            numeroEmpleado++;
        }

        System.out.println("\nTotal de empleados: " + empleados.length);
    }
}
