import java.io.*;

public class DThread4 extends Thread{

	public static int num=0;
	
	public void run(){
		num++;
	}
	public static void main(String args[]){
		DThread4 T1= new DThread4();
		T1.start();
		
		while(T1.isAlive()){
			System.out.println("Waiting.....");
		}
		System.out.println("Current value of Num is \t:"+num);
		num++;
		System.out.println("Current value of Num is \t:"+num);
	}
}
