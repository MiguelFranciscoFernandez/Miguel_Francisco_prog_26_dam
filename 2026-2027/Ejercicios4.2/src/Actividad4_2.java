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
     * Random
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
            int tempMinima = (int) (Math.random() * 21) - 10;
            int tempMaxima = tempMinima + (int) (Math.random() * 31);
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
     * 8)Diseña el algoritmo para un programa que:
     * Random
     * 1. Cree una tabla bidimensional (matriz) de 5x5 llamada `matriz`.
     * 2. Cargue la tabla con valores numéricos enteros.
     * 3. **Sume todos los elementos de cada fila y todos los elementos de cada
     * columna**, visualizando los resultados en pantalla.
     */

    public static int sumaFila(int[][] matriz, int fila) {
        int suma = 0;
        for (int j = 0; j < matriz[fila].length; j++) {
            suma += matriz[fila][j];
        }
        return suma;
    }

    public static int sumaColumna(int[][] matriz, int columna) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][columna];
        }
        return suma;
    }

    public static void ejercicio8() {
        System.out.println("Ejercicio 8");
        int[][] matriz = new int[5][5];

        // Cargar la matriz con valores aleatorios entre 0 y 9
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rand.nextInt(10);
            }
        }
        // Mostrar la matriz
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        // Mostrar las sumas de las filas
        System.out.println("Sumas de las filas:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Fila " + i + ": " + sumaFila(matriz, i));
        }
        // Mostrar las sumas de las columnas
        System.out.println("Sumas de las columnas:");
        for (int j = 0; j < matriz[0].length; j++) {
            System.out.println("Columna " + j + ": " + sumaColumna(matriz, j));
        }
    }

    /*
     * 9) Diseña el algoritmo para un programa que:
     * Random
     * 1. Cree una tabla bidimensional de 5x5 llamada `diagonal`.
     * 2. Cargue la tabla de forma que los componentes de la **diagonal principal**
     * tomen
     * el valor `1` y el resto el valor `0`.
     * 3. Muestre el contenido de la tabla en pantalla.
     */

    public static void ejercicio9() {
        System.out.println("Ejercicio 9");
        int[][] diagonal = new int[5][5];

        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                if (i == j) {
                    diagonal[i][j] = 1;
                } else {
                    diagonal[i][j] = 0;
                }
            }
        }
        // Mostrar el contenido de la tabla
        System.out.println("Matriz diagonal:");
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                System.out.print(diagonal[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*
     * 10)Diseña el algoritmo para un programa que:
     * 
     * 1. Cree una tabla bidimensional de 5x15 llamada `marco`.
     * 2. Cargue la tabla con ceros y unos para que se dibuje un **marco**. El valor
     * `1`
     * debe ocupar las posiciones más externas, y el resto de los elementos (`0`)
     * deben
     * quedar en el interior.
     * 3. Visualice el contenido de la matriz en pantalla, que debería tener este
     * aspecto:
     * 
     * ```
     * 111111111111111
     * 100000000000001
     * 100000000000001
     * 100000000000001
     * 111111111111111
     * ```
     */

    public static void ejercicio10() {
        System.out.println("Ejercicio 10");
        int[][] marco = new int[5][15];

        for (int i = 0; i < marco.length; i++) {
            for (int j = 0; j < marco[i].length; j++) {
                if (i == 0 || i == marco.length - 1 || j == 0 || j == marco[i].length - 1) {
                    marco[i][j] = 1;
                } else {
                    marco[i][j] = 0;
                }
            }
        }

        // Mostrar el contenido de la tabla
        System.out.println("Matriz marco:");
        for (int i = 0; i < marco.length; i++) {
            for (int j = 0; j < marco[i].length; j++) {
                System.out.print(marco[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*
     * 11)Crea un programa que genere un arreglo (vector) de tamaño N con **números
     * aleatorios que no se repitan entre sí**. El rango de los números y el tamaño
     * N los puedes definir tú.
     * Random
     * Pista: Cuando generes un número, tendrás que comprobar si ya existe en el
     * array
     * antes de añadirlo.*
     */
    public static void ejercicio11() {
        System.out.println("Ejercicio 11");
        int n = 10;
        int[] numeros = new int[n];
        int contador = 0;

        while (contador < n) {
            int numero = rand.nextInt(100);
            boolean repetido = false;

            for (int i = 0; i < contador; i++) {
                if (numeros[i] == numero) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                numeros[contador] = numero;
                contador++;
            }
        }

        System.out.print("Numeros sin repetir: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }

    /*
     * 12)
     * De una empresa de transporte se quiere guardar el nombre de los conductores
     * que tiene, y los kilómetros que conducen cada día de la semana. Random
     */

    public static int sumaKilometros(int[][] kilometros, int conductor) {
        int suma = 0;
        for (int j = 0; j < kilometros[conductor].length; j++) {
            suma += kilometros[conductor][j];
        }
        return suma;
    }

    public static void ejercicio12() {
        System.out.println("Ejercicio 12");
        String[] conductores = { "Juan", "María", "Pedro", "Ana", "Luis" };
        int[][] kilometros = new int[conductores.length][7];
        int[] sumaKilometros = new int[conductores.length];

        // Generar kilómetros aleatorios para cada conductor y día
        for (int i = 0; i < kilometros.length; i++) {
            for (int j = 0; j < kilometros[i].length; j++) {
                kilometros[i][j] = rand.nextInt(100);
            }
        }

        // Mostrar los datos
        System.out.println("Kilómetros conducidos por cada conductor:");
        for (int i = 0; i < conductores.length; i++) {
            System.out.print(conductores[i] + ": ");
            for (int j = 0; j < kilometros[i].length; j++) {
                System.out.print(kilometros[i][j] + " ");
            }
            sumaKilometros[i] = sumaKilometros(kilometros, i);
            System.out.println(" | Total: " + sumaKilometros[i]);
            System.out.println();
        }
    }

    /*
     * 13)
     * Crea un programa que lea los precios de 5 artículos y las cantidades vendidas
     * por una empresa en sus 4 sucursales. El programa debe informar:
     * Las cantidades **totales de cada artículo** vendido (sumando todas las
     * sucursales).
     * La cantidad total de artículos vendidos en la **sucursal 2**.
     * La cantidad del **artículo 3** que se vendió en la **sucursal 1**.
     * La **recaudación total** de cada sucursal .
     * La **recaudación total** de la empresa (sumando todas las sucursales).
     * La sucursal de **mayor recaudación** 🏢.
     */

    public static void ejercicio13() {
        System.out.println("Ejercicio 13");

    }

    /*
     * 14)
     * Crear un programa de ordenador para gestionar los resultados de la **quiniela
     * de fútbol**. Para ello vamos a utilizar dos tablas (matrices) de 15 filas
     * (una
     * por partido):
     * `equipos`: Una tabla de cadenas de texto de 15x2 donde se guarda el nombre
     * del equipo local y el visitante de cada partido.
     * `resultados`: Una tabla de enteros de 15x2 donde se guardan los goles de cada
     * equipo. La primera columna corresponde al equipo local y la segunda al
     * visitante.
     * El programa irá pidiendo por teclado los nombres de los equipos de cada uno
     * de los
     * 15 partidos y el resultado (goles del equipo 1 y goles del equipo 2). A
     * continuación, se imprimirá la quiniela completa de esa jornada de forma clara
     * y
     * ordenada. 🥅
     */

    public static void ejercicio14() {
        System.out.println("Ejercicio 14");
        String[][] equipos = new String[15][2];
        int[][] resultados = new int[15][2];

        for (int i = 0; i < 15; i++) {
            System.out.print("Partido " + (i + 1) + " - Local: ");
            equipos[i][0] = sc.nextLine();

            System.out.print("Partido " + (i + 1) + " - Visitante: ");
            equipos[i][1] = sc.nextLine();

            resultados[i][0] = (int) (Math.random() * 6);
            resultados[i][1] = (int) (Math.random() * 6);
        }

        // 2. Mostrar la quiniela completa
        System.out.println("Resultados de la quiniela:");
        for (int i = 0; i < 15; i++) {
            System.out.println((i + 1) + ". " + equipos[i][0] + " " + resultados[i][0] + " - " + resultados[i][1] + " "
                    + equipos[i][1]);
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
        // ejercicio9();
        // ejercicio10();
        // ejercicio11();
        // ejercicio12();
        // ejercicio13();
        // ejercicio14();

        sc.close();

    }
}
