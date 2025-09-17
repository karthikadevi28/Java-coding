import java.util.Scanner;

public class max3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read three integers
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max;

        // Using if-else to find maximum
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

        // Print the maximum number
        System.out.println(max);

        sc.close();
    }
}
