import java.util.Scanner;

public class DemoException{
	void arithmeticOps(int a, int b){
		System.out.println("Addition of Given Numbers\t:"+(a+b));
		System.out.println("Subraction of Given Numbers\t:"+(a-b));
		System.out.println("Multiplication of Given Numbers\t:"+(a*b));
		
		try{
			System.out.println("Division of Given Numbers\t:"+(a/b));
			System.out.println("Modulus of Given Number \t:"+(a%b));
		}catch(ArithmeticException e){
			System.out.println("Error: Division by Zero is not allowed");
		}
	}
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the First Number:");
		int num1=obj.nextInt();
		
		System.out.println("Enter the Second Number:");
		int num2=obj.nextInt();
		
		DemoException D1=new DemoException();
		D1.arithmeticOps(num1,num2);
	}
}
