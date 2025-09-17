import java.util.Scanner;

public class SBICreditCardEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        int primaryAge = sc.nextInt();
        int addonAge = sc.nextInt();
        int empType = sc.nextInt();
        int income = sc.nextInt();

        boolean eligible = true;

        // Check primary applicant age
        if (primaryAge < 21 || primaryAge > 60) {
            eligible = false;
        }

        // Check add-on card applicant age
        if (addonAge <= 18) {
            eligible = false;
        }

        // Check employment type
        if (empType < 1 || empType > 4) {
            eligible = false;
        }

        // Check income
        if (income > 300000) {
            eligible = false;
        }

        // Final decision
        if (eligible) {
            System.out.println("Yes. You are eligible for SBI credit cards");
        } else {
            System.out.println("No. You are not eligible for SBI credit cards");
        }

        sc.close();
    }
}
