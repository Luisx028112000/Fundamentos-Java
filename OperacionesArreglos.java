import java.util.Arrays;

public class OperacionesArreglos {

    public static int[] copiarArreglo(int[] original) {
        int[] copia = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copia[i] = original[i];
        }
        return copia;
    }

    public static void invertirArreglo(int[] arr) {
        int inicio = 0;
        int fin = arr.length - 1;
        while (inicio < fin) {
            int temp = arr[inicio];
            arr[inicio] = arr[fin];
            arr[fin] = temp;
            inicio++;
            fin--;
        }
    }

    public static int buscarElemento(int[] arr, int elemento) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elemento) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numeros = {15, 8, 23, 42, 7, 16, 31};
        System.out.println("Arreglo original: " + Arrays.toString(numeros));

        // Copiar arreglo
        int[] copia = copiarArreglo(numeros);
        System.out.println("Copia del arreglo: " + Arrays.toString(copia));

        // Ordenar arreglo
        Arrays.sort(copia);
        System.out.println("Arreglo ordenado: " + Arrays.toString(copia));

        // Invertir arreglo
        invertirArreglo(copia);
        System.out.println("Arreglo invertido: " + Arrays.toString(copia));

        // Buscar elemento
        int buscar = 23;
        int posicion = buscarElemento(numeros, buscar);
        if (posicion != -1) {
            System.out.println("\nElemento " + buscar + " encontrado en posición " + posicion);
        } else {
            System.out.println("\nElemento " + buscar + " no encontrado");
        }

        // Llenar arreglo
        int[] nuevo = new int[5];
        Arrays.fill(nuevo, 10);
        System.out.println("\nArreglo llenado: " + Arrays.toString(nuevo));

        // Comparar arreglos
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        boolean iguales = Arrays.equals(arr1, arr2);
        System.out.println("\n¿Los arreglos son iguales? " + iguales);
    }
}
