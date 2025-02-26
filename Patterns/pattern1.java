import java.util.*;

class pattern1 {

    static void pattern11(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter number for this pattern");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        pattern11(N); // Corrected method name to match the declaration
    }
}