import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input number
        int n = scanner.nextInt();

        if (n < 0) {
            // Handle negative number
            System.out.println("Error! Factorial of a negative number doesn't exist.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println(factorial);
        }

        scanner.close();
    }
}
