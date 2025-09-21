// Bank Loan Eligibility Checker

package JavaOperators;

public class LogicalOperator {
    public static void main(String[] args) {

        int age = 25;
        double income = 500000;
        boolean goodCreditScore = true;
        int yearsWithBank = 2;

        System.out.println("---- Loan Eligibility Check ----");

        // && Operator
        boolean basicEligibilityCheck = (age >= 21 && age <= 60) && (income >= 400000);
        System.out.println("Meets basic age & income requirement? " + basicEligibilityCheck);

        // || Operator
        boolean additionalSupport = goodCreditScore || yearsWithBank >= 5;
        System.out.println("Has good credit score or long-term relation? " + additionalSupport);

        boolean loanApproved = basicEligibilityCheck && additionalSupport;
        System.out.println("Loan Approved: " + loanApproved);

        // ! operator
        if (!loanApproved)
            System.out.println("Load Rejected!");
    }
}