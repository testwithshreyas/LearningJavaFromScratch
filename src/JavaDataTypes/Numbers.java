package JavaDataTypes;

/* Primitive number types are divided into two groups:
Integer types stores whole numbers, positive or negative (such as 123 or -456), without decimals. Valid types are byte, short, int and long.
Floating point types represents numbers with a fractional part, containing one or more decimals. There are two types: float and double. */

public class Numbers {
    public static void main(String[] args) {

        //The byte data type can store whole numbers from -128 to 127.
        byte a = 127;
        System.out.println("Byte value: " + a);

        // The short data type can store whole numbers from -32768 to 32767.
        short b = 32767;
        System.out.println("Shor value: " + b);

        // The int data type can store whole numbers from -2147483648 to 2147483647.
        int c = 999999999;
        System.out.println("Integer value: " + c);

        /* The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807. This is used when int is not large enough to store the value.
         Note that you should end the value with an "L". */
        long d = 9667777777L;
        System.out.println("Long value: " + d);

        /* Floating type numeric data types, the precision of float is up to 6-7 decimal digits.
           Note that you should end the value with an "f" for floats */
        float e = 3.14f;
        System.out.println("Float value: " + e);

        /* Double variables have a precision of about 16 digits.
           Note that you should end the value with an "d" for doubles but its optional */
        double pie = 3.14159265359d;
        System.out.println("Pie value: " + pie);
    }
}