
/**
 *
 * @author lUIS ERNESTO VARGAS
 */
public class EmpresaTelefonica {

    public static void main(String[] args) {
        System.out.println("\n\tSISTMA DE FACTURACION TELEFONICA");
        
        //Creacion de planes disponibles 
        Plan planBasico = new Plan(100, 2, 25.00);
        Plan planPremium = new Plan(500, 10, 45.00);
        Plan planIlimitado = new Plan(1000, 20, 65.00);
        
        System.out.println("  \tPlan Bssico: 100 min + 2GB - $25");
        System.out.println("  \tPlan Premium: 500 min + 10GB - $45");
        System.out.println("  \tPlan Ilimitado: 1000 min + 20GB - $65");
        
        //Creacion de clientes
        System.out.println("\n\tCREANDO CLIENTES:");
        
        Cliente cliente1 = new Cliente("Luis Ernesto", "829-371-6541", planBasico);
        Cliente cliente2 = new Cliente("Carlos Lopez", "829-555-5678", planPremium);
        Cliente cliente3 = new Cliente("Maria De Jesus", "849-555-9012", planBasico);
        
        cliente1.mostrarInfo();
        cliente2.mostrarInfo();
        cliente3.mostrarInfo();
        
        //Generando facturas con consumo real
        //Cliente 1: tiene cargos extras
        System.out.println("\nFACTURA 1 - " + cliente1.getNombre());
        Factura factura1 = new Factura(cliente1, 150, 3); // 150 min, 3 GB
        factura1.generarFactura();
        
        //Cliente 2: 
        System.out.println("\nFACTURA 2 - " + cliente2.getNombre());
        Factura factura2 = new Factura(cliente2, 400, 8); // 400 min, 8 GB
        factura2.generarFactura();
        
        //Cliente 3:
        System.out.println("\nFACTURA 3 - (Cliente con mucho exceso) " + cliente3.getNombre());        
        Factura factura3 = new Factura(cliente3, 300, 5); // 300 min, 5 GB (mucho exceso)
        factura3.generarFactura();
    }
    
}
