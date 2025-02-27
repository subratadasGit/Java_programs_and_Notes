public class CharacterFrequencyCheck {
    public static void main(String[] args) {
        // 1. Initialize the input string.
        String s = "Subrata Das";

        // 2. Initialize a counter to track the frequency of the target character.
        int count = 0;

        // 3. Define the character whose frequency we want to count.
        char c = 'a';

        // 4. Get the length of the input string.
        int n = s.length();

        // 5. Iterate through each character of the string.
        for (int i = 0; i < n; i++) {
            // 6. Check if the current character matches the target character.
            if (s.charAt(i) == c) {
                // 7. If the characters match, increment the counter.
                count++;
            }
        }

        // 8. Print the final count of the target character.
        System.out.println(count);
    }
}