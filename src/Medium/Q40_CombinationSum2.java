package Medium;
import java.util.*;
public class Q40_CombinationSum2 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(candidates);
        helper(arr, list, candidates, target, 0);
        return arr;
    }
    public static void helper(List<List<Integer>> arr, List<Integer> list, int[]candidates, int target, int idx){
        if(target == 0){
            arr.add(new ArrayList<>(list));
            return;
        }
        for(int i = idx ; i < candidates.length; i++){
            if(i!=idx && candidates[i] == candidates[i-1]){
                continue;
            }
            if(target >= candidates[i]){
                list.add(candidates[i]);
                helper(arr, list, candidates, target-candidates[i], i+1);
                list.remove(list.size()-1);
            }
        }
    }
}
