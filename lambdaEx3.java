import java.util.*;

class Product{

	int id;
	String name;
	float price;
	
	Product(int id,String name,float price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class lambdaEx3{
	public static void main(String args[]){
		List<Product>list=new ArrayList<Product>();
		
		list.add(new Product(101,"HP",45000f));
		list.add(new Product(102,"lenovo",35000f));
		list.add(new Product(103,"Dell",65000f));
		list.add(new Product(104,"Apple",25000f));

		System.out.println("Printing the original list:");
		for(Product p: list){
			System.out.println(p.id+" "+p.name+" "+p.price);
		}
		
		List<Product>list2=new ArrayList<Product>();
		for(Product p:list){
			if(p.price<40000){
				list2.add(p);
			}
		}
		System.out.println("\nPrinting the Filtered List:");
		for(Product p: list2){
			System.out.println(p.id+" "+p.name+" "+p.price);
			
			
		}
	}
}
