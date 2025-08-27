import java.util.Scanner;

public class Bike{
	
	Scanner obj = new Scanner(System.in);
		
	String name;
	String manuName;
	String engPower;
	String stokes;
	int price;
	float millage;
		
	public void getData(){
		System.out.println("\n ***Bike Details***\n");
	
		System.out.println("\n Enter the Name of Bike:\n");
		name = obj.nextLine();
		
		System.out.println("\n Enter the Name of manufacture:\n");
		manuName = obj.nextLine();
			
		System.out.println("\n Enter Stokes :\n");
		stokes= obj.nextLine();
			
		System.out.println("\n Enter the Engine power of Bike:\n");
		engPower = obj.nextLine();
		
		System.out.println("\n Enter the Price of Bike:\n");
		price = obj.nextInt();
			
		System.out.println("\n Enter the Millage of Bike:\n");
		millage = obj.nextFloat();
	}
		
	public void display(){
		System.out.println("\n Name\t\t:"+name);
		System.out.println("\n Manufacture\t:"+manuName);
		System.out.println("\n Stokes\t\t:"+stokes);
		System.out.println("\n Engine power\t:"+engPower);
		System.out.println("\n Price of Bike\t:"+price);
		System.out.println("\n Millage\t:"+millage);
			
	}
	public static void main(String args[]){
		Bike emp1 = new Bike();
		emp1.getData();
		emp1.display();
	}

}
		
		
