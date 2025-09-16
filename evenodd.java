import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input number
        int n = scanner.nextInt();
        int sumOdd = 0;
        int sumEven = 0;

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }

        // Print result: odd sum first, then even sum
        System.out.println(sumOdd + " " + sumEven);

        scanner.close();
    }
}
