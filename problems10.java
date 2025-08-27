
import java.util.Scanner;

public class problems10{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		int n = 5; 
		for (int i = 1; i <= n; i++) {
          		System.out.print("\nEnter the age of voter " + i + ": ");
	 		int age =obj.nextInt();
	 		if(age<18){
	 			throw new IllegalArgumentException("You are still a Minor");
	 		}
	 		System.out.println("Welcome to our Team");
	 	}
	}
}

