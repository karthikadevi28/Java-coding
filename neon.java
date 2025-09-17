import java.util.Scanner;

public class neon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int square = n * n;
        
        int sum = 0;
        
        // Calculate sum of digits of the square
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        
        if (sum == n) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not Neon Number");
        }
    }
}
