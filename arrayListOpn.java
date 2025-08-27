import java.util.*;

public class arrayListOpn{
	public void demoCollection(){
	
		List<String>students=new ArrayList<>();
		students.add("Dhanwantari");
		students.add("Vaishnavi");
		students.add("Dimpal");
		System.out.println("Printing the Name of students of list ");
		System.out.println(students);
		
		System.out.println("Printing the name of first student  ");
		System.out.println(students.get(0));
		
		System.out.println("Removing the name of first student  ");
		students.set(0,"Dhanno");
		System.out.println(students);
		
		System.out.println("Printing the updated list");
		System.out.println(students);
		
		System.out.println("Printing the names in alphabetical order");
		Collections.sort(students);
		System.out.println(students);
		
		System.out.println("Printing the names in areverse order");
		Collections.sort(students, Collections.reverseOrder());
		System.out.println(students);
		
		System.out.println("Printing the listof studens using for each loop");
		for(String j:students){
			System.out.println(j);
		}
		
		
	}
	public static void main(String args[]){
		arrayListOpn obj=new arrayListOpn();
		obj.demoCollection();
	}
}
	
