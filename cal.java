import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input as two numbers in a single line
        double start = sc.nextDouble();
        double end = sc.nextDouble();

        // Calculate distance
        double distance = end - start;

        // Remuneration calculation
        double remuneration = distance * 25;

        // Print with 2 decimal places
        System.out.printf("%.2f %.2f", distance, remuneration);

        sc.close();
    }
}
