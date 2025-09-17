import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numStr = scanner.next();

        if (numStr.length() <= 1) {
            // No change for single-digit numbers
            System.out.println(numStr);
        } else {
            // Swap first and last characters
            char[] chars = numStr.toCharArray();
            char temp = chars[0];
            chars[0] = chars[chars.length - 1];
            chars[chars.length - 1] = temp;

            System.out.println(new String(chars));
        }
    }
}
