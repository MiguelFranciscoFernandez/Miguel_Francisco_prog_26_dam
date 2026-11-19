import java.util.Random;
import java.util.Scanner;

public class Ejercicio3_3 {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    // Todos los ejercicios con el random

    /*
     * Ejercicio 1: Realizar un programa que imprima en pantalla los números del 1
     * al 100. (Debes hacerlo
     * con las tres estructuras iterativas vistas: while, do while y for)
     */
    public static void ejercicio1() {
        System.out.println("Ejercicio 1");

        System.out.println("Usando while:");
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
        System.out.println("Usando do-while:");
        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 100);
        System.out.println("Usando for:");
        for (i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        System.out.println();
    }

    /*
     * Ejercicio 2: Escribir un programa que solicite un valor positivo y nos
     * muestre desde 1
     * hasta el valor ingresado de uno en uno.
     */
    public static void ejercicio2() {
        System.out.println("Ejercicio 2");
        int valor = random.nextInt(100) + 1;
        for (int i = 1; i <= valor; i++) {
            System.out.println(i);
        }
        System.out.println();
    }
    /*
     * Ejercicio 3: Desarrollar un programa que permita la carga de 10 valores por
     * teclado
     * y nos muestre posteriormente la suma de los valores ingresados
     * y su promedio
     */

    public static void ejercicio3() {
        System.out.println("Ejercicio 3");
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            int valor = random.nextInt(100) + 1;
            suma += valor;
        }
        double promedio = suma / 10.0;
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println();
    }

    /*
     * Ejercicio 4: Diseña una aplicación o programa que consista en lo siguiente:
     * o Guarda en una variable tu nombre.
     * o Pide al usuario que intente adivinar tu nombre pidiendo que lo introduzca
     * por teclado.
     * o El programa finaliza cuando el usuario adivina tu nombre.
     * Sino el programa debe continuar pidiendo al usuario que lo intente otra vez.
     */

    public static void ejercicio4() {
        System.out.println("Ejercicio 4");
        String nombre = "JuanCarlos";
        String intento;
        do {
            System.out.println("Introduce tu nombre;");
            intento = sc.nextLine();
        } while (!intento.equalsIgnoreCase(nombre));
        System.out.println("¡Has adivinado el nombre!");
        System.out.println();
    }
    /*
     * Ejercicio 5: Diseña una aplicación que simule la tirada de dos dados y
     * muestre al usuario
     * el resultado de la tirada.
     * Si los dos dados tienen el mismo número debe mostrar un mensaje indicando que
     * el resultado es el mismo.
     * La aplicación se debe repetir hasta que el usuario indique que no quiere
     * tirar más
     * (preguntando por ‘s’ o ‘n’, o “si” o “no”).
     */

    public static void ejercicio5() {
        System.out.println("Ejercicio 5");
        String respuesta;
        do {
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;
            System.out.println("Dado 1: " + dado1);
            System.out.println("Dado 2: " + dado2);
            if (dado1 == dado2) {
                System.out.println("¡Los dados tienen el mismo número!");
            }
            System.out.println("¿Quieres tirar los dados de nuevo? (s/n)");
            respuesta = sc.nextLine();
        } while (respuesta.equalsIgnoreCase("s") || respuesta.equalsIgnoreCase("si"));
        System.out.println();
    }

    /*
     * Ejercicio 6: Realizar un juego para adivinar un número.
     * Para ello primero, el programa debe guardar un número en una variable y el
     * usuario debe introducir números hasta acertarlos.
     * Para darle pistas al usuario se le indicará “mayor” o “menor” según sea mayor
     * o menor con respecto al número guardado.
     * El proceso termina cuando el usuario acierta
     */

    public static void ejercicio6() {
        System.out.println("Ejercicio 6");
        int numeroSecreto = random.nextInt(100) + 1;
        int intento;
        do {
            System.out.println("Adivina el número (entre 1 y 100):");
            intento = sc.nextInt();
            if (intento < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Has acertado!");
            }
        } while (intento != numeroSecreto);
        System.out.println();
    }

    /*
     * Ejercicio 7: Diseña una aplicación que simule un reloj digital que muestre la
     * hora sin parar. Debe esperar un segundo real para darle más realismo. Pasos:
     * o Pide al usuario que introduzca la hora y los minutos.
     * o Inicializa el reloj a esa hora con esos minutos y 0 segundos.
     * o Cada vez que transcurra un segundo incrementa la hora comprobando si hay
     * cambio de minuto y hora
     * o Muéstralo por pantalla.
     * (Nota: La función Thread.sleep(1000) hace que la aplicación se interrumpa
     * durante 1000 milisegundos = 1 segundo).
     */

    public static void ejercicio7() {
        System.out.println("Ejercicio 7");
        int hora = random.nextInt(24);
        int minutos = random.nextInt(60);
        int segundos = 0;
        while (true) {
            System.out.printf("%02d:%02d:%02d\n", hora, minutos, segundos);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            segundos++;
            if (segundos == 60) {
                segundos = 0;
                minutos++;
                if (minutos == 60) {
                    minutos = 0;
                    hora++;
                    if (hora == 24) {
                        hora = 0;
                    }
                }
            }
        }
    }

    /*
     * Ejercicio8: Escriba un programa que calcule el factorial de un número.
     * El factorial de un número es igual al producto de todos los números enteros
     * positivos desde 1 hasta dicho número.
     */

    public static void ejercicio8() {
        System.out.println("Ejercicio 8");
        int numero = random.nextInt(10) + 1;
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
        System.out.println();
    }
    /*
     * Ejercicio8_2: Escriba un programa que calcule el factorial de un número.
     * El factorial de un número es igual al producto de todos los números enteros
     * positivos desde 1 hasta dicho número. Con recursividad
     */

    public static void ejercicio8_2() {
        System.out.println("Ejercicio 8_2");
        int numero = random.nextInt(10) + 1;
        long factorial = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);
        System.out.println();
    }

    public static int calcularFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * calcularFactorial(n - 1);
    }

    /*
     * Ejercicio 9: Escriba un programa que dibuje una escalera de asteriscos. La
     * altura de la escalera se lee por teclado.
     * Ejemplo: Si introducimos un 5 nos queda:
     * 
     ** 
     *** 
     **** 
     ***** 
     * Posteriormente hacer lo mismo, pero con la pirámide invertida.
     */

    public static void ejercicio9() {
        System.out.println("Ejercicio 9");
        int altura = random.nextInt(10) + 1;
        System.out.println("Altura: " + altura);

        // Escalera normal
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // Escalera invertida
        for (int i = altura; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
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
        // ejercicio8_2();
        // ejercicio9();
        sc.close();
    }

}