package JavaDataTypes;

/*
The char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c'.
 */

public class Characters {
    public static void main(String[] args) {

        char myGrade = 'A';
        System.out.println("My exam grade: " + myGrade);

        // Alternatively, if you are familiar with ASCII values, you can use those to display certain characters.
        char firstChar = 74, secondChar = 65, thirdChar = 86, fourthChar = 65;
        System.out.print(firstChar);
        System.out.print(secondChar);
        System.out.print(thirdChar);
        System.out.print(fourthChar);
    }
}