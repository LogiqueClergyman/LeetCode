package Medium;
import java.util.*;
public class Q241_DifferentWays_to_addParanthesis {
    public static void main(String[] args) {
        System.out.println(diffWaysToCompute("2-1-1"));
    }
    public static List<Integer> diffWaysToCompute(String expression) {
        List<Integer> ans = new ArrayList<>();
        helper(expression, 0, ans);
        return ans;
    }
    public static void helper(String exp, int sum, List<Integer> ans){
        for(int i = 0 ; i<exp.length(); i++){
            if(exp.charAt(i)=='+' || exp.charAt(i)=='-' || exp.charAt(i)=='*'){
                String left = exp.substring(0,i);
                String right = exp.substring(i+1);

            }
        }
    }
}
