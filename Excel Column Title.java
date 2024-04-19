public class Solution {
    public String convertToTitle(int A) {
        StringBuilder result = new StringBuilder();
        while (A > 0) {
            A--; 
            char ch = (char) (A % 26 + 'A'); // Convert the remainder to a character from 'A' to 'Z'
            result.insert(0, ch); // Insert the character at the beginning of the result
            A /= 26; // Divide A by 26 to get the next digit
        }
        return result.toString();
    }
}
