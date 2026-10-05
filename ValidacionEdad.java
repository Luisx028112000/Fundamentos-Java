import java.util.Scanner;

public class ValidacionEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad;

        do {
            System.out.print("Ingrese su edad (1-120): ");
            edad = scanner.nextInt();
            if (edad < 1 || edad > 120) {
                System.out.println("Edad inválida. Intente nuevamente.");
            }
        } while (edad < 1 || edad > 120);

        System.out.println("\nEdad registrada: " + edad + " años");

        if (edad < 18) {
            System.out.println("Categoría: Menor de edad");
        } else if (edad < 65) {
            System.out.println("Categoría: Adulto");
        } else {
            System.out.println("Categoría: Adulto mayor");
        }

        scanner.close();
    }
}
