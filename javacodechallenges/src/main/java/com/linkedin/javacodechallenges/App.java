package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static double calculateWaterBill(double gallonsUsage) {
        // Minimum charge of $18.84 for 1,496 gallons of water (two CCFs)
        // Additional CCF is $3.90 each.
        if (gallonsUsage <= 1496) {
            return 18.84;
        }
        else {
            return 18.84 + 3.90 * Math.ceil((gallonsUsage - 1496) / 748);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water did you " +
                "use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
        scanner.close();
    }
}
