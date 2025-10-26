/*
Take marks as input and print grade according to the following rules:
≥90 → A
80–89 → B
70–79 → C
60–69 → D
<60 → Fail
*/

package PracticePrograms.ConditionalStatements;

import java.util.Scanner;

public class CheckStudentGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks: ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Please enter valid marks between 0 and 100!");
        } else if (marks >= 90) {
            System.out.println("Congrats! You received grade A!!");
        } else if (marks >= 80) {
            System.out.println("Congrats! You received grade B!");
        } else if (marks >= 70) {
            System.out.println("Congrats! You received grade C!");
        } else if (marks >= 60) {
            System.out.println("Congrats! You received grade D!");
        } else {
            System.out.println("Sorry! You failed.");
        }
        sc.close();
    }
}