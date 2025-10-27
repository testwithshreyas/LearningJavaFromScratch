// Input three numbers and print them in ascending order.

package PracticePrograms.ConditionalStatements;

import java.util.Scanner;

public class PrintAscendingOrder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first value: ");
        int first_num = sc.nextInt();
        System.out.println("Enter second value: ");
        int second_num = sc.nextInt();
        System.out.println("Enter third value: ");
        int third_num = sc.nextInt();

        int smallest, middle, largest;

        if (first_num <= second_num && first_num <= third_num) {
            smallest = first_num;
            if (second_num <= third_num) {
                middle = second_num;
                largest = third_num;
            } else {
                middle = third_num;
                largest = second_num;
            }
        } else if (second_num <= first_num && second_num <= third_num) {
            smallest = second_num;
            if (first_num <= third_num) {
                middle = first_num;
                largest = third_num;
            } else {
                middle = third_num;
                largest = first_num;
            }

        } else {
            smallest = third_num;
            if (first_num <= second_num) {
                middle = first_num;
                largest = second_num;
            } else {
                middle = second_num;
                largest = first_num;
            }
        }
        System.out.println("Numbers is Ascending order: " + smallest + " ," + middle + " ," + largest);
        sc.close();
    }
}