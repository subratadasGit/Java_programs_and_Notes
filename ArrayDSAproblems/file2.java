package ArrayDSAproblems;
// Calculate the sum of all the elements in the given
// array.
import java.util.*;

public class file2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    
    for(int i = 0 ; i < n ; i++){
      arr[i]=sc.nextInt();
    }
    int sum = 0 ;
    for(int i = 0 ; i < n ; i++){
      sum = sum + arr[i];
    }
    
    System.out.println("Total sum : "+sum);
    
    sc.close();
  }
}