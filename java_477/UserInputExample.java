import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Prompt the user and read a String input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user and read an integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Prompt the user and read a double input
        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();

        // Display the input
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your height is " + height + " meters.");

        // Close the scanner
        scanner.close();
    }
}
