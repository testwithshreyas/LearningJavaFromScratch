// Input temperature in Celsius and print messages like “Cold”, “Warm”, or “Hot” based on ranges.

package PracticePrograms.ConditionalStatements;

import java.util.Scanner;

public class CheckTemperature {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature: ");
        double temp = sc.nextDouble();

        // Defined temp between, 0 to 10 as cold
        if (temp <= 10) {
            System.out.println("Weather is Cold Today");
        }
        // Defined temp between, 11 to 20 as mild
        else if (temp > 10 && temp <= 20) {
            System.out.println("Weather is Mild Today");
        }
        // Defined temp between, 20 to 30 as warm
        else if (temp > 20 && temp <= 30) {
            System.out.println("Weather is Warm Today");
        } else {
            System.out.println("Weather is Hot Today");
        }
        sc.close();
    }
}