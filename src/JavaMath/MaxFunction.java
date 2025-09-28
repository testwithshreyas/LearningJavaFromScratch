// The Math.max(x,y) method can be used to find the highest value.

package JavaMath;

public class MaxFunction {
    public static void main(String[] args) {

        int x = 25;
        int y = 20;
        int z = 15;
        int max_two = Math.max(x, y);   // Finding Maximum of two numbers
        int max_three = Math.max(x, Math.max(y, z));  // Finding maximum of three numbers

        System.out.println("-----------Finding Maximum between two numbers-----------");
        System.out.println("Numbers: " + x + " ," + y);
        System.out.println("Maximum value of current variables: " + max_two);

        System.out.println("-----------Finding Maximum between three numbers-----------");
        System.out.println("Numbers: " + x + " ," + y + " ," + z);
        System.out.println("Maximum value of current variables: " + max_three);
    }
}