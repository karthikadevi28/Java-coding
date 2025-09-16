import java.util.Scanner;

public class center {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numStr = scanner.next();

        int length = numStr.length();

        if (length % 2 == 1) { // Odd length
            int centerIndex = length / 2;
            System.out.println(numStr.charAt(centerIndex));
        } else {
            System.out.println(-1);
        }
    }
}
