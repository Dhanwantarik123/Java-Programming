import java.util.Scanner;
public class bankapp{
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
					
					r1=4;
					
					SI1=(p1*n1*r1)/100;
					amts1=SI1/100;
					amount1=SI1+p1;
					
					System.out.println("Principal Amount:"+p1);
					System.out.println("Rate of intrest:"+r1);
					System.out.println("Duration:"+n1);
					
					break;
					
				case 2:
					
					System.out.println("the Type of loan: Education");
					
					System.out.println("Enter the Amount:");
					p2=obj.nextInt();
			
					System.out.println("Enter Time Duration:");
					n2=obj.nextInt();
					
					r2=5;
					
					SI2=(p2*n2*r2)/100;
					amts2=SI2/100;
					amount2=SI2+p2;
					
					System.out.println("Principal Amount:"+p2);
					System.out.println("Rate of intrest:"+r2);
					System.out.println("Duration:"+n2);
					
					break;
					
				case 3:
					System.out.println("the Type of loan: Education");
					
					System.out.println("Enter the Amount:");
					p3=obj.nextInt();
			
					System.out.println("Enter Time Duration:");
					n3=obj.nextInt();
					
					r3=8;
					
					SI3=(p3*n3*r3);
					amts3=SI3/100;
					amount3=SI3+p3;
					
					System.out.println("Principal Amount:"+p3);
					System.out.println("Rate of intrest:"+r3);
					System.out.println("Duration:"+n3);
					
			
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
		
