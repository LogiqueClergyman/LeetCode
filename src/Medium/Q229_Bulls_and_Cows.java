package Medium;
import java.util.*;
public class Q229_Bulls_and_Cows {
    public static void main(String[]args){
        System.out.println(getHint("1123","0111"));
    }
    public static String getHint(String secret, String guess) {
        int a=0,b=0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0;i<guess.length();i++){
            hs.add(Character.getNumericValue(secret.charAt(i)));
            if(Character.getNumericValue(guess.charAt(i))==Character.getNumericValue(secret.charAt(i))) a++;
        }
        for(int i = 0;i<guess.length();i++){
            if(hs.contains(Character.getNumericValue(guess.charAt(i)))) b++;
        }
        return (Integer.toString(a)+"A"+Integer.toString(b-a)+"B");
    }
}
