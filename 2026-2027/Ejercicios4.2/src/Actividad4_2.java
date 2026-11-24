import java.util.Random;
import java.util.Scanner;

public class Actividad4_2 {
    // Declaramos un Scanner estático para leer datos desde teclado
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    // Con random

    /*
     * 1) Programa que declare tres vectores: `vector1`, `vector2` y `vector3` de
     * cinco enteros cada uno. Pide valores para `vector1` y `vector2` por teclado y
     * calcula `vector3` como la suma de los dos anteriores (`vector3 = vector1 +
     * vector2`).
     */
    public static void ejercicio1() {
        System.out.println("Ejercicio 1");
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];

        for (int i = 0; i < 5; i++) {
            vector1[i] = rand.nextInt(100);
            vector2[i] = rand.nextInt(100);
        }

        for (int i = 0; i < 5; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }

        System.out.print("vector1: ");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print(vector1[i] + " ");
        }
        System.out.println();

        System.out.print("vector2: ");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print(vector2[i] + " ");
        }
        System.out.println();

        System.out.print("vector3: ");
        for (int i = 0; i < vector3.length; i++) {
            System.out.print(vector3[i] + " ");
        }
        System.out.println();
    }

    /*
     * 2)Queremos guardar los nombres y las edades de los alumnos de un curso.
     * Realiza un programa que introduzca el nombre y la edad de cada alumno.
     * El proceso de lectura de datos terminará cuando se introduzca como nombre un
     * asterisco (`*`). Al finalizar se mostrará:
     * 
     * Todos los alumnos que son **mayores de edad**.
     * El/los alumno/s de **mayor edad** .
     */
    public static void ejercicio2() {
        System.out.println("Ejercicio 2");
        int mayor = 0;
        int[] edad = new int[100];
        String[] nombre = new String[100];
        boolean salir = false;
        int contador = 0;

        while (!salir) {
            System.out.print("Introduce nombre(* para terminar): ");
            nombre[contador] = sc.nextLine();

            if (nombre[contador].equals("*")) {
                salir = true;
            } else {
                edad[contador] = rand.nextInt(20) + 1;
                contador++;
            }
        }

        for (int i = 0; i < contador; i++) {
            if (edad[i] >= 18) {
                System.out.println(nombre[i] + " es mayor de edad");
            }
        }

        String alumnosMayores = "";

        for (int i = 0; i < contador; i++) {
            int mayorAnterior = mayor;
            mayor = Math.max(mayor, edad[i]);
            if (mayor > mayorAnterior) {
                alumnosMayores = nombre[i] + "";
            } else if (edad[i] == mayor) {
                alumnosMayores += nombre[i] + "";
            }
        }

        System.out.println("El/los alumno/s de mayor edad es/son: " + alumnosMayores);

    }

    /*
     * 3)jercicio 3
     * Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por
     * un
     * alumno (comprendidas entre 0 y 10). A continuación, debe mostrar:
     * 
     * Todas las notas.
     * La nota media .
     * La nota más alta .
     * La nota más baja .
     */
    public static void ejercicio3() {
        System.out.println("Ejercicio 3");
        int[] notas = new int[5];
        int suma = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce la nota " + (i + 1) + ": ");
            notas[i] = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer
            suma += notas[i];
            if (notas[i] > max) {
                max = notas[i];
            }
            if (notas[i] < min) {
                min = notas[i];
            }
        }

        System.out.println("Todas las notas:");
        for (int i = 0; i < 5; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.println();

        System.out.println("La nota media es: " + (double) suma / 5);
        System.out.println("La nota más alta es: " + max);
        System.out.println("La nota más baja es: " + min);

    }

    /*
     * 4) Ejercicio 4
     * Programa que declare un vector de diez elementos enteros y pida números para
     * rellenarlo hasta que se llene el vector o se introduzca un **número
     * negativo**. Al
     * terminar, se debe imprimir el vector (mostrando solo los elementos que se han
     * introducido)..
     */
    public static void ejercicio4() {
        System.out.println("Ejercicio 4");
        int[] vector = new int[10];
        int contador = 0;

        while (contador < 10) {
            System.out.print("Introduce un número: ");
            int numero = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            if (numero < 0) {
                break;
            }

            vector[contador] = numero;
            contador++;
        }

        System.out.println("Elementos introducidos:");
        for (int i = 0; i < contador; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();

    }

    /*
     * 5)Ejercicio 5
     * Programa que declare tres vectores: `vector1`, `vector2` y `vector3` de cinco
     * enteros cada uno. Pide valores para `vector1` y `vector2` por teclado y
     * calcula
     * `vector3` como la suma de los dos anteriores (`vector3 = vector1 + vector2`).
     */
    public static void ejercicio5() {
        System.out.println("Ejercicio 5");
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];

        System.out.println("Introduce valores para el primer vector:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el elemento " + (i + 1) + ": ");
            vector1[i] = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer
        }

        System.out.println("Introduce valores para el segundo vector:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el elemento " + (i + 1) + ": ");
            vector2[i] = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer
        }

        // Calcular la suma de los dos vectores
        for (int i = 0; i < 5; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }

        System.out.println("El tercer vector es:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vector3[i] + " ");
        }
        System.out.println();

    }

    /*
     * 6) Queremos guardar los nombres y las edades de los alumnos de un curso.
     * Realiza un
     * programa que introduzca el nombre y la edad de cada alumno.
     * El proceso de lectura de datos terminará cuando se introduzca como nombre un
     * asterisco (`*`). Al finalizar se mostrará:
     * Todos los alumnos que son **mayores de edad**.
     * El/los alumno/s de **mayor edad** .
     */
    public static void ejercicio6() {
        System.out.println("Ejercicio 6");

    }

    /*
     * 7)Queremos guardar la temperatura mínima y máxima de 5 días. Realiza un
     * programa que
     * ofrezca la siguiente información:
     * 
     * La temperatura media de cada día ⚖.
     * Los días con la temperatura más baja .
     * Se lee una temperatura por teclado y se muestran los días cuya temperatura
     * máxima coincide con ella. Si no existe ningún día, se muestra un mensaje
     * informativo.
     */

    public static int temperaturaMinima(int[][] temperaturas) {
        int tempMinima = temperaturas[0][0];
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i][0] < tempMinima) {
                tempMinima = temperaturas[i][0];
            }
        }
        return tempMinima;
    }

    public static int temperaturaMaxima(int[][] temperaturas) {
        int tempMaxima = temperaturas[0][1];
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i][1] > tempMaxima) {
                tempMaxima = temperaturas[i][1];
            }
        }
        return tempMaxima;
    }

    public static void ejercicio7() {
        String[] diaSemana = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
        int[][] temperaturas = new int[7][2];

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Introduzca la temperatura mínima del día " + diaSemana[i]);
            int tempMinima = sc.nextInt();
            System.out.println("Introduzca la temperatura máxima del día " + diaSemana[i]);
            int tempMaxima = sc.nextInt();
            temperaturas[i][0] = tempMinima;
            temperaturas[i][1] = tempMaxima;
        }

        System.out.println("Introduzca una temperatura");
        int tempTeclado = sc.nextInt();
        boolean controlMax = false;
        for (int i = 0; i < temperaturas.length; i++) {
            int tempTotalDia = 0;
            for (int j = 0; j < temperaturas[i].length; j++) {
                tempTotalDia = tempTotalDia + temperaturas[i][j];
            }

            int tempMedia = tempTotalDia / 2;
            System.out.println("La temperatura media del " + diaSemana[i] + " es " + tempMedia);

            if (temperaturas[i][0] == temperaturaMinima(temperaturas)) {
                System.out.println("El día " + diaSemana[i] + " tiene temperatura mínima");
            }

            if (temperaturas[i][1] == temperaturaMaxima(temperaturas) && temperaturas[i][1] == tempTeclado) {
                System.out
                        .println("El día " + diaSemana[i] + " tiene temperatura máxima y coincide con la del teclado");
                controlMax = true;
            }
        }

        if (!controlMax) {
            System.out.println("Ningún día tiene temperatura máxima que coincida con la del teclado");
        }
    }

    /*
     * 8)
     */

    public static void ejercicio8() {
        System.out.println("Ejercicio 8");

    }

    /*
     * 9)
     */

    public static void ejercicio9() {
        System.out.println("Ejercicio 9");
    }

    /*
     * 10)
     */

    public static void ejercicio10() {
        System.out.println("Ejercicio 10");

    }

    /*
     * 11)
     */
    public static void ejercicio11() {
        System.out.println("Ejercicio 11");

    }

    /*
     * 12)
     */

    public static void ejercicio12() {
        System.out.println("Ejercicio 12");

    }

    /*
     * 13)
     */

    public static void ejercicio13() {
        System.out.println("Ejercicio 13");

    }

    /*
     * 14)
     */

    public static void ejercicio14() {
        System.out.println("Ejercicio 14");

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

        sc.close();

    }
}
