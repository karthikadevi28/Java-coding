import java.util.Scanner;

public class even{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers from input
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        // Loop through the range and print even numbers
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
