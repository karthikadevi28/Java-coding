import java.util.Scanner;

public class countdig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        long number = scanner.nextLong();

        // Take the absolute value to ignore the negative sign
        number = Math.abs(number);

        // Special case: 0 has 1 digit
        if (number == 0) {
            System.out.println(1);
        } else {
            int count = 0;
            while (number > 0) {
                number /= 10;
                count++;
            }
            System.out.println(count);
        }
    }
}
