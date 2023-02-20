package Medium;
import java.util.*;
public class Q17_LetterCombo_of_a_phoneNumber {
    static String[] numpad = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
//        String digits = "23";
        List<String>answer = new ArrayList<>();
//        if(digits.length()==0){
//
//            return answer;
//        }
        helper("23", "", answer);
        System.out.println(answer);
    }
    public static void helper(String digits, String ans, List<String>answer){
        if(digits.length() == 0){
            answer.add(ans);
            return;
        }
        char key = digits.charAt(0);
        String pressed = numpad[key - '0'];
        for(int i = 0 ; i<pressed.length() ; i++){
            helper(digits.substring(1), ans + pressed.charAt(i), answer);
        }
    }
}
