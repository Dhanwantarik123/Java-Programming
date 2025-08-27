import java.util.Scanner;

public class problem6{
    public static void main(String  args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter names of 5 Automobile Industries:");
        String s1 = obj.nextLine();
        String s2 = obj.nextLine();
        String s3 = obj.nextLine();
        String s4 = obj.nextLine();
        String s5 = obj.nextLine();

        System.out.println("\nComparing Automobile Industry Names:");

        System.out.println("Using equals(): " + s1.equals(s2));
        System.out.println("Using == operator: " + (s1 == s2));
        System.out.println("Using compareTo(): " + s1.compareTo(s3));
        System.out.println("Using startsWith(): " + s4.startsWith("T"));
        System.out.println("Using endsWith(): " + s5.endsWith("a"));

    }
}
