import java.util.Scanner;

public class bonus{

	Scanner obj = new Scanner(System.in);
		
	public void getData(){
		System.out.println("\n Enter the Year of Service:\n");
		float yos = obj.nextFloat();
	}	
	
	public void display(){
		if(yos>=10){
		System.out.println("Bonus offered is 10000/-");
	}
	else if(yos>=7 && yos<10){
		System.out.println("Bonus offered is 7000/-");
	}
	else if(yos>=5 && yos<7){
		System.out.println("Bonus offered is 5000/-");
	}
	else if(yos>=3 && yos<5){
		System.out.println("Bonus offered is 3000/-");
	}
	else if(yos>=1 && yos<3){
		System.out.println("Bonus offered is 2000/-");
	}
	else{
		System.out.println("Bonus offered is 1000/-");
	}
	}
	public static void main(String args[]){
		bonus emp1 = new bonus();
		emp1.getData();
		emp1.display();
	}	
}
