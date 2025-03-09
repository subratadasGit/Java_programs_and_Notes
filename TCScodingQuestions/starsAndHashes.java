package TCScodingQuestions;
import java.util.*;
public class starsAndHashes{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Hello Maa ! ami Tcs prime peye gechi");
    String s = sc.nextLine();
    
    int cnt_stars=0;
    int cnt_hashs=0;
    
    for(char ch : s.toCharArray()){
      if(ch == '*') cnt_stars++;
      else if(ch == '#') cnt_hashs++;
      
    }
    
    System.out.println("Stars "+cnt_stars);
    System.out.println("Hashs "+cnt_hashs);
    
     int result = cnt_stars - cnt_hashs;
    if(result < 0){
      System.out.println("How much stars needed " +  Math.abs(result));
    }
    else if(result > 0){
      System.out.println("How much Hashes Needed "+Math.abs(result) );  
    }
    else{
      System.out.println("Stars and Hashes are equal ");
    }
  }
}