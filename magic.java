import java.util.Scanner;

public class magic{

    // Function to recursively find sum of digits until single digit
    public static int recursiveDigitSum(int n) {
        if (n < 10) {
            return n;
        }
        
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        
        return recursiveDigitSum(sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int result = recursiveDigitSum(number);

        if (result == 1) {
            System.out.println("Magic Number");
        } else {
            System.out.println("Not Magic Number");
        }
    }
}
