public class MatrizCalificaciones {
    public static void main(String[] args) {
        String[] estudiantes = {"Ana", "Carlos", "María", "Juan"};
        String[] asignaturas = {"Matemáticas", "Física", "Química"};

        double[][] calificaciones = {
            {85.5, 90.0, 88.5},
            {78.0, 82.5, 80.0},
            {92.0, 95.5, 93.0},
            {88.5, 85.0, 87.5}
        };

        System.out.println("=== REPORTE DE CALIFICACIONES ===\n");

        System.out.printf("%-12s", "Estudiante");
        for (String asignatura : asignaturas) {
            System.out.printf("%15s", asignatura);
        }
        System.out.printf("%15s%n", "Promedio");
        System.out.println("------------------------------------------------------------------");

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.printf("%-12s", estudiantes[i]);
            double suma = 0;
            for (int j = 0; j < asignaturas.length; j++) {
                System.out.printf("%15.1f", calificaciones[i][j]);
                suma += calificaciones[i][j];
            }
            double promedio = suma / asignaturas.length;
            System.out.printf("%15.1f%n", promedio);
        }

        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-12s", "Promedio");
        for (int j = 0; j < asignaturas.length; j++) {
            double suma = 0;
            for (int i = 0; i < estudiantes.length; i++) {
                suma += calificaciones[i][j];
            }
            double promedio = suma / estudiantes.length;
            System.out.printf("%15.1f", promedio);
        }
        System.out.println();
    }
}
