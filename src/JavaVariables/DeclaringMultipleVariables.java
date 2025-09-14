package JavaVariables;

public class DeclaringMultipleVariables {
    public static void main(String[] args) {

        // To declare more than one variable of the same type, you can use a comma-separated list.
        int a = 10, b = 20, c = 25;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);

        // You can also assign the same value to multiple variables in one line.
        int x, y, z;
        x = y = z = 100;
        System.out.println("x :"+ x);
        System.out.println("y :"+ y);
        System.out.println("z :"+ z);
    }
}