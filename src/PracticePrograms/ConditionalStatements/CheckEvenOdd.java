// Input a number and check whether it is even or odd.

package PracticePrograms.ConditionalStatements;

import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Entered number is Even!");
        } else {
            System.out.println("Entered number is Odd!");
        }
        sc.close();
    }
}