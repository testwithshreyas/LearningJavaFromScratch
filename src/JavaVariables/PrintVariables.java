package JavaVariables;

/* The println() method is often used to display variables.
To combine both text and a variable, use the + character */

public class PrintVariables {
    public static void main(String[] args) {

        String FirstName = "Tony";
        String LastName = "Stark";
        String FullName = FirstName + LastName;

        System.out.println("Full Name: "+FullName);

    }
}