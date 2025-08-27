import java.util.Scanner;

public class DemoEmployee{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		System.out.println("\n Employee Details\n");
		
		System.out.println("\n Enter the Name of Employee\n");
		String name = obj.nextLine();
		
		System.out.println("\n Enter the Name of Department\n");
		String dept = obj.nextLine();
		
		System.out.println("\n Enter the designation \n");
		String desg = obj.nextLine();
		
		System.out.println("\n Enter contact number\n");
		String contactNo= obj.nextLine();
		
		System.out.println("\n Enter Email ID\n");
		String emailId= obj.nextLine();
		
		System.out.println("\n Enter the Employee Id\n");
		int empID= obj.nextInt();
		
		System.out.println("\n Enter the Gross Salary\n");
		int grossSal= obj.nextInt();
		
		System.out.println("\n Name\t\t:"+name);
		System.out.println("\n Department\t:"+dept);
		System.out.println("\n Designation\t:"+desg);
		System.out.println("\n Contact number\t:"+contactNo);
		System.out.println("\n Email ID\t:"+emailId);
		System.out.println("\n Employee ID\t:"+empID);
		System.out.println("\n Gross salary\t:"+grossSal);
	}
}
		
		
		
		

