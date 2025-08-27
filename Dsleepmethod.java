import java.io.*;

public class Dsleepmethod extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			try{
				sleep(5000);
			}catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	
	public static void main(String args[]){
		Dsleepmethod T1=new Dsleepmethod();
		Dsleepmethod T2=new Dsleepmethod();
		
		T1.start();
		T2.start();
	
	
	}
}
