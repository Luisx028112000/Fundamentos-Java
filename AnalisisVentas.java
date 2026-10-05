public class AnalisisVentas {
    public static void main(String[] args) {
        double[] ventasMensuales = {
            15000, 18000, 12000, 22000, 19000,
            21000, 25000, 23000, 20000, 24000,
            28000, 30000
        };

        String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        double totalAnual = 0;
        double ventaMaxima = 0;
        double ventaMinima = ventasMensuales[0];
        String mejorMes = "";
        String peorMes = "";
        int index = 0;

        for (double venta : ventasMensuales) {
            totalAnual += venta;
            if (venta > ventaMaxima) {
                ventaMaxima = venta;
                mejorMes = meses[index];
            }
            if (venta < ventaMinima) {
                ventaMinima = venta;
                peorMes = meses[index];
            }
            index++;
        }

        double promedioMensual = totalAnual / ventasMensuales.length;

        System.out.println("=== REPORTE ANUAL DE VENTAS ===");
        System.out.println("Total anual: $" + totalAnual);
        System.out.println("Promedio mensual: $" + promedioMensual);
        System.out.println("\nMejor mes: " + mejorMes + " ($" + ventaMaxima + ")");
        System.out.println("Peor mes: " + peorMes + " ($" + ventaMinima + ")");
    }
}
