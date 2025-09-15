package JavaDataTypes;

/*
The var keyword was introduced in Java 10 (released in 2018).
The var keyword lets the compiler automatically detect the type of variable based on the value you assign to it.
This helps you write cleaner code and avoid repeating types, especially for long or complex types.
var only works when you assign a value at the same time (you can't declare var x; without assigning a value)
 */
public class VarKeyword {
    public static void main(String[] args) {

        var a = "Hello World";
        var x = 100;
        var y = 3.14f;
        var z = 3.14159265359;

        System.out.println("Data type of variable a: " + ((Object) a).getClass().getName());
        System.out.println("Data type of variable x: " + ((Object) x).getClass().getName());
        System.out.println("Data type of variable y: " + ((Object) y).getClass().getName());
        System.out.println("Data type of variable z: " + ((Object) z).getClass().getName());
    }
}