class OuterClass{
	int num1=10;
	static class InnerClass{
		int num2=20;
	}
}
public class innerclass{
	public static void main(String args[]){
	
		//OuterClass out1 =new OuterClass();
		OuterClass.InnerClass in1 =new OuterClass.InnerClass();
		
		//System.out.println("Num 1 is \t:"+out1.num1);
		System.out.println("Num 2 is \t:"+in1.num2);
	}
}
