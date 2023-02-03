package Medium;
import java.util.*;
public class Q78_Subsets {
    public static void main(String[] args) {

    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        List <Integer> list = new ArrayList<>();
        arr.add(new ArrayList<Integer>());
        helper(arr, list, nums, 0);
        List<Integer> s = new ArrayList<>();
        for(int i:nums) {
            s.add(i);
        }
        arr.add(s);
        return arr;
    }
    public void helper(List<List<Integer>> arr, List<Integer> list, int[]nums, int idx){
        if(list.size() != 0){
            arr.add(new ArrayList(list));
            // return;
        }
        if(list.size() == nums.length -1){
            return;
        }
        for(int i = idx ; i< nums.length ; i++){
            if(i != idx && nums[i] == nums[i-1]){
                continue;
            }
            list.add(nums[i]);
            helper(arr, list, nums, i+1);
            list.remove(list.size() - 1);
        }
    }
}
