public class constructor{
	String name;
	int rollNo;
	
	constructor(){
		System.out.println("Object 1 is created using Default or Parameterless Constructor");
	}
	
	constructor(String n, int rn){
		this.name=n;
		this.rollNo=rn;
		System.out.println("Object 2 is Created using Parametrized constructor");
	}
	
	public static void main(String args[]){
		constructor c1=new constructor();
		System.out.println("Details of object-1");
		System.out.println("Name\t:"+c1.name);
		System.out.println("RollNo\t:"+c1.rollNo);
		
		constructor c2=new constructor("Dhanwantari",1234);
		System.out.println("Details of object-2");
		System.out.println("Name\t:"+c2.name);
		System.out.println("RollNo\t:"+c2.rollNo);
		
	}
}
		
