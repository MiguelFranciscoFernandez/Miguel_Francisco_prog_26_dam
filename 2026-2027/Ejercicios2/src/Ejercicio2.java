import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    /*
     * Ejercicio 1
     * Pide por teclado un String preguntando por tu nombre, después muestra un
     * mensaje de bienvenida por consola.
     */
    public static void ejercicio1() {
        System.out.println("=== Ejercicio 1 ===");
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Bienvenido " + nombre);
        System.out.println();
    }

    /*
     * Ejercicio 2
     * Dos numeros randomy realizar operaciones básicas de suma, resta y
     * multiplicación, enseñando el resultado.
     */
    public static void ejercicio2() {
        System.out.println("=== Ejercicio 2 ===");
        int num1 = (int) (random.nextDouble() * 100);
        int num2 = (int) (random.nextDouble() * 100);

        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println();
    }

    /*
     * Ejercicio 3
     * Numero random para calcular su raíz cuadrada.
     */
    public static void ejercicio3() {
        System.out.println("=== Ejercicio 3 ===");
        int num = (int) (random.nextDouble() * 100);
        System.out.println("Número: " + num);
        System.out.println("Raíz cuadrada: " + Math.sqrt(num));
        System.out.println();
    }

    /*
     * Ejercicio 4
     * Dos números random (base y exponente) y calcular la potencia.
     */
    public static void ejercicio4() {
        System.out.println("=== Ejercicio 4 ===");
        int base = (int) (random.nextDouble() * 10);
        int exponente = (int) (random.nextDouble() * 5);
        System.out.println("Base: " + base);
        System.out.println("Exponente: " + exponente);
        System.out.println("Potencia: " + Math.pow(base, exponente));
        System.out.println();
    }

    /*
     * Ejercicio 5
     * Radio random de un círculo y calcular su área (A = pi * r^2).
     */
    public static void ejercicio5() {
        System.out.println("=== Ejercicio 5 ===");
        int radio = (int) (random.nextDouble() * 10);
        System.out.println("Radio: " + radio);
        System.out.println("Área: " + (Math.PI * Math.pow(radio, 2)));
        System.out.println();
    }

    /*
     * Ejercicio 6
     * Radio random de una circunferencia y calcular su longitud (L = 2 * pi * r).
     */
    public static void ejercicio6() {
        System.out.println("=== Ejercicio 6 ===");
        int radio = (int) (random.nextDouble() * 10);
        System.out.println("Radio: " + radio);
        System.out.println("Longitud: " + (2 * Math.PI * radio));
        System.out.println();
    }

    /*
     * Ejercicio 7
     * Pedir un password y comprobar si es igual que un String definido.
     */
    public static void ejercicio7() {
        System.out.println("=== Ejercicio 7 ===");
        String password = "1234";
        System.out.print("Introduce el password: ");
        String input = scanner.nextLine();
        if (input.equals(password)) {
            System.out.println("Password correcto");
        } else {
            System.out.println("Password incorrecto");
        }
        System.out.println();
    }

    /*
     * Ejercicio 8
     * Pedir una frase y enseñar longitud, primera y última letra.(chartAt)
     */
    public static void ejercicio8() {
        System.out.println("=== Ejercicio 8 ===");
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();
        System.out.println("Longitud: " + frase.length());
        System.out.println("Primera letra: " + frase.charAt(0));
        System.out.println("Última letra: " + frase.charAt(frase.length() - 1));
        System.out.println();
    }

    /*
     * Ejercicio 9
     * Pedir una frase con la palabra "amigo" y extraerla con indexOf y substring.
     */
    public static void ejercicio9() {
        System.out.println("=== Ejercicio 9 ===");
        System.out.print("Introduce una frase con la palabra 'amigo': ");
        String frase = scanner.nextLine();
        int index = frase.indexOf("amigo");
        if (index != -1) {
            String palabra = frase.substring(index, index + 5);
            System.out.println("Palabra extraída: " + palabra);
        } else {
            System.out.println("La palabra 'amigo' no se encuentra en la frase.");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        // ejercicio1();
        // ejercicio2();
        // ejercicio3();
        // ejercicio4();
        // ejercicio5();
        // ejercicio6();
        // ejercicio7();
        // ejercicio8();
        // ejercicio9();

        scanner.close();
    }
} 
