package JavaDataTypes;

/*
Very often in programming, you will need a data type that can only have one of two values, like:
YES / NO
ON / OFF
TRUE / FALSE
For this, Java has a boolean data type, which can only take the values true or false.
Boolean values are mostly used for conditional testing.
*/

public class Booleans {
    public static void main(String[] args) {

        boolean isJavaFun = true;
        boolean isWeatherCloudy = false;

        System.out.println("Is java fun to learn: " + isJavaFun);
        System.out.println("Is weather cloudy today: " + isWeatherCloudy);

    }
}