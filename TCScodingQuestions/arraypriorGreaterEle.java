package TCScodingQuestions;

import java.util.*;

public class arraypriorGreaterEle {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int cnt = 1;

    for (int i = 1; i < n - 1; i++) {
      if (arr[i + 1] > arr[i]) {
        cnt++;
      }
    }

    System.out.print(cnt);
    sc.close();
  }

}