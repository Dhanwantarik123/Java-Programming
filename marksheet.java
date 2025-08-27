import java.util.Scanner;

public class marksheet{
	public static void main(String args[]){
		Scanner obj =new Scanner(System.in);
		char choice='y';
		int DSA,NT,EDC,Maths,DM;
	
		System.out.println("***********MARKSHEET************");
		System.out.println("Enter the marks of DSA:");
		DSA= obj.nextInt();
		
		System.out.println("Enter the credit of DSA:");
		int c1= obj.nextInt();
	
		System.out.println("Enter the marks of NT:");
		NT= obj.nextInt();
		
		System.out.println("Enter the credit of NT:");
		int c2= obj.nextInt();
	
		System.out.println("Enter the marks of EDC:");
		EDC= obj.nextInt();
		
		System.out.println("Enter the credit of EDC:");
		int c3= obj.nextInt();
	
		System.out.println("Enter the marks of Maths:");
		Maths= obj.nextInt();
		
		System.out.println("Enter the credit of Maths:");
		int c4= obj.nextInt();
	
		System.out.println("Enter the marks of DM:");
		DM= obj.nextInt();
	
		System.out.println("Enter the mcredit  of DM:");
		int c5= obj.nextInt();
		
		System.out.println(" Enter Incentive Marks:");
		int IM= obj.nextInt();
	
		
	
		
		
		
		System.out.println("***********MARKSHEET************");
		System.out.println("The marks of DSA:\t"+DSA);
		System.out.println("The marks of NT:\t"+NT);
		System.out.println("The marks of EDC:\t"+EDC);
		System.out.println("The marks of Maths:\t"+Maths);
		System.out.println("The marks of DM:\t"+DM);
		System.out.println("Incentive Marks:\t"+IM);
		
		float per1=(DSA+NT+EDC+Maths+DM);
		float per=(per1/500)*100;
		float sgpa1=(c1+c2+c3+c4+c5+IM);
		float sgpa=(sgpa1/60)*100;
		
		System.out.println("The Percentage :"+per);
		System.out.println("SGPA:"+sgpa);
		
		
		if(per>=90){
			System.out.println("Grade is 'o'");
		}
		else if(per>=85||per<90){
			System.out.println("Grade is 'E'");
		}
		else if(per>=75||per<85){
			System.out.println("Grade is 'A+'");
		}
		else if(per>=70||per<75){
			System.out.println("Grade is 'A'");
		}
		else if(per>=65||per<70){
			System.out.println("Grade is 'B+'");
		}
		else if(per>=60||per<65){
			System.out.println("Grade is 'B'");
		}
		else if(per>=55||per<60){
			System.out.println("Grade is 'C'");
		}
		else if(per>=40||per<55){
			System.out.println("Grade is 'D'");
		}
		else{
			System.out.println("Grade is 'F'");
			
		}
	}
}

		 
		
	
