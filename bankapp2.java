import java.util.Scanner;

public class LoanCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display loan types and their respective rates of interest
        System.out.println("Select the type of loan:");
        System.out.println("1. Home Loan - 6% per annum");
        System.out.println("2. Personal Loan - 10% per annum");
        System.out.println("3. Education Loan - 5% per annum");

        // Accept user choice
        System.out.print("Enter your choice (1/2/3): ");
        int loanType = scanner.nextInt();

        // Accept principal amount and time duration
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the time duration in years: ");
        double time = scanner.nextDouble();

        double rateOfInterest = 0;

        // Determine the rate of interest based on loan type
        switch (loanType) {
            case 1:
                rateOfInterest = 6;
                break;
            case 2:
                rateOfInterest = 10;
                break;
            case 3:
                rateOfInterest = 5;
                break;
            default:
                System.out.println("Invalid choice! Please restart the program.");
                return;
        }

        // Calculate Simple Interest (SI)
        double simpleInterest = (principal * time * rateOfInterest) / 100;

        // Calculate the total amount
        double totalAmount = principal + simpleInterest;

        // Display the results
        System.out.println("\nLoan Details:");
        System.out.println("Principal Amount: " + principal);
        System.out.println("Rate of Interest: " + rateOfInterest + "%");
        System.out.println("Time Duration: " + time + " years");
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Total Amount (Principal + Interest): " + totalAmount);

        scanner.close();
    }
}
