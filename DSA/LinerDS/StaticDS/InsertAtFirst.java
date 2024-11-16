import java.util.Scanner;

public class InsertAtFirst {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter Your Elements:");
        for (int i = 0; i < arr.length; i++) { // Insert Array values
            arr[i] = sc.nextInt();
        }

        System.out.println("enter your new size array which you want to add at begining");
        int newsize = sc.nextInt();

        int[] newarr = new int[size + newsize];

        System.out.println("Enter Your Elements:");
        for (int i = 0; i < newsize ; i++) { // Insert new Array values
            newarr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {            
            newarr[newsize+i]=arr[i];

        }

        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i]+" ");
        }




        

    }
}
