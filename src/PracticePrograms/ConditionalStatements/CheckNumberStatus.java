// Take a number from the user and check if it is positive, negative, or zero.

package PracticePrograms.ConditionalStatements;

import java.util.Scanner;

public class CheckNumberStatus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to check: ");
        int number = sc.nextInt();

        //Used ternary operator
        String result = (number > 0) ? "Positive"
                : (number < 0) ? "Negative"
                : "Zero";

        System.out.println("Entered number is: "+result+"!");
        sc.close();
    }
}