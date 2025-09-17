import java.util.Scanner;

public class freq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();

        int[] freq = new int[10]; // Array to store frequency of digits 0–9

        // Count frequency
        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            if (Character.isDigit(ch)) {
                freq[ch - '0']++;
            }
        }

        // Print only digits that appear
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + "→" + freq[i]);
            }
        }
    }
}
