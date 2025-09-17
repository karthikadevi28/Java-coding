import java.util.Scanner;

public class sumdig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer
        int number = scanner.nextInt();

        // Take absolute value to handle negative numbers
        number = Math.abs(number);

        int sum = 0;

        // Extract digits and add them
        while (number > 0) {
            sum += number % 10; // Get last digit
            number /= 10;       // Remove last digit
        }

        // Output the result
        System.out.println(sum);
    }
}
