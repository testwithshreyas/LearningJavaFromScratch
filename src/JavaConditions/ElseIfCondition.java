// If it rains, bring an umbrella. Else if it's sunny, wear sunglasses. Else, just go outside normally.

package JavaConditions;

public class ElseIfCondition {
    public static void main(String[] args) {

        int weather = 2; // 1 = raining, 2 = sunny, 3 = cloudy

        if(weather == 1){
            System.out.println("Bring an umbrella.");
        }
        else if(weather == 2){
            System.out.println("Wear sunglasses.");
        }
        else {
            System.out.println("Just go outside normally.");
        }
    }
}