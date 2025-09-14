package JavaVariables;

/* Definition: Variables are containers for storing data values.
The general rules for naming variables are:
Names can contain letters, digits, underscores, and dollar signs.
Names must begin with a letter.
Names should start with a lowercase letter, and cannot contain whitespace.
Names can also begin with $ and _
Names are case-sensitive ("myVar" and "myvar" are different variables).
Reserved words (like Java keywords, such as int or boolean) cannot be used as names. */

public class InitializingVariables {
    public static void main(String[] args) {

        // Syntax: type variableName = value;
        String name = "Tony Stark";
        int age = 60;
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}