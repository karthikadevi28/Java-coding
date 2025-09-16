import java.util.Scanner;

public class div {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        int num = sc.nextInt();

        // Checking divisibility
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
