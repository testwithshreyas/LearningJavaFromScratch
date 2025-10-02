/* Java has several methods for rounding numbers:
Math.round(x) - rounds to the nearest integer
Math.ceil(x) - rounds up (returns the smallest integer greater than or equal to x)
Math.floor(x) - rounds down (returns the largest integer less than or equal to x)
*/

package JavaMath;

public class RoundingFunctions {
    public static void main(String[] args) {

        double x = 5.5;

        System.out.println("Rounding using Math.round: " + Math.round(x));
        System.out.println("Rounding using Math.ceil: " + Math.ceil(x));
        System.out.println("Rounding using Math.floor: " + Math.floor(x));

    }
}