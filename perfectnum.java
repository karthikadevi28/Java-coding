import java.util.Scanner;

public class perfectnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input number
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Not Perfect Number");
            return;
        }

        int sum = 0;

        // Loop through all numbers from 1 to number/2
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i; // Add divisor
            }
        }

        // Check if sum of divisors equals the number
        if (sum == number) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not Perfect Number");
        }
    }
}
