import java.util.*;

class Pattern2 {

    static void printForest(int n) {
        for (int i = 1; i <= n; i++) { // Loop through rows
            for (int j = 1; j <= i; j++) { // Loop through columns in the lower triangle
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter number for this pattern:");
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt();
        printForest(N); // Call the method to print the forest pattern 

    }
}