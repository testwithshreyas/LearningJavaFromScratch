package JavaVariables;

/* Grocery Bill Calculator
Declare variables for item prices.
Declare variables for quantities purchased.
Calculate and print the total bill. */

public class GroceryBillCalculator {
    public static void main(String[] args) {

        double milk = 35;
        double bread = 25;
        double butter = 85;
        int milkQty = 2;
        int breadQty = 1;
        int butterQty = 1;
        int totalQty =  milkQty + breadQty + butterQty;
        double totalBill = (milk*milkQty) + (bread*breadQty) + (butter*butterQty);
        System.out.println("------------Grocery Bill Summary------------");
        System.out.println("Milk (x" + milkQty + "): "+ (milk*milkQty));
        System.out.println("Bread (" + breadQty +"): "+(bread*breadQty));
        System.out.println("Bread (" + butterQty +"): "+(butter*butterQty));
        System.out.println("-------------------------");
        System.out.println("Total Items Purchased: "+totalQty);
        System.out.println("Total Bill Amount: ₹"+totalBill);
    }
}