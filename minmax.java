import java.util.Scanner;

public class minmax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read two integers
        int a = sc.nextInt();
        int b = sc.nextInt();

        int max, min;

        // Using if-else to find max and min
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }

        // Print result
        System.out.println("Max=" + max + " Min=" + min);

        sc.close();
    }
}
