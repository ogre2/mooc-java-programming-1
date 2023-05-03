
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        
        int sumOfBirthYears = 0, entryCounter = 0, lengthOfLongestName = 0, indexOfLongestName = 0;
        double avgOfBirthYears = 0;
        
        while(true) {
            String input = scanner.nextLine();
            
            if(input.equals("")) {
                break;
            }
            
            String[] entry = input.split(",");
            
            names.add(entry[0]);
            ages.add(Integer.valueOf(entry[1]));
            
            sumOfBirthYears += Integer.valueOf(entry[1]);
            entryCounter++;
        }
        
        avgOfBirthYears = (double) sumOfBirthYears / entryCounter;
        
        for(int i = 0; i < names.size(); i++) {
            if(names.get(i).length() > lengthOfLongestName) {
                lengthOfLongestName = names.get(i).length();
                indexOfLongestName = i;
            }
        }
        
        System.out.println("Longest name: " + names.get(indexOfLongestName));
        System.out.println("Average of the birth years: " + avgOfBirthYears);

        scanner.close();
    }
}