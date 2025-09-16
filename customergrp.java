import java.util.Scanner;

public class customergrp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input age
        int age = sc.nextInt();
        // Input gender code (1 = Male, 2 = Female)
        int gender = sc.nextInt();

        if (gender == 1) { // Male
            if (age < 25) {
                System.out.println("Group 1");
            } else if (age >= 25 && age <= 45) {
                System.out.println("Group 3");
            } else {
                System.out.println("Group 5");
            }
        } else if (gender == 2) { // Female
            if (age < 25) {
                System.out.println("Group 2");
            } else if (age >= 25 && age <= 45) {
                System.out.println("Group 4");
            } else {
                System.out.println("Group 5");
            }
        } else {
            // Invalid gender code
            System.out.println("Invalid");
        }

        sc.close();
    }
}
