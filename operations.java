public class operations{
	public static void main(String args[]){
		String s1="Java is a object oriented programming";
		System.out.println(s1);
		
		String s2= s1.toUpperCase();
		System.out.println(s2);
		
		String s3= s1.toLowerCase();
		System.out.println(s3);
		
		int L=s1.length();
		System.out.println("Length of String is\t:"+L);
		
		System.out.println(s1.replace("Java","Kava"));
	}
}
