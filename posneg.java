import java.util.Scanner;

public class posneg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        int num = sc.nextInt();

        // Checking conditions
        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        sc.close();
    }
}
