import java.util.*;
public class CollectionEx1{
	public void demoCollections(){
		int[] arr=new int[]{123,456,789};
		
		
		System.out.println("Printing the First Element of Array:");
		System.out.println(arr[0]);
		System.out.println("Printing  Element of Array:");
		for(int num: arr){
			System.out.println(num);
		}
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(123);
		list1.add(456);
		list1.add(789);
		
		System.out.println("Printing the first elemenet in list");
		System.out.println(list1.get(0));
		System.out.println("Printing the elemenet in list");
		for(Integer num : list1){
			System.out.println(num);
		}	
		
		HashSet<String> set1= new HashSet<>();
		set1.add("Manaswi");
		set1.add("Dhanwantari");
		set1.add("Dimpal");
		set1.add("Vaishnavi");
		set1.add("Minu");
		System.out.println("Printing the elemenet in Set :");
		System.out.println(set1);
		
		
		Map<Integer,String>rollList=new HashMap<>();
		rollList.put(1001,"Apurva");
		rollList.put(1002,"sanjay");
		rollList.put(1003,"Arun");
		
		System.out.println("Printing the value ofkey :");
		System.out.println(1002);
	}
	
	public static void main(String args[]){
		CollectionEx obj=new CollectionEx();
		obj.demoCollections();
	}
}
