
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number: ");
        int num = Integer.valueOf(scanner.nextLine());
        int i = 1, fact = 1;
        
        while(i <= num) {
            fact = fact * i;
            i++;
        }
        
        System.out.println("Factorial: " + fact);
        
        scanner.close();
    }
}
