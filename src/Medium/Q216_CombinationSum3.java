package Medium;
import java.util.*;
public class Q216_CombinationSum3 {
    public static void main(String[] args) {

    }
        public List<List<Integer>> combinationSum3(int k, int target) {
            List<Integer> list = new ArrayList<>();
            List<List<Integer>> arr = new ArrayList<>();
            helper(target, k, arr, list, 1);
            return arr;
        }
        public static void helper(int target, int k, List<List<Integer>> arr, List<Integer> list, int idx) {
            if (target == 0 && list.size() == k) {
                arr.add(new ArrayList<>(list));
                return;
            }
            if (list.size() > k) {
                return;
            }
            for (int i = idx; i <= 9; i++) {
                if (target >= i) {
                    list.add(i);
                    helper(target - i, k, arr, list, i + 1);
                    list.remove(list.size() - 1);
                }
            }
        }
}
