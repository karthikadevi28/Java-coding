import java.util.Scanner;

public class perfectsqr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Not Perfect Square");
            return;
        }

        int sqrt = (int) Math.sqrt(number);

        if (sqrt * sqrt == number) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not Perfect Square");
        }
    }
}
