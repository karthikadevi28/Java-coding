import java.util.Scanner;

public class strong {
    
    // Function to calculate factorial of a digit
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        if (sum == number) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }
    }
}
