
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to? ");
        int ending = Integer.valueOf(scanner.next());
        System.out.print("Where from? ");
        int start = Integer.valueOf(scanner.next());
        
        for(int i = start; i <= ending; i++) {
            System.out.println(i);
        }
        
        scanner.close();
    }
}
