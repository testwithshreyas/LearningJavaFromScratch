// Write a Java program to calculate the final salary of an employee using different assignment operators.

package JavaOperators;

public class AssignmentOperator {
    public static void main(String[] args) {

        int salary = 40000; // Base Salary
        System.out.println("Base Salary: " + salary);

        salary += 5000; // Bonus
        System.out.println("After Bonus: " + salary);

        salary -= 3000; // Tax
        System.out.println("After Tax: " + salary);

        salary *= 2; // Multiplier
        System.out.println("After Multiplier: " + salary);

        salary /= 4; // Installments
        System.out.println("Per Installments: " + salary);

        salary %= 2;  // odd rupee remainder
        System.out.println("Remaining Odd Rupee: " + salary);

    }
}