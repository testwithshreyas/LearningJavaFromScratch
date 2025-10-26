package JavaUserInput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee name:");
        // String Input
        String name = sc.nextLine();
        // Numerical Input
        System.out.println("Enter Employee age:");
        int age = sc.nextInt();
        System.out.println("Enter Employee salary:");
        double salary = sc.nextDouble();

        //Output
        System.out.println("Employee name is: "+name);
        System.out.println("Employee age is: "+age);
        System.out.println("Employee salary is: "+salary);
    }
}