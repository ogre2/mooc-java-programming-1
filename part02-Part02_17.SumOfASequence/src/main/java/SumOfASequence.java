
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Last number? ");
        int sum = 0, num = Integer.valueOf(scanner.nextLine());
        
        for(int i = 0; i <= num; i++) {
            sum += i;
        }
        
        System.out.println("The sum is " + sum);
        
        scanner.close();
    }
}
