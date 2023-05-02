
public class AdvancedAstrology {

    public static void printStars(int number) {
        int i = 1;
        while(i <= number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int i = 1;
        while(i <= number) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        int i = 1;
        while(i <= size) {
            printSpaces(size - i);
            printStars(i);
            i++;
        }
    }

    public static void christmasTree(int height) {
        int i = 1;
        int j = height - 1;
        
        while(i <= height * 2 && j >= 0) {
            printSpaces(j);
            printStars(i);
            
            i += 2;
            j--;
            
            if(j == -1) {
                printSpaces(height - 2);
                System.out.println("***");
                printSpaces(height - 2);
                System.out.println("***");
            }
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
