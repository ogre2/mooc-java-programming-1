import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here the program that allows the user to enter 
        // book information and to examine them

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while(true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if(title.equals("")) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int publishYear = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, publishYear));
        }

        System.out.println("");

        System.out.print("What information will be printed? ");
        String query = scanner.nextLine();

        if(query.equals("everything")) {
            for(Book book : books) {
                System.out.println(book.toString());
            }
        } else if(query.equals("name")) {
            for(Book book : books) {
                System.out.println(book.getTitle());
            }
        }

        scanner.close();
    }
}
