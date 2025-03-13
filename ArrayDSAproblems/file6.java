package ArrayDSAproblems;

// Q8 : Find the doublet in the Array whose sum is equal to the
// given value x. (Two Sum)
import java.util.*;

public class file6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = 6;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (x == arr[i] + arr[j]) {
                    System.out.println(" Indexes are : " + i + " " + j);
                }
            }
        }
    }
}