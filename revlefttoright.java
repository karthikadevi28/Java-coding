import java.util.Scanner;

public class revlefttoright {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number as a string to preserve leading zeros (if needed)
        String number = scanner.next();

        // Loop through each character and print it
        for (int i = 0; i < number.length(); i++) {
            System.out.print(number.charAt(i) + " ");
        }
    }
}
