import java.util.Random;
import java.util.Scanner;

public class Actividad4_1{
    // Declaramos un Scanner estático para leer datos desde teclado
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    // Con random
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
        int n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Array introducido: [");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + (i < numeros.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }

    /*
     * 2) Crea un array a con valores fijos, hace una copia en otro array b
     * y muestra ambos por pantalla.
     */
    public static void ejercicio2() {
        System.out.println("Ejercicio 2");

        int[] a = {4, 8, 15, 16, 23, 42};
        int[] b = new int[a.length];

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
     * 3) Pide números enteros positivos al usuario y los guarda en un array.
     * Cuando se introduce -1, se detiene y muestra los números introducidos.
     */
    public static void ejercicio3() {
        System.out.println("Ejercicio 3");

        // Usamos un array temporal de tamaño máximo razonable (ej. 100)
        int[] temp = new int[100];
        int contador = 0;

        System.out.println("Introduce números enteros positivos (-1 para terminar):");
        while (true) {
            int valor = sc.nextInt();
            if (valor == -1) {
                break;
            }
            if (contador < temp.length) {
                temp[contador] = valor;
                contador++;
            } else {
                System.out.println("Límite de almacenamiento alcanzado.");
                break;
            }
        }

        // Creamos el array definitivo con el tamaño exacto de los elementos introducidos
        int[] numeros = new int[contador];
        for (int i = 0; i < contador; i++) {
            numeros[i] = temp[i];
        }

        // Mostrar resultado
        System.out.print("Números guardados: [");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + (i < numeros.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }

    /*
     * 4) Pide al usuario un array de 10 elementos y crea otro array con los
     * mismos elementos en orden inverso.
     */
    public static void ejercicio4() {
        System.out.println("Ejercicio 4");

        int[] original = new int[10];
        int[] inverso = new int[10];

        System.out.println("Introduce 10 elementos:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            original[i] = sc.nextInt();
        }

        // Invertir orden
        for (int i = 0; i < 10; i++) {
            inverso[i] = original[9 - i];
        }

        // Mostrar array original e inverso
        System.out.print("Original: [");
        for (int i = 0; i < 10; i++) {
            System.out.print(original[i] + (i < 9 ? ", " : ""));
        }
        System.out.println("]");

        System.out.print("Inverso:  [");
        for (int i = 0; i < 10; i++) {
            System.out.print(inverso[i] + (i < 9 ? ", " : ""));
        }
        System.out.println("]");
    }

    /*
     * 5) Pide al usuario 8 números y crea un array b con los elementos impares.
     */
    public static void ejercicio5() {
        System.out.println("Ejercicio 5");


        int[] a = new int[8];
        int contadorImpares = 0;

        System.out.println("Introduce 8 números:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            a[i] = sc.nextInt();
            if (a[i] % 2 != 0) {
                contadorImpares++;
            }
        }

        // Crear el array b con el tamaño exacto de números impares contados
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
        System.out.println("]");
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

    }

    /*
     * 7) Escribe un programa que pida 10 números por teclado, los
     * almacene en un array y que luego muestre el máximo valor, el
     * mínimo y las posiciones que ocupan en el array.
     */

    public static void ejercicio7() {
        System.out.println("Ejercicio 7");

    }

    /*
     * 8) Escribe un programa que genere 20 números enteros
     * aleatorios entre 0 y 99 y los almacene en un array. El programa
     * debe crear un nuevo array con los números pares que haya
     * entre esos 20 números. Luego debe mostrar los dos arrays.
     */

    public static void ejercicio8() {
        System.out.println("Ejercicio 8");

    }

    /*
     * 9) Realiza un programa que dado un array desordenado lo
     * ordene de menor a mayor y lo muestre por consola siguiendo el algoritmo que
     * desees.
     */

    public static void ejercicio9() {
        System.out.println("Ejercicio 9");

    }

    /*
     * 10) Haz un programa que genere 20 números enteros del 1 al
     * 50 ambos inclusive y los almacene en un array,
     * posteriormente almacenará en un nuevo array solo los
     * números primos que haya en ese array. Ambos arrays
     * finalmente serán mostrados por consola.
     */

    // Función auxiliar para verificar si un número es primo



    /*
     * 11) Realiza un programa que dado un array bidimensional, lo
     * muestre por pantalla con la siguiente estructura:
     */
    public static void ejercicio11() {
        System.out.println("Ejercicio 11");

    }

    /*
     * 12) Realiza un programa que dado un array bidimensional lo
     * rellene de números enteros aleatorios del 2 al 12 (ambos
     * inclusive)
     */

    public static void ejercicio12() {
        System.out.println("Ejercicio 12");

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
