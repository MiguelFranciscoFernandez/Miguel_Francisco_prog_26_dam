public class Burbuja {

    public static void main(String[] args) {
        int[] lista = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array original:");
        imprimir(lista);

        ordenacionM(lista, 'c');
        System.out.println("Orden creciente:");
        imprimir(lista);

        ordenacionM(lista, 'd');
        System.out.println("Orden decreciente:");
        imprimir(lista);
    }

    public static void ordenacionM(int[] lista, char modo) {
        // Aceptar únicamente modos válidos.
        // Esto no es totalmente necesario para el ejercicio.
        if(modo != 'c' && modo != 'd') return;

        // Recorrer la lista.
        for(int i = 0; i < lista.length; i++) {
            // Por cada pasada, recorrer la lista hasta el penúltimo
            // elemento sin ordenar (el final ya está ordenado).
            for(int j = 0; j < lista.length - 1 - i; j++) {
                // Comprobar si el número actual está
                // desordenado respecto al siguiente.
                boolean desordenados;
                if(modo == 'c') desordenados = lista[j] > lista[j + 1];
                else desordenados = lista[j] < lista[j + 1];

                // Si están desordenados, cambiarlos de sitio.
                if(desordenados) {
                    int aux = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = aux;
                }
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
