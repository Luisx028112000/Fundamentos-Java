import java.util.Scanner;

public class ValidacionDatosEmpresariales {

    public static void validarEdad(int edad) throws Exception {
        if (edad < 18) {
            throw new Exception("El empleado debe ser mayor de 18 años");
        }
        if (edad > 70) {
            throw new Exception("Edad fuera del rango permitido");
        }
    }

    public static void validarSalario(double salario) throws Exception {
        if (salario < 0) {
            throw new Exception("El salario no puede ser negativo");
        }
        if (salario < 500) {
            throw new Exception("El salario está por debajo del mínimo legal");
        }
    }

    public static void validarEmail(String email) throws Exception {
        if (!email.contains("@") || !email.contains(".")) {
            throw new Exception("Formato de email inválido");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("=== REGISTRO DE EMPLEADO ===");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = Integer.parseInt(scanner.nextLine());
            validarEdad(edad);

            System.out.print("Email: ");
            String email = scanner.nextLine();
            validarEmail(email);

            System.out.print("Salario mensual: ");
            double salario = Double.parseDouble(scanner.nextLine());
            validarSalario(salario);

            System.out.println("\n✓ Empleado registrado exitosamente");
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Email: " + email);
            System.out.println("Salario: $" + salario);
        } catch (NumberFormatException e) {
            System.out.println("X Error: Debe ingresar un número válido");
        } catch (Exception e) {
            System.out.println("X Error de validación: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
