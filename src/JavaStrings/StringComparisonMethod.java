// To compare two strings, you can use the equals() method.

package JavaStrings;

public class StringComparisonMethod {
    public static void main(String[] args) {

        String compare_one = "Marvel Avengers";
        String compare_two = "Marvel Avengers";
        String compare_three = "Captain Marvel";
        String compare_four = "Captain America";

        System.out.println("String comparison result for compare_one && compare_two: "+compare_one.equals(compare_two));
        System.out.println("String comparison result for compare_three && compare_four: "+compare_three.equals(compare_four));
    }
}