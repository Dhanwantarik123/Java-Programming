import java.util.Scanner;
public class bank2{
	public static void main(String args[]){
		Scanner obj =new Scanner(System.in);
		int choice=1,input,p1,r1,n1,p2,n2,r2,p3,n3,r3;
		float SI1,amts1,amount1,SI2,amts2,amount2,SI3,amts3,amount3;
		
		System.out.println("***** WELLCOME TO APPLICATION *****");
		do{
			System.out.println("The Bank details of Customer:"); 
			
			System.out.println("Enter the Type of loan:");
			System.out.println("Press 1 : Home Loan");
			System.out.println("Press 2: Education Loan");
			System.out.println("Press 3 : Car Loan");
			
			System.out.println("Enter your Input:");
			input=obj.nextInt();
			
			
			switch (input){
			
				case 1:
					System.out.println("the Type of loan: Home");
					
					System.out.println("Enter the Amount:");
					p1=obj.nextInt();
			
					
					System.out.println("Enter Time Duration:");
					n1=obj.nextInt();
					
					
					SI1=(p1*n1*4)/100;
					amts1=SI1/100;
					amount1=amts1+p1;
					
					System.out.println("Principal Amount:"+p1);
					System.out.println("Rate of intrest:4");
					System.out.println("Duration:"+n1);
					
					System.out.println("Amount:"+amts1);
					System.out.println("Total amount:"+amount1);
					
					break;
					
				case 2:
					
					System.out.println("the Type of loan: Education");
					
					System.out.println("Enter the Amount:");
					p2=obj.nextInt();
			
					System.out.println("Enter Time Duration:");
					n2=obj.nextInt();
			
					
					
					SI2=(p2*n2*5)/100;
					amts2=SI2/100;
					amount2=amts2+p2;
					
					System.out.println("Principal Amount:"+p2);
					System.out.println("Rate of intrest:5");
					System.out.println("Duration:"+n2);
					
					System.out.println("Amount:"+amts2);
					System.out.println("Total amount:"+amount2);
					
					break;
					
				case 3:
					System.out.println("the Type of loan: Education");
					
					System.out.println("Enter the Amount:");
					p3=obj.nextInt();
			
					System.out.println("Enter Time Duration:");
					n3=obj.nextInt();
					
					
					
					SI3=(p3*n3*8);
					amts3=SI3/100;
					amount3=amts3+p3;
					
					System.out.println("Principal Amount:"+p3);
					System.out.println("Rate of intrest:8");
					
					System.out.println("Amount:"+amts3);
					System.out.println("Total amount:"+amount3);
					
			
					break;
					
				default :
					System.out.println("INVALID INPUT");
					break;
				}
				System.out.println("Do you want to perform another operation-yes-1/no-0");
				choice=obj.nextInt();
				
			
		}while(choice==1);
		
		
	}
}
		
