import java.util.Scanner;

public class App {

    // scanner
    public static void ejercicio1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String input = sc.nextLine();
        System.out.println("Hola, " + input + "!");
        sc.close();
    }

   

    public static void main(String[] args) {
        ejercicio1();
    }
}
