// The Math.pow(x, y) method returns the value of x raised to the power of y.

package JavaMath;

public class PowFunction {
    public static void main(String[] args) {

        int x = 2;
        int y = 10;
        double raised_value = Math.pow(x, y);

        System.out.println("Raised value for " + x + " and " + y + " : " + raised_value);
    }
}