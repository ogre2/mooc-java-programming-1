
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers: ");

        Statistics userStats = new Statistics();
        Statistics evenStats = new Statistics();
        Statistics oddStats = new Statistics();

        while(true) {
            int input = Integer.valueOf(scanner.nextLine());

            if(input == -1) {
                System.out.println("Sum: " + userStats.sum());
                System.out.println("Sum of even numbers: " + evenStats.sum());
                System.out.println("Sum of odd numbers: " + oddStats.sum());

                break;
            } else {
                userStats.addNumber(input);

                if(input % 2 == 0) {
                    evenStats.addNumber(input);
                } else {
                    oddStats.addNumber(input); 
                }

                System.out.println("Enter numbers: ");
            }
        }

        scanner.close();
    }
}
