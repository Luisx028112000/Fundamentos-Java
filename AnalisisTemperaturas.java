public class AnalisisTemperaturas {
    public static void main(String[] args) {
        double[] temperaturas = {22.5, 24.0, 21.8, 23.5, 25.2, 26.0, 23.8};
        String[] dias = {"Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"};

        double suma = 0;
        double maxima = temperaturas[0];
        double minima = temperaturas[0];
        int diaMaxima = 0;
        int diaMinima = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            suma += temperaturas[i];
            if (temperaturas[i] > maxima) {
                maxima = temperaturas[i];
                diaMaxima = i;
            }
            if (temperaturas[i] < minima) {
                minima = temperaturas[i];
                diaMinima = i;
            }
        }

        double promedio = suma / temperaturas.length;

        System.out.println("=== ANÁLISIS SEMANAL DE TEMPERATURAS ===\n");

        for (int i = 0; i < dias.length; i++) {
            System.out.printf("%s: %.1f°C", dias[i], temperaturas[i]);
            if (temperaturas[i] > promedio) {
                System.out.print(" ↑ (sobre promedio)");
            } else if (temperaturas[i] < promedio) {
                System.out.print(" ↓ (bajo promedio)");
            }
            System.out.println();
        }

        System.out.println("\n--- ESTADÍSTICAS ---");
        System.out.printf("Temperatura promedio: %.1f°C%n", promedio);
        System.out.printf("Temperatura máxima: %.1f°C (%s)%n", maxima, dias[diaMaxima]);
        System.out.printf("Temperatura mínima: %.1f°C (%s)%n", minima, dias[diaMinima]);
    }
}
