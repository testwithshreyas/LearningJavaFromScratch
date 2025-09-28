// The Math.min(x,y) method can be used to find the lowest value.


package JavaMath;

public class MinFunction {
    public static void main(String[] args) {
        int x = 25;
        int y = 20;
        int z = 15;
        int max_two = Math.min(x, y);   // Finding Minimum of two numbers
        int max_three = Math.min(x, Math.min(y, z));  // Finding minimum of three numbers

        System.out.println("-----------Finding Minimum between two numbers-----------");
        System.out.println("Numbers: " + x + " ," + y);
        System.out.println("Minimum value of current variables: " + max_two);

        System.out.println("-----------Finding Minimum between three numbers-----------");
        System.out.println("Numbers: " + x + " ," + y + " ," + z);
        System.out.println("Minimum value of current variables: " + max_three);
    }
}