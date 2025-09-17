import java.util.Scanner;

public class revrighttoleft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input number
        int n = scanner.nextInt();

        // Handle zero case directly
        if (n == 0) {
            System.out.println("0");
        } else {
            // Loop until the number becomes 0
            while (n > 0) {
                int digit = n % 10;       // Get the last digit
                System.out.print(digit + " ");
                n = n / 10;               // Remove the last digit
            }
        }

        scanner.close();
    }
}
