import java.util.*;

class Product{
	int id;
	String name;
	float price;
	
	Product(int id, String name, float price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
}

public class LambdaEx1{
	public static void main(String args[]){
		List<Product>list=new ArrayList<Product>();
		list.add(new Product(101,"HP",40000ff));
		list.add(new Product(102,"lenovo",50000ff));
		list.add(new Product(103,"Dell",60000ff));
		list.add(new Product(105,"Apple",70000ff));
		
		collections.sort(list,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		
		for(int product:list){
			System.out,println
