import java.util.Random;
import java.util.Scanner;

public class Ejercicio3_2 {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    // Todos los ejercicios con el random

    /*
     * Ejercicio 1: Escribe un programa que pida un número y diga si es o no
     * múltiplo de 3.
     */
    public static void ejercicio1() {
        System.out.println("=== Ejercicio 1 ===");
        int numero = random.nextInt(101);
        System.out.println("Número generado: " + numero);
        if (numero % 3 == 0) {
            System.out.println("El número " + numero + " es múltiplo de 3.");
        } else {
            System.out.println("El número " + numero + " no es múltiplo de 3.");
        }
        System.out.println();
    }

    /*
     * Ejercicio 2: Escribe un programa que lee por teclado tres números enteros y
     * calcula y muestra el
     * mayor de los tres.
     */
    public static void ejercicio2() {
        System.out.println("=== Ejercicio 2 ===");
        int a = random.nextInt(101);
        int b = random.nextInt(101);
        int c = random.nextInt(101);
        System.out.println("Números generados: " + a + ", " + b + ", " + c);
        if (a >= b && a >= c) {
            System.out.println("El mayor es: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("El mayor es: " + b);
        } else {
            System.out.println("El mayor es: " + c);
        }
        System.out.println();
    }

    /*
     * Ejercicio 3: Escribe un programa que lea por teclado tres números enteros H,
     * M, S correspondientes
     * a hora, minutos y segundos respectivamente, y comprueba si la hora que
     * indican es una hora válida.
     * 
     * Supondremos que leemos una hora en modo 24 Horas, es decir, el valor válido
     * para las horas será
     * mayor o igual que cero y menor que 24. El valor válido para los minutos y
     * segundos estará
     * comprendido entre 0 y 59 ambos incluidos.
     */
    public static void ejercicio3() {
        System.out.println("=== Ejercicio 3 ===");
        int horas = random.nextInt(24);
        int minutos = random.nextInt(60);
        int segundos = random.nextInt(60);
        System.out.println("Hora generada: " + horas + ":" + minutos + ":" + segundos);
        if (horas >= 0 && horas < 24 && minutos >= 0 && minutos < 60 && segundos >= 0 && segundos < 60) {
            System.out.println("La hora es válida." + horas + ":" + minutos + ":" + segundos);
        } else {
            System.out.println("La hora no es válida.");
        }
        System.out.println();
    }

    /*
     * Ejercicio 4: Escribe un programa que pida por teclado un número entre 0 y 10,
     * y muestre en pantalla
     * el nombre en letras de ese número. Se debe controlar que se introduzca un
     * número válido.
     */
    public static void ejercicio4() {
        System.out.println("=== Ejercicio 4 ===");
        int numero = random.nextInt(20);
        System.out.println("Número generado: " + numero);
        if (numero < 0 || numero > 10) {
            System.out.println("Número no válido.");
        } else {
            switch (numero) {
                case 0:
                    System.out.println("Cero");
                    break;
                case 1:
                    System.out.println("Uno");
                    break;
                case 2:
                    System.out.println("Dos");
                    break;
                case 3:
                    System.out.println("Tres");
                    break;
                case 4:
                    System.out.println("Cuatro");
                    break;
                case 5:
                    System.out.println("Cinco");
                    break;
                case 6:
                    System.out.println("Seis");
                    break;
                case 7:
                    System.out.println("Siete");
                    break;
                case 8:
                    System.out.println("Ocho");
                    break;
                case 9:
                    System.out.println("Nueve");
                    break;
                case 10:
                    System.out.println("Diez");
                    break;
            }
        }
        System.out.println();
    }

    /*
     * Ejercicio 5: Escribe un programa que realice lo contrario que el anterior, es
     * decir pide un número en
     * letras y enseña un número.
     * Aclaración: No es lo mismo la cadena "Uno" que "uno" o que "UNO", por lo
     * tanto, para que el
     * programa funcione correctamente deberías pasar todas las letras del nombre
     * del número a
     * mayúsculas o a minúsculas. Investiga cuál es la función del objeto String que
     * nos permite realizar ese
     * cambio.
     */
    public static void ejercicio5() {
        System.out.println("=== Ejercicio 5 ===");
        System.out.println("Escribe el numero");
        String numero = scanner.nextLine();
        switch (numero.toLowerCase()) {
            case "cero":
                System.out.println("0");
                break;
            case "uno":
                System.out.println("1");
                break;
            case "dos":
                System.out.println("2");
                break;
            case "tres":
                System.out.println("3");
                break;
            case "cuatro":
                System.out.println("4");
                break;
            case "cinco":
                System.out.println("5");
                break;
            case "seis":
                System.out.println("6");
                break;
            case "siete":
                System.out.println("7");
                break;
            case "ocho":
                System.out.println("8");
                break;
            case "nueve":
                System.out.println("9");
                break;
            case "diez":
                System.out.println("10");
                break;
            default:
                System.out.println("Número no válido.");
        }
        System.out.println();
    }

    /*
     * Ejercicio 6: Random Escribe un programa que lea una variable entera mes y
     * compruebe
     * si el valor corresponde a un mes de 30 días, de 31 o de 28. Supondremos que
     * febrero tiene
     * 28 días. Se mostrará además el nombre del mes.
     * Se debe comprobar que el valor introducido esté comprendido entre 1 y 12.
     */
    public static void ejercicio6() {
        System.out.println("=== Ejercicio 6 ===");
        int mes = random.nextInt(1, 13);
        System.out.println("Mes generado: " + mes);
        switch (mes) {
            case 1:
                System.out.println("Enero: 31 días");
                break;
            case 2:
                System.out.println("Febrero: 28 días");
                break;
            case 3:
                System.out.println("Marzo: 31 días");
                break;
            case 4:
                System.out.println("Abril: 30 días");
                break;
            case 5:
                System.out.println("Mayo: 31 días");
                break;
            case 6:
                System.out.println("Junio: 30 días");
                break;
            case 7:
                System.out.println("Julio: 31 días");
                break;
            case 8:
                System.out.println("Agosto: 31 días");
                break;
            case 9:
                System.out.println("Septiembre: 30 días");
                break;
            case 10:
                System.out.println("Octubre: 31 días");
                break;
            case 11:
                System.out.println("Noviembre: 30 días");
                break;
            case 12:
                System.out.println("Diciembre: 31 días");
                break;
        }
        System.out.println();

    }

    /*
     * Ejercicio 7: Random un programa que pida la nota de las tres evaluaciones, y
     * si están aprobadas
     * realizar la media para calcular la nota final. Evaluación aprobada >= 5. Si
     * no, escribe que evaluación debe recuperar.
     */
    public static void ejercicio7() {
        System.out.println("=== Ejercicio 7 ===");
        double n1 = random.nextInt(11);
        double n2 = random.nextInt(11);
        double n3 = random.nextInt(11);
        System.out.println("Notas generadas: " + n1 + ", " + n2 + ", " + n3);
        if (n1 >= 5 && n2 >= 5 && n3 >= 5) {
            double media = (n1 + n2 + n3) / 3;
            System.out.println("Media: " + media);
        } else {
            if (n1 < 5) {
                System.out.println("Debes recuperar la primera evaluación.");
            }
            if (n2 < 5) {
                System.out.println("Debes recuperar la segunda evaluación.");
            }
            if (n3 < 5) {
                System.out.println("Debes recuperar la tercera evaluación.");
            }
        }
    }

    /*
     * Ejercicio 8: Escribe un programa que calcule el sueldo de un trabajador. Debe
     * pedir el número de horas trabajadas este mes. Las primeras 150 horas se pagan
     * a 10€ y a partir de ahí, las restantes horas que superen las 150 se pagan a
     * 20€. Debe aparecer por pantalla el total del sueldo.
     */
    public static void ejercicio8() {
        System.out.println("=== Ejercicio 8 ===");
        int hrtab = random.nextInt(201);
        System.out.println("Horas generadas: " + hrtab);
        int sueldo;
        if (hrtab <= 150) {
            sueldo = hrtab * 10;
        } else {
            sueldo = 150 * 10 + (hrtab - 150) * 20;
        }

        System.out.println("Sueldo: " + sueldo + "€");

    }

    /*
     * Ejercicio 9: Escribe un programa que diga si un año es bisiesto. No deber
     * permitir aceptar años negativos. Un año es bisiesto si cumple una de las
     * siguientes reglas:
     * 1. Divisible entre 4, divisible entre 100 y divisible entre 400.
     * 2. Divisible entre 4, NO divisible entre 100.
     */
    public static void ejercicio9() {
        System.out.println("=== Ejercicio 9 ===");
        int anio = random.nextInt();
        System.out.println("Año generado: " + anio);
        if (anio < 0) {
            System.out.println("Año no válido.");
        } else if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 4 == 0 && anio % 100 == 0 && anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }

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
