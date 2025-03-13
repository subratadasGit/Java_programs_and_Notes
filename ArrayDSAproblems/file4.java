package ArrayDSAproblems;
// Q6 : Find the maximum value out of all the elements in the
// array.

import java.util.*;

public class file4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[]= new int[n];
    
    for(int i = 0 ; i < n ; i++){
      arr[i]= sc.nextInt();
    }
   int max = -1 ;
   for(int i = 0 ; i<n ; i++){
     if(arr[i]>max){
       max = arr[i];
     }
   }
    
    System.out.println("Max element : "+max);
    
  }
}
