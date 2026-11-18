import java.util.Random;
import java.util.Scanner;

public class Actividad4_1 {
    // Declaramos un Scanner estático para leer datos desde teclado
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    // Con random
    /*
     * NOTA: En estos ejercicios no se podrá usar métodos estáticos de la clase
     * Arrays.
     */

    /*
     * 1) Genera un número natural n y luego n números aleatorios,
     * los guarda en un array y los muestra por pantalla.
     */
    public static void ejercicio1() {
        System.out.println("Ejercicio 1");

        int n = rand.nextInt(10) + 1;
        System.out.println("Tamaño del array: " + n);

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(100);
        }
        System.out.print("Array generado: [");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + (i < a.length - 1 ? ", " : ""));
        }
        System.out.println("]");

    }

    /*
     * 2) Crea un array a con valores aleatorios, hace una copia en otro array b
     * y muestra ambos por pantalla.
     */
    public static void ejercicio2() {
        System.out.println("Ejercicio 2");

        int[] a = new int[6];
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100);
        }

        // Copia manual elemento a elemento
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        // Mostrar array a
        System.out.print("Array a: [");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + (i < a.length - 1 ? ", " : ""));
        }
        System.out.println("]");

        // Mostrar array b
        System.out.print("Array b (copia): [");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + (i < b.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }

    /*
     * 3) Genera números enteros positivos aleatorios y los guarda en un array.
     */
    public static void ejercicio3() {
        System.out.println("Ejercicio 3");

        int cantidad = rand.nextInt(10) + 1;
        int[] numeros = new int[cantidad];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100) + 1;
        }

        // Mostrar resultado
        System.out.print("Números guardados: [");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + (i < numeros.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }

    /*
     * 4) Genera un array de 10 elementos aleatorios y crea otro array con los
     * mismos elementos en orden inverso.
     */
    public static void ejercicio4() {
        System.out.println("Ejercicio 4");
        // Generar array de 10 elementos aleatorios (1-100)

        int[] original = new int[10];
        for (int i = 0; i < original.length; i++) {
            original[i] = (int) (Math.random() * 100) + 1;
        }

        int[] inverso = new int[original.length];
        for (int i = original.length - 1; i >= 0; i--) {
            inverso[original.length - 1 - i] = original[i];
        }

        // Mostrar resultados
        System.out.print("Original: ");
        for (int n : original)
            System.out.print(n + " ");

        System.out.print("\nInverso:  ");
        for (int n : inverso)
            System.out.print(n + " ");
    }

    /*
     * 5) Genera 8 números aleatorios y crea un array b con los elementos impares.
     */
    public static void ejercicio5() {
        System.out.println("Ejercicio 5");

        int[] a = new int[8];
        int contadorImpares = 0;

        for (int i = 0; i < 8; i++) {
            a[i] = rand.nextInt(100);
            if (a[i] % 2 != 0) {
                contadorImpares++;
            }
        }

        int[] b = new int[contadorImpares];
        int j = 0;
        for (int i = 0; i < 8; i++) {
            if (a[i] % 2 != 0) {
                b[j] = a[i];
                j++;
            }
        }

        // Mostrar array b con los impares
        System.out.print("Elementos impares (array b): [");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + (i < b.length - 1 ? ", " : ""));
        }
        System.out.println();
    }

    /*
     * 6)Realiza un programa que pida al usuario 9 números naturales
     * y los almacene en un array a, tras ello, introducir todos los
     * números que sean pares en un array b y los que sean
     * impares en un array c, tanto el array b como el array c se
     * tendrán que mostrar por pantalla.
     */
    public static void ejercicio6() {
        System.out.println("Ejercicio 6");
        int[] a = new int[9];
        int pares = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.print("Introduce un número natural: ");
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0)
                pares++;
        }

        int[] b = new int[pares];
        int[] c = new int[a.length - pares];
        int j = 0, k = 0;
        for (int n : a) {
            if (n % 2 == 0)
                b[j++] = n;
            else
                c[k++] = n;
        }
        System.out.println("Pares: " + java.util.Arrays.toString(b));
        System.out.println("Impares: " + java.util.Arrays.toString(c));
    }

    /*
     * 7) Escribe un programa que pida 10 números por teclado, los
     * almacene en un array y que luego muestre el máximo valor, el
     * mínimo y las posiciones que ocupan en el array.
     */

    public static void ejercicio7() {
        System.out.println("Ejercicio 7");
        int[] a = new int[10];
        Random rand = new Random();

        // Rellenar el array con números aleatorios (entre 1 y 100)
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100) + 1;
        }

        // Mostrar los 10 números generados
        System.out.print("Números generados: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(); // Salto de línea

        // Buscar máximo y mínimo
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }

        // Mostrar posiciones del máximo
        System.out.print("Máximo: " + max + " en posición(es): ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] == max) {
                System.out.print(i + " ");
            }
        }

        // Mostrar posiciones del mínimo
        System.out.print("\nMínimo: " + min + " en posición(es): ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] == min) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    /*
     * 8) Escribe un programa que genere 20 números enteros
     * aleatorios entre 0 y 99 y los almacene en un array. El programa
     * debe crear un nuevo array con los números pares que haya
     * entre esos 20 números. Luego debe mostrar los dos arrays.
     */

    public static void ejercicio8() {
        System.out.println("Ejercicio 8");

        int[] numeros = new int[20];
        int cantidadPares = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100);
            if (numeros[i] % 2 == 0) {
                cantidadPares++;
            }
        }

        int[] pares = new int[cantidadPares];
        int j = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares[j++] = numero;
            }
        }

        System.out.print("Array original: [");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + (i < numeros.length - 1 ? ", " : ""));
        }
        System.out.println("]");

        System.out.print("Números pares: [");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + (i < pares.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }

    /*
     * 9) Realiza un programa que dado un array desordenado lo
     * ordene de menor a mayor y lo muestre por consola siguiendo el algoritmo que
     * desees.
     */

    public static void ejercicio9() {
        System.out.println("Ejercicio 9");

        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100);
        }

        System.out.print("Array desordenado: [");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + (i < numeros.length - 1 ? ", " : ""));
        }
        System.out.println("]");

        // Ordenar de menor a mayor mediante el método burbuja
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temporal = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temporal;
                }
            }
        }

        System.out.print("Array ordenado: [");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + (i < numeros.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }

    /*
     * 10) Haz un programa que genere 20 números enteros del 1 al
     * 50 ambos inclusive y los almacene en un array,
     * posteriormente almacenará en un nuevo array solo los
     * números primos que haya en ese array. Ambos arrays
     * finalmente serán mostrados por consola.
     */

    // Función auxiliar para verificar si un número es primo

    public static boolean esPrimo(int numero) {
        if (numero <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0)
                return false;
        }
        return true;
    }

    public static void ejercicio10() {
        System.out.println("Ejercicio 10");

        int[] numeros = new int[20];
        int cantidadPrimos = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(50) + 1;
            if (esPrimo(numeros[i])) {
                cantidadPrimos++;
            }
        }

        int[] primos = new int[cantidadPrimos];
        int j = 0;
        for (int numero : numeros) {
            if (esPrimo(numero)) {
                primos[j++] = numero;
            }
        }

        System.out.print("Array original: [");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + (i < numeros.length - 1 ? ", " : ""));
        }
        System.out.println("]");

        System.out.print("Números primos: [");
        for (int i = 0; i < primos.length; i++) {
            System.out.print(primos[i] + (i < primos.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }

    /*
     * 11) Realiza un programa que dado un array bidimensional, lo
     * muestre por pantalla con la siguiente estructura:
     */
    public static void ejercicio11() {
        System.out.println("Ejercicio 11");

        int filas = rand.nextInt(3) + 2; // entre 2 y 4
        int columnas = rand.nextInt(3) + 2; // entre 2 y 4
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rand.nextInt(10) + 1; // 1..10
            }
        }

        System.out.println("Matriz generada:");
        for (int i = 0; i < filas; i++) {
            System.out.print("[");
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + (j < columnas - 1 ? " \t" : ""));
            }
            System.out.println("]");
        }
    }

    /*
     * 12) Realiza un programa que dado un array bidimensional lo
     * rellene de números enteros aleatorios del 2 al 12 (ambos
     * inclusive)
     */

    public static void ejercicio12() {
        System.out.println("Ejercicio 12");

        int filas = 3;
        int columnas = 4;
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rand.nextInt(11) + 2; // 2..12
            }
        }

        System.out.println("Matriz aleatoria 3x4:");
        for (int i = 0; i < filas; i++) {
            System.out.print("[");
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + (j < columnas - 1 ? " \t" : ""));
            }
            System.out.println("]");
        }
    }

    /*
     * 13) Realiza un programa que inserte en un array bidimensional
     * de 3x3 de números enteros, compuesto solamente por 0, tres
     * valores 1 en una posición aleatoria, no pueden solaparse, es
     * decir, ocupar la misma casilla alguno de los tres valores,
     * después muestra por pantalla el contenido del array.
     */

    public static void ejercicio13() {
        System.out.println("Ejercicio 13");

        int[][] matriz = new int[3][3];
        boolean[][] ocupadas = new boolean[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = 0;
            }
        }

        for (int k = 0; k < 3; k++) {
            int fila;
            int columna;
            do {
                fila = rand.nextInt(3);
                columna = rand.nextInt(3);
            } while (ocupadas[fila][columna]);

            ocupadas[fila][columna] = true;
            matriz[fila][columna] = 1;
        }

        System.out.println("Matriz 3x3 con 3 unos aleatorios:");
        for (int i = 0; i < 3; i++) {
            System.out.print("[");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + (j < 2 ? " \t" : ""));
            }
            System.out.println("]");
        }
    }

 /*
     * 14) Realiza un programa que pida al usuario el tamaño en las
     * dos dimensiones (X e Y) de un array bidimensional, construya
     * un array bidimensional (con esas dimensiones) con todas las
     * posiciones con el valor 0 y lo muestre por pantalla.
     * Posteriormente se va introducir en el array el valor 1 en todas
     * las posiciones exceptuando las que estén en los bordes
     * exteriores del array, ejemplo:
     * 0 0 0
     * 0 1 0
     * 0 1 0
     * 0 0 0
     */

    public static void ejercicio14() {
        System.out.println("Ejercicio 14");
        System.out.print("Introduce el tamaño X del array (columnas): ");
        int x = sc.nextInt();
        System.out.print("Introduce el tamaño Y del array (filas): ");
        int y = sc.nextInt();

        int[][] matriz = new int[y][x];

        for (int i = 1; i < y - 1; i++) {
            for (int j = 1; j < x - 1; j++) {
                matriz[i][j] = 1;
            }
        }

        System.out.println("Matriz generada:");
        for (int i = 0; i < y; i++) {
            System.out.print("| ");
            for (int j = 0; j < x; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    /*
     * 15 Realiza un programa que inserte en un array bidimensional
     * de 5x5 de números enteros, compuesto solamente por 0, tres
     * valores 1 de manera aleatoria, no pueden solaparse, es decir,
     * ocupar la misma casilla alguno de los tres valores, ni pueden
     * estar en casillas contiguas vertical u horizontalmente
     * (diagonalmente sí) después muestra por pantalla el contenido
     * del array
     */

    public static void ejercicio15() {
        System.out.println("Ejercicio 15");
        String respuesta;
        do {
            int[][] matriz = new int[5][5];
            Random rand = new Random();
            int contador = 0;

            while (contador < 3) {
                int fila = rand.nextInt(5);
                int columna = rand.nextInt(5);

                if (matriz[fila][columna] == 0 && esValido(matriz, fila, columna)) {
                    matriz[fila][columna] = 1;
                    contador++;
                }
            }

            // Mostramos la matriz
            System.out.println("Matriz generada:");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println("");
            }

            System.out.print("¿Quieres generar otra matriz? (s/n): ");
            respuesta = sc.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));

        System.out.println(); // Salto de línea final
    }

    public static boolean esValido(int[][] matriz, int fila, int columna) {

        // Arriba
        if (fila > 0 && matriz[fila - 1][columna] == 1)
            return false;

        // Abajo
        if (fila < 4 && matriz[fila + 1][columna] == 1)
            return false;

        // Izquierda
        if (columna > 0 && matriz[fila][columna - 1] == 1)
            return false;

        // Derecha
        if (columna < 4 && matriz[fila][columna + 1] == 1)
            return false;

        return true;
    }

    /*
     * 16 Realiza un programa en donde dado un array bidimensional
     * de tamaño 5x5 (con las posiciones con el valor 0) el usuario
     * puede introducir los números que él desee uno a uno, hasta
     * que introduzca la letra n. Cada vez que el usuario introduzca
     * un número se le mostrará el contenido del array.
     */
    public static void ejercicio16() {
        System.out.println("Ejercicio 16");
        int[][] matriz = new int[5][5];

        while (true) {
            System.out.print("Introduce un número (n para salir): ");
            String entrada = sc.nextLine();
            if (entrada.equalsIgnoreCase("n"))
                break;

            int numero;
            try {
                numero = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida");
                continue;
            }

            int fila, columna;
            do {
                fila = rand.nextInt(5);
                columna = rand.nextInt(5);
            } while (matriz[fila][columna] != 0);

            matriz[fila][columna] = numero;

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++)
                    System.out.print(matriz[i][j] + " ");
                System.out.println();
            }
        }
    }

    /*
     * 17) Realiza un tablero de ajedrez con cuadros negros: \u25A1,
     * cuadro blancos: \u25A0 y una dama ۩. Presenta la dama en
     * una posición cualquiera (al azar) del tablero (array
     * bidimensional) y vas a pedir la nueva coordenada de la dama
     * en el tablero. Existen dos posibilidades:
     * - No es válida → se informa que no se puede mover.
     * - Es válida → se actualiza el tablero según reglas del ajedrez.
     * Después se pregunta si desea seguir jugando.
     */

    public static void ejercicio17() {
    System.out.println("Ejercicio 17");
    int fila = rand.nextInt(5);
    int columna = rand.nextInt(5);

    String seguir;
    do {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == fila && j == columna)
                    System.out.print("۩ ");
                else
                    // Usamos caracteres estándar como '□' y '■' o bloques seguros
                    System.out.print((i + j) % 2 == 0 ? "□ " : "■ "); 
            }
            System.out.println();
        }

        System.out.print("Nueva fila (0-4): ");
        int nuevaFila = sc.nextInt();
        System.out.print("Nueva columna (0-4): ");
        int nuevaColumna = sc.nextInt();
        sc.nextLine();

        boolean valida = nuevaFila >= 0 && nuevaFila < 5 && nuevaColumna >= 0 && nuevaColumna < 5
                && (nuevaFila == fila || nuevaColumna == columna
                        || Math.abs(nuevaFila - fila) == Math.abs(nuevaColumna - columna));

        if (valida) {
            fila = nuevaFila;
            columna = nuevaColumna;
            System.out.println("Movimiento válido");
        } else {
            System.out.println("No se puede mover");
        }

        System.out.print("¿Seguir jugando? (s/n): ");
        seguir = sc.nextLine();
    } while (seguir.equalsIgnoreCase("s"));
}

    public static void main(String[] args) {
        // ejercicio1();
        // ejercicio2();
        // ejercicio3();
        // ejercicio4();
        // ejercicio5();
        // ejercicio6();
        // ejercicio7();
        // ejercicio8();
        // ejercicio9();
        // ejercicio10();
        // ejercicio11();
        // ejercicio12();
        // ejercicio13();
        // ejercicio14();
        // ejercicio15();
        // ejercicio16();
        ejercicio17();

        sc.close();

    }
}
