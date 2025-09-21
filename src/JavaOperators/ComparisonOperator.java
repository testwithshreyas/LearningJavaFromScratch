// Write a Java program that evaluates whether a student passes or fails in an exam based on marks and grading rules.

package JavaOperators;

public class ComparisonOperator {
    public static void main(String[] args) {

        int marks = 75;
        int passingMarks = 35;

        System.out.println("Student Marks: " + marks);

        // == operator
        System.out.println("Borderline pass? " + (marks == passingMarks));

        // != operator
        System.out.println("Got full marks? " + (marks != 100));

        // > operator
        System.out.println("Excellent Performance (>90)? " + (marks > 90));

        // < operator
        System.out.println("Failed (<35)? " + (marks < 35));

        // >= operator
        System.out.println("Pass? " + (marks >= 35));

        // <= operator
        System.out.println("Marks Valid (<=100)? " + (marks <= 100));
    }
}