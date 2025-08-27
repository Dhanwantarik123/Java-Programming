import java.util.Scanner;

class accHolder {
	Scanner obj = new Scanner(System.in);
    	String name, accType;
    	int accNumber, balance;
	
    	void getDetails() {
        	System.out.println("Enter Name of Depositor: ");
        	name = obj.next();
        	System.out.println("Enter Account Number: ");
        	accNumber = obj.nextInt();
        	System.out.println("Enter Type of Account: ");
        	accType = obj.next();
        	System.out.println("Enter Balance Amount: ");
        	balance = obj.nextInt();
    	}	

    	void displayDetails() {
        	System.out.println("\nAccount Holder Details:");
        	System.out.println("Name: " + name);
        	System.out.println("Account Number: " + accNumber);
        	System.out.println("Account Type: " + accType);
        	System.out.println("Balance: Rs. " + balance);
    	}

    	synchronized void deposit() {
        	System.out.println("Enter Amount to Deposit: ");
        	int amount = obj.nextInt();
        	balance += amount;
        	System.out.println("Updated Balance after Deposit: Rs. " + balance);
    	}

    	synchronized void withdraw() {
    	    System.out.print("Enter Amount to Withdraw: ");
    	    int amount = obj.nextInt();
    	    if (balance >= amount) {
    	        balance -= amount;
    	        System.out.println("Withdrawal Successful! Updated Balance: Rs. " + balance);
    	    } else {
    	        System.out.println("Insufficient Balance!");
    	    }
	}
}	

public class problem9{
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        accHolder[] customers = new accHolder[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for Account Holder " + (i + 1) + ":");
            customers[i] = new accHolder();
            customers[i].getDetails();
        }

        for (int i = 0; i < 3; i++) {
            customers[i].displayDetails();
            customers[i].deposit();
            customers[i].withdraw();
        }

    }
}
