import java.io.*;

public class DThread5 extends Thread{

	public static int num=0;
	
	public void run(){
		num++;
	}
	public static void main(String args[]){
		DThread5 T1= new DThread5();
		T1.start();
		
		System.out.println("Current value of Num is \t:"+num);
		num++;
		System.out.println("Current value of Num is \t:"+num);
	}
}
