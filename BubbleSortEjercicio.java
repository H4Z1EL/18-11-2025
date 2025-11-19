import java.util.Scanner;

public class BubbleSortEjercicio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuantos numeros tendra el arreglo? ");
        int n = sc.nextInt();

        int[] arreglo = new int[n];

        System.out.println("Ingresa los " + n + " numeros:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = sc.nextInt();
        }

        int[] original = new int[n];
        for (int i = 0; i < n; i++) {
            original[i] = arreglo[i];
        }

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }

        int minimo = arreglo[0];
        int maximo = arreglo[n - 1];
        int diferencia = maximo - minimo;

        System.out.print("Arreglo original: ");
        for (int i = 0; i < n; i++) {
            System.out.print(original[i] + " ");
        }

        System.out.println();

        System.out.print("Arreglo ordenado: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }

        System.out.println("\nMinimo: " + minimo);
        System.out.println("Maximo: " + maximo);
        System.out.println("Diferencia: " + diferencia);

    }

}
