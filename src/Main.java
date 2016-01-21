import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Binary to decimal converter!\n");
        System.out.println("Enter your binary number:");
        Scanner scanner = new Scanner(System.in);

        String buffer = scanner.nextLine();
        System.out.println("You have entered: " + buffer +" as your input.");
    }
}
