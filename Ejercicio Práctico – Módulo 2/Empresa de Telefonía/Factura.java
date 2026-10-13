/**
 * Clase que genera facturas con consumo real y cargos por exceso
 */
public class Factura {
    // Atributos
    private Cliente cliente;
    private int minutosUsados;
    private int datosUsadosGB;
    private double cargoExtraMinutos;
    private double cargoExtraDatos;
    
    // Constructor
    public Factura(Cliente cliente, int minutosUsados, int datosUsadosGB) {
        this.cliente = cliente;
        this.minutosUsados = minutosUsados;
        this.datosUsadosGB = datosUsadosGB;
        this.cargoExtraMinutos = 0;
        this.cargoExtraDatos = 0;
    }
    
    
    // Método para calcular cargos extras por exceso
    private void calcularCargosExtras() {
        Plan plan = cliente.getPlan();
        
        // Calcular exceso de minutos
        if (minutosUsados > plan.getMinutosIncluidos()) {
            int excesoMinutos = minutosUsados - plan.getMinutosIncluidos();
            cargoExtraMinutos = excesoMinutos * 0.10; // $0.10 por minuto extra
        }
        
        // Calcular exceso de datos
        if (datosUsadosGB > plan.getDatosGB()) {
            int excesoGB = datosUsadosGB - plan.getDatosGB();
            cargoExtraDatos = excesoGB * 2.50; // $2.50 por GB extra
        }
    }
    
    // Método para calcular monto total
    public double calcularTotal() {
        calcularCargosExtras();
        Plan plan = cliente.getPlan();
        return plan.getPrecioMensual() + cargoExtraMinutos + cargoExtraDatos;
    }
    
    // Método para generar factura detallada
    public void generarFactura() {
        Plan plan = cliente.getPlan();
        double total = calcularTotal();
        
        System.out.println("\n" + "=".repeat(40));
        System.out.println("\tFACTURA TELEFONICA");
        System.out.println("=".repeat(40));
        
        // Datos del cliente
        System.out.println("\tCliente: " + cliente.getNombre());
        System.out.println("\tTelefono: " + cliente.getNumeroTelefonico());
        System.out.println("-".repeat(40));
        
        // Detalle del plan
        System.out.println("\tPLAN BASE:");
        System.out.printf("  \tMinutos incluidos: %d min%n", plan.getMinutosIncluidos());
        System.out.printf("  \tDatos incluidos: %d GB%n", plan.getDatosGB());
        System.out.printf("  \tPrecio base: $%.2f%n", plan.getPrecioMensual());
        
        // Consumo real
        System.out.println("\n\tCONSUMO REAL:");
        System.out.printf(" \tMinutos usados: %d min%n", minutosUsados);
        System.out.printf(" \tDatos usados: %d GB%n", datosUsadosGB);
        
        // Cargos extras
        System.out.println("\n\tCARGOS EXTRAS:");
        System.out.printf("  \tMinutos extra: $%.2f%n", cargoExtraMinutos);
        System.out.printf("  \tDatos extra: $%.2f%n", cargoExtraDatos);
        
        // Total
        System.out.println("-".repeat(40));
        System.out.printf("\tTOTAL A PAGAR: $%.2f%n", total);
        System.out.println("=".repeat(40));
        
    }
}