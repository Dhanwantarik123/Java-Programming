import java.util.Scanner;
public class array{
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in){
			int empID[]=new int[5];
			int i;
		
			System.out.println(" Employee Id ");
			for(i=0;i<5;i++){
				System.out.println(" Enter Employee Id \t:"+(i+1));
				empID[i]= obj.nextInt();
			}
		
			System.out.println(" Printing Employee Id ");
			for(i=0;i<5;i++){
				System.out.println(" Printing Employee Id "+(i+1)"\t:"+empID[i]);
			
			}
	
		}
	
	}
}	
