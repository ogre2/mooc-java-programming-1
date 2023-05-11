import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");

        while(true) {
            String name = scanner.nextLine();

            if(name.equals("")) {
                break;
            }

            items.add(new Item(name));

            System.out.print("Name: ");
        }

        for(Item item : items) {
            System.out.println(item.toString());
        }

        scanner.close();
    }
}
