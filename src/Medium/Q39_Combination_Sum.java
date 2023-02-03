package Medium;
import java.util.*;
public class Q39_Combination_Sum {
    public static void main(String[] args) {

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(arr, candidates, target, list, 0);
        return arr;
    }
    public static void helper(List<List<Integer>> arr, int [] candidates, int target, List<Integer> list, int idx){
        if(target == 0){
            arr.add(new ArrayList<>(list));
            return;
        }
        for(int  i = idx ; i < candidates.length ; i++){
            if(target >= candidates[i]){
                list.add(candidates[i]);
                helper(arr, candidates, target-candidates[i], list, i);
                list.remove(list.size()-1);
            }
        }
    }
}
