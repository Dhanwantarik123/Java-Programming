import java.util.Scanner;

public class problem5{
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter Book Title: ");
        String title = obj.nextLine();

        System.out.print("Enter Author Name: ");
        String author = obj.nextLine();

        System.out.print("Enter Publication House: ");
        String publication = obj.nextLine();

        System.out.println("\nStage-2: Displaying Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication House: " + publication);

        StringBuffer book = new StringBuffer(title);

        book.append(" - ").append(author);
        book.append(" - ").append(publication);

        System.out.println("\nStage-5: Book Details using StringBuffer:");
        System.out.println(book.toString());


    }
}
