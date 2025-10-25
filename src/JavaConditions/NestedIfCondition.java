// Checking if a person is old enough to vote, and if they are a citizen

package JavaConditions;

public class NestedIfCondition {
    public static void main(String[] args) {

        var age = 21;
        var IsCitizen = true;

        if(age > 18){
            System.out.println("Old enough to vote.");
            if(IsCitizen){
                System.out.println("And you are a citizen, so you can vote!");
            }
            else {
                System.out.println("But you must be a citizen to vote.");
            }
        }
        else {
            System.out.println("Not old enough to vote.");
        }
    }
}