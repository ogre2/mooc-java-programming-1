
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int ageOfOldest = 0;
        String nameOfOldest = "";
        
        while(true) {
            String input = scanner.nextLine();
            
            if(input.equals("")) {
                break;
            }
            
            String[] str = input.split(",");
            int age = Integer.valueOf(str[1]);
            
            if(ageOfOldest < age) {
                ageOfOldest = age;
                nameOfOldest = str[0];
            }
        }
        
        System.out.println("Name of the oldest: " + nameOfOldest);
        
        scanner.close();
    }
}
