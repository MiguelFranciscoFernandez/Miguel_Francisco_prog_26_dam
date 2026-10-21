import java.util.Random;
import java.util.Scanner;

// cspell:disable
public class Ejercicio3_5 {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    // Todos con random
    /*
     * Ejercicio 1: Diseña un programa que pides al usuario que ingrese la cantidad
     * de números que va aintroducir.
     * Deberá leer la cantidad de números indicada y cuenta cuántos son positivos,
     * negativos
     * y ceros, cuantos pares y cuantos impares,
     * mostrando esa información al finalizar la ejecución.
     */
    public static void ejercicio1() {
        System.out.println("Ejercicio 1");
        System.out.print("¿Cuántos números vas a introducir? ");
        int cantidad = sc.nextInt();

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Introduce el número " + i + ": ");
            int numero = sc.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Positivos: " + positivos + "\n" + "Negativos: " + negativos + "\n" + "Ceros: " + ceros + "\n" + "Pares: " + pares + "\n" +  "Impares: " + impares);
    }

    /*
     * Ejercicio 2:
     * Crea un programa que solicite un número
     * y muestra su tabla de multiplicar del 1 al 10.
     */

    public static void ejercicio2() {
        System.out.println("Ejercicio 2");
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
    /*
     * Ejercicio 3: Diseña un programa que permita al usuario convertir temperaturas
     * de Celsius a
     * Fahrenheit y viceversa. Ofrece un menú para elegir la conversión.
     * Para pasar de Celsius a Fahrenheit:
     * (°C * 1,8) + 32 y de Fahrenheit a Celsius: (ºF-32)/1.8)
     */

    public static void ejercicio3() {
        System.out.println("Ejercicio 3");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.print("Elige una conversión: ");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.print("Introduce los grados Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = celsius * 1.8 + 32;
            System.out.println(celsius + " °C = " + fahrenheit + " °F");
        } else if (opcion == 2) {
            System.out.print("Introduce los grados Fahrenheit: ");
            double fahrenheit = sc.nextDouble();
            double celsius = (fahrenheit - 32) / 1.8;
            System.out.println(fahrenheit + " °F = " + celsius + " °C");
        } else {
            System.out.println("Opción no válida.");
        }

    }

    /*
     * Ejercicio 4: Implementa un programa que pida un número entero al usuario y
     * determine si es un
     * número perfecto.
     * Un número es perfecto si es igual a la suma de sus divisores propios. (Los
     * divisores propios de un número son aquellos números por los que es divisible
     * un número
     * sin contar el número)
     */

    public static void ejercicio4() {
        System.out.println("Ejercicio 4");
        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        int sumaDivisores = 0;
        if (numero > 1) {
            for (int divisor = 1; divisor <= numero / 2; divisor++) {
                if (numero % divisor == 0) {
                    sumaDivisores += divisor;
                }
            }
        }

        if (numero > 1 && sumaDivisores == numero) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }

    }

    /*
     * Ejercicio 5: Crea un programa que pida al usuario un número entero positivo y
     * calcule la suma de
     * todos los números primos hasta ese número
     */

    public static void ejercicio5() {
        System.out.println("Ejercicio 5");
    }

    /*
     * Ejercicio 6: Diseña un programa que simule una casa de apuestas. Se comenzará
     * con un saldo
     * de
     * 100€. Pedirá al usuario que cantidad quiere apostar, la cual deberá estar
     * entre 1 y el saldo disponible.
     * Se deberá generar un booleano aleatorio (random.nextBoolean()),
     * en caso de que salga true, el usuario gana el importe apostado.
     * Se jugará a este juego mientras
     * quiera el usuario y/o quede saldo.
     */

    public static void ejercicio6() {
        System.out.println("Ejercicio 6");
    }

    /*
     * Ejercicio 7: Crea un programa que simule una quiniela, para ello se deberá
     * leer el resultado de 15
     * partidos. El usuario deberá introducir 1, X o 2. Almacenaremos los valores en
     * variables para luego
     * poder usarlas. Debemos controlar que solo pueda introducir 1, X o 2
     * Una vez pedidos todos los resultados iremos generando aleatoriamente el
     * resultado de los partidos,
     * si gana el equipo de casa (1), empatan(X) o gana el equipo visitante.
     * Debemos mostrar para finaliza el resultado del partido y el que puso el
     * usuario, y finalmente el
     * número de aciertos. Los aciertos en la quiniela se cuentan del 1 al 14 + el
     * pleno al 15.
     */

    public static void ejercicio7() {
        System.out.println("Ejercicio 7");

    }

    /*
     * Ejercicio 8: Crea un programa que lea una frase por teclado y la convierta al
     * formato camelCase. Por
     * ejemplo, si introducimos por teclado “hola como estás”, el programa deberá
     * mostrar
     * “HolaComoEstás”.
     * Pistas:
     * o Recuerda que podemos ir cogiendo carácter a carácter de una cadena usando
     * la función
     * cadena.charAt(i), donde cadena es nuestra variable cadena y la i la posición
     * del carácter.
     * o Podemos pasar a minúscula un carácter con la función:
     * Character.toLowerCase(c), donde c
     * es el carácter a convertir.
     * o Podemos pasar a mayúsculas un carácter con la función:
     * Character.toUpperCase(c), donde c
     * es el carácter a convertir.
     */

    public static void ejercicio8() {
        System.out.println("Ejercicio 8");

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


    }
}