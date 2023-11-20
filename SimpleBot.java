import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "Aid";
        String date = "2023";
        System.out.println("Hello! My name is " + name);
        System.out.println("I was created in " + date);
        System.out.println("Please, remind me your name.");

        String userName = scanner.nextLine();

        System.out.println("What a great name you have, " + userName + "!");
        // more to come! Yay!
    }
}
