import java.util.Scanner;

public class InsertAtFirst {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the original array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter your original elements:");
        for (int i = 0; i < arr.length; i++) { // Insert original array values
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number of elements to add at the beginning:");
        int newsize = sc.nextInt();
        int[] newarr = new int[size + newsize];

        System.out.println("Enter the new elements:");
        for (int i = 0; i < newsize; i++) { // Insert new array values
            newarr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) { // Copy original array to new array
            newarr[newsize + i] = arr[i];
        }

        System.out.println("Array after inserting new elements at the beginning:");
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + " ");
        }

        sc.close();
    }
}
