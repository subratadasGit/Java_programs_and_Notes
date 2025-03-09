// Create a HashMap using Java HashMap class to store the following pairs(Person, Age) and display them.
// Input:
// Akash 21
// Yash 16
// Lav 17
// Rishika 19
// Harry 18
// Output:
// Age of Akash is 21
// Age of Yash is 16
// Age of Lav is 17
// Age of Rishika is 19
// Age of Hany is 18


package HashMap;
import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Map<String , Integer> mp = new HashMap<>();
        mp.put("Akash", 21);
        mp.put("Yash",16);
        mp.put("Lav",7);
        mp.put("Rishika",19);
        mp.put("Harry",18);
        System.out.println(mp);
        System.out.println(mp.get("Harry"));
        System.out.println(mp.get("Rahul"));
        mp.put("Akash",25); //Akash-->25 Updated value
        System.out.println(mp);
        mp.remove("Akash"); // remove the key "Akash"
        System.out.println(mp);
        System.out.println(mp.remove("Riya")); // Null
        System.out.println(mp.containsKey("Akash"));  // False
        System.out.println(mp.containsKey("Harry"));  // True

        if(!mp.containsKey("Akash")){
            mp.put("Akash", 26);

        }
        System.out.println(mp);

        mp.putIfAbsent("Subrata", 20);  //if not present 
        System.out.println(mp);

        System.out.println("All Keys--->"+ " " +mp.keySet()); // print all keys 
        System.out.println("Print All Values ---->"+" "+mp.values()); // print all values
        System.out.println(mp.entrySet()); // Returns a set ( get all entries in the HashMap)



        // Traverse all entries of HashMap
        for(String key :  mp.keySet()){
            System.out.printf("Age of %s is %d ", key , mp.get(key));
            System.out.println("");
        } 

        System.out.println(" ");

        for(Map.Entry<String , Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d \n" , e.getKey() , e.getValue() );
        }

        System.out.println(" ");

        
        for(var e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(),e.getValue());
        }











} 
}
