package Easy;
import java.util.*;
public class Q771_Jewels_and_Stones {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        HashSet<Character> hs = new HashSet<>();
        for(int i = 0 ; i < jewels.length() ; i++){
            hs.add(jewels.charAt(i));
        }
        for(int i = 0 ; i < stones.length(); i++){
            if(hs.contains(stones.charAt(i))) count++;
        }
        return count;
    }
}
