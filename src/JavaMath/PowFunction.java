// The Math.pow(x, y) method returns the value of x raised to the power of y.

package JavaMath;

public class PowFunction {
    public static void main(String[] args) {

        int x = 2;
        int y = 10;
        // Note: The Math.pow() method always returns a double, even if the result is a whole number.
        // For example, Math.pow(2, 10) returns 1024.0 (not 1024).
        double raised_value = Math.pow(x, y);

        System.out.println("Raised value for " + x + " and " + y + " : " + raised_value);
    }
}