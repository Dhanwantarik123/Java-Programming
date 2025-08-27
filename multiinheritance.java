import java.util.Scanner;
 
 class Student {
 	String name;
 	String USN;
 	
 	void getInfo(){
 		Scanner obj=new Scanner(System.in);
 		System.out.println("Enter the Name of Student");
 		name=obj.nextLine();
 		System.out.println("Enter the USN of Student");
 		salary=obj.nextLine();
 	}
 	void displayStudent(){
 		System.out.println(" Name of Student\t:"+name);
 		System.out.println(" USN of Student\t:"+USN);	
 	
 	}
 }
 class marks extends Student{
 	int sub1;
 	int sub2;
 	int sub3;
 	int sub4;
 	int sub5;
 	
 	void getmarks(){
 		System.out.println("Enter the Marks of Sub 1:");
 		sub1=obj.nextInt();
 		
 		System.out.println("Enter the Marks of Sub 2:");
 		sub2=obj.nextInt();
 		
 		System.out.println("Enter the Marks of Sub 3:");
 		sub3=obj.nextInt();
 		
 		System.out.println("Enter the Marks of Sub 4:");
 		sub4=obj.nextInt();
 		
 		System.out.println("Enter the Marks of Sub 5:");
 		sub5=obj.nextInt();
 	}
 	void displaymarks(){
 		System.out.println("Marks of Sub 1\t:"+sub1);
 		System.out.println("Marks of Sub 2\t:"+sub2);
 		System.out.println("Marks of Sub 3\t:"+sub3);
 		System.out.println("Marks of Sub 4\t:"+sub4);
 		System.out.println("Marks of Sub 5\t:"+sub5);
 	}
 }
 class result extends marks{
 	int total;
 	float per;
 	void getresult(){
 		total=(sub1+sub2+sub3+sub4+sub5);
 		per=(float)(total/5.0f);
 	}
 	void displayresult(){
 	System.out.println("Total marks \t:"+total);
 	System.out.println("Percentage \t:"+per);
 	}
 }
 
 public class multiinheritance{
 	public static void main(String args[]){
 		Student E1=new Student();
 		E1.getInfo();
 		E1.getmarks();
 		E1.getresult();
 		E1.displayInfo();
 	
 		E1.displaymarks();
 		E1.displayresult();
 	}
 }
 		

