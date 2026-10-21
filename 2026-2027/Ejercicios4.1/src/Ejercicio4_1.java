import java.util.Random;
import java.util.Scanner;

// cspell:disable
public class Ejercicio4_1 {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    /*
     * Ejercicio 1: Realiza una función llamada suma que sume dos números enteros
     * y te devuelva el resultado, posteriormente llámala desde el main y
     * muestra su resultado.
     */
    public static void ejercicio1() {
        System.out.println("Ejercicio 1");
    }

    /*
     * Ejercicio 2: Realiza un método llamado holaMundo que al ser llamada
     * muestre por consola el mensaje "Hola Mundo!".
     */
    public static void ejercicio2() {
        System.out.println("Ejercicio 2");
    }

    /*
     * Ejercicio 3: Realiza un método llamado eco con un parámetro de entrada n,
     * que al ser llamada muestre por consola el mensaje "ECO" un
     * número n de veces.
     */
    public static void ejercicio3() {
        System.out.println("Ejercicio 3");
    }

    /*
     * Ejercicio 4: Escribe un método llamado mostrarIntermedios que tenga dos
     * parámetros de entrada a y b (números enteros) y muestre todos
     * los números pares entre ambos números (a y b inclusive).
     */
    public static void ejercicio4() {
        System.out.println("Ejercicio 4");
    }

    /*
     * Ejercicio 5: Realiza una función areaCirculo que reciba un parámetro r y te
     * devuelva el área de un círculo de radio r.
     * Nota: En un circulo: area = pi * r * 2.
     * Nota: en Java podemos usar el número pi con la constante de la
     * clase Math PI (se accede con Math.PI).
     */
    public static void ejercicio5() {
        System.out.println("Ejercicio 5");
    }

    /*
     * Ejercicio 6: Realiza una función que reciba dos números enteros y devuelva el
     * mayor de los dos, si son iguales devuelve cualquiera de los dos.
     */
    public static void ejercicio6() {
        System.out.println("Ejercicio 6");
    }

    /*
     * Ejercicio 7: Realiza un método llamado mostrar que te muestre un array
     * bidimensional por consola.
     */
    public static void ejercicio7() {
        System.out.println("Ejercicio 7");
    }

    /*
     * Ejercicio 8: Realiza una función llamada busqueda que dado un array de
     * enteros y un elemento a buscar te devuelva el valor de la posición
     * donde se encuentra el elemento a buscar en el array (una
     * cualquiera de sus apariciones).
     */
    public static void ejercicio8() {
        System.out.println("Ejercicio 8");
    }

    /*
     * Ejercicio 9: Realiza un método llamado sumaPorElementoM que reciba un
     * array de enteros y un entero y le sume a cada posición del array
     * recibido el entero recibido. (Ojo, es un método).
     */
    public static void ejercicio9() {
        System.out.println("Ejercicio 9");
    }

    /*
     * Ejercicio 10: Realiza una función llamada sumaPorElementoF que reciba un
     * array de enteros y un entero y devuelva un array con el tamaño
     * del array recibido y que contiene en cada posición la suma del
     * elemento del array recibido con el entero recibido.
     */
    public static void ejercicio10() {
        System.out.println("Ejercicio 10");
    }

    /*
     * Ejercicio 11: (comportamiento parecido al ejercicio anterior). (Ojo, es una función).
     * Trata de explicar las diferencias entre el comportamiento del
     * método del ejercicio 9 y de la función del ejercicio 10. Fíjate cómo
     * se utilizan en el main.
     */
    public static void ejercicio11() {
        System.out.println("Ejercicio 11");
    }

    /*
     * Ejercicio 12: Realiza una función llamada negacionBooleana que reciba un
     * array de booleanos y devuelva un array de las mismas
     * dimensiones pero donde antes había un true pasará a haber un
     * false y donde antes había un false pasará a haber un true.
     */
    public static void ejercicio12() {
        System.out.println("Ejercicio 12");
    }

    /*
     * Ejercicio 13: Haz una función llamada factorial que reciba un entero y te
     * devuelva el resultado del factorial de ese número. Usa esa función
     * factorial para llamarla desde un método llamado factorialArray que
     * reciba un array de enteros (se presupone que mayores de 0) y
     * cambie el valor de cada posición por la del factorial del número
     * que contiene. (Ojo, es un método).
     */
    public static void ejercicio13() {
        System.out.println("Ejercicio 13");
    }

    /*
     * Ejercicio 14: Realiza una función que cree un array bidimensional de char
     * 10x10 y lo inicialice poniendo en todas sus posiciones el valor '-'.
     */
    public static void ejercicio14() {
        System.out.println("Ejercicio 14");
    }

    /*
     * Ejercicio 15: Haz un método llamado mostrarTableroRaya que genere un
     * tablero de 10x10 donde en todas las casillas está el carácter '-' y
     * muestre el tablero de la siguiente forma (NOTA: utiliza la función anterior):
     * 
     *       0  1  2  3  4  5  6  7  8  9
     *    A  -  -  -  -  -  -  -  -  -  -
     *    B  -  -  -  -  -  -  -  -  -  -
     *    C  -  -  -  -  -  -  -  -  -  -
     *    D  -  -  -  -  -  -  -  -  -  -
     *    E  -  -  -  -  -  -  -  -  -  -
     *    F  -  -  -  -  -  -  -  -  -  -
     *    G  -  -  -  -  -  -  -  -  -  -
     *    H  -  -  -  -  -  -  -  -  -  -
     *    I  -  -  -  -  -  -  -  -  -  -
     *    J  -  -  -  -  -  -  -  -  -  -
     */
    public static void ejercicio15() {
        System.out.println("Ejercicio 15");
    }

    /*
     * Ejercicio 16: Realiza una función copyArrayMasUno que reciba un array y
     * devuelva un array con los elementos copiados y una posición más
     * con el valor 0.
     */
    public static void ejercicio16() {
        System.out.println("Ejercicio 16");
    }

    /*
     * Ejercicio 17: Realiza una función llamada noRepetidos que reciba un array
     * de enteros que pueden estar repetidos y devuelva un nuevo array
     * sin ningún entero repetido. (NOTA: usa la función anterior).
     * Ejemplos:
     * entrada: [1, 3, 0, 1, 3, 6, 2, 1] → salida: [1, 3, 0, 6, 2]
     * entrada: [1, 1, 0, 1, 2, 1, 2, 1] → salida: [1, 0, 2]
     */
    public static void ejercicio17() {
        System.out.println("Ejercicio 17");
    }

    /*
     * Ejercicio 18: Realiza una función llamada invertirArray que reciba un array
     * de enteros y devuelva otro array con las posiciones invertidas:
     * Ejemplo:
     * entrada: [1, 3, 6, 2, 4, 1] → salida: [1, 4, 2, 6, 3, 1]
     */
    public static void ejercicio18() {
        System.out.println("Ejercicio 18");
    }

    /*
     * Ejercicio 19: Realiza un método llamado ordenacionM que reciba un array
     * de enteros y un char, si el char tiene el valor 'c' realiza la
     * ordenación creciente, si el char tiene el valor 'd' realiza la
     * ordenación decreciente.
     * Ejemplos:
     * entrada: [2, 4, 1, 3, 9, 3, 1, 1], 'c' → salida: [1, 1, 2, 3, 3, 4, 9]
     * entrada: [2, 4, 1, 3, 9, 3, 1, 1], 'd' → salida: [9, 4, 3, 3, 2, 1, 1]
     */
    public static void ejercicio19() {
        System.out.println("Ejercicio 19");
    }

    /*
     * Ejercicio 20: Realiza un método que dado un array de números enteros
     * positivos mayor o igual que 1 (naturales) lo ordene según el
     * número de divisores que tiene cada número.
     * NOTA1: Haz primero una función compararPorNumDivisores que
     * reciba dos números enteros mayores o iguales que uno y los
     * compare de tal forma que:
     * - si el primero tiene más divisores que el segundo la salida sea 1
     * - si el segundo tiene más divisores que el primero la salida sea -1
     * - si tienen ambos el mismo número de divisores la salida sea 0
     * NOTA2: Realiza una función numDivisores que reciba un número
     * entero mayor o igual que 1 y devuelva el número de divisores que
     * tiene ese número.
     * NOTA3: Realiza una función isDivisor que reciba dos números
     * enteros mayores o iguales que uno y devuelva si el segundo es
     * divisor del primero (true) o si no es divisor (false).
     */
    public static void ejercicio20() {
        System.out.println("Ejercicio 20");
    }

    /*
     * Ejercicio 21: Haz una función llamada desplazamiento que reciba un array
     * de char y un número entero mayor o igual que cero, y devuelva un
     * nuevo array que sea el resultado de desplazar los elementos el
     * número de posiciones introducido. Se consideran las posiciones cíclicas.
     * Ejemplos:
     * entrada: ['a', 'v', 't', 's', 'k'], 3 → salida: ['t', 's', 'k', 'a', 'v']
     * entrada: ['a', 'v', 't', 's', 'k'], 0 → salida: ['a', 'v', 't', 's', 'k']
     * entrada: ['a', 'v', 't', 's', 'k'], 1 → salida: ['k', 'a', 'v', 't', 's']
     */
    public static void ejercicio21() {
        System.out.println("Ejercicio 21");
    }

    /*
     * Ejercicio 22: Realiza una función llamada sumatorioDivisoresArray que
     * realice el sumatorio de los divisores de todos los números de un array.
     * Ejemplo:
     * entrada: [6, 5, 4] → salida: 25
     */
    public static void ejercicio22() {
        System.out.println("Ejercicio 22");
    }

    /*
     * Ejercicio 23: Realiza una función llamada subsecuenciaCrecienteMasLarga
     * que dado un array de enteros te devuelva un entero que indique la
     * posición de inicio de la subsecuencia creciente más larga. En caso
     * de empate devuelve cualquiera de las posiciones de inicio de ellas.
     * Ejemplo:
     * entrada: [2, 4, 1, 3, 5, 8, 12, 2, 3, 2, 1, 3, 5, 7, 8] → salida: 2
     */
    public static void ejercicio23() {
        System.out.println("Ejercicio 23");
    }

    /*
     * Ejercicio 24: Realiza un juego llamado alfil vs caballo, se juega en un tablero
     * 8x8 de casillas blancas y casillas negras semejante al ajedrez, se situarán de forma
     * aleatoria las piezas caballo y alfil, teniendo en cuenta que no estén en la misma casilla.
     * Tras esto, el programa mostrará el tablero y dejará mover a usuario1 y usuario2
     * hasta que alguno de los dos coma al otro.
     */
    public static void ejercicio24() {
        System.out.println("Ejercicio 24");
    }

    /*
     * Ejercicio 25: Realiza el juego anterior de nuevo, pero en esta ocasión, en
     * vez de dos usuarios enfrentándose, habrá solo uno, que se
     * enfrentará contra la máquina siguiendo un algoritmo específico.
     */
    public static void ejercicio25() {
        System.out.println("Ejercicio 25");
    }

    /*
     * Ejercicio 26: Realiza un método llamado generarTresXAleatorias que reciba
     * un array 8x8 de char "espacio" y un número "cant" e introduzca
     * aleatoriamente cant veces bloques de tres X seguidas tanto
     * horizontal como verticalmente (de forma aleatoria). Las X no
     * podrán estar en la misma posición que otros bloques y tendrá que
     * dejarse un espacio tanto vertical como horizontalmente (no
     * diagonalmente) respecto a otros bloques de X. En las otras
     * casillas habrá rayas (-). Finalmente el programa deberá mostrar
     * por pantalla el tablero que ha generado el método.
     * 
     * Ejemplo: para una entrada espacio = new char[8][8], cant = 4, una
     * posible salida sería:
     *       0  1  2  3  4  5  6  7
     *    A  -  -  -  -  -  -  -  -
     *    B  -  -  X  -  -  -  -  -
     *    C  -  X  X  X  -  X  -  -
     *    D  -  -  -  -  -  X  -  -
     *    E  -  -  -  -  -  X  -  -
     *    F  -  -  -  -  -  X  X  X
     *    G  -  -  -  -  -  -  -  -
     *    H  -  X  -  -  -  -  -  -
     */
    public static void ejercicio26() {
        System.out.println("Ejercicio 26");
    }

    public static void main(String[] args) {
        // Descomenta el ejercicio que quieras probar:
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
        // ejercicio17();
        // ejercicio18();
        // ejercicio19();
        // ejercicio20();
        // ejercicio21();
        // ejercicio22();
        // ejercicio23();
        // ejercicio24();
        // ejercicio25();
        // ejercicio26();
    }
}