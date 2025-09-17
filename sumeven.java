import java.util.Scanner;

public class sumeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input number
        int n = scanner.nextInt();
        int sum = 0;

        // Loop from 1 to n and add even numbers
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        // Print the result
        System.out.println(sum);

        scanner.close();
    }
}
