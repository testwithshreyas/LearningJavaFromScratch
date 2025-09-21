package JavaOperators;

public class ArithmeticOperator {
    public static void main(String[] args) {

        int x = 50;
        int y = 2;

        int addition = x + y;
        int substraction = x - y;
        int multiplication = x * y;
        int division = x / y;
        int modulus = x % y;
        int increment = ++x;
        int decrement = --y;

        System.out.println("Addition of " + x + " and " + y + " : " + addition);
        System.out.println("Substraction of " + x + " and " + y + " : " + substraction);
        System.out.println("Multiplication of " + x + " and " + y + " : " + multiplication);
        System.out.println("Division of " + x + " and " + y + " : " + division);
        System.out.println("Modulus of " + x + " and " + y + " : " + modulus);
        System.out.println("Increment of " + x + " : " + increment);
        System.out.println("Decrement of " + y + " : " + decrement);
    }
}