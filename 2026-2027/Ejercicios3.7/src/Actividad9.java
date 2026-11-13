import java.util.Random;
import java.util.Scanner;

public class Actividad9 {
    // Declaramos un Scanner estático para leer datos desde teclado
    static Scanner sc = new Scanner(System.in);

    /*
     * NOTA: En estos ejercicios no se podrá usar métodos estáticos de la clase
     * Arrays.
     */

    /*
     * 1) Pide al usuario un número natural n, luego solicita n números,
     * los guarda en un array y los muestra por pantalla.
     */
    public static void ejercicio1() {
        System.out.println("Ejercicio 1");
        System.out.print("Introduce un número natural n: ");
        int n = sc.nextInt(); // Leemos el tamaño del array

        int[] a = new int[n]; // Creamos el array con tamaño n

        // Pedimos al usuario n números y los guardamos en el array
        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        // Mostramos los números introducidos
        System.out.println("Los números introducidos son:");
        for (int i = 0; i < n; i++) { // Recorremos el array
            System.out.print(a[i] + " "); // Mostramos cada número
        }
        System.out.println(); // Salto de línea final
    }

    /*
     * 2) Crea un array a con valores fijos, hace una copia en otro array b
     * y muestra ambos por pantalla.
     */
    public static void ejercicio2() {
        System.out.println("Ejercicio 2");

        // Array original
        int[] a = { 1, 2, 3, 7, 5 };

        // Creamos un array b del mismo tamaño
        int[] b = new int[a.length];

        // Copiamos los elementos de a en b
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        // Mostramos ambos arrays
        System.out.println("Array a:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\nArray b (copia de a):");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println(); // Salto de línea final
    }

    /*
     * 3) Pide números enteros positivos al usuario y los guarda en un array.
     * Cuando se introduce -1, se detiene y muestra los números introducidos.
     */
    public static void ejercicio3() {
        System.out.println("Ejercicio 3");

        int[] a = new int[100]; // Tamaño máximo permitido
        int count = 0; // Contador de números introducidos
        boolean bandera = true;
        while (bandera) { // Bucle infinito hasta que se introduzca -1
            System.out.print("Introduce un número entero positivo (-1 para terminar): ");
            int num = sc.nextInt();

            if (num == -1) {
                // Si el usuario introduce -1, salimos del bucle
                bandera = false;
            }

            if (num >= 0) {
                // Guardamos el número en el array
                a[count] = num;
                count++;
            } else {
                // Mensaje si el número no es válido
                System.out.println("Por favor, introduce un número positivo.");
            }
        }

        // Mostramos los números guardados
        System.out.println("Números introducidos:");
        for (int i = 0; i < count; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(); // Salto de línea final
    }

    /*
     * 4) Pide al usuario un array de 10 elementos y crea otro array con los
     * mismos elementos en orden inverso.
     */
    public static void ejercicio4() {
        System.out.println("Ejercicio 4");
        // Declaramos los arrays
        int[] a = new int[10];
        int[] b = new int[10];

        // Pedimos los 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        // Copiamos los valores en orden inverso
        for (int i = 0; i < 10; i++) {
            b[i] = a[9 - i];
        }

        // Mostramos el array invertido
        System.out.println("Array b (elementos al revés):");
        for (int i = 0; i < 10; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println(); // Salto de línea final
    }

    /*
     * 5) Pide al usuario 8 números y crea un array b con los elementos impares.
     */
    public static void ejercicio5() {
        System.out.println("Ejercicio 5");

        int[] a = new int[8];

        // Pedimos los números al usuario
        for (int i = 0; i < 8; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        // Contamos cuántos son impares
        int count = 0;
        for (int i = 0; i < 8; i++) {
            if (a[i] % 2 != 0) {
                count++;
            }
        }

        // Creamos el nuevo array con tamaño adecuado
        int[] b = new int[count];
        int index = 0;

        // Llenamos b con los impares
        for (int i = 0; i < 8; i++) {
            if (a[i] % 2 != 0) {
                b[index] = a[i];
                index++;
            }
        }

        // Mostramos los impares
        System.out.println("Array b (elementos impares):");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println(); // Salto de línea final
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
        // Pedimos los 9 números
        for (int i = 0; i < 9; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        // Contamos cuántos son pares e impares
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < 9; i++) {
            if (a[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        // Creamos los arrays b y c
        int[] b = new int[evenCount];
        int[] c = new int[oddCount];
        int evenIndex = 0;
        int oddIndex = 0;
        // Llenamos los arrays b y c
        for (int i = 0; i < 9; i++) {
            if (a[i] % 2 == 0) {
                b[evenIndex] = a[i];
                evenIndex++;
            } else {
                c[oddIndex] = a[i];
                oddIndex++;
            }
        }
        // Mostramos el array b (pares)
        System.out.println("Array b (números pares):");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        // Mostramos el array c (impares)
        System.out.println("\nArray c (números impares):");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println(); // Salto de línea final
    }

    /*
     * 7) Escribe un programa que pida 10 números por teclado, los
     * almacene en un array y que luego muestre el máximo valor, el
     * mínimo y las posiciones que ocupan en el array.
     */

    public static void ejercicio7() {
        System.out.println("Ejercicio 7");
        int[] a = new int[10];
        // Pedimos los 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        int max = a[0]; // Suponemos que el primer número es el máximo
        int min = a[0]; // Suponemos que el primer número es el mínimo
        // Buscamos el máximo y el mínimo
        for (int i = 1; i < 10; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        // Mostramos el máximo y el mínimo
        System.out.println("Máximo valor: " + max);
        System.out.println("Mínimo valor: " + min);
        // Mostramos las posiciones del máximo y el mínimo
        System.out.print("Posiciones del máximo: ");
        for (int i = 0; i < 10; i++) {
            if (a[i] == max) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\nPosiciones del mínimo: ");
        for (int i = 0; i < 10; i++) {
            if (a[i] == min) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Salto de línea final
    }

    /*
     * 8) Escribe un programa que genere 20 números enteros
     * aleatorios entre 0 y 99 y los almacene en un array. El programa
     * debe crear un nuevo array con los números pares que haya
     * entre esos 20 números. Luego debe mostrar los dos arrays.
     */

    public static void ejercicio8() {
        System.out.println("Ejercicio 8");
        int[] a = new int[20];
        // Generamos 20 números aleatorios entre 0 y 99
        for (int i = 0; i < 20; i++) {
            a[i] = (int) (Math.random() * 100); // Números entre 0 y 99
        }
        // Contamos cuántos son pares
        int evenCount = 0;
        for (int i = 0; i < 20; i++) {
            if (a[i] % 2 == 0) {
                evenCount++;
            }
        }
        // Creamos el array de pares
        int[] b = new int[evenCount];
        int index = 0;
        for (int i = 0; i < 20; i++) {
            if (a[i] % 2 == 0) {
                b[index] = a[i];
                index++;
            }
        }
        // Mostramos ambos arrays
        System.out.println("Array a (20 números aleatorios):");
        for (int i = 0; i < 20; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nArray b (números pares):");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println(); // Salto de línea final
    }

    /*
     * 9) Realiza un programa que dado un array desordenado lo
     * ordene de menor a mayor y lo muestre por consola siguiendo el algoritmo que
     * desees.
     */

    public static void ejercicio9() {
        System.out.println("Ejercicio 9");
        // Array scaneado de los numeros que quieras
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        // Mostramos el array original (desordenado)
        System.out.print("Array desordenado: ");
        for (int num : a) {
            System.out.print(num + " "); // Imprime cada número del array separado por un espacio
        }
        System.out.println(); // Salto de línea

        // Ordenamos el array de menor a mayor usando el algoritmo de la burbuja
        /*
         * El algoritmo de la burbuja es uno de los métodos más sencillos
         * para ordenar una lista o un array.
         * Se llama así porque los valores más grandes van “subiendo” poco a poco hasta
         * el final del array, como si fueran burbujas en el agua.
         */
        for (int i = 0; i < a.length - 1; i++) { // Recorremos el array varias veces
            // En cada pasada, el número más grande "sube" al final del array
            // Por eso, en cada pasada podemos ignorar el último elemento ya ordenado
            for (int j = 0; j < a.length - 1 - i; j++) { // Comparamos elementos adyacentes
                if (a[j] > a[j + 1]) { // Si el elemento actual es mayor que el siguiente intercambiamos los elementos
                    int temp = a[j]; // Guardamos temporalmente el valor actual
                    a[j] = a[j + 1]; // Movemos el valor del siguiente elemento a la posición actual
                    a[j + 1] = temp; // Colocamos el valor guardado en la siguiente posición
                }
            }
        }

        // Mostramos el array ya ordenado
        System.out.print("Array ordenado:   ");
        for (int num : a) {
            System.out.print(num + " "); // Imprime cada número ordenado
        }
        System.out.println(); // Salto de línea final
    }

    /*
     * 10) Haz un programa que genere 20 números enteros del 1 al
     * 50 ambos inclusive y los almacene en un array,
     * posteriormente almacenará en un nuevo array solo los
     * números primos que haya en ese array. Ambos arrays
     * finalmente serán mostrados por consola.
     */

    // Función auxiliar para verificar si un número es primo
    public static boolean esPrimo(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void ejercicio10() {
        System.out.println("Ejercicio 10");

        int[] array = new int[20];

        // Generamos 20 números aleatorios entre 1 y 50
        for (int i = 0; i < 20; i++) {
            array[i] = (int) (Math.random() * 50) + 1; // Números entre 1 y 50
        }

        // Contamos cuántos son primos
        int contador = 0;
        for (int i = 0; i < 20; i++) {
            if (esPrimo(array[i])) {
                contador++;
            }
        }

        // Creamos el array de primos
        int[] primo = new int[contador];
        int indice = 0;
        for (int i = 0; i < 20; i++) { // Recorremos el array original
            if (esPrimo(array[i])) { // Verificamos si es primo
                primo[indice] = array[i]; // Almacenamos el número primo
                indice++; // Incrementamos el índice del array de primos
            }
        }

        // Imprimimos los resultados
        System.out.println("Array original:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nNúmeros primos encontrados:");
        for (int num : primo) {
            System.out.print(num + " ");
        }

        System.out.println("\nTotal de primos: " + contador);
        System.out.println(); // Salto de línea final
    }

    /*
     * 11) Realiza un programa que dado un array bidimensional, lo
     * muestre por pantalla con la siguiente estructura:
     */
    public static void ejercicio11() {
        System.out.println("Ejercicio 11");
        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        // Mostramos el array bidimensional con la estructura deseada
        for (int i = 0; i < matriz.length; i++) { // Recorremos las filas
            System.out.print("| "); // Inicio de fila
            for (int j = 0; j < matriz[i].length; j++) { // Recorremos las columnas
                System.out.print(matriz[i][j] + " "); // Mostramos el valor en la posición (i,j)
            }
            System.out.println("|");
        }
        System.out.println(); // Salto de línea final
    }

    /*
     * 12) Realiza un programa que dado un array bidimensional lo
     * rellene de números enteros aleatorios del 2 al 12 (ambos
     * inclusive)
     */

    public static void ejercicio12() {
        System.out.println("Ejercicio 12");
        int filas = 3; // por ejemplo
        int columnas = 3; // por ejemplo
        int[][] matriz = new int[filas][columnas];
        // Array de 4 filas y 5 columnas
        // Rellenamos la matriz con números aleatorios del 2 al 12
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random() * 11) + 2; // Números entre 2 y 12
            }
        }
        // Mostramos la matriz
        System.out.println("Matriz generada:");
        for (int i = 0; i < filas; i++) {
            System.out.print("| ");
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
        // Hacer que genere otra hasta que diga que pare
        String respuesta;
        do {
            System.out.print("¿Quieres generar otra matriz? (s/n): ");
            respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("s")) {
                // Rellenamos la matriz con números aleatorios del 2 al 12
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        matriz[i][j] = (int) (Math.random() * 11) + 2; // Números entre 2 y 12
                    }
                }
                // Mostramos la matriz
                System.out.println("Matriz generada:");
                for (int i = 0; i < filas; i++) {
                    System.out.print("| ");
                    for (int j = 0; j < columnas; j++) {
                        System.out.print(matriz[i][j] + " ");
                    }
                    System.out.println("|");
                }
            }
        } while (respuesta.equalsIgnoreCase("s"));
        System.out.println("Programa terminado.");
        System.out.println(); // Salto de línea final
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
        // Creamos una matriz 3x3 inicializada en 0
        int[][] matriz = new int[3][3];
        Random aleatorio = new Random();

        int contador = 0;

        // Colocamos tres "1" en posiciones aleatorias sin repetirse
        while (contador < 3) {
            int fila = aleatorio.nextInt(3);
            int columna = aleatorio.nextInt(3);

            if (matriz[fila][columna] == 0) { // Verificamos que la posición esté libre
                matriz[fila][columna] = 1; // Colocamos un 1 en la posición aleatoria
                contador++;
            }
        }

        // Mostramos la matriz resultante
        System.out.println("Matriz generada:");
        for (int i = 0; i < 3; i++) { // Recorremos las filas
            System.out.print("| ");
            for (int j = 0; j < 3; j++) { // Recorremos las columnas
                System.out.print(matriz[i][j] + " "); // Mostramos el valor en la posición (i,j)
            }
            System.out.println("|");
        }
        System.out.println(); // Salto de línea final
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

        // Rellenamos la matriz con 1 en las posiciones interiores
        for (int i = 1; i < y - 1; i++) { // Filas interiores
            for (int j = 1; j < x - 1; j++) { // Columnas interiores
                matriz[i][j] = 1;
            }
        }
        // Mostramos la matriz
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

        // Verifica si existe una fila arriba (fila > 0)
        // y si el valor en la casilla superior es 1
        if (fila > 0 && matriz[fila - 1][columna] == 1)
            return false; // Hay un vecino arriba con un 1 → no es válido

        // Verifica si existe una fila abajo (fila < 4)
        // y si la casilla inferior contiene un 1
        if (fila < 4 && matriz[fila + 1][columna] == 1)
            return false; // Hay un vecino abajo con un 1 → no es válido

        // Verifica si existe una columna a la izquierda (columna > 0)
        // y si a la izquierda hay un 1
        if (columna > 0 && matriz[fila][columna - 1] == 1)
            return false; // Hay un vecino a la izquierda con un 1 → no es válido

        // Verifica si existe una columna a la derecha (columna < 4)
        // y si a la derecha hay un 1
        if (columna < 4 && matriz[fila][columna + 1] == 1)
            return false; // Hay un vecino a la derecha con un 1 → no es válido

        return true; // No hay vecinos con un 1 → posición válida
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
        String entrada;
        do {
            // Mostrar matriz
            for (int[] fila : matriz) {
                for (int v : fila)
                    System.out.print(v + " ");
                System.out.println();
            }
            System.out.print("Introduce un número (o 'n' para salir): ");
            entrada = sc.nextLine();
            if (entrada.equalsIgnoreCase("n"))
                break;

            boolean esNumero = true;
            for (int i = 0; i < entrada.length(); i++) {
                if (!Character.isDigit(entrada.charAt(i)) && !(i == 0 && entrada.charAt(i) == '-')) {
                    esNumero = false;
                    break;
                }
            }
            if (!esNumero) { // Validar entrada
                System.out.println("Entrada inválida."); // Mensaje de error
                continue;
            }
            int num = Integer.parseInt(entrada);
            System.out.print("Fila (0-4): ");
            int f = sc.nextInt();
            System.out.print("Columna (0-4): ");
            int c = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            if (f >= 0 && f < 5 && c >= 0 && c < 5) // Validar coordenadas
                matriz[f][c] = num; // Insertar número

            else
                System.out.println("Coordenadas inválidas.");
        } while (true); // Bucle infinito hasta 'n'
        System.out.println("Programa terminado.");
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

        // Símbolos para las casillas del tablero
        String BLANCO = "\u25A0"; // ■
        String NEGRO = "\u25A1"; // □
        String DAMA = "۩"; // símbolo que representa la dama

        String[][] tablero = new String[8][8]; // Tablero 8x8
        Random rand = new Random();

        // Inicializar tablero con casillas blancas y negras alternadas
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                // Si la suma de fila+col es par → blanco, si no → negro
                tablero[i][j] = (i + j) % 2 == 0 ? BLANCO : NEGRO;

        // Posición inicial de la dama colocada aleatoriamente
        int fila = rand.nextInt(8);
        int col = rand.nextInt(8);
        tablero[fila][col] = DAMA;

        String opcion;

        do {
            // Mostrar tablero actual
            mostrarAjedrez(tablero);

            System.out.println("\nDama en: (" + fila + "," + col + ")");

            // Pedir nuevas coordenadas para mover la dama
            System.out.print("Nueva fila (0-7): ");
            int f = sc.nextInt();
            System.out.print("Nueva columna (0-7): ");
            int c = sc.nextInt();

            // Verificar si el movimiento es válido según las reglas de la reina:
            // - Misma fila
            // - Misma columna
            // - Misma diagonal (diferencia absoluta igual)
            if (f >= 0 && f <= 7 && c >= 0 && c <= 7 &&
                    (f == fila || c == col || Math.abs(f - fila) == Math.abs(c - col))) {

                // Restaurar la casilla donde estaba la dama antes (blanca o negra)
                tablero[fila][col] = (fila + col) % 2 == 0 ? BLANCO : NEGRO;

                // Actualizar nueva posición
                fila = f;
                col = c;
                tablero[fila][col] = DAMA;

                System.out.println("✓ Movimiento válido");
            } else {
                System.out.println("✗ Movimiento inválido");
            }

            // Preguntar si desea continuar
            System.out.print("¿Continuar? (s/n): ");
            opcion = sc.next().toLowerCase();

        } while (opcion.equals("s")); // Repetir mientras quiera seguir jugando

        // Mostrar tablero final antes de salir
        System.out.println("\nTablero final:");
        mostrarAjedrez(tablero);
        System.out.println("Fin del juego.");
    }

    // Función para mostrar el tablero con coordenadas
    public static void mostrarAjedrez(String[][] t) {

        // Letras superiores (columnas)
        System.out.println("  A B C D E F G H");

        // Mostrar filas
        for (int i = 0; i < 8; i++) {
            System.out.print(i + "|"); // número de fila a la izquierda
            for (int j = 0; j < 8; j++)
                System.out.print(t[i][j] + " ");
            System.out.println("|" + i); // número a la derecha
        }

        // Letras inferiores
        System.out.println("  A B C D E F G H");
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
