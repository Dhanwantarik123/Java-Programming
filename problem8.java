import java.util.Scanner;

class LIC {
	Scanner obj = new Scanner(System.in);

    	String health, area, gender;
    	int age, premium, maxPolicyAmount;

    	void getDetails() {
        	System.out.println("Enter Health Condition (Excellent/Poor): ");
        	health = obj.next();
        	System.out.println("Enter Age: ");
        	age = obj.nextInt();
        	System.out.println("Enter Residence Area (City/Village): ");
        	area = obj.next();
        	System.out.println("Enter Gender (Male/Female): ");
        	gender = obj.next();
    	}

    	void calculatePolicy() {
        	if (health.equalsIgnoreCase("Excellent") && age >= 25 && age <= 35 && area.equalsIgnoreCase("City")) {
        	    if (gender.equalsIgnoreCase("Male")) {
        	        premium = 4;
        	        maxPolicyAmount = 200000;
        	    } else {
        	        premium = 3;
        	        maxPolicyAmount = 100000;
        	    }
        	} else if (health.equalsIgnoreCase("Poor") && age >= 25 && age <= 35 && area.equalsIgnoreCase("Village")) {
        	    if (gender.equalsIgnoreCase("Male")) {
        	        premium = 6;
        	        maxPolicyAmount = 100000;
        	    } else {
        	        premium = 5;
        	        maxPolicyAmount = 50000;
        	    }
        	} else {
        	    premium = 0;
        	    maxPolicyAmount = 0;
        	}
    	}	
	
    	void displayPolicy() {
        	if (maxPolicyAmount > 0) {
        	    System.out.println("Premium: Rs. " + premium + " per thousand");
        	    System.out.println("Max Policy Amount: Rs. " + maxPolicyAmount);
        	} else {
        	    System.out.println("Not Eligible for Insurance");
        	}
    	}	
}

public class problem8 {
    	public static void main(String args[]) {
        	Scanner obj = new Scanner(System.in);
	
        	for (int i = 1; i <= 5; i++) {
        	    System.out.println("Customer " + i + ":");
        	    LIC c1 = new LIC();
        	    c1.getDetails();
        	    c1.calculatePolicy();
        	    c1.displayPolicy();
        	}
	
    	}
}
