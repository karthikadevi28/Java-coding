import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();  // Number of ages

        int babyCount = 0;
        int schoolCount = 0;
        int adultCount = 0;

        for (int i = 0; i < n; i++) {
            int age = scanner.nextInt();

            if (age <= 5) {
                babyCount++;
            } else if (age <= 20) {
                schoolCount++;
            } else {
                adultCount++;
            }
        }

        System.out.println("Baby: " + babyCount);
        System.out.println("Attending school: " + schoolCount);
        System.out.println("Adult: " + adultCount);
    }
}
