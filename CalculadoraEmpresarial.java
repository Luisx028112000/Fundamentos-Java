public class CalculadoraEmpresarial {

    public static double calcularSalarioNeto(double salarioBruto, double porcentajeImpuesto) {
        double impuesto = salarioBruto * (porcentajeImpuesto / 100);
        return salarioBruto - impuesto;
    }

    public static double calcularBonoAnual(double salarioMensual, int mesesTrabajados) {
        if (mesesTrabajados >= 12) {
            return salarioMensual * 2;
        } else if (mesesTrabajados >= 6) {
            return salarioMensual;
        } else {
            return 0;
        }
    }

    public static void mostrarDesglose(String nombre, double salarioBruto, double impuesto, double salarioNeto, double bono) {
        System.out.println("\n=== DESGLOSE DE NÓMINA ===");
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario bruto: $" + salarioBruto);
        System.out.println("Impuestos: -$" + impuesto);
        System.out.println("Salario neto: $" + salarioNeto);
        System.out.println("Bono anual: $" + bono);
        System.out.println("TOTAL ANUAL: $" + ((salarioNeto * 12) + bono));
    }

    public static void main(String[] args) {
        String empleado = "Carlos Mendoza";
        double salarioBruto = 3500.00;
        double porcentajeImpuesto = 15.0;
        int mesesTrabajados = 12;

        double salarioNeto = calcularSalarioNeto(salarioBruto, porcentajeImpuesto);
        double bono = calcularBonoAnual(salarioBruto, mesesTrabajados);
        double impuesto = salarioBruto - salarioNeto;

        mostrarDesglose(empleado, salarioBruto, impuesto, salarioNeto, bono);
    }
}
