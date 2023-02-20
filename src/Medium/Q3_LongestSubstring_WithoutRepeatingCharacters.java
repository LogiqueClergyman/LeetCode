package Medium;
import java.util.*;
public class Q3_LongestSubstring_WithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int max=0, start=0;
        for(int i = 0 ; i < s.length() ; i++){
            if(!hs.contains(s.charAt(i))){
                hs.add(s.charAt(i));
                max = Math.max(max, i - start + 1);
            }
            else{
                while(s.charAt(start) != s.charAt(i)){
                    hs.remove(s.charAt(start));
                    start++;
                }
                hs.remove(s.charAt(start));
                start++;
                hs.add(s.charAt(i));
            }
        }
        return max;
    }
}
