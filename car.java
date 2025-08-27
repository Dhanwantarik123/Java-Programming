import java.util.Scanner;
public class car{
	public static void main(String args[]){
		Scanner obj= new Scanner(System.in);
		
		StringBuilder name = new StringBuilder("Mahindra");
		StringBuilder model = new StringBuilder("Thar");
		StringBuilder price = new StringBuilder("1500000");
		
		System.out.println("Details of the car:");
		System.out.println("Name:"+name+"\tModel"+model+"\tPrice"+price);
		
		StringBuilder car = new StringBuilder(" Car Details:");
		car.append("\nSeating Capacity=9\n");
		
		System.out.println("Details of the car:");
		System.out.println(car);
		car.append("Engine type = petrol\n");
		
		System.out.println("Details of the car:");
		System.out.println(car);
		car.insert(32,"\nMillage=160km/hr\n");
		
		System.out.println("Details of the car:");
		System.out.println(car);
		car.append("Engine Power=45\n");
		
		System.out.println("Details of the car:");
		System.out.println(car);
		car.append("Colour Name= White\n");
		
		System.out.println("Details of the car:");
		System.out.println(car);
		car.delete(0,1);
		
		
		System.out.println("Details of the car:");
		System.out.println(car);
		
		
	}
}
