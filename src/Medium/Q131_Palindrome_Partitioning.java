package Medium;
import java.util.*;
public class Q131_Palindrome_Partitioning {
    public static void main(String[] args) {

    }
    public List<List<String>> partition(String s) {
        List<String> list = new ArrayList<>();
        List<List<String>> arr = new ArrayList<>();
        helper(arr, list, s);
        return arr;
    }
    public void helper(List<List<String>> arr, List<String> list, String s){
        if(s.length() == 0){
            arr.add(new ArrayList<>(list));
            return;
        }
        for(int i = 1 ; i <= s.length() ; i++){
            if(palindrome(s.substring(0,i))){
                list.add(s.substring(0,i));
                helper(arr, list, s.substring(i));
                list.remove(list.size()-1);
            }
        }
    }
    public boolean palindrome(String s){
        for(int i = 0 ; i < s.length()/2 ; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }
        return true;
    }
}
