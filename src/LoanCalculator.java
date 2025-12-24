import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the annual interest rate (percentage): ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterest = annualInterestRate/1200;

        System.out.print("Enter the number of years to pay laon: ");
        double numberOfYears = input.nextDouble();
        System.out.print("Enter loan amount: ");
        double loanAmount = input.nextDouble();

        double monthlyPayment = loanAmount * monthlyInterest / (1 - 1 / Math.pow (1 + monthlyInterest, numberOfYears * 12)) ;
        double totalPayment = monthlyPayment * numberOfYears * 12;
        System.out.println("monthly payment is equals: #" + (int)(monthlyPayment * 100)/100.0);
        System.out.println("Total payment is equals: #" + (int)(totalPayment * 100)/100.0);
    }
}
