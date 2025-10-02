/*
Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive)
Note: Math.random() returns a double. To get an integer, you need to cast it with (int).
 */

package JavaMath;

public class RandomNumberGeneration {
    public static void main(String[] args) {

        // Generate a Random Integer Between 1 and 10
        int random_num = (int) (Math.random() * 10) + 1;
        // Math.random() * 10 → gives 0 to 9 after casting.
        // (Math.random() * 10) + 1 → gives 1 to 10 after casting.
        System.out.println("Random number between 1 and 10: " + random_num);

        // Random OTP Generator (4 Digits)
        int otp = (int) (Math.random() * 9000) + 1000;  // ensures 4 digits
        System.out.println("OTP Received: " + otp);
    }
}