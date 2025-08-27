import java.io.*;

public class DThread{

	public static void main(String args[]){
	
		Thread T1=new Thread("My Thread");
		System.out.println("The Statement is Running from the Thread");
		T1.start();
	
		String str=T1.getName();
		System.out.println(str);
	}


}
