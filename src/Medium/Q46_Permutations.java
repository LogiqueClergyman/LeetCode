//package Medium;
//
//public class Q46_Permutations {
//    public List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> ans = new ArrayList<>();
//        List<Integer> list = new ArrayList<>();
//        helper(nums, list, ans);
//        return ans;
//    }
//    static int a = 0;
//    public void helper(int [] nums, List<Integer> list, List<List<Integer>> ans){
//        if(list.size() == nums.length){
//            ans.add(new ArrayList<>(list));
//            return;
//        }
//        for(int i = 0; i < nums.length; i++){
//            if(!list.contains(nums[i])){
//                list.add(nums[i]);
//                // a = nums[i];
//                // nums[i] = -11;
//                helper(nums, list, ans);
//                // nums[i] = a;
//                list.remove(list.size()-1);
//            }
//        }
//    }
//}
