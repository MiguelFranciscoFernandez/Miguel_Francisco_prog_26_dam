import java.util.Random;
import java.util.Scanner;

// cspell:disable
public class Ejercicio3_4 {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    /*
     * Ejercicio 1: Diseñar un programa que pida un número por teclado y escriba
     * tantas líneas como diga el número y en cada línea escriba desde el número 
     * 1 hasta el número introducido.
     * Ejemplo: Si se introduce el número 5, el programa deberá mostrar en pantalla:
     * 12345
     * 12345
     * 12345
     * 12345
     * 12345
     */
    public static void ejercicio1() {
        System.out.println("Ejercicio 1");
        int numero = rand.nextInt(8) + 1;
        System.out.println("Número aleatorio generado: " + numero);
        for (int i = 0; i < numero; i++) {
            for (int j = 1; j <= numero; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
     * Ejercicio 2: Diseñar un programa que haga lo mismo que el anterior, pero en
     * este caso deberá escribir los números en orden decreciente, es decir, si introducimos el
     * número 5 deberá mostrar en pantalla:
     * 54321
     * 54321
     * 54321
     * 54321
     * 54321
     */
    public static void ejercicio2() {
        System.out.println("Ejercicio 2");
        int numero = rand.nextInt(8) + 1;
        System.out.println("Número aleatorio generado: " + numero);
        for (int i = 0; i < numero; i++) {
            for (int j = numero; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
     * Ejercicio 3: Deberéis diseñar un programa similar al anterior, pero en lugar
     * de imprimir en todas las líneas todos los números desde el 1 hasta el
     * introducido por teclado, en la primera línea se imprimirá sólo el número 1, 
     * en la segunda el 1 y el 2, y así hasta escribir el número de líneas indicadas por el usuario.
     * Ejemplo: Si el usuario imprime el número 5, el programa mostrará en pantalla:
     * 1
     * 12
     * 123
     * 1234
     * 12345
     */
    public static void ejercicio3() {
        System.out.println("Ejercicio 3");
        int numero = rand.nextInt(8) + 1;
        System.out.println("Número aleatorio generado: " + numero);
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
     * Ejercicio 4: Diseña un programa que escriba todos los números del 100 al 0 de
     * 7 en 7, es decir, mostrará 100, 93, 86…0.
     */
    public static void ejercicio4() {
        System.out.println("Ejercicio 4");
        for (int i = 100; i >= 0; i -= 7) {
            System.out.println(i);
        }
    }

    /*
     * Ejercicio 5: Desarrollar un programa que te pregunte cuando números quieres
     * leer. Nosotros deberemos leer la cantidad de números indicada y calcula el promedio de los
     * valores indicados.
     */
    public static void ejercicio5() {
        System.out.println("Ejercicio 5");
        int cantidad = rand.nextInt(5) + 3;
        System.out.println("¿Cuántos números quieres leer? " + cantidad);
        int suma = 0;

        for (int i = 0; i < cantidad; i++) {
            int numero = rand.nextInt(50) + 1;
            System.out.println("Introduce el número " + (i + 1) + ": " + numero);
            suma += numero;
        }

        double promedio = (double) suma / cantidad;
        System.out.println("El promedio de los números introducidos es: " + promedio);
    }

    /*
     * Ejercicio 6: Realiza un programa que lea un número por teclado y nos diga si
     * el número es o no primo. (Los números primos son aquellos que sólo son divisibles por ellos
     * mismos y por la unidad).
     */
    public static void ejercicio6() {
        System.out.println("Ejercicio 6");
        int numero = rand.nextInt(50) + 1;
        int divisores = 0;
        System.out.println("Introduce un número: " + numero);
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores++;
            }
        }
        if (divisores == 2) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }

    /*
     * Ejercicio 7: Desarrollar un programa que lea números enteros hasta teclear 0,
     * y nos muestre el máximo, el mínimo y la media de todos ellos. El 0 no se debe contar como
     * número introducido, solo como valor de salida.
     */
    public static void ejercicio7() {
        System.out.println("Ejercicio 7");
        int numero;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int suma = 0;
        int contador = 0;

        do {
            numero = rand.nextInt(21);
            System.out.println("Introduce un número (0 para salir): " + numero);

            if (numero != 0) {
                if (numero > maximo) {
                    maximo = numero;
                }
                if (numero < minimo) {
                    minimo = numero;
                }
                suma += numero;
                contador++;
            }
        } while (numero != 0);

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("Máximo: " + maximo);
            System.out.println("Mínimo: " + minimo);
            System.out.println("Media: " + media);
        } else {
            System.out.println("No se han introducido números.");
        }
    }

    /*
     * Ejercicio 8: Escribe un programa en Java que implemente una calculadora
     * simple. La calculadora debe permitir a los usuarios realizar operaciones matemáticas básicas, como
     * suma, resta, multiplicación y división. El programa deberá mostrar un menú con las
     * siguientes opciones:
     * 1. Sumar
     * 2. Restar
     * 3. Multiplicar
     * 4. Dividir
     * 5. Es primo (indica si el número introducido es primo o no lo es)
     * 6. Salir
     */
    public static void ejercicio8() {
        System.out.println("Ejercicio 8");
        int opcion = rand.nextInt(6) + 1;
        System.out.println("Menú de la calculadora:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Es primo");
        System.out.println("6. Salir");
        System.out.println("Elige una opción (1-6): " + opcion);

        if (opcion >= 1 && opcion <= 4) {
            int num1 = rand.nextInt(20) + 1;
            int num2 = rand.nextInt(10) + 1;
            System.out.println("Introduce el primer número: " + num1);
            System.out.println("Introduce el segundo número: " + num2);
            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Error: División por cero no permitida.");
                    }
                    break;
            }
        } else if (opcion == 5) {
            int num = rand.nextInt(30) + 1;
            System.out.println("Introduce un número: " + num);
            boolean esPrimo = true;
            if (num <= 1) {
                esPrimo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }
            if (esPrimo) {
                System.out.println(num + " es un número primo.");
            } else {
                System.out.println(num + " no es un número primo.");
            }
        } else if (opcion != 6) {
            System.out.println("Opción no válida. Por favor, elige una opción del menú.");
        }
    }

    /*
 * Ejercicio 8: Escribe un programa en Java que implemente una calculadora
 * simple utilizando funciones para cada operación matemática y comprobación.
 */
public static void ejercicio8_1() {
    System.out.println("Ejercicio 8");
    int opcion = rand.nextInt(6) + 1;
    
    mostrarMenu();
    System.out.println("Elige una opción (1-6): " + opcion);

    if (opcion >= 1 && opcion <= 4) {
        int num1 = rand.nextInt(20) + 1;
        int num2 = rand.nextInt(10) + 1;
        System.out.println("Introduce el primer número: " + num1);
        System.out.println("Introduce el segundo número: " + num2);
        
        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + sumar(num1, num2));
                break;
            case 2:
                System.out.println("Resultado: " + restar(num1, num2));
                break;
            case 3:
                System.out.println("Resultado: " + multiplicar(num1, num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " + dividir(num1, num2));
                } else {
                    System.out.println("Error: División por cero no permitida.");
                }
                break;
        }
    } else if (opcion == 5) {
        int num = rand.nextInt(30) + 1;
        System.out.println("Introduce un número: " + num);
        
        if (esPrimo(num)) {
            System.out.println(num + " es un número primo.");
        } else {
            System.out.println(num + " no es un número primo.");
        }
    } else if (opcion == 6) {
        System.out.println("Saliendo de la calculadora...");
    } else {
        System.out.println("Opción no válida. Por favor, elige una opción del menú.");
    }
}

// --- FUNCIONES AUXILIARES ---

public static void mostrarMenu() {
    System.out.println("Menú de la calculadora:");
    System.out.println("1. Sumar");
    System.out.println("2. Restar");
    System.out.println("3. Multiplicar");
    System.out.println("4. Dividir");
    System.out.println("5. Es primo");
    System.out.println("6. Salir");
}

public static int sumar(int a, int b) {
    return a + b;
}

public static int restar(int a, int b) {
    return a - b;
}

public static int multiplicar(int a, int b) {
    return a * b;
}

public static double dividir(int a, int b) {
    return (double) a / b;
}

public static boolean esPrimo(int num) {
    if (num <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}

    /*
     * Ejercicio 9: Diseña un programa que calcule la letra de un DNI. Para ello:
     * 1º Pediremos el DNI por teclado al usuario.
     * 2º Para calcular la letra, cogeremos el DNI y lo dividiremos entre 23
     * quedándonos con el resto de la división, que debe estar entre 0 y 22.
     */
    public static void ejercicio9() {
        System.out.println("Ejercicio 9");
        int dni = rand.nextInt(90000000) + 10000000;
        System.out.println("Introduce el número del DNI (sin letra): " + dni);
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni % 23;
        char letra = letras.charAt(resto);
        System.out.println("La letra del DNI es: " + letra);
    }

    /*
     * Ejercicio 10: Solicita al usuario una cadena y comprueba el número de vocales
     * que tiene. Deberás usar el método charAT(i) de la clase String para extraer
     * un carácter de la cadena, donde i es la posición del carácter de la cadena
     * que queremos obtener. Por ejemplo, si quisiéramos obtener el carácter número
     * de 5 de una cadena lo haríamos así: cadena.charAT(i)
     */
    public static void ejercicio10() {
        System.out.println("Ejercicio 10");
        String[] cadenas = {
            "Programar en Java es divertido",
            "La inteligencia artificial avanza rapido",
            "Buenos dias usuario",
            "Aleatoriedad de cadenas de texto"
        };
        String cadena = cadenas[rand.nextInt(cadenas.length)].toLowerCase();
        System.out.println("Introduce una cadena de texto: " + cadena);
        int contadorVocales = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contadorVocales++;
            }
        }
        System.out.println("Número de vocales en la cadena: " + contadorVocales);
    }

    /*
     * Ejercicio 11: Realiza el control de acceso a una caja fuerte. La combinación
     * será un número de cuatro cifras. El usuario tendrá 4 oportunidades para
     * averiguar el número. El programa nos pedirá la combinación para abrirla. Si
     * no acertamos, se nos mostrará el mensaje “Clave incorrecta le quedan X
     * intentos”, si agota los 4 intentos mostrará el mensaje “Lo siento has agotado
     * las 4 oportunidades” y si acertamos se nos dirá “Has abierto la caja fuerte”.
     */
    public static void ejercicio11() {
        System.out.println("Ejercicio 11");
        final int combinacion = 1234;
        int intentos = 4;
        boolean cajaAbierta = false;
        while (intentos > 0 && !cajaAbierta) {
            int intento = rand.nextInt(9000) + 1000;
            System.out.println("Introduce la combinación de 4 cifras: " + intento);
            if (intento == combinacion) {
                cajaAbierta = true;
                System.out.println("Has abierto la caja fuerte.");
            } else {
                intentos--;
                if (intentos > 0) {
                    System.out.println("Clave incorrecta, te quedan " + intentos + " intentos. ");
                } else {
                    System.out.println("Lo siento, has agotado las 4 oportunidades.");
                }
            }
        }
    }

    /*
     * Ejercicio 12: Realiza un programa que compruebe si dos números son amigos.
     * Para ello hay que comprobar que la suma de todos los divisores del primer
     * número (sin contar con él) es el segundo número, y que la suma de todos los
     * divisores propios del segundo número (sin contar con él) es el primer número.
     * Por ejemplo: - Los divisores propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22,
     * 44, 55 y 110. Su suma es 284. - Los divisores propios de 284 son 1, 2, 4, 71
     * y 142. Su suma es 220. - Por tanto, 220 y 284 son amigos.
     */
    public static void ejercicio12() {
        System.out.println("Ejercicio 12");
        int num1 = rand.nextInt(400) + 1;
        System.out.print("Introduce el primer número: " + num1);
        int num2 = rand.nextInt(400) + 1;
        System.out.println("Introduce el segundo número: " + num2);

        int sumaDivisoresNum1 = 0;
        int sumaDivisoresNum2 = 0;

        System.out.print("Divisores propios de " + num1 + ": ");
        for (int i = 1; i <= num1 / 2; i++) {
            if (num1 % i == 0) {
                sumaDivisoresNum1 += i;
                System.out.print(i + " ");
            }
        }
        System.out.println("Suma de divisores propios de " + num1 + ": " + sumaDivisoresNum1);

        System.out.print("Divisores propios de " + num2 + ": ");
        for (int i = 1; i <= num2 / 2; i++) {
            if (num2 % i == 0) {
                sumaDivisoresNum2 += i;
                System.out.print(i + " ");
            }
        }
        System.out.println("Suma de divisores propios de " + num2 + ": " + sumaDivisoresNum2);

        if (sumaDivisoresNum1 == num2 && sumaDivisoresNum2 == num1) {
            System.out.println(num1 + " y " + num2 + " son números amigos.");
        } else {
            System.out.println(num1 + " y " + num2 + " no son números amigos.");
        }
    }

    /*
     * Ejercicio 13: Realiza un algoritmo que permita calcular un número determinado
     * de elementos de la serie de Fibonacci, teniendo en cuenta que cada uno es la
     * suma de los dos elementos anteriores, con la excepción de los dos primeros,
     * que son 0 y 1. Así, la serie estaría formada por los números: 0, 1, 1, 2, 3,
     * 5, 8, 13, 21…
     */
    public static void ejercicio13() {
        System.out.println("Ejercicio 13");
        int n = rand.nextInt(10) + 3;
        System.out.print("Introduce el número de elementos de la serie de Fibonacci que deseas calcular: " + n);
        int a = 0, b = 1;
        System.out.print("Serie: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
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
        // ejercicio8_1();
        // ejercicio9();
        // ejercicio10();
        // ejercicio11();
        // ejercicio12();
        // ejercicio13();
    }
}