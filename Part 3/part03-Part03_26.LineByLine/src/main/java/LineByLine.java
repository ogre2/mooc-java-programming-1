
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String str = scanner.nextLine();
            
            if(str.equals("")) break;
            
            String[] pieces = str.split(" ");
            int i = 0;
            
            while(i < pieces.length) {
                System.out.println(pieces[i]);
                
                i++;
            }
        }
        
        scanner.close();
    }
}
