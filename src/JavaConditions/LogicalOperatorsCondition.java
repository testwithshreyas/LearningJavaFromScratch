package JavaConditions;

public class LogicalOperatorsCondition {
    public static void main(String[] args) {

        var IsRaining = true;
        var HavingUmbrella = true;
        var IsSunny = true;

        // AND Operator
        if(!IsRaining && HavingUmbrella){
            System.out.println("You can go out safely.");
        }
        else {
            System.out.println("You cannot go out safely.");
        }

        //OR Operator
        if(IsSunny || HavingUmbrella){
            System.out.println("You can enjoy outdoor activities.");
        }
        else {
            System.out.println("Better stay indoors.");
        }

        //NOT Operator
        if(!IsRaining){
            System.out.println("It is NOT raining.");
        }
        else{
            System.out.println("It is raining.");
        }
    }
}