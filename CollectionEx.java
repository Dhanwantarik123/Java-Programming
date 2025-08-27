import java.util.*;
public class CollectionEx{
	public void demoCollections(){
		int[] arr=new int[]{123,456,789};
		
		System.out.println("Printing the First Element of Array:");
		System.out.println(arr[0]);
		System.out.println("Printing  Element of Array:");
		for(int num: arr){
			System.out.println(num);
		}
	}
	
	public static void main(String args[]){
		CollectionEx obj=new CollectionEx();
		obj.demoCollections();
	}
}
