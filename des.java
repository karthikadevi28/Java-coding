import java.util.Arrays;
import java.util.Scanner;

public class des {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read 4 integers
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort in ascending
        Arrays.sort(arr);

        // Print in descending order
        for (int i = 3; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
