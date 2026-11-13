public class Burbuja {

    public static void main(String[] args) {
        int[] numeros = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array original:");
        imprimir(numeros);

        ordenarBurbuja(numeros);

        System.out.println("Array ordenado:");
        imprimir(numeros);
    }

    public static void ordenarBurbuja(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean huboIntercambio = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar los elementos
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    huboIntercambio = true;
                }
            }

            // Si no hubo intercambios, el array ya está ordenado
            if (!huboIntercambio) {
                break;
            }
        }
    }

    public static void imprimir(int[] arr) {
        for (int numero : arr) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
