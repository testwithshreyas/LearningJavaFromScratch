package JavaTypeCasting;

public class BillCalculatorEx {
    public static void main(String[] args) {

        // Customer details
        int customer = 83;
        char customer_name = (char) customer;

        // Item prices & Calculation
        double milk_price = 35.25;
        double bread_price = 25.25;
        int totalWithoutDecimals = (int) milk_price + (int) bread_price;
        double totalWithDecimals = milk_price + bread_price;

        System.out.println("Customer name: "+customer_name);
        System.out.println("Total Bill (Without Decimals): "+totalWithoutDecimals);
        System.out.println("Total Bill (With Decimals): "+totalWithDecimals);
    }
}