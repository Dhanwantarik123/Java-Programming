import java.util.StringTokenizer;

public class problem10{
	public static void main(String args[]){
		StringTokenizer s1= new StringTokenizer("My name is Dhanwantari");
		StringTokenizer s2= new StringTokenizer("My name is Vaishnavi");
		StringTokenizer s3= new StringTokenizer("My name is Dimpal");
		StringTokenizer s4= new StringTokenizer("My name is Dhanno");
		StringTokenizer s5= new StringTokenizer("My name is Prashant");
		
		System.out.println("Demo of hasMoreTokens & NextToken");
		while(s1.hasMoreTokens()){
			System.out.println(s1.nextToken());
		}
		
		System.out.println("Demo of hasMoreElements & NextElements");
		while(s2.hasMoreElements()){
			System.out.println(s2.nextElement());
		}
		
		System.out.println("Demo of hasMoreTokens & NextElements");
		while(s3.hasMoreTokens()){
			System.out.println(s3.nextElement());
		}
		
		System.out.println("Demo of hasMoreElements & NextToken");
		while(s4.hasMoreElements()){
			System.out.println(s4.nextToken());
		}
		
		System.out.println("Demo of countTokens");
		
		System.out.println(s5.countTokens());
		

	
	
	}
}
