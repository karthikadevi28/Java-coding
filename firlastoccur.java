import java.util.Scanner;

public class firlastoccur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number as string to preserve digit order
        String number = scanner.next();
        char digit = scanner.next().charAt(0); // Digit to find

        int first = -1;
        int last = -1;

        // Loop through the string
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                if (first == -1) {
                    first = i + 1; // 1-based position
                }
                last = i + 1;
            }
        }

        if (first == -1) {
            System.out.println("Digit not found");
        } else {
            System.out.println("First=" + first + ", Last=" + last);
        }
    }
}
