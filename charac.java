import java.util.Scanner;

public class charac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read a single character
        char ch = sc.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("digit");
        } else {
            System.out.println("special");
        }

        sc.close();
    }
}
