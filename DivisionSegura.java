import java.util.Scanner;

public class DivisionSegura {

    public static double dividir(double dividendo, double divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return dividendo / divisor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese el dividendo: ");
            double dividendo = scanner.nextDouble();
            System.out.print("Ingrese el divisor: ");
            double divisor = scanner.nextDouble();

            double resultado = dividir(dividendo, divisor);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error aritmético: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Entrada inválida");
        } finally {
            System.out.println("Operación finalizada");
            scanner.close();
        }
    }
}
