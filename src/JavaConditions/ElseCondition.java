// If it rains, bring an umbrella. Otherwise (else), go outside without one.

package JavaConditions;

public class ElseCondition {
    public static void main(String[] args) {

        var IsRaining = false;

        if(IsRaining){
            System.out.println("Bring an umbrella!");
        }
        else{
            System.out.println("No rain today, no need for an umbrella!");
        }
    }
}