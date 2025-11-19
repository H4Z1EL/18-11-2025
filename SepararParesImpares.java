import java.util.Scanner;

public class SepararParesImpares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuantos numeros ingresaras? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        System.out.println("Ingresa los " + n + " numeros:");
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        int contPares = 0;
        int contImpares = 0;

        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                contPares++;
            } else {
                contImpares++;
            }
        }

        int[] pares = new int[contPares];
        int[] impares = new int[contImpares];

        int p = 0;
        int im = 0;

        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                pares[p] = numeros[i];
                p++;
            } else {
                impares[im] = numeros[i];
                im++;
            }
        }

        for (int i = 0; i < pares.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < pares.length; j++) {
                if (pares[j] < pares[min]) {
                    min = j;
                }
            }
            int aux = pares[i];
            pares[i] = pares[min];
            pares[min] = aux;
        }

        for (int i = 0; i < impares.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < impares.length; j++) {
                if (impares[j] < impares[min]) {
                    min = j;
                }
            }
            int aux = impares[i];
            impares[i] = impares[min];
            impares[min] = aux;
        }

        System.out.print("Arreglo original: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();

        System.out.print("Pares ordenados: ");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println();

        System.out.print("Impares ordenados: ");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + " ");
        }
    }
}
