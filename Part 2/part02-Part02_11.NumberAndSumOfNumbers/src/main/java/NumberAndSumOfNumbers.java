
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tally = 0, sum = 0;
        
        while(true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if(num == 0) {
                break;
            }
            
            if(num != 0) {
                tally = tally + 1;
                sum = sum + num;
            }
        }
        
        System.out.println("Number of numbers: " + tally);
        System.out.println("Sum of the numbers: " + sum);
    }
}
