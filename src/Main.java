import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Binary to decimal converter!\n");
        System.out.println("Enter your binary number:");
        Scanner scanner = new Scanner(System.in);

        String buffer = scanner.nextLine();
        System.out.println("Binary: " + buffer + " represents the decimal: " + Binary2Decimal(buffer));
    }

    public static int Binary2Decimal(String binary){
        int result  = 0; // Temporarily  holds result
        for(int i = 0; i < binary.length(); i++)
        {
            int digit = Character.getNumericValue(binary.charAt(i));
            int position  = binary.length() - i - 1;
            result += digit * Math.pow(2,  position);
        }
        return result;
    }
}
