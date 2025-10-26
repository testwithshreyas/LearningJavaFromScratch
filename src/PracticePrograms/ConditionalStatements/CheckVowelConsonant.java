// Take a character input and check if it’s a vowel or consonant.

package PracticePrograms.ConditionalStatements;

import java.util.Scanner;

public class CheckVowelConsonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the letter to check: ");
        char ch = sc.next().toLowerCase().charAt(0);

        if (!Character.isLetter(ch)) {
            System.out.println("Invalid input! Please enter an alphabet letter.");
        } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Entered character is Vowel!");
        } else {
            System.out.println("Entered character is Consonant!");
        }
        sc.close();
    }
}