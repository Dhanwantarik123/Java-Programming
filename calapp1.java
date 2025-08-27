import java.util.Scanner;

public class calapp1{
	
	public static void main(String args[]){
		Scanner obj= new Scanner(System.in);
		
		int input,choice=1,num1,num2;
		do{
		
			System.out.println("WELCOME IN APPLICATION");
			System.out.println("Press 1: Addition");
			System.out.println("Press 2: Subraction");
			System.out.println("Press 3: Multiplication");
			System.out.println("Press 4: Division");
			System.out.println("Press 5: Modulus");
			
			System.out.println("Enter your input");
			input=obj.nextInt();
			
			switch(input) {
				case 1:
					System.out.println("Enter first integer ");
					num1=obj.nextInt();
					
					
					System.out.println("Enter second integer ");
					num2=obj.nextInt();
					
					int add=num1+num2;
					System.out.println(" Addition:"+add);
					break;
				
				case 2:
					System.out.println("Enter first integer ");
					 num1=obj.nextInt();
					
					
					System.out.println("Enter second integer ");
					 num2=obj.nextInt();
					
					int sub=num1-num2;
					
					System.out.println(" Subtraction:"+sub);
					break;
				
				case 3:
					System.out.println("Enter first integer ");
					num1=obj.nextInt();
					
					
					System.out.println("Enter second integer ");
					num2=obj.nextInt();
					
					int mult=num1*num2;
					System.out.println(" Multiplication:"+mult);
					break;
				
				case 4:
					System.out.println("Enter first integer ");
					num1=obj.nextInt();
					
					
					System.out.println("Enter second integer ");
					num2=obj.nextInt();
					
					int div=num1/num2;
					
					System.out.println(" Division:"+div);
					break;
				
				case 5:
					System.out.println("Enter first integer ");
					num1=obj.nextInt();
					
					
					System.out.println("Enter second integer ");
					num2=obj.nextInt();
					
					int mod=num1%num2;
					System.out.println(" Modulus:"+mod);
					break;
				default :
					System.out.println("INVALID INPUT");
				}
			System.out.println("Do you want to perform another operation -yes-1/no-0");
			choice=obj.nextInt();
		}while(choice==1);
	}
}
			
