// Input a 5-digit number, extract the middle digit, and print whether it’s even or odd.

package PracticePrograms.ConditionalStatements;

import java.util.Scanner;

public class CheckMiddleValueEvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 digits number:");
        int num = sc.nextInt();
        int middle = (num / 100) % 10;
        if (middle % 2 == 0) {
            System.out.println("Entered number " + middle + " is even!");
        } else {
            System.out.println("Entered number " + middle + " is odd!");
        }
        sc.close();
    }
}