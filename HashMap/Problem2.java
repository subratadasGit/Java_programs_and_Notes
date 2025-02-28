// Given an array, find the most frequent element in it. If there are multiple elements that appear a maximum
// number of times, print any one of them.
// Sample Input:
// n = 6  
// arr[] = {1, 3, 2, 1, 4, 1}
// Expected Output :
// 1
package HashMap;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class Problem2 {

    public static void main(String[] args) {

        Map<Integer, Integer> freq = new HashMap<>();

        int arr[] = { 1, 2, 3, 1, 4, 1,4,4,44,4 };

        for (int x : arr) {

            if (!freq.containsKey(x)) {

                freq.put(x, 1);

            } else {
                freq.put(x, freq.get(x) + 1);
            }

        }
        System.out.println(freq.entrySet());

        int maxFreq = 0 , ansKey = -1;

        for( var e : freq.entrySet()){
            if(e.getValue()>maxFreq){
                maxFreq=e.getValue();
                ansKey=e.getKey();
            }
        }
        System.out.println("Highest frequency Value from Array \n" + ansKey);
    }

}
