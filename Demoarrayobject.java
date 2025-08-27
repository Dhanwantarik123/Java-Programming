import java.util.Scanner;

class Employee{
	String name;
	int empID;
	String dept;
	String desg;
	
	Employee(String n, int i,String d, String de){
		this.name=n;
		this.empID=i;
		this.dept=d;
		this.desg=de;
	}
}

public class Demoarrayobject{
	public static void main (String args[]){
		Scanner obj= new Scanner(System.in);
		
		Employee empData[] = new Employee[5];
		
		System.out.println(" Reading Employee Details");
		for (int i=0;i<5;i++){
			System.out.println("Enter the Details ofEmployeee-"+(i+1));
				
			System.out.print("Enter the Name of Enployee");
			String nam=obj.nextLine();
			obj.nextLine();
				
			System.out.print("Enter the ID of Enployee");
			int id=obj.nextInt();
			obj.nextLine();
				
			System.out.print("Enter the Department of Enployee");
			String dep=obj.nextLine();
			obj.nextLine();
				
			System.out.print("Enter the Designation of Enployee");
			String des=obj.nextLine();
			obj.nextLine();
				
			empData[i]=new Employee(nam,id,dep,des);
			
		}
		
		System.out.println("Printing theEmployee Details");
		
		for(int j=0;j<5;j++){
			System.out.println("Name:"+empData[j].name+"\tEmployeeID:"+empData[j].empID+"\tDepartment:"+empData[j].dept+"\t Designation:"+empData[j].desg);
		}
	}
}			
