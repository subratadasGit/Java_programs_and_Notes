package ArrayDSAproblems;

// Q5 : Find the element 'x' in the array . Take array
// and x as input.
import java.util.*;

public class file3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println(" Element is Present  ");
            }
        }
        System.out.println("Element is not present");

    }
}