import java.util.Scanner;

public class harshadnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        int number = scanner.nextInt();

        int originalNumber = number;
        number = Math.abs(number); // Ignore sign

        int sum = 0;
        int temp = number;

        // Calculate sum of digits
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        // Check divisibility
        if (sum != 0 && originalNumber % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not Harshad Number");
        }
    }
}
