
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many times?");
        int i = 0, repeat = Integer.valueOf(scanner.nextLine());
        
        while(i < repeat) {
            printText();
            i++;
        }
        
        scanner.close();
    }
    
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
