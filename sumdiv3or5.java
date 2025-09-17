import java.util.Scanner;

public class sumdiv3or5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two integers
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        int sum = 0;

        // Loop through the range from start to end (inclusive)
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        // Print the result
        System.out.println(sum);
    }
}
