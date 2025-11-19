public class TemperaturasInsertionSort {
    public static void main(String[] args) {

        double[] temperaturas = {23.5, 18.2, 30.0, 15.8, 28.3, 12.4, 32.1};

        double[] original = new double[temperaturas.length];
        for (int i = 0; i < temperaturas.length; i++) {
            original[i] = temperaturas[i];
        }

        for (int i = 1; i < temperaturas.length; i++) {
            double actual = temperaturas[i];
            int j = i - 1;

            while (j >= 0 && temperaturas[j] > actual) {
                temperaturas[j + 1] = temperaturas[j];
                j--;
            }
            temperaturas[j + 1] = actual;
        }

        double minimo = temperaturas[0];
        double maximo = temperaturas[temperaturas.length - 1];
        double rango = maximo - minimo;

        System.out.print("Arreglo original: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }

        System.out.println();

        System.out.print("Arreglo ordenado: ");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print(temperaturas[i] + " ");
        }

        System.out.println("\nTemperatura minima: " + minimo);
        System.out.println("Temperatura maxima: " + maximo);
        System.out.println("Rango: " + rango);

        System.out.print("Tres temperaturas mas bajas: ");
        for (int i = 0; i < 3 && i < temperaturas.length; i++) {
            System.out.print(temperaturas[i] + " ");
        }

        System.out.println();

        System.out.print("Tres temperaturas mas altas: ");
        for (int i = temperaturas.length - 1; i >= temperaturas.length - 3 && i >= 0; i--) {
            System.out.print(temperaturas[i] + " ");
        }
    }
}
