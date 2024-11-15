import java.util.*;

public class InsertArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter Your Elements:");
        for (int i = 0; i < arr.length; i++) { // Insert Array values
            arr[i] = sc.nextInt();
        }

        System.out.println("The elements in the array are:");
        for (int i = 0; i < arr.length; i++) { // Print Array values
            System.out.print(arr[i] + "  ");
        }
        sc.close();
    }
}
