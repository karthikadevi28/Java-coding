import java.util.Scanner;

public class arms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int originalNumber = number;

        int digits = String.valueOf(number).length();  // Count of digits
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);  // Raise digit to power of total digits
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}
