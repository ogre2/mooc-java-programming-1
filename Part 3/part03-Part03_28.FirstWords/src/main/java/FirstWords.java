
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String input = scanner.nextLine();
            
            if(input.equals("")) {
                break;
            }
            
            String[] str = input.split(" ");
            
            System.out.println(str[0]);
        }
        
        scanner.close();
    }
}
