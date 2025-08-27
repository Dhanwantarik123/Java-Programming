import java.util.Scanner;

public class Demo{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		
	 	System.out.println("Enetr the age of person");
	 	int age =obj.nextInt();
	 	if(age<18){
	 		throw new IllegalArgumentException("You are still a Minor");
	 	}
	 	System.out.println("Welcome to our Team");
	}
}

