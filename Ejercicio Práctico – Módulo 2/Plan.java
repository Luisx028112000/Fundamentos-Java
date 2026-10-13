
public class Plan {
    //Atributos privados 
    private int minutosIncluidos;
    private int datosGB;
    private double precioMensual;
    
    //Getters
    public int getMinutosIncluidos(){
        return minutosIncluidos;
    }
    public int getDatosGB(){
        return datosGB;
    }
    public double getPrecioMensual(){
        return precioMensual;
    }
    
    //Constructores 
    public Plan(int minutosIncluidos, int datosGB, double precioMensual) {
        this.minutosIncluidos = minutosIncluidos;
        this.datosGB = datosGB;
        this.precioMensual = precioMensual;
    }
    
    // Mostrar información
    public void mostrarInfo() {
        System.out.println("\tPLAN:");
        System.out.println("\t  Minutos: " + minutosIncluidos + " min");
        System.out.println(" \t  Datos: " + datosGB + " GB");
        System.out.println(" \t  Precio: $" + precioMensual);
    }
    
}
