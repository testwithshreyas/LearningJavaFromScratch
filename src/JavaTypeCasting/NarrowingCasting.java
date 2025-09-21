package JavaTypeCasting;

public class NarrowingCasting {
    public static void main(String[] args) {

        double pieValue = 3.14159265359;
        int myValue = (int) pieValue;     // Manual casting: double to int

        System.out.println("Pie Value: "+pieValue);
        System.out.println("Integer Value: "+myValue);
    }
}