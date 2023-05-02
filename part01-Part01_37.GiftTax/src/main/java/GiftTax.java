
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());
        double tax = 0;
        
        if(value < 5000) {
            System.out.println("No tax!");
        } else if(value >= 5_000 && value <= 25_000) {
            tax = (double) (100 + (value - 5_000) * 0.08);
            System.out.println("Tax: " + tax);
        } else if(value >= 25_000 && value <= 55_000) {
            tax = (double) (1_700 + (value - 25_000) * 0.10);
            System.out.println("Tax: " + tax);
        } else if(value >= 55_000 && value <= 200_000) {
            tax = (double) (4_700 + (value - 55_000) * 0.12);
            System.out.println("Tax: " + tax);
        } else if(value >= 200_000 && value <= 1_000_000) {
            tax = (double) (22_100 + (value - 200_000) * 0.15);
            System.out.println("Tax: " + tax);
        } else {
            tax = (double) (142_100 + (value - 1_000_000) * 0.17);
            System.out.println("Tax: " + tax);
        }
    }
}
