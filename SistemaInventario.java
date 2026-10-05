public class SistemaInventario {
    public static void main(String[] args) {
        String[] productos = {"Laptop", "Mouse", "Teclado", "Monitor", "Impresora"};
        int[] stock = {10, 50, 30, 15, 8};
        double[] precios = {899.99, 19.99, 49.99, 299.99, 199.99};

        double valorTotal = 0;
        int productosDisponibles = 0;

        System.out.println("=== REPORTE DE INVENTARIO ===\n");
        System.out.printf("%-15s %10s %12s %15s%n", "Producto", "Stock", "Precio", "Valor Total");
        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < productos.length; i++) {
            double valorProducto = stock[i] * precios[i];
            valorTotal += valorProducto;
            productosDisponibles += stock[i];
            System.out.printf("%-15s %10d $%11.2f $%14.2f%n",
                    productos[i], stock[i], precios[i], valorProducto);
        }

        System.out.println("---------------------------------------------------------");
        System.out.printf("Total de productos: %d%n", productosDisponibles);
        System.out.printf("Valor total del inventario: $%.2f%n", valorTotal);
    }
}
