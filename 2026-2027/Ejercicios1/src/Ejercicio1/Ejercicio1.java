import java.util.Scanner;

public class Ejercicio1 {
    static Scanner scanner = new Scanner(System.in);

    /* 1.-Escribe un programa que muestre tu nombre por pantalla. */
    public static void ejercicio1() {
        System.out.println("Ejercicio 1");
        System.out.print("Por favor, introduce tu nombre: ");
        String input = scanner.nextLine();
        System.out.println("Hola, " + input + "!");
        scanner.close();
    }

    /*
     * 2.- Modifica el programa anterior para que además se muestre tu edad y tu
     * correo electrónico. Asegúrate de que los datos se muestran en líneas
     * separadas.
     */
    public static void ejercicio2() {
        System.out.println("Ejercicio 2");
        System.out.print("Por favor, introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Por favor, introduce tu edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Por favor, introduce tu correo electrónico: ");
        String correo = scanner.nextLine();

        System.out.println("Hola, " + nombre + "!");
        System.out.println("Edad: " + edad);
        System.out.println("Correo electrónico: " + correo);
    }

    /*
     * 3.- Escribe un programa que muestre por pantalla 10 palabras en inglés junto
     * a su correspondiente
     * traducción al castellano. Las palabras deben estar distribuidas en dos
     * columnas y alineadas a
     * la izquierda. Pista: Se puede insertar un tabulador mediante \t.
     */
    public static void ejercicio3() {
        String tab = "\t";

        System.out.println("Español " + tab + "Inglés");
        System.out.println("--------" + tab + "------");
        System.out.println("Nombre " + tab + tab + "Name");
        System.out.println("Perro " + tab + tab + "Dog");
        System.out.println("Gato " + tab + tab + "Cat");
        System.out.println("Vaca " + tab + tab + "Cow");
        System.out.println("Toro " + tab + tab + "Bull");
        System.out.println("Gallina " + tab + "Hen");
        System.out.println("Mesa " + tab + tab + "Table");
        System.out.println("Ordenador " + tab + "Computer");
        System.out.println("Coche " + tab + tab + "Car");
        System.out.println("Papel " + tab + tab + "Paper");
    }

    /*
     * 4.- Escribe un programa que muestre tu horario de clase. Puedes usar espacios
     * o tabuladores para
     * alinear el texto.
     */
    public static void ejercicio4() {
        String tab = "\t";

        System.out.println("Hora " + tab + tab + "Lunes" + tab + tab + "Martes" + tab + tab
                + "Miércoles" + tab + "Jueves" + tab + tab + "Viernes");
        System.out.println(
                "------------------------------------------------------------------------------------------------");
        System.out.println("16:00 - 16:55" + tab + "BB.DD." + tab + tab + "Sis.Inf" + tab + tab
                + "Ent.Des" + tab + tab + "PROG" + tab + tab + "PROG");
        System.out.println("16:55 - 17:50" + tab + "BB.DD." + tab + tab + "Sis.Inf" + tab + tab
                + "Ent.Des" + tab + tab + "PROG" + tab + tab + "PROG");
        System.out.println("17:50 - 18:45" + tab + "FOL" + tab + tab + "PROG" + tab + tab + "PROG" + tab
                + tab + "BB.DD." + tab + tab + "FOL");

        System.out.println("18:45 - 19:00" + tab + tab + "R" + tab + "E" + tab + "C" + tab + "R" + tab
                + "E" + tab + "O");

        System.out.println("19:00 - 19:55" + tab + "FOL" + tab + tab + "PROG" + tab + tab + "Leng.Marc"
                + tab + "BB.DD." + tab + tab + "Ent.Des");
        System.out.println("19:55 - 20:50" + tab + "Leng.Marc" + tab + "BB.DD." + tab + tab
                + "Leng.Marc" + tab + "Inglés" + tab + tab + "Sis.Inf");
        System.out.println("20:50 - 21:45" + tab + "Leng.Marc" + tab + "BB.DD." + tab + tab + "Sis.Inf"
                + tab + tab + "FOL" + tab + tab + "Sis.Inf");
    }

    /*
     * 5.- Escribe un programa que pinte por pantalla una pirámide rellena a base de
     * asteriscos. La base
     * de la pirámide debe estar formada por 9 asteriscos.
     */
    public static void ejercicio5() {
        System.out.println("    *    ");
        System.out.println("   ***   ");
        System.out.println("  *****  ");
        System.out.println(" ******* ");
        System.out.println("*********");
    }

    /*
     * 6.- Igual que el programa anterior, pero esta vez la pirámide estará hueca
     * (se debe ver únicamente
     * el contorno hecho con asteriscos).
     */
    public static void ejercicio6() {
        System.out.println("    *    ");
        System.out.println("   * *   ");
        System.out.println("  *   *  ");
        System.out.println(" *     * ");
        System.out.println("*********");
    }

    /*
     * 7.- Igual que el programa anterior, pero esta vez la pirámide debe aparecer
     * invertida, con el
     * vértice hacia abajo.
     */
    public static void ejercicio7() {
        System.out.println("*********");
        System.out.println(" ******* ");
        System.out.println("  *****  ");
        System.out.println("   ***   ");
        System.out.println("    *    ");
    }

    public static void main(String[] args) throws Exception {
        // ejercicio1();
        System.out.println("============");
        // ejercicio2();
        System.out.println("============");
        ejercicio3();
        System.out.println("============");
        ejercicio4();
        System.out.println("============");
        ejercicio5();
        System.out.println("============");
        ejercicio6();
        System.out.println("============");
        ejercicio7();
    }
}