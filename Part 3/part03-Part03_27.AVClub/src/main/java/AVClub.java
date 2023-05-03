
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String input = scanner.nextLine();
            
            if(input.equals("")) {
                break;
            }
            
            String[] str = input.split(" ");
            int i = 0;
            
            while(i < str.length) {
                if(str[i].contains("av")) {
                    System.out.println(str[i]);
                }
                
                i++;
            }
        }
        
        scanner.close();
    }
}
