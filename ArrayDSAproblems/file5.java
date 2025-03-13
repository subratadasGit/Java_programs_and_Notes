package ArrayDSAproblems;

// Q7 : Find the second largest element in the given Array.
import java.util.*;

public class file5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = -1; // Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int secLarge = -1; // Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > secLarge && arr[i] != max) {
                secLarge = arr[i];
            }
        }

        System.out.println(" Second Largest : " + secLarge);

    }
}