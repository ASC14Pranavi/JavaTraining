package Assignment1;
import java.util.Scanner;

public class Message {
    public static String Display(String name) {
        return "Hello " + name + ", Welcome to Java World!";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        String welcomeMessage = Display(name);
        System.out.println(welcomeMessage);
        scanner.close();
    }
}
