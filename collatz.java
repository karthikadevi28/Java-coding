import java.util.Scanner;

public class collatz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        // Print sequence until it reaches 1
        while (n != 1) {
            System.out.print(n + ", ");
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }

        // Print the last number 1
        System.out.println(1);
    }
}
