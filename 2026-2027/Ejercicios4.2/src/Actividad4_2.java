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
     * 3)
     */
    public static void ejercicio3() {
        System.out.println("Ejercicio 3");

    }

    /*
     * 4) .
     */
    public static void ejercicio4() {
        System.out.println("Ejercicio 4");

    }

    /*
     * 5)
     */
    public static void ejercicio5() {
        System.out.println("Ejercicio 5");

    }

    /*
     * 6)
     */
    public static void ejercicio6() {
        System.out.println("Ejercicio 6");

    }

    /*
     * 7)
     */

    public static void ejercicio7() {
        System.out.println("Ejercicio 7");

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
        ejercicio2();
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
