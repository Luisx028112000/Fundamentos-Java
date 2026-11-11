public class Main {

    // Método para calcular la raíz cuadrada
     public class Raizcuadrada_Exponente {(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Error: No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(numero);
    }

    // Método para calcular la potencia
    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    // Punto de entrada ejecutable
    public static void main(String[] args) {
        Main app = new Main();

        // Pruebas de funcionamiento
        double raiz = app.raizCuadrada(16);
        double pot = app.potencia(2, 3);

        System.out.println("La raíz cuadrada de 16 es: " + raiz);
        System.out.println("2 elevado a la 3 es: " + pot);
    }
}