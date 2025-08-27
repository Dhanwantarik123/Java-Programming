import java.util.Scanner;

public class problem7{
    public static void main(String  args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter First Name: ");
        String firstName = obj.next();

        System.out.println("Enter Last Name: ");
        String lastName = obj.next();
	
	System.out.println("+ method: ");
        String fullName1 = firstName + " " + lastName;
        System.out.println("\n" + fullName1);
        
	System.out.println("Concat method:");
        String fullName2 = firstName.concat(" ").concat(lastName);
        System.out.println(fullName2);
        
	System.out.println("Join method: ");
        String fullName3 = String.join(" ", firstName, lastName);
        System.out.println(fullName3);
	
	System.out.println("Format method: ");
        String fullName4 = String.format("%s %s", firstName, lastName);
        System.out.println(fullName4);

    }
}
