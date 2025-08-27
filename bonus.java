import java.util.Scanner;

public class bonus{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		
	
		System.out.println("\n Enter the Year of Service:\n");
		float yos = obj.nextFloat();
		
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
}
