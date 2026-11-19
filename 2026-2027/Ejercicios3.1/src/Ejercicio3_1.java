import java.util.Random;
import java.util.Scanner;

public class Ejercicio3_1 {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    /*
     * Ejercicio 1: Construye un programa que pida dos números al usuario e indique
     * cuál es mayor o si son
     * iguales.
     */
    public static void ejercicio1() {
        System.out.println("=== Ejercicio 1 ===");
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println("El primer número es mayor");
        } else if (num1 < num2) {
            System.out.println("El segundo número es mayor");
        } else {
            System.out.println("Los números son iguales");
        }
        System.out.println();
    }

    /*
     * Ejercicio 2: Construye un programa que pida un número al usuario
     * y nos indique si es par o impar.
     */
    public static void ejercicio2() {
        System.out.println("=== Ejercicio 2 ===");
        System.out.print("Introduce un número: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
        
        System.out.println();
    }

    /*
     * Ejercicio 3: Construye un programa que pida dos números al usuario
     * y muestre el resultado de su división.
     * Si el segundo número es 0, debe mostrar un mensaje de error.
     */
    public static void ejercicio3() {
        System.out.println("=== Ejercicio 3 ===");
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        if (num2 == 0) {
            System.out.println("Error");
        } else {
            System.out.println("El resultado de la división es: " + (num1 / num2));
        }

        System.out.println();
    }

    /*
     * Ejercicio 4: Construye un programa que pida dos números al usuario. Debe
     * calcular el resultado de
     * elevar el primero (base) al segundo (exponente) teniendo en cuenta lo
     * siguiente:
     * o Si el exponente es cero el resultado es 1
     * o En cualquier otro caso calcula la potencia (Math.pow(base,exponente) es la
     * función que
     * calcula la potencia)
     */
    public static void ejercicio4() {
        System.out.println("=== Ejercicio 4 ===");
        System.out.print("Introduce la base: ");
        int base = scanner.nextInt();
        System.out.print("Introduce el exponente: ");
        int exponente = scanner.nextInt();

        if (exponente == 0) {
            System.out.println("El resultado es: 1");
        } else {
            System.out.println("El resultado es: " + Math.pow(base, exponente));
        }

        System.out.println();
    }

    /*
     * Ejercicio 5: Construye un programa que exprese si un triángulo es isósceles,
     * equilátero o escaleno y
     * si es rectángulo. Para ello debe recibir por teclado 3 valores
     * correspondiente a la medida de sus
     * lados.
     */
    public static void ejercicio5() {
        System.out.println("=== Ejercicio 5 ===");
        System.out.print("Introduce el primer lado: ");
        int lado1 = scanner.nextInt();
        System.out.print("Introduce el segundo lado: ");
        int lado2 = scanner.nextInt();
        System.out.print("Introduce el tercer lado: ");
        int lado3 = scanner.nextInt();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("El triángulo es equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("El triángulo es isósceles");
        } else {
            System.out.println("El triángulo es escaleno");
        }
        System.out.println();
    }

    /*
     * Ejercicio 6: Un instituto está organizando un viaje y te piden que construyas
     * un programa que
     * calcule el coste total del viaje y lo que le supone a cada alumno en función
     * de lo siguiente:
     * o Si llegan a 50 alumnos o más, deberán pagar 40€ por alumno.
     * o De 30 a 49 alumnos, deberán pagar 48€ por alumno.
     * o De 20 a 29 alumnos, deberán pagar 56€ por alumno.
     * o Menos de 20 alumnos, deberán abonar un total de 2000 euros en total
     */
    public static void ejercicio6() {
        System.out.println("=== Ejercicio 6 ===");
        System.out.print("Introduce el número de alumnos: ");
        int alumnos = scanner.nextInt();
        double costeTotal = 0;
        double costePorAlumno = 0;

        switch (alumnos / 10) {
            case 0:// 0 a 9 alumnos
                costeTotal = 2000;
                costePorAlumno = alumnos > 0 ? costeTotal / alumnos : 0;
                break;
            case 1:// 10 a 19 alumnos
                costeTotal = 2000;
                costePorAlumno = alumnos > 0 ? costeTotal / alumnos : 0;
                break;
            case 2:// 20 a 29 alumnos
                costePorAlumno = 56;
                costeTotal = alumnos * costePorAlumno;
                break;
            case 3:// 30 a 39 alumnos
                costePorAlumno = 48;
                costeTotal = alumnos * costePorAlumno;
                break;
            case 4:// 40 a 49 alumnos
                costePorAlumno = 48;
                costeTotal = alumnos * costePorAlumno;
                break;
            default:
                costePorAlumno = 40;
                costeTotal = alumnos * costePorAlumno;
                break;
        }

        System.out.println("El coste total del viaje es: " + costeTotal + " euros");
        System.out.println("El coste por alumno es: " + costePorAlumno + " euros");

        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        // ejercicio1();
        // ejercicio2();
        // ejercicio3();
        // ejercicio4();
        ejercicio5();
        ejercicio6();

        scanner.close();
    }
}
